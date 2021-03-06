package juegos.cartas.poker.analisis;

import java.util.ArrayList;
import java.util.List;

import juego.cartas.clasicos.cartas.OrdenarCartas;
import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.poker.manos.NombreManoPoker;
import juegos.cartas.poker.manos.fact.FactoriaMano;

/**
 * 
 * @author victor
 * Dadas 5 cartas, permite saber que mano  disponemos
 *
 */
public class SaberJugada <C extends ICartaNumeroPalo<N, P>,N,P>
{
	
	private List<C> cartas;
	
	private boolean hayPareja;
	private boolean hayDoblePareja;
	private boolean hayTrio;
	private boolean hayFull;
	private boolean hayPoker;
	private boolean hayColor;
	private boolean hayEscalera;
	private boolean hayEscaleraColor;
	
		
	private N hc1;
	
	@SuppressWarnings("unused")
	private N hc2;
	
	
	
	private Mano mano;

	private DominioValorPalo<N,P,C> dom;
	
	
	
	public SaberJugada(List<C> manos,DominioValorPalo<N, P, C> dom)
	{
		
		this.dom=dom;
		if(manos.size()==5)
		{
			this.cartas=manos;
			
			hayPareja=false;
			hayTrio=false;
			hayPoker=false;
			hayColor=false;
			hayEscalera=false;
			
			
			
			comprobarIguales();
			comprobarColor();
			
			if(!(hayPareja || hayTrio || hayPoker))//ya calculado 
				comprobarEscalera();
			
			
			if(hayPareja && hayTrio) 	hayFull=true;
			if(hayEscalera && hayColor) hayEscaleraColor=true;
			
			//System.out.println("parsea  algo con  de "+hc1+" y "+ hc2) ;
			
			FactoriaMano<C,N,P> f = new FactoriaMano<>(dom);
			
			//metodo antiguo
			/*
			if(hayEscaleraColor)	mano = f.creaMano(NombreManoPoker.straight_flush, 	hc1,hc2);
			else if(hayPoker)		mano = f.creaMano(NombreManoPoker.four_of_a_kind, 	hc1,hc2);
			else if(hayFull)		mano = f.creaMano(NombreManoPoker.full_house, 		hc1,hc2);
			else if(hayColor)		mano = f.creaMano(NombreManoPoker.flush, 			hc1,hc2);
			else if(hayEscalera)	mano = f.creaMano(NombreManoPoker.straight, 		hc1,hc2);
			else if(hayTrio)		mano = f.creaMano(NombreManoPoker.three_of_a_kind, hc1,hc2);
			else if(hayDoblePareja)	mano = f.creaMano(NombreManoPoker.two_pair, 		hc1,hc2);
			else if(hayPareja)		mano = f.creaMano(NombreManoPoker.pair, 			hc1,hc2);
			else 					mano = f.creaMano(NombreManoPoker.high_card, 		hc1,hc2);
			*/
			
			//metodo mejor para comparar
			if(hayEscaleraColor)	mano = f.creaMano(cartas, 	NombreManoPoker.straight_flush);
			else if(hayPoker)		mano = f.creaMano(cartas, 	NombreManoPoker.four_of_a_kind);
			else if(hayFull)		mano = f.creaMano(cartas, 	NombreManoPoker.full_house);
			else if(hayColor)		mano = f.creaMano(cartas, 	NombreManoPoker.flush);
			else if(hayEscalera)	mano = f.creaMano(cartas, 	NombreManoPoker.straight);
			else if(hayTrio)		mano = f.creaMano(cartas, 	NombreManoPoker.three_of_a_kind);
			else if(hayDoblePareja)	mano = f.creaMano(cartas, 	NombreManoPoker.two_pair);
			else if(hayPareja)		mano = f.creaMano(cartas, 	NombreManoPoker.pair);
			
			//else if(proyectoEscalera)		mano = f.creaMano(cartas, 			NombreManoPoker.proyectoEscalera);
			//else if(proyectoEscalera)		mano = f.creaMano(cartas, 			NombreManoPoker.proyectoEscalera);
			//else if(proyectoColor)		mano = f.creaMano(cartas, 			NombreManoPoker.proyectoColor);
						
			else 					mano = f.creaMano(cartas, 	NombreManoPoker.high_card);
			
		}
		else System.err.println("Mano mal hecha");
	}
	
	
	
