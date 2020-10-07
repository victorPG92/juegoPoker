package juegos.cartas.poker.juego.fact;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.cartas.mazos.fact.FactMazoConcretoEnums;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.poker.juego.JuegoPoker;

public class FactPoker{

	
	public JuegoPoker<CartaNumeroPalo<Integer, PaloFrances>> creaPoker(int j)
	{
		FactMazoConcretoEnums factMazo= new FactMazoConcretoEnums();
		MazoGen<CartaNumeroPalo<Integer, PaloFrances>, Integer, PaloFrances> mazo = factMazo.crearBarajaFrancesa();
		
		JuegoPoker<CartaNumeroPalo<Integer, PaloFrances>> poker=
				new JuegoPoker<>(j, mazo);
		
		return poker;
	}
}
