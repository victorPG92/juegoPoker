package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.cartas.ordenar.OrdenarCartas;

/**
 * Mano Carta mas alta
 * 
 * @author victor
 *
 */
public class ManoSegunCompararTodas<C extends ICartaNumeroPalo<N, P>,N,P> extends ManoPoker<C,N,P> implements Mano//Comparable<ManoPoker> 
{

	/** Constructor de carta mas alta
	 * 
	 * @param mano
	 * @param dom 
	 */
	public ManoSegunCompararTodas(List<C> mano, DominioValorPalo<N, P, C> dom)// ,ManoEnum me
	{
		super(mano, dom);
		//tipo = ManoEnum.high_card;
		List<C> manoOrd = (new OrdenarCartas()).ordenarPorNumero(mano);
		cartas = manoOrd;

	}

	@Override
	public int compareTo(Mano m)
	{
		ManoPoker<C,N,P> m2= (ManoPoker) m;
		int r = super.compareTo(m2);
		if (r != 0)
			return r;
		int i = 0;

		while (r == 0 && i < cartas.size()) 
		{
			r = comp.compare(cartas.get(i),m2.cartas.get(i));//)//);
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
