package juegos.cartas.poker.mesas;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Jugador;

/**
 * Representa que jugador hay en que posicion.
 * Se implementa con EnumMap
 */
public class MesaPosicionJugadores2<C extends ICartaComparable,J extends Jugador<C>> implements MesaPosicionesJugadores<C,J>
{
	
	//private LinkedHashMap<K, V> paa guardar en orden pero al ser enumerados mejro enummap
	private EnumMap<PosicionJugador, J> jugadorPorPosicion= new EnumMap<>(PosicionJugador.class);

	
	//por si acaso lo necesito en vez de usar map.values()
	List<J> jugadores;
	
	List<PosicionJugador> posicionesJugadas;
	
	/**
	 * Como maximo deben ser 6 jugadores
	 * @param jugadores
	 */
	public MesaPosicionJugadores2(List<J> jugadores)
	{
		super();
		this.jugadores=jugadores;
		
		construyeMapa();
	}



	private void construyeMapa() 
	{
		if(jugadores.size()<=6)
		{
			PosicionJugador posIni= PosicionJugador.UTG;
			for (J jugador : jugadores)
			{
				jugadorPorPosicion.put(posIni, jugador);
				posIni = posIni.sig();
			}
		}
	}



	public J getJugador(PosicionJugador pos)
	{
		return jugadorPorPosicion.get(pos);
	}
	
	/**
	 * Desplaza los jugadores a la posicion siguiente.
	 */
	public void mover()
	{
		J aux=null;
		for(PosicionJugador pos: jugadorPorPosicion.keySet())
		{
			//en el inicio, el primer elemento tiene como anterior al ultimo, 
			//el resto, ya se inicializa en la variable aux
			if(aux==null)
			{
				PosicionJugador posAntg= pos.ant();
				aux= jugadorPorPosicion.get(posAntg);
			}
			jugadorPorPosicion.put(pos, aux);
			aux= jugadorPorPosicion.get(pos);

			
			
		}
	}



	@Override
	public Iterator<J> iterator() {
		
		return null;
	}
	
	
}
