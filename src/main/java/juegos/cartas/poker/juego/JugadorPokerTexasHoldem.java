package juegos.cartas.poker.juego;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Jugador;

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
}
