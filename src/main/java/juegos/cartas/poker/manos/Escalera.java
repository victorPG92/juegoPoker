package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Escalera
 * @author victor
 *
 */
public class Escalera<C extends ICartaNumeroPalo<N, P>,N,P> extends EscaleraMano<C,N,P> //implements Comparable<Escalera>
{

	/*private Carta cartaMasAlta;
	private Carta cartaMasBaja;
*/
	String nombre=ConstantesPR1.ESCALERA;
	
	public Escalera(List<C> mano, DominioValorPalo<N, P, C> dom )
	{
			super(mano,dom);
			tipo=NombreManoPoker.straight;
			//cartas =  (new OrdenarCartas()).ordenarPorNumeroAscendente(mano);
            /*cartas =  (new OrdenarCartas()).ordenarPorNumero(mano);
                        
            // si la escalera contiene un as, pero su carta mas baja es un 2, poner el as como ultima 
			if(cartas.get(4).getNum()==2 && cartas.get(0).getNum()==1)
			{
				Carta as = cartas.get(0);
				cartas.add(5,as);
				cartas.remove(0);
			}
			
			cartaMasAlta=cartas.get(0);
			cartaMasBaja=cartas.get(4);

	*/
	}
	
	@Override
	public int compareTo(Mano m)
	{
		ManoPoker<C,N,P> m2= (ManoPoker) m;
		
		int retorno= super.compareTo(m2);
		//if(retorno!=0)
			return retorno;
		//retorno= Integer.compare(cartaMasAlta, ((Escalera)m2).cartaMasAlta);
	//	retorno= cartaMasAlta.compareTo(((Escalera)m2).cartaMasAlta);
	//s	return retorno;
	}

	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(nombre);
		
		/*sb.append(" desde ");
		sb.append(cartas.get(0).dameNombre());
		sb.append(" hasta ");
		sb.append(cartas.get(4).dameNombre());
		*/
	
		return sb.toString();
	}
	
	
	
}
