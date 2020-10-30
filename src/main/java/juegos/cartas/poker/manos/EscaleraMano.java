package juegos.cartas.poker.manos;

import java.util.List;

import juego.cartas.clasicos.cartas.OrdenarCartas;
import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Escalera
 * @author victor
 *
 */
public abstract class EscaleraMano<C extends ICartaNumeroPalo<N, P>,N,P> extends ManoPoker<C,N,P> //implements Comparable<Escalera>
{
	private N cartaMasAlta;
	private N cartaMasBaja;

	String nombre=ConstantesPR1.ESCALERA;
	
	public EscaleraMano(List<C> mano, DominioValorPalo<N, P, C> dom )
	{
			super(mano,dom);
			//tipo=ManoEnum.straight;
			//cartas =  (new OrdenarCartas()).ordenarPorNumeroAscendente(mano);
            cartas =  (new OrdenarCartas()).ordenarPorNumero(mano);
                        
            // si la escalera contiene un as, pero su carta mas baja es un 2, poner el as como ultima 
			//if(cartas.get(4).getNumero()==2 && cartas.get(0).getNumero()==1)
			if(dom.getDomValor().get(1).equals(cartas.get(4).getNumero())
			&&	dom.getDomValor().get(0).equals(cartas.get(0).getNumero())	)
            {
				C as = cartas.get(0);
				cartas.add(5,as);
				cartas.remove(0);
			}
			
			cartaMasAlta=cartas.get(0).getNumero();
			cartaMasBaja=cartas.get(4).getNumero();

	
	}
	
	@Override
	public int compareTo(Mano m)
	{
		ManoPoker<C,N,P> m2= (ManoPoker) m;	
		int retorno= super.compareTo(m2);
		if(retorno!=0)
			return retorno;
		//retorno= Integer.compare(cartaMasAlta, ((Escalera)m2).cartaMasAlta);
		retorno= compValor.compare(cartaMasAlta,((EscaleraMano<C,N,P>)m2).cartaMasAlta);
		return retorno;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(nombre);
		
		sb.append(" desde ");
		sb.append(cartaMasBaja);
		sb.append(" hasta ");
		sb.append(cartaMasAlta);
		
	
		return sb.toString();
	}
	
	/*
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(nombre);
		
		/*sb.append(" desde ");
		sb.append(cartas.get(0).dameNombre());
		sb.append(" hasta ");
		sb.append(cartas.get(4).dameNombre());
		*/
	/*
		return sb.toString();
	}
	*/
	
	
}
