package juegos.cartas.poker.juego.realizadorTurno;

import java.util.HashMap;
import java.util.Map;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.FasesPoker;
import juegos.cartas.poker.juego.JuegoPoker;

public class RealizadorTurnoSegunFase<C extends ICartaComparable>
extends RealizadorTurnoPoker<C>
{
	Map<FasesPoker, RealizadorTurnoPoker<C>> realizadoresSegunFase= new HashMap<>();
	/*
	protected RealizadorTurnoPoker<C> realizadorTurnopreFlop;
	protected RealizadorTurnoPoker<C> realizadorTurnoFlop;
	protected RealizadorTurnoPoker<C> realizadorTurnoTurn;
	protected RealizadorTurnoPoker<C> realizadorTurnoRiver;
	 */
	public RealizadorTurnoSegunFase(JuegoPoker<C> juegoPoker) 
	{
		super(juegoPoker);
	}

	@Override
	public Apuesta<AccionPoker> escogeAccion() {
		
		return null;
	}

	@Override
	public void realizaTurno() {
		escogeAccion();		
	}
	
	public void setRealizadorFase(RealizadorTurnoPoker<C> realizador, FasesPoker fase)
	{
		
	}

}
