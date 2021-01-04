package fizzbuzz;
//Escribir un programa que tomar� un entero y
//mostrar� en pantalla Fizz si el n�mero es divisible
//por 3, Buzz si el n�mero es divisible por 5,
//FizzBuzz si el n�mero es divisible por 3 y 5 y
//para el resto de los casos mostrar� el n�mero que se ingres�.

public class FizzBuzz {
    public void fizzBuzz(int number) {
    	
        if (number % 3== 0 && number % 5 == 0) {
        	System.out.println("FizzBuzz");
        }else if (number % 3== 0) {
        	System.out.println("Fizz");
        }else if (number % 5== 0) {
        	System.out.println("Buzz");
        }else {
        	System.out.println(number);
        }
    }
}

