package juego.cartas.poker.manos;

import java.util.ArrayList;
import java.util.List;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.palos.PaloFrances;

public class FactTestManos 
{
	public List<Carta> creaPareja()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(2,PaloFrances.PICAS));
		cartas.add(new Carta(2,PaloFrances.TREBOLES));
	
		cartas.add(new Carta(4,PaloFrances.PICAS));
		cartas.add(new Carta(5,PaloFrances.DIAMANTES));
		cartas.add(new Carta(7,PaloFrances.CORAZONES));
		
		return cartas;
		
	}
	
	public List<Carta> creaTrio()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(3,PaloFrances.PICAS));
		cartas.add(new Carta(3,PaloFrances.TREBOLES));
		cartas.add(new Carta(3,PaloFrances.DIAMANTES));

	
		cartas.add(new Carta(4,PaloFrances.PICAS));
		cartas.add(new Carta(7,PaloFrances.CORAZONES));
		
		return cartas;
		
	}
	
	public List<Carta> creaPoker()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(1,PaloFrances.PICAS));
		cartas.add(new Carta(1,PaloFrances.TREBOLES));
		cartas.add(new Carta(1,PaloFrances.DIAMANTES));
		cartas.add(new Carta(1,PaloFrances.CORAZONES));

	
		cartas.add(new Carta(4,PaloFrances.PICAS));
		
		return cartas;
		
	}
	
	public List<Carta> creaEscalera()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(12,PaloFrances.PICAS));
		cartas.add(new Carta(11,PaloFrances.TREBOLES));
		cartas.add(new Carta(10,PaloFrances.PICAS));
		cartas.add(new Carta(9,PaloFrances.CORAZONES));	
		cartas.add(new Carta(8,PaloFrances.PICAS));
		
		return cartas;
		
	}
	
	public List<Carta> creaEscaleraColor()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(12,PaloFrances.DIAMANTES));
		cartas.add(new Carta(11,PaloFrances.DIAMANTES));
		cartas.add(new Carta(10,PaloFrances.DIAMANTES));
		cartas.add(new Carta(9,PaloFrances.DIAMANTES));	
		cartas.add(new Carta(8,PaloFrances.DIAMANTES));
		
		return cartas;
		
	}
	
	public List<Carta> creaEscaleraColorBaja()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(7,PaloFrances.DIAMANTES));
		cartas.add(new Carta(6,PaloFrances.DIAMANTES));
		cartas.add(new Carta(5,PaloFrances.DIAMANTES));
		cartas.add(new Carta(4,PaloFrances.DIAMANTES));	
		cartas.add(new Carta(3,PaloFrances.DIAMANTES));
		
		return cartas;
		
	}
	
	public List<Carta> creaEscaleraBaja()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(7,PaloFrances.TREBOLES));
		cartas.add(new Carta(6,PaloFrances.CORAZONES));
		cartas.add(new Carta(5,PaloFrances.PICAS));
		cartas.add(new Carta(4,PaloFrances.DIAMANTES));	
		cartas.add(new Carta(3,PaloFrances.DIAMANTES));
		
		return cartas;
		
	}
	
	public List<Carta> creaDoblesPareja()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(12,PaloFrances.PICAS));
		cartas.add(new Carta(12,PaloFrances.TREBOLES));
	
		cartas.add(new Carta(10,PaloFrances.PICAS));
		cartas.add(new Carta(10,PaloFrances.DIAMANTES));
		cartas.add(new Carta(7,PaloFrances.CORAZONES));
		
		return cartas;
		
	}
	
	public List<Carta> creaDoblesParejaBajas()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(2,PaloFrances.PICAS));
		cartas.add(new Carta(2,PaloFrances.TREBOLES));
	
		cartas.add(new Carta(4,PaloFrances.PICAS));
		cartas.add(new Carta(4,PaloFrances.DIAMANTES));
		cartas.add(new Carta(7,PaloFrances.CORAZONES));
		
		return cartas;
		
	}
	
	public List<Carta> creaColor()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(8,PaloFrances.TREBOLES));
		cartas.add(new Carta(10,PaloFrances.TREBOLES));
	
		cartas.add(new Carta(11,PaloFrances.TREBOLES));
		cartas.add(new Carta(5,PaloFrances.TREBOLES));
		cartas.add(new Carta(7,PaloFrances.TREBOLES));
		
		return cartas;
		
	}
	
	public List<Carta> creaColorBajo()
	{
		List<Carta> cartas= new ArrayList<>();
		
		cartas.add(new Carta(2,PaloFrances.PICAS));
		cartas.add(new Carta(3,PaloFrances.PICAS));
	
		cartas.add(new Carta(9,PaloFrances.PICAS));
		cartas.add(new Carta(5,PaloFrances.PICAS));
		cartas.add(new Carta(7,PaloFrances.PICAS));
		
		return cartas;
		
	}


}
