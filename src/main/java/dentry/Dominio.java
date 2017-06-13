package dentry;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Dominio {

	private static int contadorReg;
	private static String filePath;
	private static List<Registro> registros;
	
	private Dominio(){
		if(registros == null){
			registros = new ArrayList<Registro>();
		}
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

	public static int incrementarCont(){
		return ++contadorReg;
	}
	
	public static void autoGuardado(int cantReg, List<Registro> registros) throws CustomException{
		incrementarCont();
		
		if(contadorReg == cantReg){
			dentry.Utils.persisteRegistros(new File(filePath), registros);
			contadorReg = 0;
		}
	}
	
}
