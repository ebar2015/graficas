/**
 * 
 */
package com.viscaya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.viscaya.entities.AgendaDisponible;

/**
 * @author joseviscaya
 *
 */
public interface IAgendaDisponibleRepository extends CrudRepository<AgendaDisponible, Long> {
	
	
	public List<AgendaDisponible> findByIdMedicoAndIdAppAndEspecialidadAndEstadoOrderByFecha(long idMedico, long idApp, String especialidad, String estado);
	
	@Query(value = "SELECT COUNT(*) TOTAL FROM AGENDA_DISPONIBLE c WHERE c.ESTADO =:estado AND c.ID_MEDICO =:idMedico AND c.ID_APP=:idApp AND YEAR(c.FECHA) =:anio AND c.ESPECIALIDAD =:especialidad",nativeQuery = true)
	public int totalEspecialidadAnio(long idMedico, long idApp, String especialidad, String estado, int anio);
}
