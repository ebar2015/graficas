/**
 * 
 */
package com.viscaya.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.viscaya.entities.Personas;



/**
 * @author joseviscaya
 *
 */

public interface IPersonaRepository extends CrudRepository<Personas, Long> {
	
	@Query(value ="Select p.* from  PERSONAS p INNER JOIN PERSONA_APP pa ON pa.ID_PERSONA = p.ID where p.NUMERO_IDENTIFICACION = :numeroIdentificacion AND pa.ID_APP = :idApp AND pa.ESTADO = 1" ,nativeQuery = true)
	public Optional<Personas> findOneByNumeroIdentificacionAndIdApp(String numeroIdentificacion, long idApp);
	
	@Query(value ="Select p.* from  PERSONAS p INNER JOIN PERSONA_APP pa ON pa.ID_PERSONA = p.ID where p.NUMERO_IDENTIFICACION = :numeroIdentificacion AND pa.ID_APP = :idApp AND pa.ESTADO = 1 AND EMAIL=:email" ,nativeQuery = true)
	public Optional<Personas> findOneByForgot(String numeroIdentificacion, String email, long idApp);
	
	
	
 
}
