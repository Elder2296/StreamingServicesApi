package ServicesStreaming.dto;

public class ClientesDTO {

	private Integer id;
	private String nombre1;
	private String apellido1;
	private String UsuarioFacebook;
	private String whatsapp;
	private String email;


	public ClientesDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
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
		return this.UsuarioFacebook;
	}

	public void setUsuarioFacebook(String UsuarioFacebook) {
		this.UsuarioFacebook = UsuarioFacebook;
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

	public ClientesDTO( String nombre1, String apellido1, String UsuarioFacebook, String whatsapp, String email) {
		super();
		
		this.nombre1 = nombre1;
		this.apellido1 = apellido1;
		this.UsuarioFacebook = UsuarioFacebook;
		this.whatsapp = whatsapp;
		this.email = email;
	}

	
}
