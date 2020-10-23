package juegos.cartas.poker.juego.fact;

import juegos.cartas.cartas.cartas.CartaFrancesaOld;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.cartas.mazos.fact.FactMazoConcretoEnums;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.poker.juego.JuegoPoker;

public class FactPoker{

	
	public JuegoPoker<CartaFrancesaOld> creaPoker(int j)
	{
		FactMazoConcretoEnums factMazo= new FactMazoConcretoEnums();
		MazoGen<CartaFrancesaOld, Integer, PaloFrances> mazo = factMazo.crearBarajaFrancesa();
		
		JuegoPoker<CartaFrancesaOld> poker=
				new JuegoPoker<CartaFrancesaOld>(j, mazo);
		
		return poker;
	}
}
