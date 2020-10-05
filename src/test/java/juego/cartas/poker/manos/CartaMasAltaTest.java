package juego.cartas.poker.manos;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.poker.manos.CartaMasAlta;

public class CartaMasAltaTest
{

	
	
	
	@Test
	public void testCartaMasAlta1Carta() throws Exception
	{
		
		
		
		List<Carta> cartas= new ArrayList<>();
		List<Carta> cartas2= new ArrayList<>();

		List<Carta> cartasBase1= new ArrayList<>();
		List<Carta> cartasBase2= new ArrayList<>();
		
		cartasBase1.add(new Carta(10,PaloFrances.TREBOLES));
		cartasBase1.add(new Carta(8,PaloFrances.CORAZONES));
		cartasBase1.add(new Carta(7,PaloFrances.PICAS));
		cartasBase1.add(new Carta(12,PaloFrances.TREBOLES));
		cartasBase1.add(new Carta(11,PaloFrances.TREBOLES));
		
		
		cartasBase2.add(new Carta(6,PaloFrances.TREBOLES));
		cartasBase2.add(new Carta(4,PaloFrances.PICAS));
		cartasBase2.add(new Carta(3,PaloFrances.CORAZONES));
		cartasBase2.add(new Carta(5,PaloFrances.TREBOLES));
		cartasBase2.add(new Carta(9,PaloFrances.CORAZONES));

		

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				Carta cartaElegida;
				if(i<j)
					cartaElegida=cartasBase1.get(j);
				else
					cartaElegida=cartasBase2.get(j);

				cartas2.add(cartaElegida);
			}
			CartaMasAlta cartaMasAlta1 = new CartaMasAlta(cartasBase1);
			CartaMasAlta cartaMasAlta2 = new CartaMasAlta(cartas2);
			
			System.out.println("Comparando");
			System.out.println(cartaMasAlta1 + cartasBase1.toString());
			System.out.println(cartaMasAlta2 + cartas2.toString());
			System.out.println();
			
			Assert.assertTrue(cartaMasAlta1.compareTo(cartaMasAlta2)>=0);
			cartas2.clear();
		}
		
		

		
	}
}
