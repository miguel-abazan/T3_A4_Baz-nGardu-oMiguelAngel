public class Nodo {

	private Temperatura dato;
	private Nodo enlace;
	
	public Nodo() {}
	
	public Nodo(Temperatura dato) {
		this.dato = dato;
	}
	public Nodo(Temperatura dato, Nodo enlace) {
		this.dato = dato;
		this.enlace = enlace;
	}
	
	public Temperatura getDato() {
		return dato;
	}
	public void setDato(Temperatura dato) {
		this.dato = dato;
	}
	public Nodo getEnlace() {
		return enlace;
	}
	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", enlace=" + enlace + "]";
	}
}