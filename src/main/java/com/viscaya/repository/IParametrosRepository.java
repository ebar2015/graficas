/**
 * 
 */
package com.viscaya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.viscaya.entities.Parametros;

/**
 * @author joseviscaya
 *
 */
public interface IParametrosRepository extends CrudRepository<Parametros, Long> {
	
	public Parametros findByNombreAndIdAppAndEstado(String nombre,long idApp, short estado);
	public List<Parametros> findByPadreAndIdAppAndEstado(long padre,long idApp, short estado);
	
	 

}
