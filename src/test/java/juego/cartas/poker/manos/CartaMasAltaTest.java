package juego.cartas.poker.manos;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import juego.cartas.clasicos.cartas.CartaFrancesaOld;
import juego.cartas.clasicos.dom.fact.FactDominiosCartasEnumFr;
import juego.cartas.clasicos.palos.PaloFrances;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.poker.manos.CartaMasAlta;

public class CartaMasAltaTest
{

	
	
	FactDominiosCartasEnumFr f= new FactDominiosCartasEnumFr();
	private DominioValorPalo<Integer,PaloFrances,CartaFrancesaOld> dom= f.creaDominioVP();

	@Test
	public void testCartaMasAlta1Carta() throws Exception
	{
		
		
		
		//List<CartaFrancesaOld> cartas= new ArrayList<>();
		List<CartaFrancesaOld> cartas2= new ArrayList<>();

		List<CartaFrancesaOld> cartasBase1= new ArrayList<>();
		List<CartaFrancesaOld> cartasBase2= new ArrayList<>();
		
		cartasBase1.add(new CartaFrancesaOld(10,PaloFrances.TREBOLES));
		cartasBase1.add(new CartaFrancesaOld(8,PaloFrances.CORAZONES));
		cartasBase1.add(new CartaFrancesaOld(7,PaloFrances.PICAS));
		cartasBase1.add(new CartaFrancesaOld(12,PaloFrances.TREBOLES));
		cartasBase1.add(new CartaFrancesaOld(11,PaloFrances.TREBOLES));
		
		
		cartasBase2.add(new CartaFrancesaOld(6,PaloFrances.TREBOLES));
		cartasBase2.add(new CartaFrancesaOld(4,PaloFrances.PICAS));
		cartasBase2.add(new CartaFrancesaOld(3,PaloFrances.CORAZONES));
		cartasBase2.add(new CartaFrancesaOld(5,PaloFrances.TREBOLES));
		cartasBase2.add(new CartaFrancesaOld(9,PaloFrances.CORAZONES));

		

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				CartaFrancesaOld cartaElegida;
				if(i<j)
					cartaElegida=cartasBase1.get(j);
				else
					cartaElegida=cartasBase2.get(j);

				cartas2.add(cartaElegida);
			}
			CartaMasAlta cartaMasAlta1 = new CartaMasAlta(cartasBase1,dom);
			CartaMasAlta cartaMasAlta2 = new CartaMasAlta(cartas2,dom);
			
			System.out.println("Comparando");
			System.out.println(cartaMasAlta1 + cartasBase1.toString());
			System.out.println(cartaMasAlta2 + cartas2.toString());
			System.out.println();
			
			Assert.assertTrue(cartaMasAlta1.compareTo(cartaMasAlta2)>=0);
			cartas2.clear();
		}
		
		

		
	}
}
