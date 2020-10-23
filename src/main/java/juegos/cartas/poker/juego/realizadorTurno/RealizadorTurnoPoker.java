package juegos.cartas.poker.juego.realizadorTurno;

import java.util.Map;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.juego.RealizadorTurno;
import juegos.cartas.cartas.mazos.modelos.func.MazoCartasSimple;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.poker.crupier.CrupierPokerTexasHoldemAleatorio;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.FasesPoker;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.JugadorPokerTexasHoldem;
import juegos.cartas.poker.juego.realizadorTurno.ia.RealizadorTurnoIAPoker;
import juegos.cartas.poker.mesas.Apuestas;
import juegos.cartas.poker.mesas.MesaPokerTexasHoldem;

/**
 * Jugador de poker 
 * @author victor
 *
 */
public  abstract class RealizadorTurnoPoker
<C extends ICartaComparable>

extends RealizadorTurno<C,Apuesta<AccionPoker>,JuegoPoker<C>,JugadorPokerTexasHoldem<C>, FasesPoker>
{
	
	//Rango rango;
	
	public RealizadorTurnoPoker(JugadorPokerTexasHoldem<C> jugador, JuegoPoker<C> juegoCartas) {
		super(jugador, juegoCartas);
	}
	




	/**
	 * Calcula el numero de fichas necesarias para igualar apuestas de otros jugadores
	 * @return
	 */
	public int fichasNecesariasParaIgualar()
	{
		//		return juegoCartas.getApuestaTurno()-(Integer)juegoCartas.getApuestas().getApuestaJugador().getOrDefault(jugador,new Apuesta(AccionPoker.ABANDONAR));

		int apuestaTurno=juegoCartas.getApuestaTurno();
		Map<Jugador<C>, Apuesta<AccionPoker>> apuestasJugadores = juegoCartas.getApuestas().getApuestaJugador();
		int apuestaJugador = apuestasJugadores.getOrDefault(jugador,new Apuesta<AccionPoker>(AccionPoker.ABANDONAR)).getFichas() ;
		
		return apuestaTurno - apuestaJugador;
		
		//return juegoCartas.getApuestaTurno()-(Integer)juegoCartas.getApuestas().getApuestaJugador().getOrDefault(jugador,new Apuesta(AccionPoker.ABANDONAR)).getFichas();
	}
	
	


	




	public JuegoPoker<C> getJuegoPoker()
	{
		return juegoCartas;//(JuegoPoker ) juegoCartas;
	}



	public MesaPokerTexasHoldem<C> getMesa() {
		return juegoCartas.getMesa();
	}



	public int getNumJug() {
		return juegoCartas.getNumJug();
	}



	public CrupierPokerTexasHoldemAleatorio<C> getCrupier() {
		return juegoCartas.getCrupier();
	}



	public MazoCartasSimple<C> getMazo() {
		return juegoCartas.getMazo();
	}



	public int getFichasIniciales() {
		return juegoCartas.getFichasIniciales();
	}



	public FasesPoker getFase() {
		return juegoCartas.getFase();
	}



	public int getTurno() {
		return juegoCartas.getTurno();
	}



	public Map<Jugador<C>, RealizadorTurnoPoker<C>> getRealizadores() {
		return juegoCartas.getRealizadores();
	}



	public int getBote() {
		return juegoCartas.getBote();
	}



	public int getApuestaTurno() {
		return juegoCartas.getApuestaTurno();
	}



	public Apuesta<AccionPoker> getUltimaAccionRealizada() {
		return juegoCartas.getUltimaAccionRealizada();
	}



	public Apuestas<C> getApuestas() {
		return juegoCartas.getApuestas();
	}
	
	public Jugador<C> getJugador()
	{
		return jugador;
	}
	

}
