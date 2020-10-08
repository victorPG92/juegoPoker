package juegos.cartas.poker.manos.draws;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;

/**
 * Transforma una carta de tipo C en una mano rango
 * @author victor
 *
 * @param <C>
 */
public interface Carta2ManoRango <C extends ICartaComparable>
{
	
	/**
	 * Transforma 2 cartas de tipo C en una mano rango
	 * @param carta
	 * @return
	 */
	ManoRango toManoRango(List<C> cartas);

}
