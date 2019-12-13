public class ListaEnlazada {

	Nodo nodoInicio;
	Nodo nodoFin;

	// 1) Crear lista enlazada
	public ListaEnlazada() {
		nodoFin = nodoInicio = null;
	}

	// 2) Agregar elemento al inicio
	public void agregarElemenentoAlInicio(Temperatura dato) {
		Nodo nodoNuevo = new Nodo(dato);

		if (nodoInicio == null) {
			nodoFin = nodoInicio = nodoNuevo;
		} else {
			nodoNuevo.setEnlace(nodoInicio);
			nodoInicio = nodoNuevo;
		}
	}

	public void mostrarElementos() {
		Nodo nodoActual = nodoInicio;

		while (nodoActual != null) {
			System.out.print("[" + nodoActual.getDato() + "]-->");
			nodoActual = nodoActual.getEnlace();
		}
	}

	public void eliminarInicio() {
		if (nodoInicio != null) {
			nodoInicio = nodoInicio.getEnlace();
		}

	}

	public void insertarFinal(Temperatura dato) {
		Nodo nuevoNodo = new Nodo(dato);
		
		if (nodoInicio != null) {
			nodoFin.setEnlace(nuevoNodo);
			nodoFin = nuevoNodo;
		} else {
			nodoFin = nodoInicio = nuevoNodo;
		}
	}

	public void eliminarFinal() {
		Nodo aux = nodoInicio;
		if (nodoInicio != null) {
			while (aux.getEnlace() != null) {
				nodoFin=aux;
				aux=aux.getEnlace();
			}
			nodoFin.setEnlace(null);
			nodoFin=aux;
		}

	}

	
	public int mostrarCantidadElementos() {
		Nodo aux = nodoInicio;
		if (nodoInicio!=null) {
			int cont = 0;
			while(aux!=null){
				cont+=1;
				aux=aux.getEnlace();
			}
			return cont;
		} else {
			return 0;
		}
	}
	public boolean vacia() {
		if (nodoInicio==null) {
			return false;
			
		}
		return true;
		
	}
	
	public String mostrarPromedio(ListaEnlazada l, String año) {
		año = año.substring(6);
		double promedio = 0;
		Nodo nodoActual = l.nodoInicio;
		int cont = 0;
		while(nodoActual.getEnlace()!= null) {
			if (nodoActual.getDato().getFecha().substring(6).equals(año)) {
				promedio = promedio + nodoActual.getDato().getTemperatura();
				cont+=1;
			}
			
			nodoActual = nodoActual.getEnlace();
			
		}
		promedio = promedio/cont;
		String retorno = "";
		if (promedio<10) {
			retorno = promedio + "-" + "Congelacion";
		} else if(promedio<20){
			retorno = promedio + "-" + "Frio";
		}else if (promedio<30) {
			retorno = promedio + "-" + "Normal";
		}else if (promedio<40) {
			retorno = promedio + "-" + "Alta";
		}
		return retorno;
		
	}
	

}