package juegos.cartas.poker.mesas;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Jugador;

public class PosicionConJugador<C extends ICartaComparable>
{
	PosicionJugador pos;
	Jugador<C> jugador;
	
	
	
	public PosicionConJugador(PosicionJugador pos, Jugador<C> jugador) {
		super();
		this.pos = pos;
		this.jugador = jugador;
	}
	public PosicionJugador getPos() {
		return pos;
	}
	public void setPos(PosicionJugador pos) {
		this.pos = pos;
	}
	public Jugador<C> getJugador() {
		return jugador;
	}
	public void setJugador(Jugador<C> jugador) {
		this.jugador = jugador;
	}
	
	

}
