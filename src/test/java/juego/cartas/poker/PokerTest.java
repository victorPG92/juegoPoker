package juego.cartas.poker;

import org.junit.jupiter.api.Test;

import juego.cartas.clasicos.modelos.ICartaNumeroPaloFrancesa;
import juego.cartas.clasicos.palos.PaloFrances;
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
