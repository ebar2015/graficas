// Generated with g9.

package com.viscaya.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="APLICACIONES")
public class Aplicaciones implements Serializable {

    /** Primary key. */
    protected static final String PK = "idAplicacion";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_APLICACION", unique=true, nullable=false, precision=19)
    private long idAplicacion;
    @Column(name="ID_REPRESENTANTE", nullable=false, precision=19)
    private long idRepresentante;
    @Column(name="NOMBRE", nullable=false, length=200)
    private String nombre;
    @Column(name="PAIS", nullable=false, length=150)
    private String pais;
    @Column(name="DEPARTAMENTO", nullable=false, length=150)
    private String departamento;
    @Column(name="MUNICIPIO", nullable=false, length=150)
    private String municipio;
    @Column(name="DIRECCION", nullable=false, length=150)
    private String direccion;
    @Column(name="CELULAR", nullable=false, length=20)
    private String celular;
    @Column(name="LOGO", nullable=false, length=120)
    private String logo;
    @Column(name="CORREO", nullable=false, length=120)
    private String correo;
    @Column(name="SITIO_WEB", nullable=true, length=120)
    private String sitioWeb;
    @Column(name="ESTAD0", nullable=false, precision=3)
    private short estad0;
    @Column(name="COPI_EMAIL")
    private short copiEmail;
    @Column(name="FECHA_CREACION", nullable=false)
    private LocalDateTime fechaCreacion;

    /** Default constructor. */
    public Aplicaciones() {
        super();
    }

    /**
     * Access method for idAplicacion.
     *
     * @return the current value of idAplicacion
     */
    public long getIdAplicacion() {
        return idAplicacion;
    }

    /**
     * Setter method for idAplicacion.
     *
     * @param aIdAplicacion the new value for idAplicacion
     */
    public void setIdAplicacion(long aIdAplicacion) {
        idAplicacion = aIdAplicacion;
    }

    /**
     * Access method for idRepresentante.
     *
     * @return the current value of idRepresentante
     */
    public long getIdRepresentante() {
        return idRepresentante;
    }

    /**
     * Setter method for idRepresentante.
     *
     * @param aIdRepresentante the new value for idRepresentante
     */
    public void setIdRepresentante(long aIdRepresentante) {
        idRepresentante = aIdRepresentante;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for pais.
     *
     * @return the current value of pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Setter method for pais.
     *
     * @param aPais the new value for pais
     */
    public void setPais(String aPais) {
        pais = aPais;
    }

    /**
     * Access method for departamento.
     *
     * @return the current value of departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Setter method for departamento.
     *
     * @param aDepartamento the new value for departamento
     */
    public void setDepartamento(String aDepartamento) {
        departamento = aDepartamento;
    }

    /**
     * Access method for municipio.
     *
     * @return the current value of municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Setter method for municipio.
     *
     * @param aMunicipio the new value for municipio
     */
    public void setMunicipio(String aMunicipio) {
        municipio = aMunicipio;
    }

    /**
     * Access method for direccion.
     *
     * @return the current value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter method for direccion.
     *
     * @param aDireccion the new value for direccion
     */
    public void setDireccion(String aDireccion) {
        direccion = aDireccion;
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
     * Access method for logo.
     *
     * @return the current value of logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Setter method for logo.
     *
     * @param aLogo the new value for logo
     */
    public void setLogo(String aLogo) {
        logo = aLogo;
    }

    /**
     * Access method for correo.
     *
     * @return the current value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Setter method for correo.
     *
     * @param aCorreo the new value for correo
     */
    public void setCorreo(String aCorreo) {
        correo = aCorreo;
    }

    /**
     * Access method for estad0.
     *
     * @return the current value of estad0
     */
    public short getEstad0() {
        return estad0;
    }

    /**
     * Setter method for estad0.
     *
     * @param aEstad0 the new value for estad0
     */
    public void setEstad0(short aEstad0) {
        estad0 = aEstad0;
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
     * Access method for copiEmail.
     *
     * @return the current value of copiEmail
     */
    public short getCopiEmail() {
        return copiEmail;
    }


    /**
     * Setter method for copiEmail.
     *
     * @param aIconPerfil the new value for copiEmail
     */
    public void setIconPerfil(short copiEmail) {
    	this.copiEmail = copiEmail;
    }

    /**
     * Compares the key for this instance with another Aplicaciones.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Aplicaciones and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Aplicaciones)) {
            return false;
        }
        Aplicaciones that = (Aplicaciones) other;
        if (this.getIdAplicacion() != that.getIdAplicacion()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Aplicaciones.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Aplicaciones)) return false;
        return this.equalKeys(other) && ((Aplicaciones)other).equalKeys(this);
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
        i = (int)(getIdAplicacion() ^ (getIdAplicacion()>>>32));
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
        StringBuffer sb = new StringBuffer("[Aplicaciones |");
        sb.append(" idAplicacion=").append(getIdAplicacion());
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
        ret.put("idAplicacion", Long.valueOf(getIdAplicacion()));
        return ret;
    }

	/**
	 * @return the sitioWeb
	 */
	public String getSitioWeb() {
		return sitioWeb;
	}

	/**
	 * @param sitioWeb the sitioWeb to set
	 */
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

}
