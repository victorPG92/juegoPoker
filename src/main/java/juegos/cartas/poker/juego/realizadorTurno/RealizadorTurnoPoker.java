package juegos.cartas.poker.juego.realizadorTurno;

import java.util.Map;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.juego.RealizadorTurno;
import juegos.cartas.cartas.mazos.modelos.MazoCartasSimple;
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
	//FasesPoker fase;	
	/**Con el juego puedo saber la fase, la ultima accion realizada, el dinero apostado, ... */
	protected JuegoPoker<C> juegoPoker;
	
	
	
	public RealizadorTurnoPoker(JuegoPoker<C> juegoPoker) {
		super();
		this.juegoPoker = juegoPoker;
		juegoCartas= juegoPoker;
	}



	/**
	 * Calcula el numero de fichas necesarias para igualar apuestas de otros jugadores
	 * @return
	 */
	public int fichasNecesariasParaIgualar()
	{
		//		return juegoPoker.getApuestaTurno()-(Integer)juegoPoker.getApuestas().getApuestaJugador().getOrDefault(jugador,new Apuesta(AccionPoker.ABANDONAR));

		int apuestaTurno=juegoPoker.getApuestaTurno();
		Map<Jugador<C>, Apuesta<AccionPoker>> apuestasJugadores = juegoPoker.getApuestas().getApuestaJugador();
		int apuestaJugador = apuestasJugadores.getOrDefault(jugador,new Apuesta<AccionPoker>(AccionPoker.ABANDONAR)).getFichas() ;
		
		return apuestaTurno - apuestaJugador;
		
		//return juegoPoker.getApuestaTurno()-(Integer)juegoPoker.getApuestas().getApuestaJugador().getOrDefault(jugador,new Apuesta(AccionPoker.ABANDONAR)).getFichas();
	}
	
	


	public JuegoPoker<C> getJuegoPoker()
	{
		return juegoPoker;//(JuegoPoker ) juegoCartas;
	}



	public MesaPokerTexasHoldem<C> getMesa() {
		return juegoPoker.getMesa();
	}



	public int getNumJug() {
		return juegoPoker.getNumJug();
	}



	public CrupierPokerTexasHoldemAleatorio<C> getCrupier() {
		return juegoPoker.getCrupier();
	}



	public MazoCartasSimple<C> getMazo() {
		return juegoPoker.getMazo();
	}



	public int getFichasIniciales() {
		return juegoPoker.getFichasIniciales();
	}



	public FasesPoker getFase() {
		return juegoPoker.getFase();
	}



	public int getTurno() {
		return juegoPoker.getTurno();
	}



	public Map<Jugador<C>, RealizadorTurnoIAPoker<C>> getRealizadores() {
		return juegoPoker.getRealizadores();
	}



	public int getBote() {
		return juegoPoker.getBote();
	}



	public int getApuestaTurno() {
		return juegoPoker.getApuestaTurno();
	}



	public Apuesta<AccionPoker> getUltimaAccionRealizada() {
		return juegoPoker.getUltimaAccionRealizada();
	}



	public Apuestas<C> getApuestas() {
		return juegoPoker.getApuestas();
	}
	
	public Jugador<C> getJugador()
	{
		return jugador;
	}
	

}
