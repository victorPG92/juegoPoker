package juegos.cartas.poker.juego.realizadorTurno.ia;

import java.util.List;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.FasesPoker;
import juegos.cartas.poker.juego.JuegoPoker;

/**
 * Crea estrategia inteligente
 * @author victor
 *
 */
public  class RealizadorTurnoIAPokerInteligente  extends RealizadorTurnoIAPoker
{
	
	
	
	
	public RealizadorTurnoIAPokerInteligente(JuegoPoker juegoPoker) {
		super(juegoPoker);
	}

	public Apuesta<AccionPoker> escogeAccion()
	{
		List<Carta> cartas = jugador.getCartas();
		
		if(FasesPoker.PREFLOP.equals(getJuegoPoker().getFase()))
		{
			boolean juegaPreFlop=rango.isJuega(cartas);
			
			
			
		
		}
		
		return null;
	}


	


	
	

}
