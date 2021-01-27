package cuentadeBanco;

import java.util.ArrayList;
import java.util.Random;
//Crear una clase BankAccount.
//La clase debe tener los siguientes atributos: (string) n�mero de cuenta, (double) saldo cuenta corriente, (double) saldo cuenta de ahorros.
//Crear una variable (static) que contenga el n�mero de cuentas creadas hasta el momento.
//Crear una variable (static) que rastree la cantidad de dinero almacenado en cada cuenta creada.
//Crear un m�todo privado que retorne un n�mero de 10 d�gitos aleatorios para el n�mero de cuenta.
//En el constructor, llamar al m�todo privado anterior, as� cada usuario tendr� un n�mero de cuenta de 10 d�gitos aleatorios.
//En el constructor, asegurarse de incrementar el contador de cuentas creadas.
//Crear un m�todo getter para el saldo de la cuenta corriente del usuario.
//Crear un m�todo getter para el saldo de la cuenta de ahorros del usuario.
//Crear un m�todo que permita al usuario depositar dinero en su cuenta corriente o cuenta de ahorros, aseg�rese de aumentar el total de dinero almacenado.
//Crear un m�todo para retirar dinero de una cuenta. No permita que retire dinero si tiene fondos insuficientes.
//Crear un m�todo para ver el total de dinero en la cuenta corriente y en la cuenta de ahorros.
//Los usuarios no deber�an poder configurar ning�n atributo de la clase

public class BankAccount {

	// atributos
	private String numeroDeCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorro;
	public static int CuentasCreadas;
	public static int saldoEnCuenta;

	// constructor
	public BankAccount() {
		this.numeroDeCuenta = randomCuenta();
		CuentasCreadas++;
//		 saldoCuentaCorriente =  saldoCuentaCorriente;
//		saldoCuentaAhorro = saldoCuentaAhorro;
	}
	//  metodo
	private String randomCuenta(){
		String numero ="";

		for(int i=0;i<10;i++){
			int aleatorio = (int) Math.floor((Math.random()*9));

			numero=  (numero +""+ aleatorio);
		}
		//System.out.println(numero);	
		return numero;
	}
	
		public double depositoCtaCte(double deposito) {
		this.saldoCuentaCorriente= this.saldoCuentaCorriente+deposito;
		this.saldoEnCuenta = (int) (this.saldoEnCuenta + deposito);
		return this.saldoCuentaCorriente;
	}
//		public double giroCtaCte(double Giro) {
//			this.saldoCuentaCorriente= this.saldoCuentaCorriente-Giro;
//			return this.saldoCuentaCorriente;
			
			public void retirar(double giro) {
				if (giro < this.getSaldoCuentaCorriente()) {
					this.setSaldoCuentaCorriente(this.getSaldoCuentaCorriente()- giro);
				} else {
					System.out.println("saldo insuficiente ");
				}
		}
		
		public double depositoCtaAhorro(double deposito1) {
			this.saldoCuentaAhorro= this.saldoCuentaAhorro+deposito1;
			this.saldoEnCuenta = (int) (this.saldoEnCuenta + deposito1);
			return this.saldoCuentaAhorro;
		}
		public double giroCtaAhorro(double Giro1) {
			this.saldoCuentaCorriente= this.saldoCuentaCorriente-Giro1;
			return this.saldoCuentaCorriente;
		}

	
		
	
	
	// sett y gett
	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}

	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}
		




	
	

}
