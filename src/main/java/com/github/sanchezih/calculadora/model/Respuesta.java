package com.github.sanchezih.calculadora.model;

public class Respuesta {

	boolean error;
	String respuesta;

	public Respuesta(boolean error, String respuesta) {
		super();
		this.error = error;
		this.respuesta = respuesta;
	}

	public boolean getError() {
		return error;
	}
	
	public void setError(boolean error) {
		this.error = error;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
}
