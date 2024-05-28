/**
 * 
 */
package com.viscaya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.viscaya.entities.Aplicaciones;

/**
 * @author joseviscaya
 *
 */
public interface IAplicacionesRepository extends CrudRepository<Aplicaciones, Long> {
	
	public List<Aplicaciones> findByIdRepresentante(Long idRepresentante);

}
