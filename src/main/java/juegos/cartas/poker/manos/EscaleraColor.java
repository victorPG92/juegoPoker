package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Escalera color
 * @author victor
 *
 */
public class EscaleraColor<C extends CartaNumeroPalo<N, P>,N,P> extends EscaleraMano<C,N,P>
{
	P color;

	public EscaleraColor(List<C> mano, DominioValorPalo<N, P, C> dom)
	{
		super(mano,dom);
		
		tipo=NombreManoPoker.straight_flush;
		nombre=ConstantesPR1.ESCALERA_COLOR;
		color= mano.get(0).getPalo();
	}

	

	
/*
	public EscaleraColor(ArrayList<Carta> mano )
	{
		
			
			tipo=ManoEnum.straight_flush;
			ArrayList<Carta> manoOrd =  (new OrdenarCartas()).ordenarPorNumero(mano);
			
                        // si la escalera contiene un as, pero su carta mas alta, es en realidad un rey, poner el as como primera 
			if(manoOrd.get(0).getNum()==12 && manoOrd.get(4).getNum()==1)
			{
				Carta as = manoOrd.get(4);
				manoOrd.add(0,as);
				manoOrd.remove(5);
			}
                        
                        // si la escalera contiene un as, pero su carta mas baja es un 2, poner el as como ultima 
			if(manoOrd.get(4).getNum()==2 && manoOrd.get(0).getNum()==1)
			{
				Carta as = manoOrd.get(0);
				manoOrd.add(5,as);
				manoOrd.remove(0);
			}
			cartas=manoOrd;
	}
	
	
	
	public String toString()
	{
		
		StringBuilder sb = new StringBuilder();
		sb.append(ConstantesPR1.ESCALERA_COLOR);
		sb.append(" desde ");
		sb.append(cartas.get(0).dameNombre());
		sb.append("hasta ");
		sb.append(cartas.get(4).dameNombre());
		
	
		return sb.toString();
		
	}
	
	*/
	
}
