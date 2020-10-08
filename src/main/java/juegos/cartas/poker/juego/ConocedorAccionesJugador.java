package juegos.cartas.poker.juego;

import java.util.ArrayList;
import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.mesas.Jugador;

/**
 * Conoce las acciones del jugador
 * @author victor
 *
 * @param <C>
 */
public class ConocedorAccionesJugador<C extends ICartaComparable>
{
	
	//private JugadorPokerTexasHoldem<C> jugador;
	//private JuegoPoker<C> juegoPoker;
	
	
	/*
	public ConocedorAccionesJugador(JugadorPokerTexasHoldem<C> jugador, JuegoPoker<C> juegoPoker) {
		super();
		this.jugador = jugador;
		this.juegoPoker = juegoPoker;
	}
	 */
	
	
	/**
	 * Obtiene las acciones permtidas, segun el jugador y el estado del juego
	 * @param fichasNecesariasParaIgualar
	 * @return
	 */
	public List<AccionPoker> accionesPermitidas(int fichasNecesariasParaIgualar,Jugador<C> jugador,JuegoPoker<C> juegoPoker) 
	{
		Apuesta<AccionPoker> ultimaApuesta=juegoPoker.getUltimaAccionRealizada();
		List<AccionPoker> accionesPermitidas = ultimaApuesta.getAccion().permite();
		if(fichasNecesariasParaIgualar> jugador.getFichas())
		{
			accionesPermitidas.remove(AccionPoker.SUBIR);
			accionesPermitidas.remove(AccionPoker.IGUALAR);
			//solo se permite all in y retirarse?? igualar tampoco
		}
		return accionesPermitidas;
	}
	
	/**
	 * Obtiene las acciones con fichas, apuestas, permitidas, segun el jugador y el estado del juego
	 * @param fichasNecesariasParaIgualar
	 * @return
	 */
	public List<Apuesta<AccionPoker>> accionesFichasPermitidas(int fichasNecesariasParaIgualar,Jugador<C> jugador,JuegoPoker<C> juegoPoker) 
	{
		List<Apuesta<AccionPoker>> acciones= new ArrayList<>();
		
		List<AccionPoker> accionesPermitidas=accionesPermitidas(fichasNecesariasParaIgualar,jugador,juegoPoker);
		for (AccionPoker accionPoker : accionesPermitidas)
		{			
			acciones.add(accion2Apuesta(accionPoker, fichasNecesariasParaIgualar,jugador));
		}
		

		return acciones;
	}
	
	/**
	 * Trasforma una accion de un jugador en apuesta 
	 * @param accionPoker
	 * @param fichasNecesariasParaIgualar
	 * @return
	 */
	public Apuesta<AccionPoker> accion2Apuesta(AccionPoker accionPoker,int fichasNecesariasParaIgualar,Jugador<C> jugador)
	{
		Apuesta<AccionPoker> apuesta = new Apuesta<>(accionPoker);
		
		if(AccionPoker.IGUALAR.equals(accionPoker))
		{
			apuesta.setFichas(fichasNecesariasParaIgualar);
		}
		else if(AccionPoker.ALL_IN.equals(accionPoker))
		{
			apuesta.setFichas(jugador.getFichas());
		}
		
		return apuesta;
	}

	/*
	public JugadorPokerTexasHoldem<C> getJugador() {
		return jugador;
	}

	public void setJugador(JugadorPokerTexasHoldem<C> jugador) {
		this.jugador = jugador;
	}

	public JuegoPoker<C> getJuegoPoker() {
		return juegoPoker;
	}

	public void setJuegoPoker(JuegoPoker<C> juegoPoker) {
		this.juegoPoker = juegoPoker;
	}
*/
	
	
}
