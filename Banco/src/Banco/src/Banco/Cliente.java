package Banco;

public class Cliente {
	private String nombre;
	private int edad;
	private String apellidos;
	
	public Cliente (String nombre, int edad, String apellidos) {
		this.nombre = nombre;
		this.edad = edad;
		this.apellidos= apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", apellidos=" + apellidos + "]";
	}
	
	
}
