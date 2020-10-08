package juegos.cartas.poker.manos.draws;

import java.util.List;

import juegos.cartas.cartas.cartas.Carta;

public class CartaImpl2ManoRango implements Carta2ManoRango<Carta>{

	@Override
	public ManoRango toManoRango(List<Carta> cartas) {
		ManoSimple manoSimple= new ManoSimple(cartas.get(0), cartas.get(0));
		ManoRango manoRango = manoSimple.toManoRango();
		
		return manoRango;
	}

}
