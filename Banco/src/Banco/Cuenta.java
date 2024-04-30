package Banco;

public class Cuenta {
	private int iban;
	private Cliente cliente;
	private int cantidad;
	private boolean estado;
	
	public Cuenta (int iban, Cliente cliente, int cantidad) {
		this.iban = iban;
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.estado = true;
	}

	public int getIban() {
		return iban;
	}

	public void setIban(int iban) {
		this.iban = iban;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
