package juegos.cartas.poker.juego.realizadorTurno;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.juego.RealizadorTurno;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.JuegoPoker;

/**
 * Jugador de poker 
 * @author victor
 *
 */
public  abstract class RealizadorTurnoPoker<C extends ICartaComparable>  extends RealizadorTurno<C,Apuesta<AccionPoker>>
{
	
	//Rango rango;
	//FasesPoker fase;	
	/**Con el juego puedo saber la fase, la ultima accion realizada, el dinero apostado, ... */
	JuegoPoker juegoPoker;
	
	
	
	public int fichasNecesariasParaIgualar()
	{
		return juegoPoker.getApuestaTurno()-(Integer)juegoPoker.getApuestas().getApuestaJugador().getOrDefault(jugador,0);
	}


	
	
	

}
