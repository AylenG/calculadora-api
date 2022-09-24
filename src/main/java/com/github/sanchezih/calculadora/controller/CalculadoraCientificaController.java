package com.github.sanchezih.calculadora.controller;

import java.math.BigInteger;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.sanchezih.calculadora.model.Respuesta;
import com.github.sanchezih.calculadora.utils.MathUtils;

@RestController
@RequestMapping("/cientifica")
public class CalculadoraCientificaController {
	
	public CalculadoraCientificaController() {
	}

	@RequestMapping(value = "/cuadrado/{numero}", method = RequestMethod.GET)
	public Respuesta cuadrado(@PathParam("numero") Double numero) {
		return new Respuesta(false, String.valueOf(Math.pow(numero, 2)));
	}
	
	@RequestMapping(value = "/factorial/{numero}", method = RequestMethod.GET)
	public Respuesta factorial(@PathParam("numero") Integer numero) {
		return new Respuesta(false, String.valueOf(MathUtils.factorial(numero)));
	}
	
	@RequestMapping(value = "/primo/{numero}", method = RequestMethod.GET)
	public Respuesta esPrimo(@PathParam("numero") Integer numero) {
		return new Respuesta(false, String.valueOf(MathUtils.esPrimo(numero)));
	}
}
