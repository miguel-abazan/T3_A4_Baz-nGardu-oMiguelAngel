
public class Prueba {
public static void main(String[] args) {
		
		Temperatura t1 = new Temperatura(15, "12/12/2010");
		Temperatura t2 = new Temperatura(15, "12/12/2015");
		Temperatura t3 = new Temperatura(20, "12/12/2000");
		Temperatura t4 = new Temperatura(40, "12/12/2012");
		Temperatura t5 = new Temperatura(30, "12/12/2012");

		ListaEnlazada l1 = new ListaEnlazada();
		l1.agregarElemenentoAlInicio(t1);
		l1.agregarElemenentoAlInicio(t2);
		l1.agregarElemenentoAlInicio(t3);
		l1.agregarElemenentoAlInicio(t4);
		l1.agregarElemenentoAlInicio(t5);
		System.out.println(l1.mostrarPromedio(l1, "20/15/2012"));
		
	}
}
