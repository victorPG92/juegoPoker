package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.ordenar.OrdenarCartas;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Trio
 * @author victor
 *
 */
public class Trio extends ManoPoker 
{

	
	
		public Trio(List<Carta> mano )
		{
			
				
				tipo=NombreMano.three_of_a_kind;
				List<Carta> manoOrd =  (new OrdenarCartas()).ordenarPorIguales(mano);
				this.cartas=manoOrd;
				
				
			
		}
		
	
	public String toString()
	{
				
		StringBuffer sb = new StringBuffer();
		sb.append(ConstantesPR1.TRIO);
		sb.append(" of ");
		sb.append(cartas.get(0).dameNombre());
		sb.append("s");	//\n
		return sb.toString();
	}
	
	
	
	
}
