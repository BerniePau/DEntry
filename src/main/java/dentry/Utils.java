package dentry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Utils {

	public static void persisteRegistros(File file, List<Registro> registros) throws CustomException{
		
		FileWriter fw = null;
		BufferedWriter bufferw = null;
		
		try{
			
			if(!file.exists()){
				file.createNewFile();
			}
			
			fw = new FileWriter(file, true);
			bufferw = new BufferedWriter(fw);
			
			for(Registro reg : registros){				
				bufferw.write(reg.getCabecera());
				bufferw.write(reg.getDetalle());
			}
			
			System.out.println("Escribió.");
		}catch(Exception e){
			throw new CustomException("Error al escribir archivo.");
		}
		finally {
			try {
				bufferw.flush();
				bufferw.close();
				fw.close();
			} catch (IOException e) {
				throw new CustomException("Se produjo un error al cerrar el archivo.");
			}
		}
	}
}
