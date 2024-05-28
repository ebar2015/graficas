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

@Entity(name="ESPECIALIDAD_MEDICO")
public class EspecialidadMedico implements Serializable {

    private static final long serialVersionUID = 2999512457325606680L;

	/** Primary key. */
    protected static final String PK = "idEspecialidadMedico";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_ESPECIALIDAD_MEDICO", unique=true, nullable=false, precision=19)
    private long idEspecialidadMedico;
    @Column(name="ID_PERSONA", nullable=false, precision=19)
    private long idPersona;
    @Column(name="ID_APP", nullable=false, precision=19)
    private long idApp;
    @Column(name="ESPECIALIDAD", nullable=false, length=200)
    private String especialidad;
    @Column(name="ESTILO", nullable=false, length=100)
    private String estilo;
    @Column(name="FECHA_CREACION", nullable=false)
    private LocalDateTime fechaCreacion;
    @Column(name="FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;
    @Column(name="ESTADO", nullable=false, precision=3)
    private short estado;

    /** Default constructor. */
    public EspecialidadMedico() {
        super();
    }

    /**
     * Access method for idEspecialidadMedico.
     *
     * @return the current value of idEspecialidadMedico
     */
    public long getIdEspecialidadMedico() {
        return idEspecialidadMedico;
    }

    /**
     * Setter method for idEspecialidadMedico.
     *
     * @param aIdEspecialidadMedico the new value for idEspecialidadMedico
     */
    public void setIdEspecialidadMedico(long aIdEspecialidadMedico) {
        idEspecialidadMedico = aIdEspecialidadMedico;
    }

    /**
     * Access method for idPersona.
     *
     * @return the current value of idPersona
     */
    public long getIdPersona() {
        return idPersona;
    }

    /**
     * Setter method for idPersona.
     *
     * @param aIdPersona the new value for idPersona
     */
    public void setIdPersona(long aIdPersona) {
        idPersona = aIdPersona;
    }

    /**
     * Access method for idApp.
     *
     * @return the current value of idApp
     */
    public long getIdApp() {
        return idApp;
    }

    /**
     * Setter method for idApp.
     *
     * @param aIdApp the new value for idApp
     */
    public void setIdApp(long aIdApp) {
        idApp = aIdApp;
    }

    /**
     * Access method for especialidad.
     *
     * @return the current value of especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Setter method for especialidad.
     *
     * @param aEspecialidad the new value for especialidad
     */
    public void setEspecialidad(String aEspecialidad) {
        especialidad = aEspecialidad;
    }

    /**
     * Access method for estilo.
     *
     * @return the current value of estilo
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * Setter method for estilo.
     *
     * @param aEstilo the new value for estilo
     */
    public void setEstilo(String aEstilo) {
        estilo = aEstilo;
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
     * Access method for estado.
     *
     * @return the current value of estado
     */
    public short getEstado() {
        return estado;
    }

    /**
     * Setter method for estado.
     *
     * @param aEstado the new value for estado
     */
    public void setEstado(short aEstado) {
        estado = aEstado;
    }

    /**
     * Compares the key for this instance with another EspecialidadMedico.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspecialidadMedico and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspecialidadMedico)) {
            return false;
        }
        EspecialidadMedico that = (EspecialidadMedico) other;
        if (this.getIdEspecialidadMedico() != that.getIdEspecialidadMedico()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspecialidadMedico.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspecialidadMedico)) return false;
        return this.equalKeys(other) && ((EspecialidadMedico)other).equalKeys(this);
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
        i = (int)(getIdEspecialidadMedico() ^ (getIdEspecialidadMedico()>>>32));
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
        StringBuffer sb = new StringBuffer("[EspecialidadMedico |");
        sb.append(" idEspecialidadMedico=").append(getIdEspecialidadMedico());
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
        ret.put("idEspecialidadMedico", Long.valueOf(getIdEspecialidadMedico()));
        return ret;
    }

}
