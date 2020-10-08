package juegos.cartas.poker.juego.realizadorTurno.ia;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.FasesPoker;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.JugadorPokerTexasHoldem;

/**
 * Crea estrategia inteligente
 * @author victor
 *
 */
public  class RealizadorTurnoIAPokerInteligente<C extends ICartaComparable>  extends RealizadorTurnoIAPoker<C>
{
	
	public RealizadorTurnoIAPokerInteligente(JugadorPokerTexasHoldem<C> jugador, JuegoPoker<C> juegoCartas) {
		super(jugador, juegoCartas);
	}

	public Apuesta<AccionPoker> escogeAccion()
	{
		List<C> cartas = (List<C>) jugador.getCartas();//TODO
		
		if(FasesPoker.PREFLOP.equals(getJuegoPoker().getFase()))
		{
			boolean juegaPreFlop=rango.isJuega(cartas);
			
			
			
		
		}
		
		return null;
	}


	


	
	

}
