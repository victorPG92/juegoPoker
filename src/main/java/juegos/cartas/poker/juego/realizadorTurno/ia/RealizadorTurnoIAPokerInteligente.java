package juegos.cartas.poker.juego.realizadorTurno.ia;

import java.util.List;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.FasesPoker;

/**
 * Crea estrategia
 * @author victor
 *
 */
public  class RealizadorTurnoIAPokerInteligente  extends RealizadorTurnoIAPoker
{
	
	
	
	
	public Apuesta<AccionPoker> escogeAccion()
	{
		List<Carta> cartas = jugador.getCartas();
		
		if(FasesPoker.PREFLOP.equals(fase))
		{
			boolean juegaPreFlop=rango.isJuega(cartas);
			
			
			
		
		}
		
		return null;
	}


	


	
	

}
