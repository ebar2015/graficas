/**
 * 
 */
package com.viscaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viscaya.bean.Grafico;
import com.viscaya.service.IGraficasDashboardService;

/**
 * @author joseviscaya
 *
 */
@RestController
@RequestMapping("/api")
public class GraficasController {
	
	@Autowired
	private IGraficasDashboardService service;
	
	
	@GetMapping("/dasboardMedico/{idMedico}/{idApp}")
	public Grafico getById(@PathVariable(value = "idMedico") long idMedico, @PathVariable(value = "idApp") long idApp) {
		return service.getDashboard(idMedico, idApp);
	}

} 
