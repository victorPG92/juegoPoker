package juego.cartas.poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.fact.FactPoker;

class PokerTest {

	@Test
	void test() {

		JuegoPoker<CartaNumeroPalo<Integer, PaloFrances>> poker=
				new FactPoker().creaPoker(2);
	
	}

}
