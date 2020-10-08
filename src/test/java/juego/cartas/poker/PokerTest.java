package juego.cartas.poker;

import org.junit.jupiter.api.Test;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.fact.FactPoker;
import juegos.cartas.poker.launcher.PokerLauncherConsola;

class PokerTest {

	@Test
	void test() {

		JuegoPoker<CartaNumeroPalo<Integer, PaloFrances>> poker=
				new FactPoker().creaPoker(2);
		
		PokerLauncherConsola<CartaNumeroPalo<Integer, PaloFrances>> launcher= new PokerLauncherConsola<>();
		
		launcher.loadPoker(poker);

		
	}

}
