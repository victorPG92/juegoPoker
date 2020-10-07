package juego.cartas.poker.realizador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import juego.cartas.poker.mocks.JuegoPokerMock;
import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.JugadorPokerTexasHoldem;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;
import juegos.cartas.poker.juego.realizadorTurno.ui.RealizadorTurnoPokerConsola;
import juegos.cartas.poker.manos.Poker;

class RealizadorTurnoTest {

	@Test
	void test() 
	{
		Apuesta<AccionPoker> apuesta= new Apuesta<AccionPoker>(AccionPoker.PASAR); 
		RealizadorTurnoPoker<Carta> r= new RealizadorTurnoPokerConsola(new JuegoPokerMock(2,apuesta));
		
		r.setJugador(new JugadorPokerTexasHoldem<>());
		r.getJugador().setId("67");
		Carta c1=new Carta(1, PaloFrances.CORAZONES);
		Carta c2= new Carta(2, PaloFrances.CORAZONES);
		
		System.out.println(c1+" y  " +c2);
		r.getJugador().setCartas(List.of(c1,c2));
		
		System.out.println(r.getJugador());
		
		r.escogeAccion();
		
		
	}

}
