package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Carta mas alta
 * 
 * @author victor
 *
 */
public class CartaMasAlta<C extends ICartaNumeroPalo<N, P>,N,P> extends ManoSegunCompararTodas<C,N,P> //implements Comparable<ManoPoker> {
{
	/** Constructor de carta mas alta
	 * 
	 * @param mano
	 * @param dom 
	 */
	public CartaMasAlta(List<C> mano, DominioValorPalo<N, P, C> dom)// ,ManoEnum me
	{
		super(mano,dom);
		tipo = NombreManoPoker.high_card;
		//List<Carta> manoOrd = (new OrdenarCartas()).ordenarPorNumero(mano);
		//cartas = manoOrd;

	}

	@Override
	public int compareTo(Mano m2) {
		/*int r = super.compareTo(m2);
		if (r != 0)
			return r;
		int i = 0;

		while (r == 0 && i < cartas.size()) 
		{
			r = cartas.get(i).compareTo(m2.cartas.get(i));
			i++;
		}
		
		return r;*/
		
		return super.compareTo(m2);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ConstantesPR1.CARTA_MAS_ALTA);
		sb.append(" ");
		// sb.append(" carta mas alta : ");
		sb.append(dom.toString(cartas.get(0)));//.dameNombre());

		return sb.toString();
	}

}
