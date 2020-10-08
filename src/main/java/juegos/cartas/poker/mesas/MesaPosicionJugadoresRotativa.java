package juegos.cartas.poker.mesas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Jugador;

/**
 * Representa que jugador hay en que posicion.
 * Se implementa con EnumMap
 */
public class MesaPosicionJugadoresRotativa<C extends ICartaComparable,J extends Jugador<C>> implements MesaPosicionesJugadores<C,J>
{
	
	
	
	//por si acaso lo necesito en vez de usar map.values()
	LinkedList<J> jugadores;
	
	List<PosicionJugador> posicionesJugadas;
	
	
	/**
	 * Como maximo deben ser 6 jugadores
	 * @param jugadores
	 */
	public MesaPosicionJugadoresRotativa(List<J> jugadores)
	{
		super();
		if(jugadores instanceof LinkedList)
			this.jugadores=(LinkedList<J>) jugadores;
		else
		{
			this.jugadores= new LinkedList<>();
			this.jugadores.addAll(jugadores);
		}
		construyeMapa();
	}



	private void construyeMapa() 
	{
		if(jugadores.size()<=6)
		{
			PosicionJugador posIni= PosicionJugador.UTG;
			for (J jugador : jugadores)
			{
				posicionesJugadas.add(posIni);
				posIni = posIni.sig();
			}
		}
	}



	public J getJugador(PosicionJugador pos)
	{
		return jugadores.get(posicionesJugadas.indexOf(pos));
	}
	
	/**
	 * Desplaza los jugadores a la posicion siguiente.
	 */
	public void mover()
	{
		int ultPos=jugadores.size()-1;
		J ultimoJugador= jugadores.get(ultPos);
		jugadores.remove(ultPos);
		jugadores.add(0,ultimoJugador);
		
	}



	@Override
	public Iterator<J> iterator() {
		
		return jugadores.iterator();
	}
	
	
}
