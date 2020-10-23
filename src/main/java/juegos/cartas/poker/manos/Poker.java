package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.ordenar.OrdenarCartas;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Poker
 * 
 * @author victor
 *
 */
public class Poker<C extends CartaNumeroPalo<N, P>, N, P> extends ManoPoker<C, N, P>
{

	private N kind;

	public Poker(List<C> mano, DominioValorPalo<N, P, C> dom)
	{
		super(mano, dom);

		tipo = NombreManoPoker.four_of_a_kind;
		List<C> manoOrd = (new OrdenarCartas()).ordenarPorIguales(mano);
		this.cartas = manoOrd;
		kind = cartas.get(0).getNumero();

	}
	/*
	 * po que?
	 * 
	 * @Override public ManoEnum dameTipo() { // TODO Auto-generated method stub
	 * return ManoEnum.four_of_a_kind; }
	 */

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(ConstantesPR1.POKER);
		sb.append(" of ");
		sb.append(kind);
		sb.append("s"); // \n
		return sb.toString();

	}

}
