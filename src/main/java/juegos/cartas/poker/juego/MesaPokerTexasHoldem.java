package juegos.cartas.poker.juego;

import java.util.List;

import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.cartas.mesas.Mesa;

public class MesaPokerTexasHoldem extends Mesa
{
	MesaPosicionJugadores posiciones;

	public MesaPokerTexasHoldem(List<Jugador> jugadores) {
		super(jugadores);
		posiciones= new MesaPosicionJugadores(jugadores);
	}

	public final MesaPosicionJugadores getPosiciones() {
		return posiciones;
	}

	
	
	
	
	
}
