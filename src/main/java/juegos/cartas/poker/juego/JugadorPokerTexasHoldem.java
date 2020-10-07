package juegos.cartas.poker.juego;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Jugador;

/**
 * Jugador de poker texas holdem
 * que indica si se ha retirado o no
 * @author victor
 *
 * @param <C>
 */
public class JugadorPokerTexasHoldem<C extends ICartaComparable> extends Jugador<C>
{

	private boolean seHaRetirado=false;
	
	
	public void retirarse()
	{
		seHaRetirado=true;
	}
	public boolean seHaRetirado()
	{
		return seHaRetirado;
	}
	
	@Override
	public String toString() {
		return ""+getId()+"o"+getCartas();
	}
}
