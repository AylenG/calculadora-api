package com.github.sanchezih.calculadora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.sanchezih.calculadora.model.Respuesta;

@RestController
@RequestMapping("/aritmetica")
public class CalculadoraAritmeticaController {

	public CalculadoraAritmeticaController() {
	}

	@RequestMapping(value = "/sumar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Respuesta sumar(@RequestParam("operando1") Integer operando1, @RequestParam("operando2") Integer operando2) {
		return new Respuesta(false, String.valueOf(operando1 + operando2));
	}

	@RequestMapping(value = "/restar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Respuesta restar(@RequestParam("operando1") Integer operando1, @RequestParam("operando2") Integer operando2) {
		return new Respuesta(false, String.valueOf(operando1 - operando2));
	}
	
	@RequestMapping(value = "/multiplicar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Respuesta multiplicar(@RequestParam("operando1") Integer operando1,
			@RequestParam("operando2") Integer operando2) {
		return new Respuesta(false, String.valueOf(operando1 * operando2));
	}

	@RequestMapping(value = "/dividir", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Respuesta dividir(@RequestParam("operando1") Integer operando1,
			@RequestParam("operando2") Integer operando2) {
		
		String respuesta = "Error. División por 0";
		boolean error = true;
		
		if(operando2 != 0) {
			respuesta = String.valueOf(operando1*1.0 / operando2);
			error = false;
		}
		
		return new Respuesta(error, respuesta);
	}
}