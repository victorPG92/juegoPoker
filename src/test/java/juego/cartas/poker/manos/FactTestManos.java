package juego.cartas.poker.manos;

import java.util.ArrayList;
import java.util.List;

import juego.cartas.clasicos.cartas.CartaFrancesaOld;
import juego.cartas.clasicos.palos.PaloFrances;

public class FactTestManos 
{
	public List<CartaFrancesaOld> creaPareja()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(2,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(2,PaloFrances.TREBOLES));
	
		cartas.add(new CartaFrancesaOld(4,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(5,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(7,PaloFrances.CORAZONES));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaTrio()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(3,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(3,PaloFrances.TREBOLES));
		cartas.add(new CartaFrancesaOld(3,PaloFrances.DIAMANTES));

	
		cartas.add(new CartaFrancesaOld(4,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(7,PaloFrances.CORAZONES));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaPoker()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(1,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(1,PaloFrances.TREBOLES));
		cartas.add(new CartaFrancesaOld(1,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(1,PaloFrances.CORAZONES));

	
		cartas.add(new CartaFrancesaOld(4,PaloFrances.PICAS));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaEscalera()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(12,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(11,PaloFrances.TREBOLES));
		cartas.add(new CartaFrancesaOld(10,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(9,PaloFrances.CORAZONES));	
		cartas.add(new CartaFrancesaOld(8,PaloFrances.PICAS));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaEscaleraColor()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(12,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(11,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(10,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(9,PaloFrances.DIAMANTES));	
		cartas.add(new CartaFrancesaOld(8,PaloFrances.DIAMANTES));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaEscaleraColorBaja()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(7,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(6,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(5,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(4,PaloFrances.DIAMANTES));	
		cartas.add(new CartaFrancesaOld(3,PaloFrances.DIAMANTES));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaEscaleraBaja()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(7,PaloFrances.TREBOLES));
		cartas.add(new CartaFrancesaOld(6,PaloFrances.CORAZONES));
		cartas.add(new CartaFrancesaOld(5,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(4,PaloFrances.DIAMANTES));	
		cartas.add(new CartaFrancesaOld(3,PaloFrances.DIAMANTES));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaDoblesPareja()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(12,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(12,PaloFrances.TREBOLES));
	
		cartas.add(new CartaFrancesaOld(10,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(10,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(7,PaloFrances.CORAZONES));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaDoblesParejaBajas()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(2,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(2,PaloFrances.TREBOLES));
	
		cartas.add(new CartaFrancesaOld(4,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(4,PaloFrances.DIAMANTES));
		cartas.add(new CartaFrancesaOld(7,PaloFrances.CORAZONES));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaColor()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(8,PaloFrances.TREBOLES));
		cartas.add(new CartaFrancesaOld(10,PaloFrances.TREBOLES));
	
		cartas.add(new CartaFrancesaOld(11,PaloFrances.TREBOLES));
		cartas.add(new CartaFrancesaOld(5,PaloFrances.TREBOLES));
		cartas.add(new CartaFrancesaOld(7,PaloFrances.TREBOLES));
		
		return cartas;
		
	}
	
	public List<CartaFrancesaOld> creaColorBajo()
	{
		List<CartaFrancesaOld> cartas= new ArrayList<>();
		
		cartas.add(new CartaFrancesaOld(2,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(3,PaloFrances.PICAS));
	
		cartas.add(new CartaFrancesaOld(9,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(5,PaloFrances.PICAS));
		cartas.add(new CartaFrancesaOld(7,PaloFrances.PICAS));
		
		return cartas;
		
	}


}
