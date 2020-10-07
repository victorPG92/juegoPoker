package juegos.cartas.poker.juego;

import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;

import juegos.cartas.cartas.mesas.Jugador;

/**
 * Representa que jugador hay en que posicion.
 * Se implementa con EnumMap
 */
public class MesaPosicionJugadores 
{
	
	//private LinkedHashMap<K, V> paa guardar en orden pero al ser enumerados mejro enummap
	private EnumMap<PosicionJugador, Jugador> jugadorPorPosicion= new EnumMap<>(PosicionJugador.class);

	
	//por si acaso lo necesito en vez de usar map.values()
	List<Jugador> jugadores;
	
	/**
	 * Como maximo deben ser 6 jugadores
	 * @param jugadores
	 */
	public MesaPosicionJugadores(List<Jugador> jugadores)
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
			for (Jugador jugador : jugadores)
			{
				jugadorPorPosicion.put(posIni, jugador);
				posIni = posIni.sig();
			}
		}
	}



	public Jugador getJugador(PosicionJugador pos)
	{
		return jugadorPorPosicion.get(pos);
	}
	
	/**
	 * Desplaza los jugadores a la posicion siguiente.
	 */
	public void mover()
	{
		Jugador aux=null;
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
	
	
}
