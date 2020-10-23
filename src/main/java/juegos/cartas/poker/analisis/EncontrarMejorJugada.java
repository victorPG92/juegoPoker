package juegos.cartas.poker.analisis;

import java.util.ArrayList;
import java.util.List;

import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.cartas.utils.Combinaciones;


/**
 * 
 * @author victor
 * 
 * implementacion del problema de la mochila de 2 niveles (elijo solo las 2 que no entran )
 * sacar de 7 cartas 5 , que den la jugada mayor
 *
 */
public class EncontrarMejorJugada<C extends ICartaNumeroPalo<V,P>,V,P> {
	
	
	private List<C> cartas;
	
	//private List<C> manoTemp;
	//private int valor;
	//private int valorMejor;
	//private ArrayList<CartaFrancesaOld> manoMejor;
	private Mano manoMejor;//cambiado

	private DominioValorPalo<V, P, C> dom;
	
	
	
	
	public EncontrarMejorJugada(List<C> cartas)
	{
		if(cartas.size()>=5  && cartas.size()<=7)
		{
			this.cartas=cartas;
			//valorMejor = -1;
			manoMejor=null;
			buscar();
						
		}
			
		
	}
	
	/**
	 * Busco la mejor mano dado unas cartas
	 * @param cartas
	 */
	public void buscar()
	{
		//Combinaciones cmb = new Combinaciones(7, 5);
		Combinaciones cmb = new Combinaciones(cartas.size(), 5);
		
		ArrayList<ArrayList<Integer>> combinaciones = cmb.dameTodasLasCombinaciones();
		
		for(ArrayList<Integer> indices : combinaciones)
		{
			List<C> manoTemp = new  ArrayList<C >();
			for(Integer i : indices)
				manoTemp.add(cartas.get(i));

			SaberJugada<C,V,P> sj = new SaberJugada<>(manoTemp,dom);
			Mano m= sj.dameMano();
			
			
			if (manoMejor==null) manoMejor=m;
			else
			{
				if(manoMejor.compareTo(m)==-1)
				{
					manoMejor=m;
				}
			}
			
			/*
			valor = sj.dameMano().dameTipo().getValor();
			
			if(valor > valorMejor) 
			{
				valorMejor = valor;
				manoMejor =  sj.dameMano();
			}*/
			
		}
	}

	
	//cambiado
	public Mano getManoMejor() {
		return manoMejor;
	}

	

	
	
	//METODO PRUEBA
	/*public static void main (String args[])
	{
		Mazo m = new Mazo();
		
		ArrayList<CartaFrancesaOld> cartas = new ArrayList<CartaFrancesaOld>();
		
		for(int i=0;i<7;i++)
			cartas.add(m.dameCartaFrancesaOldAleatoria());
		
		System.out.println(cartas);
		EncontrarMejorJugada e = new EncontrarMejorJugada(cartas);
		Mano manoMejor = e.getManoMejor();
		System.out.println(manoMejor);
	}*/









































	/*
	public EncontrarMejorJugada(ArrayList<CartaFrancesaOld> manos)
	{
		if(manos.size()==7)
		{
			this.manos=manos;
			elegir = new boolean[7];
			
			
			for(int i=0;i<7;i++)
				for(int j=0;j<7;j++)
				{
					manoTemp = new ArrayList<CartaFrancesaOld>();
					for(int k=0;k<7;k++)
					{
						if(k!= i && k != j) 
						{
							elegir[k]=true;
							manoTemp.add(manos.get(k));
							
							
						}
						else 	elegir[k]=false;
					}
					
					SaberJugada sj = new SaberJugada(manoTemp);
					valor = sj.dameMano().dameTipo().getValor();
					
					if(valor > valorMejor) 
					{
						valorMejor = valor;
						manoMejor = manoTemp;
					}
					
					
				}
			
		}
	}*/
	

}
