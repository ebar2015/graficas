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

@Entity(name="PROGRAMAS_MEDICOS")
public class ProgramasMedicos implements Serializable {

    private static final long serialVersionUID = 6037340699842888370L;

	/** Primary key. */
    protected static final String PK = "idPrograma";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_PROGRAMA", unique=true, nullable=false, precision=19)
    private long idPrograma;
    @Column(name="ID_APP", nullable=false, precision=19)
    private long idApp;
    @Column(name="NOMBRE", nullable=false, length=120)
    private String nombre;
    @Column(name="DESCRIPCION", nullable=false, length=300)
    private String descripcion;
    @Column(name="ICONO", nullable=false, length=80)
    private String icono;
    @Column(name="ESTADO", nullable=false, precision=3)
    private short estado;
    @Column(name="FECHA_CREACION", nullable=false)
    private LocalDateTime fechaCreacion;

    /** Default constructor. */
    public ProgramasMedicos() {
        super();
    }

    /**
     * Access method for idPrograma.
     *
     * @return the current value of idPrograma
     */
    public long getIdPrograma() {
        return idPrograma;
    }

    /**
     * Setter method for idPrograma.
     *
     * @param aIdPrograma the new value for idPrograma
     */
    public void setIdPrograma(long aIdPrograma) {
        idPrograma = aIdPrograma;
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
     * Access method for descripcion.
     *
     * @return the current value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for descripcion.
     *
     * @param aDescripcion the new value for descripcion
     */
    public void setDescripcion(String aDescripcion) {
        descripcion = aDescripcion;
    }

    /**
     * Access method for icono.
     *
     * @return the current value of icono
     */
    public String getIcono() {
        return icono;
    }

    /**
     * Setter method for icono.
     *
     * @param aIcono the new value for icono
     */
    public void setIcono(String aIcono) {
        icono = aIcono;
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
     * Compares the key for this instance with another ProgramasMedicos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ProgramasMedicos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ProgramasMedicos)) {
            return false;
        }
        ProgramasMedicos that = (ProgramasMedicos) other;
        if (this.getIdPrograma() != that.getIdPrograma()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ProgramasMedicos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ProgramasMedicos)) return false;
        return this.equalKeys(other) && ((ProgramasMedicos)other).equalKeys(this);
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
        i = (int)(getIdPrograma() ^ (getIdPrograma()>>>32));
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
        StringBuffer sb = new StringBuffer("[ProgramasMedicos |");
        sb.append(" idPrograma=").append(getIdPrograma());
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
        ret.put("idPrograma", Long.valueOf(getIdPrograma()));
        return ret;
    }

}
