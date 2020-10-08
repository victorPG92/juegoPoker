package juegos.cartas.poker.mesas;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Jugador;

public class PosicionConJugador<C extends ICartaComparable, J extends Jugador<C>>
{
	PosicionJugador pos;
	J jugador;
	
	
	
	public PosicionConJugador(PosicionJugador pos, J jugador) {
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
	public J getJugador() {
		return jugador;
	}
	public void setJugador(J jugador) {
		this.jugador = jugador;
	}
	
	

}
