package maestrodeobjetos;


public class Wizard extends Human{

	public Wizard() {
		super(3,3,8,50D);
		// TODO Auto-generated constructor stub
	}
	// m�todo heal(Human) que aumentar� la salud del otro Human en los puntos de intelligence que tenga el Wizard.
	public void heal(Human sanado) {
		sanado.setHealth(sanado.getHealth()+this.getIntelligence());
	}
	/*Agregar un m�todo fireBall(Human) 
	que disminuye la salud del otro Human 
	en los puntos de intelligence * 3 que tenga el Wizard*/

	public void fireBall(Human humanito) {
		humanito.setHealth(humanito.getHealth()-(this.getIntelligence()*3));
		humanito.energia();
	}
}

