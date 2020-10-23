package juegos.cartas.poker.mesas;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Mesa;
import juegos.cartas.poker.juego.JugadorPokerTexasHoldem;

/**
 * Mesa para jugar al poker texas holdem
 * Tiene una estructura que almacena las posiciones por jugador
 * @author victor
 *
 */
public class MesaPokerTexasHoldem<C extends ICartaComparable> extends Mesa<C,JugadorPokerTexasHoldem<C>>
{
	private MesaPosicionesJugadores<C,JugadorPokerTexasHoldem<C>> posiciones;

	public MesaPokerTexasHoldem(List<JugadorPokerTexasHoldem<C>> jugadores) {
		super(jugadores);
		System.out.println("construyenfo posiciones");
		posiciones= new MesaPosicionJugadoresMapaPosJug<>(jugadores);
	}

	public final MesaPosicionesJugadores<C,JugadorPokerTexasHoldem<C>> getPosiciones() {
		return posiciones;
	}

	
	
	
	
	
}
