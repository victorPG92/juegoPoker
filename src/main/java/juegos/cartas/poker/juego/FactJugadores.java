package juegos.cartas.poker.juego;

import java.util.ArrayList;
import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
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
	
	public List<JugadorPokerTexasHoldem<C>> creaJugadores(int jug)
	{
		List<JugadorPokerTexasHoldem<C>> jugs= new ArrayList<>();
		for (int i = 0; i < jug; i++)
		{
			JugadorPokerTexasHoldem<C> j=new JugadorPokerTexasHoldem<>();
			j.setId("J"+i);
			jugs.add(j);
		}
		
		return jugs;
	}
	
	public RealizadorTurnoPoker<C> creaJugador(JugadorPokerTexasHoldem<C> jugador,TipoJugador tipo, JuegoPoker<C> juegoPoker)
	{

		switch (tipo) {
			case consola: return new RealizadorTurnoPokerConsola<>(jugador,juegoPoker);
			case ia: return new RealizadorTurnoIAPokerPasota<>(jugador,juegoPoker);		

		default:
			return null;
		}
	}
	
	public List<RealizadorTurnoPoker<C>> creaJugadores(List<JugadorPokerTexasHoldem<C>> jugadores,TipoJugador[] tipos, JuegoPoker<C> juegoPoker)
	{
		List<RealizadorTurnoPoker<C>> jugs= new ArrayList<>();
		
		//for (TipoJugador tipoJugador : tipos) 
		int n=Math.min(jugadores.size(),tipos.length);//si son iguales es el mismo
		
			
		for (int i = 0; i < n; i++)
		{
			JugadorPokerTexasHoldem<C> jugador= jugadores.get(i);			
			TipoJugador tipoJugador= tipos[i];
			
			jugs.add(creaJugador(jugador,tipoJugador, juegoPoker));
			
		}
		
		return jugs;
	}

}
