/**
 * 
 */
package com.viscaya.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.viscaya.bean.Grafico;
import com.viscaya.bean.Series;
import com.viscaya.entities.AgendaDisponible;
import com.viscaya.entities.EspecialidadMedico;
import com.viscaya.repository.IAgendaDisponibleRepository;
import com.viscaya.utilities.Utilities;

/**
 * @author joseviscaya
 *
 */
@Service
public class GraficasDashboardServiceIMPL implements IGraficasDashboardService {
	
	
	@Autowired
	private IAgendaDisponibleRepository service;
	
	@Autowired
	private RestTemplate restTemplate;
	

	
	@Autowired
	private Utilities utilities;
	
	
	@Override
	@Cacheable("dasboardMedicoCache")
	public Grafico getDashboard(long idMedico, long idApp) {
		
		ResponseEntity<List<EspecialidadMedico>> lstEsp = restTemplate.exchange(utilities.URL_ESPECIALIDADES.concat(String.valueOf(idMedico)).concat("/"+String.valueOf(idApp)), HttpMethod.GET, null, new ParameterizedTypeReference<List<EspecialidadMedico>>() {});
		Series s = null;
		List<Series> series = new ArrayList<>();
		List<Long> categories = new ArrayList<>();
		Grafico gr = new Grafico();
		for(EspecialidadMedico esp :lstEsp.getBody()) {
			s = new Series();
			s.setName(esp.getEspecialidad());
			s.setData(new ArrayList<>());
			getCategorias(service.findByIdMedicoAndIdAppAndEspecialidadAndEstadoOrderByFecha(idMedico, idApp, esp.getEspecialidad(),utilities.FINALIZADA),categories);
			series.add(s);
		}
		eliminarDuplicados(categories);
		for(long anio: categories) {
			for(int i = 0; i < series.size(); i++) {
				series.get(i).getData().add((long) service.totalEspecialidadAnio(idMedico, idApp, series.get(i).getName(), utilities.FINALIZADA, (int) anio));
			}
		}
		gr.setCategories(categories);
		gr.setSeries(series);
		return gr;
	}
	/**
	 * 
	 * @param categorias
	 */
	public void eliminarDuplicados(List<Long> categorias) {
        HashSet<Long> conjunto = new HashSet<>(categorias);
        categorias.clear();
        categorias.addAll(conjunto);
    }
	/**
	 * 
	 * @param lst
	 * @param categories
	 */
	public void getCategorias(List<AgendaDisponible> lst, List<Long> categories) {
		int anio = 0;
		int anioCount = 0;
		if(!lst.isEmpty()) {
			for(AgendaDisponible ag : lst) {
				if(anio == 0) {
					anio = ag.getFecha().getYear();
					categories.add((long) anio);
					anioCount ++;
				}else if(anio == ag.getFecha().getYear()) {
					anioCount ++;
				}else {
					anio = 0;
					anioCount = 0;
				}
			}
		}
	}

}
