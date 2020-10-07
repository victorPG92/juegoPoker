package juegos.cartas.poker.juego.realizadorTurno.ia;

import java.util.Map;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;
import juegos.cartas.poker.manos.draws.Rango;

/**
 * Realiza el turno en el juego de poker
 * 
 * Conoce los rangos de accion para las manos
 * 
 * @author victor
 *
 */
public abstract class RealizadorTurnoIAPoker<C extends ICartaComparable>  extends RealizadorTurnoPoker<C>
{
	public RealizadorTurnoIAPoker(JuegoPoker<C> juegoPoker) {
		super(juegoPoker);
	}


	protected double probAzar;
	protected Map<AccionPoker,Rango> rangosPorAccion;
	protected Rango rango;
	//protected FasesPoker fase; de juego
	protected AccionPoker ultimaAccionRealizada;
	
	
	public void realizaTurno()
	{
		
		
	}
	
	public abstract Apuesta<AccionPoker> escogeAccion();


	public final double getProbAzar() {
		return probAzar;
	}


	public final void setProbAzar(double probAzar) {
		this.probAzar = probAzar;
	}


	public final Rango getRango() {
		return rango;
	}


	public final void setRango(Rango rango) {
		this.rango = rango;
	}


	
	

	
	

}
