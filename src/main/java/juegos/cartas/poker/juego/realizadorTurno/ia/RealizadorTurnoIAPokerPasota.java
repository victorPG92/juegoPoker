package juegos.cartas.poker.juego.realizadorTurno.ia;

import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;

/**
 * Lo unico que hace este jugador es pasar
 * @author victor
 *
 */
public  class RealizadorTurnoIAPokerPasota  extends RealizadorTurnoIAPoker
{
	
	
	
	
	public Apuesta<AccionPoker> escogeAccion()
	{
		
		return new Apuesta<>(AccionPoker.PASAR);
	}


	


	
	

}
