package juegos.cartas.poker.juego.realizadorTurno.ia;

import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.JuegoPoker;

/**
 * Lo unico que hace este jugador es pasar
 * @author victor
 *
 */
public  class RealizadorTurnoIAPokerPasota  extends RealizadorTurnoIAPoker
{
	
	
	
	
	public RealizadorTurnoIAPokerPasota(JuegoPoker juegoPoker) {
		super(juegoPoker);
	}

	public Apuesta<AccionPoker> escogeAccion()
	{
		
		return new Apuesta<>(AccionPoker.PASAR);
	}


	


	
	

}