	/**
	 * Comprueba si existen cartas de misma numeracion
	 * el objetivo es saber si tenemos pareja, trio ,full o poker,
	 */
	public void comprobarIguales()
	{
		N n;
		int i=0;
		for(C c : cartas)
		{
			
			n= c.getNumero();
			if(n!=hc1)
			{
				i=1;
				for(C c2 : cartas)
				{
					if(c!=c2) // mismo objeto, no con equals
					{
						if(c2.getNumero().equals(n))i++;
					}
					
					
				}
				
				if(i==2)
				{
					if(!hayPareja ) //!hayTrio puesto despues de que full no coja bien el valor de trio y pareja
					{
						hayPareja=true;
						if(!hayTrio)hc1 = c.getNumero();
						else 		hc2 = c.getNumero();
						
					}
					else if(hayPareja && c.getNumero()!=hc1) //
					{
						
						hayDoblePareja=true;
						N hc = c.getNumero();
						//if(hc ==1 || (hc > hc1  && hc1!=1))
						if(dom.getDomValor().isFirst(hc)
						|| (dom.getDomValor().getComparator().compare(hc, hc1)>0
						&&			
							!dom.getDomValor().isFirst(hc1)
							)		
								)
						{
							hc2=hc1;
							hc1=hc;
						}
						else //if(hc <= hc1)
							hc2=hc;
						
						//System.out.println("doble pareja de "+hc1 +" y "+ hc2);
						
					}
					/*else
					{
						hayPareja=true;
						hc1 = c.getNum();
					}*/
					
					
				}
				else if(i == 3 )
				{	
					hayTrio=true;
					if(hayPareja)hc2=hc1;
					hc1= c.getNumero();
				}
				else if(i == 4 ){	hayPoker=true;hc1= c.getNumero();}
			}
		}
		
	}
	
	/**
	 * Comprueba si las cartas son del mismo palo
	 * el objetivo es saber si tenemos color (se usa para la escalera de color)
	 */
	public void comprobarColor()
	{
		
		boolean posible = true;
		N max=null;
		//N i=null;
		int i=0;
		P p = cartas.get(0).getPalo();
		
		for(C c : cartas)
		{
			
			if(!c.getPalo().equals(p))
			{
				
				posible=false;
				break;
			}
			else
			{
				i++;
				//i=dom.getDomValor().sig(i);
				if(dom.getDomValor().getComparator().compare(max, c.getNumero())==1) max=c.getNumero();//c.getNumero()>max
			}
		}
		
		if(posible && i==5)
		{
			hc1=max;
			hayColor=true;
			//System.out.println("color con "+hc1);
		}
		
		/*if(i==4)
		{
			hc1=max;
			proyectoColor=true;
			//System.out.println("color con "+hc1);
		}*/
			
		
	}
	
