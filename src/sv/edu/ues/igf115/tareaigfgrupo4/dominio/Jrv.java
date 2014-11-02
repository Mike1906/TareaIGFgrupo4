package dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.persistence.NamedQuery;



@Entity 
@Table(name = "jrv", catalog = "tarea_grupo4_clave4", schema = "") 
@NamedQueries({ 
 @NamedQuery(name = "Jrv.findAll", query = "SELECT j FROM Jrv j"), 
 @NamedQuery(name = "Jrv.findById", query = "SELECT j FROM Jrv e WHERE j.id_Jrv = :id_Jrv"), 
 @NamedQuery(name = "Jrv.findByDepto", query = "SELECT j FROM Jrv j WHERE j.id_Depto = :id_Depto"), 
 @NamedQuery(name = "Jrv.findByMunicipio", query = "SELECT j FROM Jrv j WHERE j.id_Municipio = :id_Municipio")}) 
public class Jrv implements Serializable{
 private int idJrv;
 private String username;
 private Date fecha_hora;
 private String user_modifico;
 private Date fecha_hora_modifico;
 private Municipio municipio;
 private Departamento departamento;
 private PadronElectoral padronelectoral;
 
 public Jrv(){
	 
 }

public Jrv( String username, Date fecha_hora, Municipio municipio,
		Departamento departamento, PadronElectoral padronelectoral) {
	super();
	this.username = username;
	this.fecha_hora = fecha_hora;
	this.municipio = municipio;
	this.departamento = departamento;
	this.padronelectoral = padronelectoral;
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Basic(optional = false) 
@Column(name = "Id_JRV") 
public int getIdJrv() {
	return idJrv;
}

public void setIdJrv(int idJrv) {
	this.idJrv = idJrv;
}

@Basic(optional = false) 
@Column(name = "username") 
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

@Basic(optional = false) 
@Column(name = "Fecha_hora") 
public Date getFecha_hora() {
	return fecha_hora;
}

public void setFecha_hora(Date fecha_hora) {
	this.fecha_hora = fecha_hora;
}

@Basic(optional = false) 
@Column(name = "User_modifico") 
public String getUser_modifico() {
	return user_modifico;
}

public void setUser_modifico(String user_modifico) {
	this.user_modifico = user_modifico;
}

@Basic(optional = false) 
@Column(name = "Fecha_hora_modifico") 
public Date getFecha_hora_modifico() {
	return fecha_hora_modifico;
}

public void setFecha_hora_modifico(Date fecha_hora_modifico) {
	this.fecha_hora_modifico = fecha_hora_modifico;
}

@JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio") 
@ManyToOne(optional = false) 
public Municipio getMunicipio() {
	return municipio;
}

public void setMunicipio(Municipio municipio) {
	this.municipio = municipio;
}

@JoinColumn(name = "id_depto", referencedColumnName = "id_depto") 
@ManyToOne(optional = false) 
public Departamento getDepartamento() {
	return departamento;
}

public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
}

@JoinColumn(name = "dui", referencedColumnName = "dui") 
@ManyToOne(optional = false) 
public PadronElectoral getPadronelectoral() {
	return padronelectoral;
}

public void setPadronelectoral(PadronElectoral padronelectoral) {
	this.padronelectoral = padronelectoral;
}
 
 
}
