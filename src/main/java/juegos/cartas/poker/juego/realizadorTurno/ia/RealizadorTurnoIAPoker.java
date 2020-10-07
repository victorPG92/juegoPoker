package juegos.cartas.poker.juego.realizadorTurno.ia;

import java.util.List;
import java.util.Map;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.juego.RealizadorTurno;
import juegos.cartas.poker.crupier.FasesPoker;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;
import juegos.cartas.poker.manos.draws.Rango;

public  class RealizadorTurnoIAPoker  extends RealizadorTurnoPoker
{
	protected double probAzar;
	protected Map<AccionPoker,Rango> rangosPorAccion;
	protected Rango rango;
	protected FasesPoker fase;
	protected AccionPoker ultimaAccionRealizada;
	
	
	public void realizaTurno()
	{
		
		
	}
	
	public AccionPoker escogeAccion()
	{
		List<Carta> cartas = jugador.getCartas();
		
		if(FasesPoker.PREFLOP.equals(fase))
		{
			boolean juegaPreFlop=rango.isJuega(cartas);
			
		
		}
		
		return null;
	}


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


	public final FasesPoker getFase() {
		return fase;
	}


	public final void setFase(FasesPoker fase) {
		this.fase = fase;
	}
	
	
	

}
