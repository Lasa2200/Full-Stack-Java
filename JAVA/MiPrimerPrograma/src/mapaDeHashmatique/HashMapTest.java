package mapaDeHashmatique;
import java.util.*;
import java.util.Set;


public class HashMapTest {
    public static void main(String[] args) {
    	HashMap<String,String> trackList = new HashMap<String, String>();
        trackList.put("Desconf�o,Pappo's Blues", "No s� por qu�, Imagin�... Que estabamos unidos... Y me sent� mejor...Pero aqu� estoy Tan solo en la vida,Que mejor me voy");
        trackList.put("Blues del Esclavo,Mecano", "El ser negrito es un color, lo de ser esclavo no lo trago.Me tiene frito tanto trabajar de sola sol, las tierras del maldito se�orito");
        trackList.put("Perd�n, Los Cafers", "Perd�n, no es algo magico ni tragico,Perd�n es algo pr�ctico,did�ctico, Perd�n, para tu hijo tu familia hay un perd�n");
        trackList.put("Todo Cambia, Mercedes Sosa", "Cambia lo superficial, Cambia tambi�n lo profundo Cambia el modo de pensar Cambia todo en este mundo");
        trackList.put("Antiguos due�os de las flechas,Tomolec","Indio Toba no llorando aquel tiempo feliz Pilcomayos y Bermejos llorando por mi Campamento de mi raza es la America es ");
        String name= (String) trackList.get("nninjacodigo.com");
        System.out.println("El Nobre completo es:"+ name);
        
        
        
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));  // con este codigo accedo al valor nancy ninja  imprimo solo una cosa
        }
    }
}
