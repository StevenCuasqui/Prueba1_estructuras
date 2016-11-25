package estructuras;

public class Persona {
	
	private String Nombre;
	private int id;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, int id) {
		super();
		Nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nombre=" + Nombre + " Identificacion=" + id+"//";
	}
	
	

}
