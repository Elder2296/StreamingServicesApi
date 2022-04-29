package ServicesStreaming.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre1")
	private String nombre1;
	
	@Column(name = "apellido1")
	private String apellido1;
	
	@Column(name = "UsuarioFacebook")
	private String UsuarioFacebook;
	
	@Column(name = "whatsapp")
	private String whatsapp;
	
	@Column(name = "email")
	private String email;
	
	public Clientes(String nombre1, String apellido1, String usuarioFacebook, String whatsapp,
			String email) {
		super();
		this.nombre1 = nombre1;
		this.apellido1 = apellido1;
		UsuarioFacebook = usuarioFacebook;
		this.whatsapp = whatsapp;
		this.email = email;
	}

	public Clientes() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getUsuarioFacebook() {
		return UsuarioFacebook;
	}

	public void setUsuarioFacebook(String usuarioFacebook) {
		UsuarioFacebook = usuarioFacebook;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	

}
