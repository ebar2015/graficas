// Generated with g9.

package com.viscaya.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="HISTORIA_CLINICA")
public class HistoriaClinica implements Serializable {

    private static final long serialVersionUID = -8081531860951318247L;

	/** Primary key. */
    protected static final String PK = "idHistoriaClinica";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_HISTORIA_CLINICA", unique=true, nullable=false, precision=19)
    private long idHistoriaClinica;
    @Column(name="ID_AGENDA", nullable=false, precision=19)
    private long idAgenda;
    @Column(name="ID_HISTORIA", nullable=false, precision=19)
    private long idHistoria;
    @Column(name="HISTORIA", nullable=false)
    private String historia;
    @Column(name="CODIGO_CUPS", length=12)
    private String codigoCups;
    @Column(name="CODIGO_CIE", length=12)
    private String codigoCie;
    @Column(name="CONTROL", nullable=false, precision = 4)
    private int control;
    @Column(name="FECHA_CREACION")
    private LocalDateTime fechaCreacion;
    @Transient
    private String especialidad;
    @Transient
    private String estiloLabel;
    @Transient
    private LocalDate fecha;
    @Transient
    private String programaPAciente;
    @Transient
    private Long idApp;
    @Transient
    private String formulaMedica;
    @Transient
    private boolean definitiva;

    /** Default constructor. */
    public HistoriaClinica() {
        super();
    }

    /**
     * Access method for idHistoriaClinica.
     *
     * @return the current value of idHistoriaClinica
     */
    public long getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    /**
     * Setter method for idHistoriaClinica.
     *
     * @param aIdHistoriaClinica the new value for idHistoriaClinica
     */
    public void setIdHistoriaClinica(long aIdHistoriaClinica) {
        idHistoriaClinica = aIdHistoriaClinica;
    }

    /**
     * Access method for idAgenda.
     *
     * @return the current value of idAgenda
     */
    public long getIdAgenda() {
        return idAgenda;
    }

    /**
     * Setter method for idAgenda.
     *
     * @param aIdAgenda the new value for idAgenda
     */
    public void setIdAgenda(long aIdAgenda) {
        idAgenda = aIdAgenda;
    }

    /**
     * Access method for idHistoria.
     *
     * @return the current value of idHistoria
     */
    public long getIdHistoria() {
        return idHistoria;
    }

    /**
     * Setter method for idHistoria.
     *
     * @param aIdHistoria the new value for idHistoria
     */
    public void setIdHistoria(long aIdHistoria) {
        idHistoria = aIdHistoria;
    }

    /**
     * Access method for historia.
     *
     * @return the current value of historia
     */
    public String getHistoria() {
        return historia;
    }

    /**
     * Setter method for historia.
     *
     * @param aHistoria the new value for historia
     */
    public void setHistoria(String aHistoria) {
        historia = aHistoria;
    }

    /**
     * Access method for codigoCups.
     *
     * @return the current value of codigoCups
     */
    public String getCodigoCups() {
        return codigoCups;
    }

    /**
     * Setter method for codigoCups.
     *
     * @param aCodigoCups the new value for codigoCups
     */
    public void setCodigoCups(String aCodigoCups) {
        codigoCups = aCodigoCups;
    }

    /**
     * Access method for fechaCreacion.
     *
     * @return the current value of fechaCreacion
     */
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Setter method for fechaCreacion.
     *
     * @param aFechaCreacion the new value for fechaCreacion
     */
    public void setFechaCreacion(LocalDateTime aFechaCreacion) {
        fechaCreacion = aFechaCreacion;
    }
    
    
    public String getCodigoCie() {
    	return this.codigoCie;
    }
    
    public void setCodigoCie(String codigoCie) {
    	this.codigoCie = codigoCie;
    }

    /**
     * Compares the key for this instance with another HistoriaClinica.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class HistoriaClinica and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof HistoriaClinica)) {
            return false;
        }
        HistoriaClinica that = (HistoriaClinica) other;
        if (this.getIdHistoriaClinica() != that.getIdHistoriaClinica()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another HistoriaClinica.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof HistoriaClinica)) return false;
        return this.equalKeys(other) && ((HistoriaClinica)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = (int)(getIdHistoriaClinica() ^ (getIdHistoriaClinica()>>>32));
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[HistoriaClinica |");
        sb.append(" idHistoriaClinica=").append(getIdHistoriaClinica());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idHistoriaClinica", Long.valueOf(getIdHistoriaClinica()));
        return ret;
    }

	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * @return the estiloLabel
	 */
	public String getEstiloLabel() {
		return estiloLabel;
	}

	/**
	 * @param estiloLabel the estiloLabel to set
	 */
	public void setEstiloLabel(String estiloLabel) {
		this.estiloLabel = estiloLabel;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param localDate the fecha to set
	 */
	public void setFecha(LocalDate localDate) {
		this.fecha = localDate;
	}
	
	public void setProgramaPAciente(String programaPAciente) {
		this.programaPAciente = programaPAciente;
	}

	public String getProgramaPAciente() {
		return programaPAciente;
	}

	/**
	 * @return the idApp
	 */
	public Long getIdApp() {
		return idApp;
	}

	/**
	 * @param idApp the idApp to set
	 */
	public void setIdApp(Long idApp) {
		this.idApp = idApp;
	}

	/**
	 * @return the formulaMEdica
	 */
	public String getFormulaMedica() {
		return formulaMedica;
	}

	/**
	 * @param formulaMEdica the formulaMEdica to set
	 */
	public void setFormulaMedica(String formulaMEdica) {
		this.formulaMedica = formulaMEdica;
	}

	/**
	 * @return the control
	 */
	public int getControl() {
		return control;
	}

	/**
	 * @param control the control to set
	 */
	public void setControl(int control) {
		this.control = control;
	}

	/**
	 * @return the definitiva
	 */
	public boolean isDefinitiva() {
		return definitiva;
	}

	/**
	 * @param definitiva the definitiva to set
	 */
	public void setDefinitiva(boolean definitiva) {
		this.definitiva = definitiva;
	}

}
