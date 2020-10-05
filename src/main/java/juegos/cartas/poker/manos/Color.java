package juegos.cartas.poker.manos;

import java.util.List;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.poker.ConstantesPR1;

/**
 * Mano Color
 * @author victor
 *
 */
public class Color extends ManoSegunCompararTodas {
	
	
	
	// Constructor de carta mas alta
	public Color(List<Carta> mano)
	{
		super(mano);
		tipo=NombreMano.flush;
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
