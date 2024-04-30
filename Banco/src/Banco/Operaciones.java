package Banco;

public class Operaciones {
	private Cuenta cuentaOrigen;
	private Cuenta cuentaDestino;
	private int cantidad;
	
	public Operaciones(Cuenta cuentaOrigen, Cuenta cuentaDestino, int cantidad) {
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
		this.cantidad = cantidad;
	}
	
	public void transferencia (Cuenta cuentaOrigen, Cuenta cuentaDestino, int cantidad) {
		cuentaOrigen.setCantidad(cuentaOrigen.getCantidad() - cantidad);
		cuentaDestino.setCantidad(cuentaDestino.getCantidad() + cantidad);
	}
	
	public void prestamo (Cuenta cuentaDestino, int cantidad) {
		cuentaDestino.setCantidad(cuentaDestino.getCantidad() + cantidad);
	}
	
	public void cancelarCuenta (Cuenta cuentaDestino) {
		cuentaDestino.setEstado(false);
	}
	
}
