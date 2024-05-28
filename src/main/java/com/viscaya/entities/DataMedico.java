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

@Entity(name="DATA_MEDICO")
public class DataMedico implements Serializable {

    /** Primary key. */
    protected static final String PK = "idDataMedico";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_DATA_MEDICO", unique=true, nullable=false, precision=19)
    private long idDataMedico;
    @Column(name="ID_APP", nullable=false, precision=19)
    private long idApp;
    @Column(name="ID_PERSONA", nullable=false, precision=19)
    private long idPersona;
    @Column(name="REGISTRO_MEDICO", nullable=false, length=12)
    private String registroMedico;
    @Column(name="TITULO", nullable=false, length=120)
    private String titulo;
    @Column(name="FIRMA", length=100)
    private String firma;
    @Column(name="SELLO", length=100)
    private String sello;
    @Column(name="HABILITACION", length=100)
    private String habilitacion;
    @Column(name="ESTADO", precision=3)
    private short estado;
    @Column(name="FECHA_CREACION")
    private LocalDateTime fechaCreacion;
    @Column(name="FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    /** Default constructor. */
    public DataMedico() {
        super();
    }

    /**
     * Access method for idDataMedico.
     *
     * @return the current value of idDataMedico
     */
    public long getIdDataMedico() {
        return idDataMedico;
    }

    /**
     * Setter method for idDataMedico.
     *
     * @param aIdDataMedico the new value for idDataMedico
     */
    public void setIdDataMedico(long aIdDataMedico) {
        idDataMedico = aIdDataMedico;
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
     * Access method for registroMedico.
     *
     * @return the current value of registroMedico
     */
    public String getRegistroMedico() {
        return registroMedico;
    }

    /**
     * Setter method for registroMedico.
     *
     * @param aRegistroMedico the new value for registroMedico
     */
    public void setRegistroMedico(String aRegistroMedico) {
        registroMedico = aRegistroMedico;
    }

    /**
     * Access method for titulo.
     *
     * @return the current value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter method for titulo.
     *
     * @param aTitulo the new value for titulo
     */
    public void setTitulo(String aTitulo) {
        titulo = aTitulo;
    }

    /**
     * Access method for firma.
     *
     * @return the current value of firma
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Setter method for firma.
     *
     * @param aFirma the new value for firma
     */
    public void setFirma(String aFirma) {
        firma = aFirma;
    }

    /**
     * Access method for sello.
     *
     * @return the current value of sello
     */
    public String getSello() {
        return sello;
    }

    /**
     * Setter method for sello.
     *
     * @param aSello the new value for sello
     */
    public void setSello(String aSello) {
        sello = aSello;
    }

    /**
     * Access method for habilitacion.
     *
     * @return the current value of habilitacion
     */
    public String getHabilitacion() {
        return habilitacion;
    }

    /**
     * Setter method for habilitacion.
     *
     * @param aHabilitacion the new value for habilitacion
     */
    public void setHabilitacion(String aHabilitacion) {
        habilitacion = aHabilitacion;
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
     * Compares the key for this instance with another DataMedico.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DataMedico and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DataMedico)) {
            return false;
        }
        DataMedico that = (DataMedico) other;
        if (this.getIdDataMedico() != that.getIdDataMedico()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DataMedico.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DataMedico)) return false;
        return this.equalKeys(other) && ((DataMedico)other).equalKeys(this);
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
        i = (int)(getIdDataMedico() ^ (getIdDataMedico()>>>32));
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
        StringBuffer sb = new StringBuffer("[DataMedico |");
        sb.append(" idDataMedico=").append(getIdDataMedico());
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
        ret.put("idDataMedico", Long.valueOf(getIdDataMedico()));
        return ret;
    }

}
