package juego.cartas.poker;

import org.junit.jupiter.api.Test;

import juegos.cartas.cartas.cartas.CartaFrancesaOld;
import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.cartas.modelos.ICartaNumeroPaloFrancesa;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.fact.FactPoker;
import juegos.cartas.poker.launcher.PokerLauncherConsola;

class PokerTest {

	@Test
	void test() {

		JuegoPoker<ICartaNumeroPaloFrancesa<Integer,PaloFrances>> poker=
				new FactPoker().creaPoker(6);
		
		System.out.println(poker.getMazo());
		System.out.println(poker.getMazo().size());
		
		PokerLauncherConsola<ICartaNumeroPaloFrancesa<Integer,PaloFrances>> launcher= new PokerLauncherConsola<>();
		
		launcher.loadPoker(poker);

		
	}

}
