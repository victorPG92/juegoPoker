package juegos.cartas.poker.manos.draws;

import java.util.List;

import juego.cartas.clasicos.cartas.CartaFrancesaOld;

public class CartaImpl2ManoRango implements Carta2ManoRango<CartaFrancesaOld>{

	@Override
	public ManoRango toManoRango(List<CartaFrancesaOld> cartas) {
		ManoSimple manoSimple= new ManoSimple(cartas.get(0), cartas.get(0));
		ManoRango manoRango = manoSimple.toManoRango();
		
		return manoRango;
	}

}