	/*
	public void comprobarEscalera()
	{
		
		ArrayList<Integer> esc = new ArrayList<Integer>();
		int max=0;
		
		for(CartaFrancesaOld c : cartas)
		{
			if(esc.isEmpty()){esc.add(c.getNum());if(c.getNum()>max) max=c.getNum();}
			else
			{
				int j= c.getNum();
				if		(j== esc.get(0)-1)				{esc.add(0, j);if(c.getNum()>max) max=c.getNum();}
				else if	(j== esc.get(esc.size()-1)+1)	{esc.add(j);if(c.getNum()>max) max=c.getNum();}
				else 									break;
			}
			
			
		}
		
		if(esc.size()==5)
		{
			//System.out.println("escalera con "+hc1);
			hc1=max;
			hayEscalera=true;
		}
			
		
		
	}*/
	
	
	/**
	 * Comprueba si las cartas son consecutivas, 
	 * el objetivo es saber si tenemos escalera (se usa para la escalera de color)
	 */
	public void comprobarEscalera()
	{
		OrdenarCartas<C,N,P> o = new OrdenarCartas<>();
		//ArrayList<CartaFrancesaOld > cartasOrdenadas= o.ordenarPorEscalera(cartas);
        List<C > cartasOrdenadas= o.ordenarPorNumero(cartas);
		
		boolean as=false;
		
		//tomar los 1s como 14s
		int i=0;
		
		int esc=1;
		while(i<cartasOrdenadas.size()-1)
		{
			C c = cartasOrdenadas.get(i);
			C c1 = cartasOrdenadas.get(i+1);
			N n1= c.getNumero();
			N n2 = c1.getNumero();
			
			if(dom.getDomValor().indexOf(n1)==0)//if(n1==1)
			{
				n1=dom.getDomValor().last();//14;
				as=true;
			}
			if(dom.getDomValor().isFirst(n2))//n2==1)
			{
				n2=dom.getDomValor().last();//14;
				as=true;
			}
						
			if(dom.getDomValor().dif(n1, n2)==1) esc++;//n1-n2 == 1	) esc++;
			
			i++;
		}
				
		if(esc==5)
		{
			hayEscalera=true;
			hc1=cartasOrdenadas.get(cartasOrdenadas.size()-1).getNumero();
		}
		
		
		//tomar los ases como 1s
		if(as)
		{
			//System.out.println("Hay as");
			ArrayList<C> manoTemp1 = new ArrayList<>();
			manoTemp1.addAll(cartasOrdenadas);
			esc=1;
			
                       
			// si la primera carta es un as, la muevo al final 
			C cAs= manoTemp1.get(0);
			if(dom.getDomValor().isFirst(cAs.getNumero()))//cAs.getNumero()==1)
			{
				manoTemp1.add(cAs);
				manoTemp1.remove(0);
				
			}
                        
			// System.out.println(manoTemp1);
                         i=0;
			while(i<manoTemp1.size()-1)
			{
                C c = manoTemp1.get(i);
                C c1 = manoTemp1.get(i+1);
                N n1= c.getNumero();
                N n2 = c1.getNumero();


                if(dom.getDomValor().dif(n1, n2)==1)esc++;//(n1-n2 == 1) esc++;

                i++;
			}
					
			if(esc==5)
			{
				hayEscalera=true;
				hc1=manoTemp1.get(cartasOrdenadas.size()-1).getNumero();
			}
		}
	}
	public void comprobarEscalera1()
	{
		/*
		OrdenarCartaFrancesaOlds o = new OrdenarCartaFrancesaOlds();
		ArrayList<CartaFrancesaOld > cartasOrdenadas= o.ordenarPorNumero(cartas);
		
		boolean as=false;
		int esc =0;
		CartaFrancesaOld c = cartasOrdenadas.get(0);
		for(int i=1;i<cartasOrdenadas.size();i++)
		{
			int n1= c.getNum();
			c = cartasOrdenadas.get(i);
			int n2 = c.getNum();
			if(n1-n2 == 1	) esc++;   //if(n2-n1 == 1	) esc++;
			else 
			{
				if(n1==1)as=true;
				else break;
			}
		}
		
		if(esc==5)
		{
			hayEscalera=true;
			hc1=cartasOrdenadas.get(cartasOrdenadas.size()-1).getNum();
		}
		/*else if(esc==4)
		{
			proyectoEscalera=true;
			if(as)
				hc1=13;
		}*/
	}
	
	
	public Mano dameMano()
	{
		return mano;
	}
	
	
	
	
	
	/*
	public void comprobarOpenEnded() // 4 consecutivas
	{	
	}*/
	
		
}
