package juegos.cartas.poker.launcher;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.poker.juego.JuegoPoker;

public class PokerLauncherConsola <C extends ICartaComparable>
{
	
	public void loadPoker(JuegoPoker<C> poker)
	{
		poker.faseInicializacion();		
		
		poker.faseRondas();
		
		poker.faseValoracionManos();
	}

}
