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
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity 
@Table(name = "PadronElectoral", catalog = "tarea_grupo4_clave4", schema = "") 
@NamedQueries({ 
 @NamedQuery(name = "PadronElectoral.findAll", query = "SELECT p FROM PadronElectoral p"), 
 @NamedQuery(name = "PadronElectoral.findByDui", query = "SELECT p FROM PadronElectoral p WHERE p.dui = :dui"), 
 @NamedQuery(name = "Jrv.findByIdUrna", query = "SELECT p FROM PadronElectoral p WHERE p.id_Urna = :id_Urna")
 }) 
public class PadronElectoral implements Serializable{
	private String dui;
	private Urna urna;
	private String nombres;
	private String apellidos;
	private Date fecha_nac;
	private String domicilio;
	private String estado_votacion;
	private String username;
	private Date fecha_hora;
	private String user_modifico;
	private Date fecha_hora_modifico;
	
	public PadronElectoral(){
		
	}

	public PadronElectoral(String dui, String nombres, String apellidos,
			Date fecha_nac, String domicilio, Date fecha_hora) {
		super();
		this.dui = dui;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_nac = fecha_nac;
		this.domicilio = domicilio;
		this.fecha_hora = fecha_hora;
	}

	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Basic(optional = false) 
	 @Column(name = "dui") 
	public String getDui() {
		return dui;
	}

	 
	public void setDui(String dui) {
		this.dui = dui;
	}

	@JoinColumn(name = "id_urna", referencedColumnName = "id_urna") 
	@ManyToOne(optional = false) 
	public Urna getUrna() {
		return urna;
	}

	public void setUrna(Urna urna) {
		this.urna = urna;
	}

	@Basic(optional = false) 
	@Column(name = "nombres")
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Basic(optional = false) 
	@Column(name = "apellidos")
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Basic(optional = false) 
	@Column(name = "fecha_nac")
	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	@Basic(optional = false) 
	@Column(name = "domicilio")
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Basic(optional = false) 
	@Column(name = "estado_votacion")
	public String getEstado_votacion() {
		return estado_votacion;
	}

	public void setEstado_votacion(String estado_votacion) {
		this.estado_votacion = estado_votacion;
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
	@Column(name = "fecha_hora")
	public Date getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	@Basic(optional = false) 
	@Column(name = "user_modifico")
	public String getUser_modifico() {
		return user_modifico;
	}

	public void setUser_modifico(String user_modifico) {
		this.user_modifico = user_modifico;
	}

	@Basic(optional = false) 
	@Column(name = "fecha_hora_modifico")
	public Date getFecha_hora_modifico() {
		return fecha_hora_modifico;
	}

	public void setFecha_hora_modifico(Date fecha_hora_modifico) {
		this.fecha_hora_modifico = fecha_hora_modifico;
	}
	
	
}
