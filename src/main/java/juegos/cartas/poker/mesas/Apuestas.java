package juegos.cartas.poker.mesas;

import java.util.HashMap;
import java.util.Map;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.poker.juego.AccionPoker;

public class Apuestas <C extends ICartaComparable>
{
	
	private Map<Jugador<C>,Apuesta<AccionPoker>> apuestaJugador= new HashMap<>();

	/**
	 * Indica si todas las apuestas estan finalizadas
	 * es decir
	 * si todos los jugadores han apostado lo mismo
	 * o se han retirado
	 * @return
	 */
	public boolean estanApuestasFinalizadas()
	{
		final int apuestaMax=maximaApuesta();
		
		return apuestaJugador.values().stream().allMatch(a-> 
			AccionPoker.ABANDONAR.equals(a.getAccion()) ||
			a.getFichas()== apuestaMax
		);
	}
	
	/**
	 * Devuelve la maxima apuesta
	 * @return
	 */
	public int maximaApuesta()
	{
		return apuestaJugador.values().stream().
				map(a-> a.getFichas()).max(Integer::compareTo).get();
	}
	
	public Map<Jugador<C>, Apuesta<AccionPoker>> getApuestaJugador() {
		return apuestaJugador;
	}

	public void setApuestaJugador(Map<Jugador<C>, Apuesta<AccionPoker>> apuestaJugador) {
		this.apuestaJugador = apuestaJugador;
	}
	
	

}
