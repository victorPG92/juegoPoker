package juegos.cartas.poker.mesas;

import java.util.Iterator;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Jugador;

/**
 * Organiza los jugadores segun las posiciones
 * permite iterar los jugadores desde la primera posicion a la ultima
 * y obtener el jugador en la posicion x
 * @param pos
 * @return
 */
public interface MesaPosicionesJugadores<C extends ICartaComparable, J extends Jugador<C>>
extends Iterable<J>
{
	
	
	/**
	 * Obtiene el jugador sentado en la posicion indicada
	 * @param pos
	 * @return
	 */
	public J getJugador(PosicionJugador pos);
	
	
	/**
	 * Iterador para recorrer los jugadores en la posicion indicada
	 * @param pos
	 * @return
	 */
	public Iterator<J> iterator() ;

}
