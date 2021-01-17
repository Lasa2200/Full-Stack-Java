package Rompecabeza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {

/* 1.-Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. 
Imprimir la suma de todos los n�meros en el arreglo. El m�todo tambi�n 
debe retornar un arreglo que incluya solo los n�meros que son mayores a
10 (Por ejemplo cuando env�a el arreglo anterior, debe retornar un arreglo
con los valores de 13,25,32).*/
	
	public ArrayList<Integer> imprimeSuma (ArrayList<Integer>arreglo) {
		ArrayList<Integer> nMayores =new ArrayList<Integer>();// creo la nueva ArrayList
		Integer suma=0;// creo la variable suma
		for (int i = 0; i < arreglo.size (); i++) {// recorro todo el arreglo
			suma= suma + arreglo.get(i);// sumo todo lo que esta dentro del arreglo
			if (arreglo.get(i)>10){// pregunto por los mayores
				nMayores.add(arreglo.get(i));// agrego nueva funcion
				
			}
		}
		System.out.println(suma);// imprimo la suma
		return nMayores; // retorno la nueva array
		
	}
	
/* 2.- Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, 
 * Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona. 
* Haga que el m�todo tambi�n devuelva un arreglo con los nombres que tienes m�s de 5 caracteres.*/
	
	public ArrayList<String> imprimNombre (ArrayList<String>arreglo){
		ArrayList<String> nNombres =new ArrayList<String>();
		 Collections.shuffle(arreglo);
		for (int i = 0; i < arreglo.size(); i++) {
			if ( arreglo.get(i).length()>5) {
				nNombres.add(arreglo.get(i));
			}
		}
		System.out.println(arreglo);
		return nNombres;
	}
	
/* 3.-Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores).
 *  Mezcle el arreglo y, despu�s de mezclarlo, imprima la �ltima letra del arreglo. 
 *  Tambi�n debe imprimir la primera letra del arreglo. Si la primera letra del arreglo es una vocal,
 *  haga que muestre un mensaje. Para mezclar una colecci�n, puede utilizar el m�todo shuffle
 *  de la clase Collections. Documentaci�n de la Clase Collections.   */
	
	public void mezclarLetras (ArrayList<String> abc){
		 Collections.shuffle(abc);
		 System.out.println(abc);
		 System.out.println(abc.get(abc.size()-1));
		 System.out.println(abc.get(0));
		 String p = abc.get(0);// variable
		 
		 if(p == "A" || p == "E" || p == "I" || p == "O" || p == "U"){
			System.out.println("es vocal");
		 }	
	}

/*4.-Generar y devolver un arreglo con 10 n�meros aleatorios entre 55 - 100.
Para obtener un n�mero entero aleatorio, puede utilizar el m�todo nextInt de la clase Random.
 Documentaci�n de la Clase Random.  */
	
	public void numeroAleatorio3 () {
		ArrayList<Integer> numeros = new ArrayList<Integer>();// generar ArrayList con el punto add le agregamos valores
		
		for (int i = 0; i < 10; i++) {//  obtener solo 10 numeros
			int  numeroAleatorio = (int) (Math.random()*(100-55))+55;//  numero aleatorio ente 55-100
			 
			numeros.add (numeroAleatorio);// agregando numeroAleatorio al ArrayList llamada numero
		}
				System.out.println(numeros);
	}
		
/* 5.- Generar y devolver un arreglo con 10 n�meros aleatorios entre 55 - 100 y hacer que est�n ordenados
 *  (mostrar el n�mero m�s peque�o en el principio del arreglo). Imprimir todos los n�meros del arreglo.
 *   Luego, Imprimir el valor m�nimo del arreglo, as� como el valor m�ximo.
Para ordenar una colecci�n, puede utilizar el m�todo sort de la clase Collections.*/
	
	public void numeroAleatorio5 () {
		ArrayList<Integer> numeros = new ArrayList<Integer>();// generar ArrayList con el punto add le agregamos valores
		
		for (int i = 0; i < 10; i++) {//  obtener solo 10 numeros
			int  numeroAleatorio = (int) (Math.random()*(100-55))+55;//  numero aleatorio ente 55-100
			 
			numeros.add (numeroAleatorio);// agregando numeroAleatorio al ArrayList llamada numero
		}
			Collections.sort(numeros);// por defecto es de menor a mayor ordena los numero dentro del ArrayList
			System.out.println(numeros);
			numeros.get(0);// acceder al primer elemento(0)
			numeros.get(9);// acceder al ultimo elemento 
			numeros.get(numeros.size()-1);// acceder al ultimo elemento de forma generica
			System.out.println(numeros.get(0));
			System.out.println(numeros.get(numeros.size()-1));
	}
	
	
	
/* 6.- Crear una cadena aleatoria con 5 caracteres de longitud.*/
	
	public String cadenaAleatoria (ArrayList<String> arreglo) {
		String cadena="";
		for (int i = 0; i < 5; i++) {//  obtener solo 5 
		
			int numeroAleatorio = (int) (Math.random()*(arreglo.size()-1))+1;// generar un numero del 1 al tama�o del arreglo, aleatorio, .size ()-1 no se conoce el tama�o del arreglo
			cadena = cadena + arreglo.get(numeroAleatorio);// .get obtener el dato en la posicion aleatoria
		
		}
			System.out.println(cadena);
			return cadena;
	}

	
/*7.- Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud.*/
	
	public void arregloAleatoria () {
		ArrayList<Integer> cadena10 = new ArrayList<Integer>();// generar ArrayList con el punto add le agregamos valores
		
		for (int i = 0; i < 5; i++) {//  obtener solo 10 numeros
			int aleatorio = (int) (Math.random()*(65-5))+5;//  numero aleatorio ente 55-100
			 
			cadena10.add (aleatorio);// agregando numeroAleatorio al ArrayList llamada numero
		}
			System.out.println(cadena10);
	
	}
	// como hacer para que random se genere 10 veces y guarde en el arraylist
}// no borrar
	


