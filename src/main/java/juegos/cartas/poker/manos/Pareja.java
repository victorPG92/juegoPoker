package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.ordenar.OrdenarCartas;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Pareja Una pareja esta formada por dos cartas iguales y 3 cartas
 * diferentes
 * 
 * @author victor
 *
 */
public class Pareja<C extends CartaNumeroPalo<N, P>, N, P> extends ManoPoker<C, N, P>
{

	public Pareja(List<C> mano, DominioValorPalo<N, P, C> dom)
	{
		super(mano, dom);

		tipo = NombreManoPoker.pair;
		List<C> manoOrd = (new OrdenarCartas()).ordenarPorIguales(mano);
		this.cartas = manoOrd;

	}

	@Override
	public NombreManoPoker dameTipo()
	{

		return NombreManoPoker.pair;
	}

	public String toString()
	{

		StringBuffer sb = new StringBuffer();
		sb.append(ConstantesPR1.PAREJA);
		sb.append(" of ");
		sb.append(dom.toString(cartas.get(0)));// .dameNombre());
		sb.append("s"); // \n
		return sb.toString();

	}

}
