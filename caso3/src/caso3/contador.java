package caso3;

public class contador {
	public static int totalObjetos=0;
	private String nombres;
	public contador(String nombres) {
		this.nombres = nombres;
		totalObjetos++;
	}
	
	public int cantidad() {
		return totalObjetos;
	}
	
}
