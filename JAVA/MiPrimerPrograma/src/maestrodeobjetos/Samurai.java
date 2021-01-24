package maestrodeobjetos;

public class Samurai extends Human {

	// constructor super class
	public Samurai() {
		super(3,3,3,200D);

	}
	//m�todo deathBlow(Human) que asesina al otro Human y reduce la health del Samurai a la mitad.
	public void deathBlow(Human muerto) {
		muerto.setHealth(0D);
		this.setHealth(this.getHealth()/2);
		energia();
	}
	//m�todo meditate() que curar� al Samurai en la mitad de puntos que tenga de health.
	public void meditate() {
		//this.setHealth(this.getHealth() -this.getHealth()/2);
		this.setHealth(1.5*this.getHealth());// fraccionada
	}

	//Samurai: Agregar un m�todo howMany() que devuelve el n�mero actual del Samurai.

	public void howMany() {
		this.getHealth();
	}
}