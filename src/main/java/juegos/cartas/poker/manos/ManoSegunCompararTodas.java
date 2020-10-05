package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.mesas.Mano;
import juegos.cartas.cartas.ordenar.OrdenarCartas;

/**
 * Mano Carta mas alta
 * 
 * @author victor
 *
 */
public class ManoSegunCompararTodas extends ManoPoker implements Mano//Comparable<ManoPoker> 
{

	/** Constructor de carta mas alta
	 * 
	 * @param mano
	 */
	public ManoSegunCompararTodas(List<Carta> mano)// ,ManoEnum me
	{

		//tipo = ManoEnum.high_card;
		List<Carta> manoOrd = (new OrdenarCartas()).ordenarPorNumero(mano);
		cartas = manoOrd;

	}

	@Override
	public int compareTo(Mano m)
	{
		ManoPoker m2= (ManoPoker) m;
		int r = super.compareTo(m2);
		if (r != 0)
			return r;
		int i = 0;

		while (r == 0 && i < cartas.size()) 
		{
			r = cartas.get(i).compareTo(m2.cartas.get(i));
			i++;
		}
		
		return r;
	}

	/*
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ConstantesPR1.CARTA_MAS_ALTA);
		sb.append(" ");
		// sb.append(" carta mas alta : ");
		sb.append(cartas.get(0).dameNombre());

		return sb.toString();
	}*/

}
