package Cadenas;

public class StringManipulator {

	  public void trimAndConcat(String a, String b) {
		  String palabra = a.trim() + b.trim();// muy resumido

		  
		 //String palabra1 = a.trim();//otra forma de hacerlo
		 //String palabra2 = b.trim();//descomentar linea 17

		//String palabra1 = a;
		//String palabra2 = b;
		//String palabras = "";// concatena
		//palabra1 = palabra1.trim();// trim quita espacio
		//palabra2= palabra2.trim();
		//String palabras=palabra1 + palabra2;// concatena cualquier String ingresado, en este caso palabra1 y palabra2
		System.out.println(palabra);
		//return palabras;
	}
	//int getIndexOrNull(String, char): Obtener el �ndice del caracter dado 
	//y devolverlo o devolver -1. Si el caracter aparece varias veces, 
	//retornar el primer �ndice. Puede utilizar el m�todo indexOf de la clase String.
	
	 int getIndexOrNull(String cadena, char busca) {
				
		int a = cadena.indexOf(busca);//indexOf primitivo cuenta, creando variable a "cadena"
		return a;
		
	}
	 //int getIndexOrNull(String, String): Obtener el �ndice donde empieza
	 //la subcadena dada y devolverlo o devolver -1. Puede utilizar el 
	 //m�todo indexOf de la clase String.
	   int getIndexOrNull2(String x, String y ) {
			
		int z = x.indexOf(y);//indexOf primitivo cuenta, creando variable a ""
		return z;
	 }
	  //String concatSubstring(String, int, int, String): Obtener una subcadena
	   //utilizando un �ndice de inicio y un �ndice de finalizaci�n y concatenarlo
	   //con la segunda cadena de entrada en nuestro m�todo. Puede utilizar 
	   //el m�todo substring de la clase String.
	   
	   
	   
	   String concatSubstring(String a1,int x1,int y1,String b1){ //concatSubstring es el metodo
		  
		   String w = a1.substring(x1,y1);
		   return w;
	   }
	
	   
}// no borrar llave de cierre
	
	

