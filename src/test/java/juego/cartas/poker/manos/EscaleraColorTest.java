package juego.cartas.poker.manos;

import org.junit.Test;

import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.poker.manos.NombreManoPoker;
import juegos.cartas.poker.manos.fact.FactoriaMano;

public class EscaleraColorTest
{
	FactTestManos factTestManos= new FactTestManos();
	FactoriaMano factoriaMano= new FactoriaMano();
	
	
	@Test
	public void creaEscaleraColor() throws Exception {
		Mano manoEscaleraColor = factoriaMano.creaMano(factTestManos.creaEscaleraColor(), NombreManoPoker.straight_flush);
		
		
	}
	@Test
	public void escaleraColorVSEscaleraColorBaja() throws Exception {
		
	}

}
