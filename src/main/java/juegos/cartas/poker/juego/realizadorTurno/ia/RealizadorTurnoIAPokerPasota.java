package juegos.cartas.poker.juego.realizadorTurno.ia;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.JugadorPokerTexasHoldem;

/**
 * Lo unico que hace este jugador es pasar
 * @author victor
 *
 */
public  class RealizadorTurnoIAPokerPasota<C extends ICartaComparable> 
extends RealizadorTurnoIAPoker<C>
{	

	public RealizadorTurnoIAPokerPasota(JugadorPokerTexasHoldem<C> jugador, JuegoPoker<C> juegoCartas) {
		super(jugador, juegoCartas);
	}

	public Apuesta<AccionPoker> escogeAccion()
	{
		
		return new Apuesta<>(AccionPoker.PASAR);
	}


	


	
	

}
