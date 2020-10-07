package juego.cartas.poker.realizador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import juego.cartas.poker.mocks.JuegoPokerMock;
import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;
import juegos.cartas.poker.juego.realizadorTurno.ui.RealizadorTurnoPokerConsola;

class RealizadorTurnoTest {

	@Test
	void test() 
	{
		RealizadorTurnoPoker<Carta> r= new RealizadorTurnoPokerConsola(new JuegoPokerMock(2));
		
		r.setJugador(new Jugador<>());
		r.getJugador().setCartas(List.of(new Carta(1, PaloFrances.CORAZONES),new Carta(2, PaloFrances.CORAZONES)));
		
		r.escogeAccion();
		
		
	}

}
