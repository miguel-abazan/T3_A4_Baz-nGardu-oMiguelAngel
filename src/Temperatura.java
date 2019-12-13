class Temperatura {
	private int temperatura;
	private String Fecha;
	
	public Temperatura(int temperatura, String fecha) {
		super();
		this.temperatura = temperatura;
		Fecha = fecha;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	
}

