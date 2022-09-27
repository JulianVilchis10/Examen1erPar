import java.util.*;

public class CuentaCrediticia extends Cliente{
	private int idCuenta;
	private int numeroCuentas;
	private double PorcentajePuntualidad;

	public void modificarDatos(){
		System.out.println("Registrando...");
	}

	public void cambiarContrasena(int idCuenta){

		System.out.println("entrarCuenta...");
	}

	public void eliminarCuenta(int idCuenta){
		System.out.println("Saliendo...");
	}
}