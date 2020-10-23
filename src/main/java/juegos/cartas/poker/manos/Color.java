package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Color
 * @author victor
 *
 */
public class Color<C extends CartaNumeroPalo<N, P>,N,P> extends ManoSegunCompararTodas<C,N,P> {
	
	
	
	// Constructor de carta mas alta
	public Color(List<C> mano, DominioValorPalo<N, P, C> dom)
	{
		super(mano,dom);
		tipo=NombreManoPoker.flush;
		/*ArrayList<Carta> manoOrd =  (new OrdenarCartas()).ordenarPorNumero(mano);
		this.cartas=manoOrd;
		*/
		
		
		
			
	}
	
	
	
	
	
	
	

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(ConstantesPR1.COLOR);
		//sb.append(" carta mas alta : ");
		//sb.append(cartas.get(0));
		
	
		return sb.toString();
	}
	
	
	
	
	
}
