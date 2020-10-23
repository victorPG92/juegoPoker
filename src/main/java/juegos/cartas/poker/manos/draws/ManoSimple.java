package juegos.cartas.poker.manos.draws;

import juegos.cartas.cartas.cartas.CartaFrancesaOld;

public class ManoSimple 
{
	private CartaFrancesaOld[] cartas;
	
	
	public ManoSimple(CartaFrancesaOld c1, CartaFrancesaOld c2)
	{
		cartas = new CartaFrancesaOld[2];
		cartas[0]=c1;
		cartas[1]=c2;
	}
	
	public ManoSimple(CartaFrancesaOld[] c2)
	{
		if(c2.length==2) cartas= c2;
		else
		{
			cartas = new CartaFrancesaOld[2];
		}
		
	}
	
	public ManoRango toManoRango()
	{
		
		ManoRango m ;
		
		CartaFrancesaOld c1= cartas[0];
		CartaFrancesaOld c2= cartas[1];
		
		
		int n1= c1.getNumero()-2;
		int n2= c2.getNumero()-2;
		
		
		if(n1==-1)n1=12;
		if(n2==-1)n2=12;
		
		if(n1 == n2) m = new ManoRango(n1);
		else
		{
			boolean suited = c1.getPalo().equals(c2.getPalo());
			m = new ManoRango(n1,n2,suited);
		}
			
			
			
		return m;
		
	}
	
	

	
	
}
