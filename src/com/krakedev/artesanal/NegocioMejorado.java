package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	private ArrayList<Maquina> maquinas;

	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}

	public NegocioMejorado() {
		maquinas = new ArrayList<Maquina>();
	}

	public String generarCodigo() {
		int numerico = (int) (Math.random() * 100) + 1;

		String codigo = "M-" + numerico;

		return codigo;
	}

	public void agregarMaquina(String nombreCerveza, String descripcion, double precioPorMl) {
		String codigo = generarCodigo();
		Maquina taberna = new Maquina(codigo, nombreCerveza, descripcion, precioPorMl);

		maquinas.add(taberna);
	}

	public void cargarMaquinas() {
		for (int i = 0; i < maquinas.size(); i++) {
			Maquina m = maquinas.get(i);
			m.llenarMaquina();
		}
	}
}
