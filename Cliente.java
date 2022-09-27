import java.util.*;

public class Cliente extends Persona{
	private int idCliente;
	private String rfc;
	private String numeroTelefonico;

	public void registrarCliente(){
		System.out.println("Registrando...");
	}

	public void entrarCuenta(int idCliente){
		System.out.println("entrarCuenta...");
	}

	public void salirCuenta(int idCliente){
		System.out.println("Saliendo...");
	}
}