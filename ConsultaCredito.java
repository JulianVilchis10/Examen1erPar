import java.util.*;

public class ConsultaCredito extends Administrador{
	private int idConsulta;
	private String fechaConsulta;
	private String horaConsulta;

	public void informarEstado(int idConsulta){
		System.out.println("Registrando...");
	}

	public void verificarScoreCrediticio(int idConsulta){
		System.out.println("entrarCuenta...");
	}

	public void eliminarScore(int idConsulta){
		System.out.println("Saliendo...");
	}
}