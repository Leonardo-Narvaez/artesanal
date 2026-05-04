package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class testJUnit_Negocio_Mejorado_AgregarMaquina {

	@Test
	void agregarVariasMaquinas() {

		NegocioMejorado taberna = new NegocioMejorado();

		taberna.agregarMaquina("Pilsener", "Cerveza", 0.02);

		taberna.agregarMaquina("Corona", "Importada", 0.06);

		taberna.agregarMaquina("Club", "Nacional", 0.04);

		ArrayList<Maquina> m1 = taberna.getMaquinas();

		assertEquals(3, m1.size());
	}
}
