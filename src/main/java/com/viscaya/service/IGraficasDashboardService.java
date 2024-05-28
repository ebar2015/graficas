/**
 * 
 */
package com.viscaya.service;

import com.viscaya.bean.Grafico;

/**
 * @author joseviscaya
 *
 */
public interface IGraficasDashboardService {
	
	public Grafico getDashboard(long idMedico, long idApp);

}
