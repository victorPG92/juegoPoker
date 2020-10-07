package juegos.cartas.poker.juego.realizadorTurno;

import java.util.Map;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.juego.RealizadorTurno;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.poker.crupier.CrupierPokerTexasHoldemAleatorio;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.FasesPoker;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.mesas.Apuestas;
import juegos.cartas.poker.mesas.MesaPokerTexasHoldem;

/**
 * Jugador de poker 
 * @author victor
 *
 */
public  abstract class RealizadorTurnoPoker<C extends ICartaComparable>  extends RealizadorTurno<C,Apuesta<AccionPoker>>
{
	
	//Rango rango;
	//FasesPoker fase;	
	/**Con el juego puedo saber la fase, la ultima accion realizada, el dinero apostado, ... */
	JuegoPoker juegoPoker;
	
	
	
	public RealizadorTurnoPoker(JuegoPoker juegoPoker) {
		super();
		this.juegoPoker = juegoPoker;
		juegoCartas= juegoPoker;
	}



	public int fichasNecesariasParaIgualar()
	{
		return juegoPoker.getApuestaTurno()-(Integer)juegoPoker.getApuestas().getApuestaJugador().getOrDefault(jugador,0);
	}


	public JuegoPoker getJuegoPoker()
	{
		return juegoPoker;//(JuegoPoker ) juegoCartas;
	}



	public MesaPokerTexasHoldem getMesa() {
		return juegoPoker.getMesa();
	}



	public int getNumJug() {
		return juegoPoker.getNumJug();
	}



	public CrupierPokerTexasHoldemAleatorio getCrupier() {
		return juegoPoker.getCrupier();
	}



	public MazoGen getMazo() {
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



	public Map getRealizadores() {
		return juegoPoker.getRealizadores();
	}



	public int getBote() {
		return juegoPoker.getBote();
	}



	public int getApuestaTurno() {
		return juegoPoker.getApuestaTurno();
	}



	public Apuesta getUltimaAccionRealizada() {
		return juegoPoker.getUltimaAccionRealizada();
	}



	public Apuestas getApuestas() {
		return juegoPoker.getApuestas();
	}
	
	public Jugador<C> getJugador()
	{
		return jugador;
	}
	

}
