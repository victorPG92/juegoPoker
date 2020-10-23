package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.ordenar.OrdenarCartas;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Trio
 * @author victor
 *
 */
public class Trio<C extends CartaNumeroPalo<N, P>,N,P> extends ManoPoker<C,N,P> 
{

	
	
		public Trio(List<C> mano, DominioValorPalo<N, P, C> dom )
		{
			super(mano, dom);
				
				tipo=NombreManoPoker.three_of_a_kind;
				List<C> manoOrd =  (new OrdenarCartas()).ordenarPorIguales(mano);
				this.cartas=manoOrd;
				
				
			
		}
		
	
	public String toString()
	{
				
		StringBuffer sb = new StringBuffer();
		sb.append(ConstantesPR1.TRIO);
		sb.append(" of ");
		sb.append(dom.toString(cartas.get(0)));//.dameNombre());
		sb.append("s");	//\n
		return sb.toString();
	}
	
	
	
	
}
