package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.cartas.ordenar.OrdenarCartas;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Dobles parejas
 * @author victor
 *
 */
public class DoblesParejas<C extends ICartaNumeroPalo<N, P>,N,P> extends ManoPoker<C,N,P>
{
	
	private N parejaMayor;
	private N parejaMenor;
	private N desparejada;
	
	
	
	
	public DoblesParejas(List<C> mano, DominioValorPalo<N, P, C> dom)
	{
		super(mano,dom);
		tipo=NombreManoPoker.two_pair;
		List<C> manoOrd =  (new OrdenarCartas()).ordenarPorIguales(mano);
		parejaMayor= manoOrd.get(0).getNumero();
		parejaMenor= manoOrd.get(2).getNumero();
		desparejada= manoOrd.get(4).getNumero();

		if(compValor.compare(parejaMayor,parejaMenor)==-1)
		{
			N cartaAux= parejaMayor;
			parejaMayor=parejaMenor;
			parejaMenor=cartaAux;
		}
		this.cartas=manoOrd;
			
			
	}
	
	@Override
	public int compareTo(Mano m)
	{
		ManoPoker<C,N,P> m2= (ManoPoker) m;
		int r= super.compareTo(m2);
		if(r!=0)return r;
		
		DoblesParejas<C,N,P> dp= (DoblesParejas<C,N,P>) m2;
		// r=parejaMayor.compareTo(dp.parejaMayor);
		 r=compValor.compare(parejaMayor,dp.parejaMayor);
		 
		 if(r!=0)return r;
		// r=parejaMenor.compareTo(dp.parejaMenor);
		 r=compValor.compare(parejaMenor,dp.parejaMenor);
		 
		 if(r!=0)return r;
		 //r=desparejada.compareTo(dp.desparejada);
		 r=compValor.compare(desparejada,dp.desparejada);
		 
		 return r;
		
		
		
	}
		
	public String toString()
	{
		
		/*Carta c1 = cartas.get(0);
		Carta c2 = cartas.get(2);
		*/
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(ConstantesPR1.DOBLES_PAREJAS);
		sb.append(" of ");
		sb.append(dom.getDomValor().toString(parejaMayor));//.dameNombre());
		sb.append("s and ");
		sb.append(dom.getDomValor().toString(parejaMenor));//.dameNombre());
		sb.append("s");	//\n
		
	
		return sb.toString();
	}
	
	
	
}
