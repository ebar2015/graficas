// Generated with g9.

package com.viscaya.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="AGENDA_DISPONIBLE")
public class AgendaDisponible implements Serializable {

    private static final long serialVersionUID = 7277203196114734258L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID", unique=true, nullable=false, precision=19)
    private long id;
    @Column(name="ID_APP", nullable=false, precision=19)
    private long idApp;
    @Column(name="ID_MEDICO", nullable=false, precision=10)
    private long idMedico;
    @Column(name="ESPECIALIDAD", nullable=false, length=60)
    private String especialidad;
    @Column(name="FECHA", nullable=false)
    private LocalDate fecha;
    @Column(name="HORA", nullable=false)
    private LocalTime hora;
    @Column(name="TIPO", nullable=false, length=2)
    private String tipo;
    @Column(name="ID_HORA", nullable=false, precision=19)
    private long idHora;
    @Column(name="LUGAR", nullable=false, length=100)
    private String lugar;
    @Column(name="ESTADO", nullable=false, length=20)
    private String estado;
    @Column(name="ORDEN", nullable=false, precision=10)
    private int orden;
    @Column(name="FECHA_CREACION", nullable=false)
    private LocalDateTime fechaCreacion;
    @Column(name="FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    /** Default constructor. */
    public AgendaDisponible() {
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
     * Access method for idMedico.
     *
     * @return the current value of idMedico
     */
    public long getIdMedico() {
        return idMedico;
    }

    /**
     * Setter method for idMedico.
     *
     * @param aIdMedico the new value for idMedico
     */
    public void setIdMedico(long aIdMedico) {
        idMedico = aIdMedico;
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
     * Access method for fecha.
     *
     * @return the current value of fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Setter method for fecha.
     *
     * @param aFecha the new value for fecha
     */
    public void setFecha(LocalDate aFecha) {
        fecha = aFecha;
    }

    /**
     * Access method for hora.
     *
     * @return the current value of hora
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * Setter method for hora.
     *
     * @param aHora the new value for hora
     */
    public void setHora(LocalTime aHora) {
        hora = aHora;
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
     * Access method for idHora.
     *
     * @return the current value of idHora
     */
    public long getIdHora() {
        return idHora;
    }

    /**
     * Setter method for idHora.
     *
     * @param aIdHora the new value for idHora
     */
    public void setIdHora(long aIdHora) {
        idHora = aIdHora;
    }

    /**
     * Access method for lugar.
     *
     * @return the current value of lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Setter method for lugar.
     *
     * @param aLugar the new value for lugar
     */
    public void setLugar(String aLugar) {
        lugar = aLugar;
    }

    /**
     * Access method for estado.
     *
     * @return the current value of estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Setter method for estado.
     *
     * @param aEstado the new value for estado
     */
    public void setEstado(String aEstado) {
        estado = aEstado;
    }

    /**
     * Access method for orden.
     *
     * @return the current value of orden
     */
    public int getOrden() {
        return orden;
    }

    /**
     * Setter method for orden.
     *
     * @param aOrden the new value for orden
     */
    public void setOrden(int aOrden) {
        orden = aOrden;
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
     * Compares the key for this instance with another AgendaDisponible.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AgendaDisponible and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AgendaDisponible)) {
            return false;
        }
        AgendaDisponible that = (AgendaDisponible) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AgendaDisponible.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AgendaDisponible)) return false;
        return this.equalKeys(other) && ((AgendaDisponible)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[AgendaDisponible |");
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
