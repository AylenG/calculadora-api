package com.github.sanchezih.calculadora.utils;

import java.math.BigInteger;

public class MathUtils {

	public static BigInteger factorial(Integer n) {
	    BigInteger result = BigInteger.ONE;
	    for (int i = 2; i <= n; i++)
	        result = result.multiply(BigInteger.valueOf(i));
	    return result;
	}
	
	public static boolean esPrimo(Integer n) {
		boolean esPrimo = true;
		for(int i = 2; i < n; i++) {
	        if (n % i == 0) {
	            esPrimo = false;
	            break;
	        }
	    }
		return esPrimo;
	}
}
