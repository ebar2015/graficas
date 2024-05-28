/**
 * 
 */
package com.viscaya.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @author joseviscaya
 *
 */

@Entity(name="AGENDA_MEDICA")
public class AgendaMedica implements Serializable{
	
    

    private static final long serialVersionUID = -8246707792299886820L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID", unique=true, nullable=false, precision=10)
    private long id;
    
    @Column(name="ID_MEDICO")
    private long idMedico;
    @Column(name="ID_PASCIENTE")
    private Long idPaciente;
    @Column(name="ID_APP")
    private long idApp;
    @Column(name="MEDICO")
    private String medico;
    @Column(name="PACIENTE")
    private String paciente;
    @Column(name="FECHA_NACIMIENTO", nullable=false)
    private LocalDate fechaNacimiento;
    @Column(name="GENERO")
    private String genero;
    @Column(name="ID_AGENDA")
    private Long idAgenda;
    @Column(name="NUMERO_IDENTIFICACION")
    private String numeroIdentificacion;
    @Column(name="EMAIL")
    private String email;
    @Column(name="CELULAR")
    private String celular;
    @Column(name="FECHA")
    private LocalDate fecha;
    @Column(name="HORA")
    private LocalTime hora;
    @Column(name="LUGAR")
    private String lugar;
    @Column(name="TIPO")
    private String tipo;
    @Column(name="ESPECIALIDAD")
    private String especialidad;
    @Column(name="ESTADO")
    private String estado;
    @Column(name="MENSAGE")
    private String mensage;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the idMedico
	 */
	public long getIdMedico() {
		return idMedico;
	}

	/**
	 * @param idMedico the idMedico to set
	 */
	public void setIdMedico(long idMedico) {
		this.idMedico = idMedico;
	}

	/**
	 * @return the idPaciente
	 */
	public Long getIdPaciente() {
		return idPaciente;
	}

	/**
	 * @param idPaciente the idPaciente to set
	 */
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	/**
	 * @return the medico
	 */
	public String getMedico() {
		return medico;
	}

	/**
	 * @param medico the medico to set
	 */
	public void setMedico(String medico) {
		this.medico = medico;
	}

	/**
	 * @return the paciente
	 */
	public String getPaciente() {
		return paciente;
	}

	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	/**
	 * @return the numeroIdentificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the hora
	 */
	public LocalTime getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
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
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the idApp
	 */
	public long getIdApp() {
		return idApp;
	}

	/**
	 * @param idApp the idApp to set
	 */
	public void setIdApp(long idApp) {
		this.idApp = idApp;
	}

	/**
	 * @return the idAgenda
	 */
	public Long getIdAgenda() {
		return idAgenda;
	}

	/**
	 * @param idAgenda the idAgenda to set
	 */
	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the mensage
	 */
	public String getMensage() {
		return mensage;
	}

	/**
	 * @param mensage the mensage to set
	 */
	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

}
