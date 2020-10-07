package juegos.cartas.poker.juego.realizadorTurno.ia;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.JuegoPoker;

/**
 * Lo unico que hace este jugador es pasar
 * @author victor
 *
 */
public  class RealizadorTurnoIAPokerPasota<C extends ICartaComparable> 
extends RealizadorTurnoIAPoker<C>
{
	
	
	
	
	public RealizadorTurnoIAPokerPasota(JuegoPoker<C> juegoPoker) {
		super(juegoPoker);
	}

	public Apuesta<AccionPoker> escogeAccion()
	{
		
		return new Apuesta<>(AccionPoker.PASAR);
	}


	


	
	

}
