package juego.cartas.poker.manos;

import org.junit.Test;

import juego.cartas.clasicos.cartas.CartaFrancesaOld;
import juego.cartas.clasicos.dom.fact.FactDominiosCartasEnumFr;
import juego.cartas.clasicos.palos.PaloFrances;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.poker.manos.NombreManoPoker;
import juegos.cartas.poker.manos.fact.FactoriaMano;

public class EscaleraColorTest
{
	FactTestManos factTestManos= new FactTestManos();
	FactDominiosCartasEnumFr f= new FactDominiosCartasEnumFr();
	private DominioValorPalo<Integer,PaloFrances,CartaFrancesaOld> dom= f.creaDominioVP();

	FactoriaMano factoriaMano= new FactoriaMano(dom);
	
	
	@Test
	public void creaEscaleraColor() throws Exception {
		Mano manoEscaleraColor = factoriaMano.creaMano(factTestManos.creaEscaleraColor(), NombreManoPoker.straight_flush);
		
		
	}
	@Test
	public void escaleraColorVSEscaleraColorBaja() throws Exception {
		
	}

}
