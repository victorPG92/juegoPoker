package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.mesas.Mano;
import juegos.cartas.cartas.ordenar.OrdenarCartas;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Dobles parejas
 * @author victor
 *
 */
public class DoblesParejas extends ManoPoker
{
	
	private Carta parejaMayor;
	private Carta parejaMenor;
	private Carta desparejada;
	
	public DoblesParejas(List<Carta> mano)
	{
		
		tipo=NombreManoPoker.two_pair;
		List<Carta> manoOrd =  (new OrdenarCartas()).ordenarPorIguales(mano);
		parejaMayor= manoOrd.get(0);
		parejaMenor= manoOrd.get(2);
		desparejada= manoOrd.get(4);

		if(parejaMayor.compareTo(parejaMenor)==-1)
		{
			Carta cartaAux= parejaMayor;
			parejaMayor=parejaMenor;
			parejaMenor=cartaAux;
		}
		this.cartas=manoOrd;
			
			
	}
	
	@Override
	public int compareTo(Mano m)
	{
		ManoPoker m2= (ManoPoker) m;
		int r= super.compareTo(m2);
		if(r!=0)return r;
		
		DoblesParejas dp= (DoblesParejas) m2;
		 r=parejaMayor.compareTo(dp.parejaMayor);
		 
		 if(r!=0)return r;
		 r=parejaMenor.compareTo(dp.parejaMenor);
		 
		 if(r!=0)return r;
		 r=desparejada.compareTo(dp.desparejada);
		 
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
		sb.append(parejaMayor.dameNombre());
		sb.append("s and ");
		sb.append(parejaMenor.dameNombre());
		sb.append("s");	//\n
		
	
		return sb.toString();
	}
	
	
	
}
