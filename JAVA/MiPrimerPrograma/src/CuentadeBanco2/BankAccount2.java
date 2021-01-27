package CuentadeBanco2;

public class BankAccount2 {

	/*    La clase debe tener los siguientes atributos: (string) n�mero de cuenta, (double) saldo cuenta corriente, 
	 (double) saldo cuenta de ahorros.
	Crear una variable (static) que contenga el n�mero de cuentas creadas hasta el momento.
	Crear una variable (static) que rastree la cantidad de dinero almacenado en cada cuenta creada.
	Crear un m�todo privado que retorne un n�mero de 10 d�gitos aleatorios para el n�mero de cuenta.
	En el constructor, llamar al m�todo privado anterior, as� cada usuario tendr� un n�mero de cuenta de 10 d�gitos aleatorios.
	En el constructor, asegurarse de incrementar el contador de cuentas creadas.
	Crear un m�todo getter para el saldo de la cuenta corriente del usuario.
	Crear un m�todo getter para el saldo de la cuenta de ahorros del usuario.
	Crear un m�todo que permita al usuario depositar dinero en su cuenta corriente o cuenta de ahorros, 
	aseg�rese de aumentar el total de dinero almacenado.
	Crear un m�todo para retirar dinero de una cuenta. No permita que retire dinero si tiene fondos insuficientes.
	Crear un m�todo para ver el total de dinero en la cuenta corriente y en la cuenta de ahorros.
	Los usuarios no deber�an poder configurar ning�n atributo de la clase */

	private String numerocuenta;
    private double saldocorriente;
    private double saldoahorro;
    private static int cuentascreadas;
    private static int totaldinero;
    
    BankAccount2()
    {
        this.numerocuenta = generarCuenta();
        this.totaldinero += getSaldoahorro() + getSaldocorriente(); 
        this.cuentascreadas++;
    }

    private String generarCuenta()
    {
        String numero = "";

        for(int i=0; i<10;i++)
        {
            numero += Integer.toString((int) Math.random()*9);
        }

        return numero;
    }

    private double getSaldoahorro() {
        return saldoahorro;
    }
    private double getSaldocorriente() {
        return saldocorriente;
    }
    public void depositarAhorro(int cantidad)
    {
        System.out.println("cantidad a depositar: "+cantidad+" a la cuenta de Ahorro");
        saldoahorro += cantidad;
        totaldinero += cantidad;
    }

    public void depositarCorriente(int cantidad)
    {
        System.out.println("cantidad a depositar: "+cantidad+" a la cuenta Corriente");
        saldocorriente += cantidad;
        totaldinero += cantidad;
    }

    public void retirarAhorro(int cantidad)
    {
        System.out.println("cantidad a retirar: "+cantidad+" a la cuenta de Ahorro");

        if( saldoahorro - cantidad < 0 || saldoahorro == 0)
        {
            System.out.println("Saldo insuficiente para retiro");
        } 
        else
        {
            saldocorriente -= cantidad;
            totaldinero -= cantidad;
        } 
    }

    public void retirarCorriente(int cantidad)
    {
        System.out.println("cantidad a retirar: "+cantidad+" a la cuenta Corriente");

        if( saldocorriente - cantidad < 0 || saldocorriente == 0)
        {
            System.out.println("Saldo insuficiente para retiro");
        } 
        else
        {
            saldocorriente -= cantidad;
            totaldinero -= cantidad;
        } 
    }

    public void verSaldo()
    {
        System.out.println("saldo en cuenta de Ahorro: "+ getSaldoahorro());
        System.out.println("saldo en cuenta Corriente: "+ getSaldocorriente());
        System.out.println("total: "+ (getSaldoahorro() + getSaldocorriente()));

    }
}