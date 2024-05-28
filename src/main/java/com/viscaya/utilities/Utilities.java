/**
 * 
 */
package com.viscaya.utilities;

import java.io.Serializable;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import org.springframework.stereotype.Component;

/**
 * @author joseviscaya
 *
 */
@Component
public class Utilities implements Serializable {

	private static final long serialVersionUID = -6263078987217947030L;
	
	private final int LONGITUD_CODIGO = 8;
	private final String CARACTERES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public String CLAIMS_ID 								= "id";
	public String CLAIMS_NOMBRES 							= "nombres";
	public String CLAIMS_TIPO 								= "tipo";
	public String CLAIMS_EXPIRATION 						= "expiration";
	public String CLAIMS_TIME_EXP 							= "timeDuration";
	public String FORMATO_FECHA_LARGA 						= "dd/MM/yyyy HH:mm:ss";
	public String URL_ESPECIALIDADES 						= "http://localhost:8090/especialidades-medico/api/byMedico/";
	public String FINALIZADA 								= "FINALIZADA";





	





	





	





	





	





	





	





	





	





	





	

	
	
	public String getEdad(LocalDate fnac) {
		Period edad = Period.between(LocalDate.of(fnac.getYear(), fnac.getMonth(), fnac.getDayOfMonth()), LocalDate.now());
		String data = "Años: "+edad.getYears()+" Meses: "+edad.getMonths()+" Dias: "+edad.getDays();
		return data;
	}
	
	public String getSaludoMedico(String medico, String genero) {
		
		switch(genero){
			case "Femenino":
				return "Dra. "+medico;
			default:
				return "Dr. "+medico;
		}
	}
	
	
	public String generarCodigo() {
	       SecureRandom rnd = new SecureRandom();
	       StringBuilder sb = new StringBuilder(LONGITUD_CODIGO);
	       for (int i = 0; i < LONGITUD_CODIGO; i++) {
	           sb.append(CARACTERES.charAt(rnd.nextInt(CARACTERES.length())));
	       }
	       return sb.toString();
	}
	
	public int getMinutos(LocalDateTime fechaInicial) {
		LocalDateTime fechaFinal = LocalDateTime.now();
        Duration duracion = Duration.between(fechaInicial, fechaFinal);
        return (int) duracion.toMinutes();
	}

}
