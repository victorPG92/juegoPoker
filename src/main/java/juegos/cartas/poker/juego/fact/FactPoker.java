package juegos.cartas.poker.juego.fact;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.cartas.mazos.fact.FactMazoConcretoEnums;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.poker.juego.JuegoPoker;

public class FactPoker{

	
	public JuegoPoker<ICartaNumeroPalo<Integer, PaloFrances>> creaPoker(int j)
	{
		FactMazoConcretoEnums factMazo= new FactMazoConcretoEnums();
		MazoGen<ICartaNumeroPalo<Integer, PaloFrances>, Integer, PaloFrances> mazo = factMazo.crearBarajaFrancesa();
		
		JuegoPoker<ICartaNumeroPalo<Integer, PaloFrances>> poker=
				new JuegoPoker<ICartaNumeroPalo<Integer, PaloFrances>>(j, mazo);
		
		return poker;
	}
}
