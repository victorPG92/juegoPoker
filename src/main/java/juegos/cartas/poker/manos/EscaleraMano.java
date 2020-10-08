package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.cartas.ordenar.OrdenarCartas;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Escalera
 * @author victor
 *
 */
public abstract class EscaleraMano extends ManoPoker //implements Comparable<Escalera>
{
	private Carta cartaMasAlta;
	private Carta cartaMasBaja;

	String nombre=ConstantesPR1.ESCALERA;
	
	public EscaleraMano(List<Carta> mano )
	{
			
			//tipo=ManoEnum.straight;
			//cartas =  (new OrdenarCartas()).ordenarPorNumeroAscendente(mano);
            cartas =  (new OrdenarCartas()).ordenarPorNumero(mano);
                        
            // si la escalera contiene un as, pero su carta mas baja es un 2, poner el as como ultima 
			if(cartas.get(4).getNumero()==2 && cartas.get(0).getNumero()==1)
			{
				Carta as = cartas.get(0);
				cartas.add(5,as);
				cartas.remove(0);
			}
			
			cartaMasAlta=cartas.get(0);
			cartaMasBaja=cartas.get(4);

	
	}
	
	@Override
	public int compareTo(Mano m)
	{
		ManoPoker m2= (ManoPoker) m;	
		int retorno= super.compareTo(m2);
		if(retorno!=0)
			return retorno;
		//retorno= Integer.compare(cartaMasAlta, ((Escalera)m2).cartaMasAlta);
		retorno= cartaMasAlta.compareTo(((EscaleraMano)m2).cartaMasAlta);
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
