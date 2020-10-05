package juego.cartas.poker.manos;


import juegos.cartas.poker.manos.Color;
import juegos.cartas.poker.manos.DoblesParejas;
import juegos.cartas.poker.manos.Escalera;
import juegos.cartas.poker.manos.EscaleraColor;
import juegos.cartas.poker.manos.NombreMano;
import juegos.cartas.poker.manos.Pareja;
import juegos.cartas.poker.manos.Poker;
import juegos.cartas.poker.manos.Trio;
import juegos.cartas.poker.manos.fact.FactoriaMano;

public class FactTestManosCreadas
{
	FactTestManos factTestManos= new FactTestManos();
	FactoriaMano factManos= new FactoriaMano();
	
	public Pareja creaPareja()
	{
		return (Pareja) factManos.creaMano(factTestManos.creaPareja(), NombreMano.pair);
	}
	
	public DoblesParejas creaDoblesParejasBajas()
	{
		return (DoblesParejas) factManos.creaMano(factTestManos.creaDoblesParejaBajas(), NombreMano.two_pair);
	}
	
	public DoblesParejas creaDoblesParejas()
	{
		return (DoblesParejas) factManos.creaMano(factTestManos.creaDoblesPareja(), NombreMano.two_pair);
	}	
	
	
	public Trio creaTrio()
	{
		return (Trio) factManos.creaMano(factTestManos.creaTrio(), NombreMano.three_of_a_kind);
	}
	
	public Escalera creaEscaleraBaja()
	{
		return (Escalera) factManos.creaMano(factTestManos.creaEscaleraBaja(), NombreMano.straight);
	}
	
	public Escalera creaEscalera()
	{
		return (Escalera) factManos.creaMano(factTestManos.creaEscalera(), NombreMano.straight);
	}
	
	public Color creaColorBaja()
	{
		return (Color) factManos.creaMano(factTestManos.creaColorBajo(), NombreMano.flush);
	}
	
	public Color creaColor()
	{
		return (Color) factManos.creaMano(factTestManos.creaColor(), NombreMano.flush);
	}
	
	
	
	public Poker creaPoker()
	{
		return (Poker) factManos.creaMano(factTestManos.creaPoker(), NombreMano.four_of_a_kind);
	}
	
	public EscaleraColor creaEscaleraColorBaja()
	{
		return (EscaleraColor) factManos.creaMano(factTestManos.creaEscaleraColorBaja(), NombreMano.straight_flush);
	}

	
	public EscaleraColor creaEscaleraColor()
	{
		return (EscaleraColor) factManos.creaMano(factTestManos.creaEscaleraColor(), NombreMano.straight_flush);
	}
	
	

}
