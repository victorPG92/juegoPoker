package juegos.cartas.poker.juego.fact;

import juegos.cartas.cartas.cartas.CartaFrancesaOld;
import juegos.cartas.cartas.cartas.modelos.ICartaNumeroPaloFrancesa;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.cartas.mazos.fact.FactMazoConcretoEnums;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.poker.juego.JuegoPoker;

public class FactPoker{

	
	public JuegoPoker<ICartaNumeroPaloFrancesa<Integer,PaloFrances>> creaPoker(int j)
	{
		FactMazoConcretoEnums factMazo= new FactMazoConcretoEnums();
		MazoGen<ICartaNumeroPaloFrancesa<Integer,PaloFrances>, Integer, PaloFrances> mazo = factMazo.crearBarajaFrancesa();
		
		JuegoPoker<ICartaNumeroPaloFrancesa<Integer,PaloFrances>> poker=
				new JuegoPoker<>(j, mazo);
		
		return poker;
	}
}
