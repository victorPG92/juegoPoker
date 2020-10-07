package juego.cartas.poker.manos;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.poker.manos.Color;
import juegos.cartas.poker.manos.DoblesParejas;

public class DoblesParejasTest
{

	
	
	
	@Test
	public void testColor1Carta() throws Exception
	{
		
		
		
		//List<Carta> cartas= new ArrayList<>();
		List<Carta> cartas2= new ArrayList<>();

		List<Carta> cartasBase1= new ArrayList<>();
		List<Carta> cartasBase2= new ArrayList<>();
		
		cartasBase1.add(new Carta(10,PaloFrances.CORAZONES));
		cartasBase1.add(new Carta(10,PaloFrances.PICAS));
		cartasBase1.add(new Carta(7,PaloFrances.CORAZONES));
		cartasBase1.add(new Carta(7,PaloFrances.TREBOLES));
		cartasBase1.add(new Carta(5,PaloFrances.DIAMANTES));
		
		
		cartasBase2.add(new Carta(9,PaloFrances.CORAZONES));
		cartasBase2.add(new Carta(9,PaloFrances.PICAS));
		cartasBase2.add(new Carta(6,PaloFrances.CORAZONES));
		cartasBase2.add(new Carta(6,PaloFrances.TREBOLES));
		cartasBase2.add(new Carta(4,PaloFrances.DIAMANTES));
		
		
		

		List<Carta> cartasMismasParejasExceptoUltima= new ArrayList<>();
		cartasMismasParejasExceptoUltima.add(cartasBase1.get(0));
		cartasMismasParejasExceptoUltima.add(cartasBase1.get(1));
		cartasMismasParejasExceptoUltima.add(cartasBase1.get(2));
		cartasMismasParejasExceptoUltima.add(cartasBase1.get(3));

		cartasMismasParejasExceptoUltima.add(cartasBase2.get(4));

		
		List<Carta> cartasDobleParejasAlta= new ArrayList<>();
		cartasDobleParejasAlta.add(cartasBase1.get(0));
		cartasDobleParejasAlta.add(cartasBase1.get(1));
		
		cartasDobleParejasAlta.add(cartasBase2.get(2));
		cartasDobleParejasAlta.add(cartasBase2.get(3));

		cartasDobleParejasAlta.add(cartasBase2.get(4));


		List<Carta> cartasDobleParejasBaja= new ArrayList<>();
		cartasDobleParejasBaja.add(cartasBase2.get(0));
		cartasDobleParejasBaja.add(cartasBase2.get(1));
		
		cartasDobleParejasBaja.add(cartasBase1.get(2));
		cartasDobleParejasBaja.add(cartasBase1.get(3));

		cartasDobleParejasBaja.add(cartasBase2.get(4));


	


		
			DoblesParejas doblesParejasAltas = new DoblesParejas(cartasBase1);
			Color cartaMasAlta2 = new Color(cartas2);
			
			System.out.println("Comparando");
			System.out.println(doblesParejasAltas + cartasBase1.toString());
			System.out.println(cartaMasAlta2 + cartas2.toString());
			System.out.println();
			
			Assert.assertTrue(doblesParejasAltas.compareTo(cartaMasAlta2)>=0);
			cartas2.clear();
	
		
		

		
	}
}
