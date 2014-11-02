package sv.edu.ues.igf115.tareaigfgrupo4.dominio;

import java.util.Date;

import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "miembrojrv", catalog = "tarea_grupo4_clave4", schema = "")
public class MiembroJRV {
	private String idMiembro;
	private String idTipo;
	private int idJ;
	private String nombres;
	private String apellidoP;
	private String apellidoM;
	private String username;
	private Date fecha;
	private String usernameM;
	private Date fechaM;
	
	public MiembroJRV(String idMiembro, String idTipo, int idJ, String nombres, String apellidoP, String apellidoM, String username, 
					Date fecha,String usernameM, Date fechaM) {
		super();
		this.idMiembro = idMiembro;
		this.idTipo = idTipo;
		this.idJ = idJ;
		this.nombres = nombres;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.username = username;
		this.fecha = fecha;
		this.usernameM = usernameM;
		this.fechaM = fechaM;
	}

	public String getIdMiembro() {
		return idMiembro;
	}

	public void setIdMiembro(String idMiembro) {
		this.idMiembro = idMiembro;
	}

	public String getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(String idTipo) {
		this.idTipo = idTipo;
	}

	public int getIdJ() {
		return idJ;
	}

	public void setIdJ(int idJ) {
		this.idJ = idJ;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUsernameM() {
		return usernameM;
	}

	public void setUsernameM(String usernameM) {
		this.usernameM = usernameM;
	}

	public Date getFechaM() {
		return fechaM;
	}

	public void setFechaM(Date fechaM) {
		this.fechaM = fechaM;
	}
	
	

}