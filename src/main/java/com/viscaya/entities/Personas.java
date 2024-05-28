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
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="PERSONAS", indexes={@Index(name="personasNumeriiduni", columnList="NUMERO_IDENTIFICACION,TIPO_IDENTIFICACION", unique=true)})
public class Personas implements Serializable {

    private static final long serialVersionUID = 7184453880524174974L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Long id;
    @Column(name="NOMBRES", nullable=false, length=90)
    private String nombres;
    @Column(name="APELLIDOS", nullable=false, length=90)
    private String apellidos;
    @Column(name="TIPO_IDENTIFICACION", nullable=false, length=25)
    private String tipoIdentificacion;
    @Column(name="NUMERO_IDENTIFICACION", nullable=false, length=20)
    private String numeroIdentificacion;
    @Column(name="GENERO", nullable=false, length=25)
    private String genero;
    @Column(name="EMAIL", nullable=false, length=120)
    private String email;
    @Column(name="CELULAR", nullable=false, length=25)
    private String celular;
    @Column(name="TIPO", nullable=false, length=60)
    private String tipo;
    @Column(name="FECHA_NACIMIENTO", nullable=false)
    private LocalDate fechaNacimiento;
    @Column(name="FECHA_CREACION", nullable=false)
    private LocalDateTime fechaCreacion;
    @Column(name="FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;
    
    @Transient
    private Long idApp;


    /** Default constructor. */
    public Personas() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(Long aId) {
        id = aId;
    }
    

    /**
     * Access method for nombres.
     *
     * @return the current value of nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Setter method for nombres.
     *
     * @param aNombres the new value for nombres
     */
    public void setNombres(String aNombres) {
        nombres = aNombres;
    }

    /**
     * Access method for apellidos.
     *
     * @return the current value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Setter method for apellidos.
     *
     * @param aApellidos the new value for apellidos
     */
    public void setApellidos(String aApellidos) {
        apellidos = aApellidos;
    }

    /**
     * Access method for tipoIdentificacion.
     *
     * @return the current value of tipoIdentificacion
     */
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Setter method for tipoIdentificacion.
     *
     * @param aTipoIdentificacion the new value for tipoIdentificacion
     */
    public void setTipoIdentificacion(String aTipoIdentificacion) {
        tipoIdentificacion = aTipoIdentificacion;
    }

    /**
     * Access method for numeroIdentificacion.
     *
     * @return the current value of numeroIdentificacion
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Setter method for numeroIdentificacion.
     *
     * @param aNumeroIdentificacion the new value for numeroIdentificacion
     */
    public void setNumeroIdentificacion(String aNumeroIdentificacion) {
        numeroIdentificacion = aNumeroIdentificacion;
    }

    /**
     * Access method for genero.
     *
     * @return the current value of genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Setter method for genero.
     *
     * @param aGenero the new value for genero
     */
    public void setGenero(String aGenero) {
        genero = aGenero;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for celular.
     *
     * @return the current value of celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Setter method for celular.
     *
     * @param aCelular the new value for celular
     */
    public void setCelular(String aCelular) {
        celular = aCelular;
    }

    /**
     * Access method for tipo.
     *
     * @return the current value of tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter method for tipo.
     *
     * @param aTipo the new value for tipo
     */
    public void setTipo(String aTipo) {
        tipo = aTipo;
    }

    /**
     * Access method for fechaNacimiento.
     *
     * @return the current value of fechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Setter method for fechaNacimiento.
     *
     * @param aFechaNacimiento the new value for fechaNacimiento
     */
    public void setFechaNacimiento(LocalDate aFechaNacimiento) {
        fechaNacimiento = aFechaNacimiento;
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

    /**
     * Access method for fechaModificacion.
     *
     * @return the current value of fechaModificacion
     */
    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Setter method for fechaModificacion.
     *
     * @param aFechaModificacion the new value for fechaModificacion
     */
    public void setFechaModificacion(LocalDateTime aFechaModificacion) {
        fechaModificacion = aFechaModificacion;
    }

    /**
     * Compares the key for this instance with another Personas.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Personas and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Personas)) {
            return false;
        }
        Personas that = (Personas) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Personas.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Personas)) return false;
        return this.equalKeys(other) && ((Personas)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
    	Long i;
        int result = 17;
        i = getId();
        result = (int) (37*result + i);
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Personas |");
        sb.append(" id=").append(getId());
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
        ret.put("id", getId());
        return ret;
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

}
