package juegos.cartas.poker.juego.fact;

import java.util.List;

import juegos.cartas.cartas.cartas.CartaFrancesaOld;
import juegos.cartas.cartas.cartas.modelos.ICartaNumeroPaloFrancesa;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.cartas.mazos.fact.FactMazoConcretoEnums;
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
