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

@Entity(name="PARAMETROS")
public class Parametros implements Serializable {

    private static final long serialVersionUID = -3232664101409372327L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID", unique=true, nullable=false, precision=19)
    private long id;
    @Column(name="ID_APP", precision=19)
    private long idApp;
    @Column(name="PADRE", precision=19)
    private long padre;
    @Column(name="NOMBRE", nullable=false, length=100)
    private String nombre;
    @Column(name="VALOR", nullable=false, length=500)
    private String valor;
    @Column(name="ESTADO", nullable=false, precision=3)
    private short estado;
    @Column(name="FECHA_CREACION", nullable=false)
    private LocalDateTime fechaCreacion;

    /** Default constructor. */
    public Parametros() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(long aId) {
        id = aId;
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
     * Access method for padre.
     *
     * @return the current value of padre
     */
    public long getPadre() {
        return padre;
    }

    /**
     * Setter method for padre.
     *
     * @param aPadre the new value for padre
     */
    public void setPadre(long aPadre) {
        padre = aPadre;
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
     * Access method for valor.
     *
     * @return the current value of valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * Setter method for valor.
     *
     * @param aValor the new value for valor
     */
    public void setValor(String aValor) {
        valor = aValor;
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
     * Compares the key for this instance with another Parametros.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Parametros and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Parametros)) {
            return false;
        }
        Parametros that = (Parametros) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Parametros.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Parametros)) return false;
        return this.equalKeys(other) && ((Parametros)other).equalKeys(this);
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
        i = (int)(getId() ^ (getId()>>>32));
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
        StringBuffer sb = new StringBuffer("[Parametros |");
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
        ret.put("id", Long.valueOf(getId()));
        return ret;
    }

}
