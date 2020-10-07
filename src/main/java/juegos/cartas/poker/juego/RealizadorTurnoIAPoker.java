package juegos.cartas.poker.juego;

import java.util.List;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.juego.RealizadorTurno;
import juegos.cartas.poker.crupier.FasesPoker;
import juegos.cartas.poker.manos.draws.Rango;

public  class RealizadorTurnoIAPoker  extends RealizadorTurno<Carta,AccionPoker>
{
	protected double probAzar;
	Rango rango;
	FasesPoker fase;
	AccionPoker ultimaAccionRealizada;
	
	
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
