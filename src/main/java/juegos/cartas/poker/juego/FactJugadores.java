package juegos.cartas.poker.juego;

import java.util.ArrayList;
import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;
import juegos.cartas.poker.juego.realizadorTurno.ia.RealizadorTurnoIAPokerPasota;
import juegos.cartas.poker.juego.realizadorTurno.ui.RealizadorTurnoPokerConsola;

/**
 * Crea jugadores segun el tipo
 * @author victor
 *
 * @param <C>
 */
public class FactJugadores<C extends ICartaComparable> 
{
	
	public List<Jugador<C>> creaJugadores(int jug)
	{
		List<Jugador<C>> jugs= new ArrayList<>();
		for (int i = 0; i < jug; i++)
		{
			JugadorPokerTexasHoldem<C> j=new JugadorPokerTexasHoldem<>();
			j.setId("J"+i);
			jugs.add(j);
		}
		
		return jugs;
	}
	
	public RealizadorTurnoPoker<C> creaJugador(TipoJugador tipo, JuegoPoker<C> juegoPoker)
	{

		switch (tipo) {
			case consola: return new RealizadorTurnoPokerConsola<>(juegoPoker);
			case ia: return new RealizadorTurnoIAPokerPasota<>(juegoPoker);		

		default:
			return null;
		}
	}
	
	public List<RealizadorTurnoPoker<C>> creaJugadores(TipoJugador[] tipos, JuegoPoker<C> juegoPoker)
	{
		List<RealizadorTurnoPoker<C>> jugs= new ArrayList<>();
		for (TipoJugador tipoJugador : tipos) 
		{
			jugs.add(creaJugador(tipoJugador, juegoPoker));
			
		}
		
		return jugs;
	}

}
