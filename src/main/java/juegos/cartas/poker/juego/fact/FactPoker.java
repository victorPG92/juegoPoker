package juegos.cartas.poker.juego.fact;

import java.util.List;

import juego.cartas.clasicos.mazos.fact.FactMazoConcretoEnums;
import juego.cartas.clasicos.modelos.ICartaNumeroPaloFrancesa;
import juego.cartas.clasicos.palos.PaloFrances;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.JugadorPokerTexasHoldem;
import juegos.cartas.poker.juego.realizadorTurno.FactRealizadorPoker;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;

public class FactPoker{

	FactRealizadorPoker factRealizador= new FactRealizadorPoker();
	public JuegoPoker<ICartaNumeroPaloFrancesa<Integer,PaloFrances>> creaPoker(int j)
	{
		FactMazoConcretoEnums factMazo= new FactMazoConcretoEnums();
		MazoGen<ICartaNumeroPaloFrancesa<Integer,PaloFrances>, Integer, PaloFrances> mazo = factMazo.crearBarajaFrancesa();
		
		JuegoPoker<ICartaNumeroPaloFrancesa<Integer,PaloFrances>> poker=
				new JuegoPoker<>(j, mazo);
		
		List<JugadorPokerTexasHoldem<ICartaNumeroPaloFrancesa<Integer,PaloFrances>>> jugadores= poker.getMesa().getJugadores();
		
		for (JugadorPokerTexasHoldem<ICartaNumeroPaloFrancesa<Integer, PaloFrances>> jugadorPokerTexasHoldem : jugadores)
		{
			
			RealizadorTurnoPoker realizador= factRealizador.creaRealizador();
			poker.estableceRealizadorParaJugador(jugadorPokerTexasHoldem,realizador);
		}
		
		return poker;
	}
}
