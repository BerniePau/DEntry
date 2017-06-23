package dentry;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Dominio {

	private static int numeroLinea;
	private static int contadorReg;
	private static int cantRegAutoguardado = 2; // TODO Parametrizar por properties
	private static String filePath;
	private static List<Registro> registros;
	
	// Constructor
	
	private Dominio(){
		if(registros == null){
			registros = new ArrayList<Registro>();
		}
	}
	
	// Getters y Setters
	
	// Incrementa el numeroDeLinea
	public static int getNumeroLinea() {
		return ++numeroLinea;
	}

	public static void setNumeroLinea(int numeroLinea) {
		Dominio.numeroLinea = numeroLinea;
	}
	
	public static List<Registro> getRegistros(){
		return registros;
	}
	
	public static void addRegistro(Registro reg){
		registros.add(reg);
	}
	
	public static String getFilePath() {
		return filePath;
	}

	public static void setFilePath(String filePath) {
		Dominio.filePath = filePath;
	}
	

	// Metodos de Clase
	
	public static int incrementarCont(){
		return ++contadorReg;
	}
	
	public static void autoGuardado() throws CustomException{
		incrementarCont();
		
		if(contadorReg == cantRegAutoguardado){
			dentry.Utils.persisteRegistros(new File(filePath), registros);
			contadorReg = 0;
			registros.clear();
		}
	}
		
}
