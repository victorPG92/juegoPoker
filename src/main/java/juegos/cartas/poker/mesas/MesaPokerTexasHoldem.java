package juegos.cartas.poker.mesas;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.cartas.mesas.Mesa;

/**
 * Mesa para jugar al poker texas holdem
 * Tiene una estructura que almacena las posiciones por jugador
 * @author victor
 *
 */
public class MesaPokerTexasHoldem<C extends ICartaComparable> extends Mesa<C>
{
	MesaPosicionesJugadores<C> posiciones;

	public MesaPokerTexasHoldem(List<Jugador<C>> jugadores) {
		super(jugadores);
		posiciones= new MesaPosicionJugadoresMapaPosJug<>(jugadores);
	}

	public final MesaPosicionesJugadores<C> getPosiciones() {
		return posiciones;
	}

	
	
	
	
	
}
