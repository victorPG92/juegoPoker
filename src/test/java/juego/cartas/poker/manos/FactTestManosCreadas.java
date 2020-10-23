package juego.cartas.poker.manos;


import juegos.cartas.cartas.cartas.CartaFrancesaOld;
import juegos.cartas.cartas.cartas.dom.dominios.DominioValorPalo;
import juegos.cartas.cartas.cartas.dom.fact.FactDominiosCartasEnumFr;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.poker.manos.Color;
import juegos.cartas.poker.manos.DoblesParejas;
import juegos.cartas.poker.manos.Escalera;
import juegos.cartas.poker.manos.EscaleraColor;
import juegos.cartas.poker.manos.NombreManoPoker;
import juegos.cartas.poker.manos.Pareja;
import juegos.cartas.poker.manos.Poker;
import juegos.cartas.poker.manos.Trio;
import juegos.cartas.poker.manos.fact.FactoriaMano;

public class FactTestManosCreadas
{
	FactTestManos factTestManos= new FactTestManos();
	FactDominiosCartasEnumFr f= new FactDominiosCartasEnumFr();
	private DominioValorPalo<Integer,PaloFrances,CartaFrancesaOld> dom= f.creaDominioVP();

	FactoriaMano factManos= new FactoriaMano(dom);
	
	public Pareja creaPareja()
	{
		return (Pareja) factManos.creaMano(factTestManos.creaPareja(), NombreManoPoker.pair);
	}
	
	public DoblesParejas creaDoblesParejasBajas()
	{
		return (DoblesParejas) factManos.creaMano(factTestManos.creaDoblesParejaBajas(), NombreManoPoker.two_pair);
	}
	
	public DoblesParejas creaDoblesParejas()
	{
		return (DoblesParejas) factManos.creaMano(factTestManos.creaDoblesPareja(), NombreManoPoker.two_pair);
	}	
	
	
	public Trio creaTrio()
	{
		return (Trio) factManos.creaMano(factTestManos.creaTrio(), NombreManoPoker.three_of_a_kind);
	}
	
	public Escalera creaEscaleraBaja()
	{
		return (Escalera) factManos.creaMano(factTestManos.creaEscaleraBaja(), NombreManoPoker.straight);
	}
	
	public Escalera creaEscalera()
	{
		return (Escalera) factManos.creaMano(factTestManos.creaEscalera(), NombreManoPoker.straight);
	}
	
	public Color creaColorBaja()
	{
		return (Color) factManos.creaMano(factTestManos.creaColorBajo(), NombreManoPoker.flush);
	}
	
	public Color creaColor()
	{
		return (Color) factManos.creaMano(factTestManos.creaColor(), NombreManoPoker.flush);
	}
	
	
	
	public Poker creaPoker()
	{
		return (Poker) factManos.creaMano(factTestManos.creaPoker(), NombreManoPoker.four_of_a_kind);
	}
	
	public EscaleraColor creaEscaleraColorBaja()
	{
		return (EscaleraColor) factManos.creaMano(factTestManos.creaEscaleraColorBaja(), NombreManoPoker.straight_flush);
	}

	
	public EscaleraColor creaEscaleraColor()
	{
		return (EscaleraColor) factManos.creaMano(factTestManos.creaEscaleraColor(), NombreManoPoker.straight_flush);
	}
	
	

}
