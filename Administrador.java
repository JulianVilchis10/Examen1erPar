import java.util.*;

public class Administrador extends Persona{
	private int idAdmin;
	private String rfc;
	private String numeroTelefonico;

	public void altaCliente(int idAdmin){
		System.out.println("Registrando...");
	}

	public void bajaCliente(int idAdmin){
		System.out.println("entrarCuenta...");
	}

	public void buscarCliente(int idAdmin){
		System.out.println("Saliendo...");
	}
}