package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.cartas.ordenar.OrdenarCartas;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Full
 * @author victor
 *
 */
public class Full<C extends CartaNumeroPalo<N, P>,N,P> extends ManoPoker<C,N,P>
{
	private N trio;
	private N pareja;
	
	public Full(List<C> mano, DominioValorPalo dom )
	{
		super(mano, dom);
			
		tipo=NombreManoPoker.full_house;
		List<C> manoOrd =  (new OrdenarCartas()).ordenarPorIguales(mano);
		this.cartas=manoOrd;
		
		trio=cartas.get(2).getNumero();
		
		if(cartas.get(0).getNumero()==trio)
			pareja= cartas.get(4).getNumero();
		else
			pareja= cartas.get(0).getNumero();
			
		
	}
	
	@Override
	public int compareTo(Mano m)
	{
		ManoPoker<C,N,P> m2= (ManoPoker) m;
			int retorno=super.compareTo(m2);
			if(retorno!=0)
				return retorno;
			Full<C,N,P> full2= (Full<C,N,P>) m2;
			retorno= compValor.compare(trio, full2.trio);//Integer.compare(trio, full2.trio);
			if(retorno!=0)
				return retorno;
			
			retorno= compValor.compare(pareja, full2.pareja);
			
			return retorno;
		}
	
	
	public String toString()
	{
		
		StringBuffer sb = new StringBuffer();
		sb.append(ConstantesPR1.FULL);
		sb.append(" of ");
		sb.append(trio);
		sb.append("s and ");
		sb.append(pareja);
		sb.append("s");	//\n
		
	
		return sb.toString();
	}

	
	
	
}
