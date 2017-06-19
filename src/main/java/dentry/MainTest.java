package dentry;

public class MainTest {

	public static void main(String[] args) {
		
		pruebaFecha();
		
	}
	
	public static void pruebaFecha(){
		
		Registro registro = new Registro(0);
		String fecha = null;
		
		try {
			fecha = registro.invertirFecha("01020017");
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("FECHA INVERTIDA: " + fecha);
		
	}

}
