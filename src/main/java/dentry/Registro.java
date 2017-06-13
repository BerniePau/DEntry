package dentry;

import java.util.Calendar;

public class Registro {

	// Atributos
	private String cabecera;
	private String detalle;

	private int numeroLinea;
	private Calendar fechaPractica;
	private String fechaPractica2Str = "mmddyyyy";
	private String numeroAfiliado;
	private String codigoPractica;
	private int cantidad;
	private float monto;

	private String COMA = ",";
	private String NULO = "";
	private String NL = "\n";

	// Getters y Setters
	public String getCabecera() {
		return cabecera;
	}

	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Calendar getFechaPractica() {
		return fechaPractica;
	}

	public void setFechaPractica(Calendar fechaPractica) {
		this.fechaPractica = fechaPractica;
	}

	public String getNumeroAfiliado() {
		return numeroAfiliado;
	}

	public void setNumeroAfiliado(String numeroAfiliado) {
		this.numeroAfiliado = numeroAfiliado;
	}

	public String getCodigoPractica() {
		return codigoPractica;
	}

	public void setCodigoPractica(String codigoPractica) {
		this.codigoPractica = codigoPractica;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	// Constructor
	public Registro(int numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	// Metodos de instancia
	public String crearCabecera() {
		String linea = "";

		// TODO Realizar controles

		// TODO Formatear fecha en string fechaPractica2Str

		// <num_linea>,0,<fechaPractica_mmddaaa>,<fechaPractica_mmddaaa>,<nulo>,<nulo>,121,<num_afiliado{8}>,<num_afiliado{2}>,
		// MC999999,0,0,<nulo>,<nulo>,<nulo>,<nulo>,<nulo>,<nulo>,0,<monto>
        linea = numeroLinea + COMA + "0" + COMA
                + fechaPractica2Str + COMA + fechaPractica2Str + COMA
                + NULO + COMA + NULO + COMA
                + "121" + COMA + numeroAfiliado.substring(0, 8) + COMA
                + numeroAfiliado.substring(8, 10) + COMA + "MC999999" + COMA
                + "0" + COMA + "0" + COMA
                + NULO + COMA + NULO + COMA
                + NULO + COMA + NULO + COMA
                + NULO + COMA + NULO + COMA
                + "0" + COMA + monto + NL ;

		return linea;
	}

	public String crearDetalle() {
		String linea = "";

		// TODO Realizar controles

		// TODO Formatear fecha en string fechaPractica2Str

		// <num_linea>,1,<fechaPractica_mmddaaa>,<fechaPractica_mmddaaa>,<nulo>,<CodPractica>,<nulo>,<cantidad>,<monto>
        linea = numeroLinea + COMA + "1" + COMA
                + fechaPractica2Str + COMA + fechaPractica2Str + COMA
                + NULO + COMA + codigoPractica + COMA
                + NULO+ COMA + cantidad + COMA +
                + monto + NL;

		return linea;
	}
}
