package juego.cartas.poker.manos;

import org.junit.Assert;
import org.junit.Test;

public class ManosTest
{
	FactTestManosCreadas factManos= new FactTestManosCreadas();
	
	
	/**
	* Se compara Pareja con Pareja y debe dar 0
	*/
	@Test
	public void testParejaVSPareja(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaPareja())==0);
	}


	/**
	* Se compara Pareja con DoblesParejasBajas y debe dar -1
	*/
	@Test
	public void testParejaVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaDoblesParejasBajas())==-1);
	}


	/**
	* Se compara Pareja con DoblesParejas y debe dar -1
	*/
	@Test
	public void testParejaVSDoblesParejas(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaDoblesParejas())==-1);
	}


	/**
	* Se compara Pareja con Trio y debe dar -1
	*/
	@Test
	public void testParejaVSTrio(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaTrio())==-1);
	}


	/**
	* Se compara Pareja con EscaleraBaja y debe dar -1
	*/
	@Test
	public void testParejaVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaEscaleraBaja())==-1);
	}


	/**
	* Se compara Pareja con Escalera y debe dar -1
	*/
	@Test
	public void testParejaVSEscalera(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaEscalera())==-1);
	}


	/**
	* Se compara Pareja con ColorBaja y debe dar -1
	*/
	@Test
	public void testParejaVSColorBaja(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaColorBaja())==-1);
	}


	/**
	* Se compara Pareja con Color y debe dar -1
	*/
	@Test
	public void testParejaVSColor(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaColor())==-1);
	}


	/**
	* Se compara Pareja con Poker y debe dar -1
	*/
	@Test
	public void testParejaVSPoker(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaPoker())==-1);
	}


	/**
	* Se compara Pareja con EscaleraColorBaja y debe dar -1
	*/
	@Test
	public void testParejaVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaEscaleraColorBaja())==-1);
	}


	/**
	* Se compara Pareja con EscaleraColor y debe dar -1
	*/
	@Test
	public void testParejaVSEscaleraColor(){
		Assert.assertTrue(factManos.creaPareja().compareTo(factManos.creaEscaleraColor())==-1);
	}


	//DOBLES PAREJAS 
	
	/**
	* Se compara DoblesParejasBajas con Pareja y debe dar 1
	*/
	@Test
	public void testDoblesParejasBajasVSPareja(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara DoblesParejasBajas con DoblesParejasBajas y debe dar 0
	*/
	@Test
	public void testDoblesParejasBajasVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaDoblesParejasBajas())==0);
	}


	/**
	* Se compara DoblesParejasBajas con DoblesParejas y debe dar -1
	*/
	@Test
	public void testDoblesParejasBajasVSDoblesParejas(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaDoblesParejas())==-1);
	}


	/**
	* Se compara DoblesParejasBajas con Trio y debe dar -1
	*/
	@Test
	public void testDoblesParejasBajasVSTrio(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaTrio())==-1);
	}


	/**
	* Se compara DoblesParejasBajas con EscaleraBaja y debe dar -1
	*/
	@Test
	public void testDoblesParejasBajasVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaEscaleraBaja())==-1);
	}


	/**
	* Se compara DoblesParejasBajas con Escalera y debe dar -1
	*/
	@Test
	public void testDoblesParejasBajasVSEscalera(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaEscalera())==-1);
	}


	/**
	* Se compara DoblesParejasBajas con ColorBaja y debe dar -1
	*/
	@Test
	public void testDoblesParejasBajasVSColorBaja(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaColorBaja())==-1);
	}


	/**
	* Se compara DoblesParejasBajas con Color y debe dar -1
	*/
	@Test
	public void testDoblesParejasBajasVSColor(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaColor())==-1);
	}


	/**
	* Se compara DoblesParejasBajas con Poker y debe dar -1
	*/
	@Test
	public void testDoblesParejasBajasVSPoker(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaPoker())==-1);
	}


	/**
	* Se compara DoblesParejasBajas con EscaleraColorBaja y debe dar -1
	*/
	@Test
	public void testDoblesParejasBajasVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaEscaleraColorBaja())==-1);
	}


	/**
	* Se compara DoblesParejasBajas con EscaleraColor y debe dar -1
	*/
	@Test
	public void testDoblesParejasBajasVSEscaleraColor(){
		Assert.assertTrue(factManos.creaDoblesParejasBajas().compareTo(factManos.creaEscaleraColor())==-1);
	}


	/**
	* Se compara DoblesParejas con Pareja y debe dar 1
	*/
	@Test
	public void testDoblesParejasVSPareja(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara DoblesParejas con DoblesParejasBajas y debe dar 1
	*/
	@Test
	public void testDoblesParejasVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaDoblesParejasBajas())==1);
	}


	/**
	* Se compara DoblesParejas con DoblesParejas y debe dar 0
	*/
	@Test
	public void testDoblesParejasVSDoblesParejas(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaDoblesParejas())==0);
	}


	/**
	* Se compara DoblesParejas con Trio y debe dar -1
	*/
	@Test
	public void testDoblesParejasVSTrio(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaTrio())==-1);
	}


	/**
	* Se compara DoblesParejas con EscaleraBaja y debe dar -1
	*/
	@Test
	public void testDoblesParejasVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaEscaleraBaja())==-1);
	}


	/**
	* Se compara DoblesParejas con Escalera y debe dar -1
	*/
	@Test
	public void testDoblesParejasVSEscalera(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaEscalera())==-1);
	}


	/**
	* Se compara DoblesParejas con ColorBaja y debe dar -1
	*/
	@Test
	public void testDoblesParejasVSColorBaja(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaColorBaja())==-1);
	}


	/**
	* Se compara DoblesParejas con Color y debe dar -1
	*/
	@Test
	public void testDoblesParejasVSColor(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaColor())==-1);
	}


	/**
	* Se compara DoblesParejas con Poker y debe dar -1
	*/
	@Test
	public void testDoblesParejasVSPoker(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaPoker())==-1);
	}


	/**
	* Se compara DoblesParejas con EscaleraColorBaja y debe dar -1
	*/
	@Test
	public void testDoblesParejasVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaEscaleraColorBaja())==-1);
	}


	/**
	* Se compara DoblesParejas con EscaleraColor y debe dar -1
	*/
	@Test
	public void testDoblesParejasVSEscaleraColor(){
		Assert.assertTrue(factManos.creaDoblesParejas().compareTo(factManos.creaEscaleraColor())==-1);
	}


	/**
	* Se compara Trio con Pareja y debe dar 1
	*/
	@Test
	public void testTrioVSPareja(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara Trio con DoblesParejasBajas y debe dar 1
	*/
	@Test
	public void testTrioVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaDoblesParejasBajas())==1);
	}


	/**
	* Se compara Trio con DoblesParejas y debe dar 1
	*/
	@Test
	public void testTrioVSDoblesParejas(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaDoblesParejas())==1);
	}


	/**
	* Se compara Trio con Trio y debe dar 0
	*/
	@Test
	public void testTrioVSTrio(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaTrio())==0);
	}


	/**
	* Se compara Trio con EscaleraBaja y debe dar -1
	*/
	@Test
	public void testTrioVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaEscaleraBaja())==-1);
	}


	/**
	* Se compara Trio con Escalera y debe dar -1
	*/
	@Test
	public void testTrioVSEscalera(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaEscalera())==-1);
	}


	/**
	* Se compara Trio con ColorBaja y debe dar -1
	*/
	@Test
	public void testTrioVSColorBaja(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaColorBaja())==-1);
	}


	/**
	* Se compara Trio con Color y debe dar -1
	*/
	@Test
	public void testTrioVSColor(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaColor())==-1);
	}


	/**
	* Se compara Trio con Poker y debe dar -1
	*/
	@Test
	public void testTrioVSPoker(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaPoker())==-1);
	}


	/**
	* Se compara Trio con EscaleraColorBaja y debe dar -1
	*/
	@Test
	public void testTrioVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaEscaleraColorBaja())==-1);
	}


	/**
	* Se compara Trio con EscaleraColor y debe dar -1
	*/
	@Test
	public void testTrioVSEscaleraColor(){
		Assert.assertTrue(factManos.creaTrio().compareTo(factManos.creaEscaleraColor())==-1);
	}


	/**
	* Se compara EscaleraBaja con Pareja y debe dar 1
	*/
	@Test
	public void testEscaleraBajaVSPareja(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara EscaleraBaja con DoblesParejasBajas y debe dar 1
	*/
	@Test
	public void testEscaleraBajaVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaDoblesParejasBajas())==1);
	}


	/**
	* Se compara EscaleraBaja con DoblesParejas y debe dar 1
	*/
	@Test
	public void testEscaleraBajaVSDoblesParejas(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaDoblesParejas())==1);
	}


	/**
	* Se compara EscaleraBaja con Trio y debe dar 1
	*/
	@Test
	public void testEscaleraBajaVSTrio(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaTrio())==1);
	}


	/**
	* Se compara EscaleraBaja con EscaleraBaja y debe dar 0
	*/
	@Test
	public void testEscaleraBajaVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaEscaleraBaja())==0);
	}


	/**
	* Se compara EscaleraBaja con Escalera y debe dar -1
	*/
	@Test
	public void testEscaleraBajaVSEscalera(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaEscalera())==-1);
	}


	/**
	* Se compara EscaleraBaja con ColorBaja y debe dar -1
	*/
	@Test
	public void testEscaleraBajaVSColorBaja(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaColorBaja())==-1);
	}


	/**
	* Se compara EscaleraBaja con Color y debe dar -1
	*/
	@Test
	public void testEscaleraBajaVSColor(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaColor())==-1);
	}


	/**
	* Se compara EscaleraBaja con Poker y debe dar -1
	*/
	@Test
	public void testEscaleraBajaVSPoker(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaPoker())==-1);
	}


	/**
	* Se compara EscaleraBaja con EscaleraColorBaja y debe dar -1
	*/
	@Test
	public void testEscaleraBajaVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaEscaleraColorBaja())==-1);
	}


	/**
	* Se compara EscaleraBaja con EscaleraColor y debe dar -1
	*/
	@Test
	public void testEscaleraBajaVSEscaleraColor(){
		Assert.assertTrue(factManos.creaEscaleraBaja().compareTo(factManos.creaEscaleraColor())==-1);
	}


	/**
	* Se compara Escalera con Pareja y debe dar 1
	*/
	@Test
	public void testEscaleraVSPareja(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara Escalera con DoblesParejasBajas y debe dar 1
	*/
	@Test
	public void testEscaleraVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaDoblesParejasBajas())==1);
	}


	/**
	* Se compara Escalera con DoblesParejas y debe dar 1
	*/
	@Test
	public void testEscaleraVSDoblesParejas(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaDoblesParejas())==1);
	}


	/**
	* Se compara Escalera con Trio y debe dar 1
	*/
	@Test
	public void testEscaleraVSTrio(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaTrio())==1);
	}


	/**
	* Se compara Escalera con EscaleraBaja y debe dar 1
	*/
	@Test
	public void testEscaleraVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaEscaleraBaja())==1);
	}


	/**
	* Se compara Escalera con Escalera y debe dar 0
	*/
	@Test
	public void testEscaleraVSEscalera(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaEscalera())==0);
	}


	/**
	* Se compara Escalera con ColorBaja y debe dar -1
	*/
	@Test
	public void testEscaleraVSColorBaja(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaColorBaja())==-1);
	}


	/**
	* Se compara Escalera con Color y debe dar -1
	*/
	@Test
	public void testEscaleraVSColor(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaColor())==-1);
	}


	/**
	* Se compara Escalera con Poker y debe dar -1
	*/
	@Test
	public void testEscaleraVSPoker(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaPoker())==-1);
	}


	/**
	* Se compara Escalera con EscaleraColorBaja y debe dar -1
	*/
	@Test
	public void testEscaleraVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaEscaleraColorBaja())==-1);
	}


	/**
	* Se compara Escalera con EscaleraColor y debe dar -1
	*/
	@Test
	public void testEscaleraVSEscaleraColor(){
		Assert.assertTrue(factManos.creaEscalera().compareTo(factManos.creaEscaleraColor())==-1);
	}


	/**
	* Se compara ColorBaja con Pareja y debe dar 1
	*/
	@Test
	public void testColorBajaVSPareja(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara ColorBaja con DoblesParejasBajas y debe dar 1
	*/
	@Test
	public void testColorBajaVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaDoblesParejasBajas())==1);
	}


	/**
	* Se compara ColorBaja con DoblesParejas y debe dar 1
	*/
	@Test
	public void testColorBajaVSDoblesParejas(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaDoblesParejas())==1);
	}


	/**
	* Se compara ColorBaja con Trio y debe dar 1
	*/
	@Test
	public void testColorBajaVSTrio(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaTrio())==1);
	}


	/**
	* Se compara ColorBaja con EscaleraBaja y debe dar 1
	*/
	@Test
	public void testColorBajaVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaEscaleraBaja())==1);
	}


	/**
	* Se compara ColorBaja con Escalera y debe dar 1
	*/
	@Test
	public void testColorBajaVSEscalera(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaEscalera())==1);
	}


	/**
	* Se compara ColorBaja con ColorBaja y debe dar 0
	*/
	@Test
	public void testColorBajaVSColorBaja(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaColorBaja())==0);
	}


	/**
	* Se compara ColorBaja con Color y debe dar -1
	*/
	@Test
	public void testColorBajaVSColor(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaColor())==-1);
	}


	/**
	* Se compara ColorBaja con Poker y debe dar -1
	*/
	@Test
	public void testColorBajaVSPoker(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaPoker())==-1);
	}


	/**
	* Se compara ColorBaja con EscaleraColorBaja y debe dar -1
	*/
	@Test
	public void testColorBajaVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaEscaleraColorBaja())==-1);
	}


	/**
	* Se compara ColorBaja con EscaleraColor y debe dar -1
	*/
	@Test
	public void testColorBajaVSEscaleraColor(){
		Assert.assertTrue(factManos.creaColorBaja().compareTo(factManos.creaEscaleraColor())==-1);
	}


	/**
	* Se compara Color con Pareja y debe dar 1
	*/
	@Test
	public void testColorVSPareja(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara Color con DoblesParejasBajas y debe dar 1
	*/
	@Test
	public void testColorVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaDoblesParejasBajas())==1);
	}


	/**
	* Se compara Color con DoblesParejas y debe dar 1
	*/
	@Test
	public void testColorVSDoblesParejas(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaDoblesParejas())==1);
	}


	/**
	* Se compara Color con Trio y debe dar 1
	*/
	@Test
	public void testColorVSTrio(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaTrio())==1);
	}


	/**
	* Se compara Color con EscaleraBaja y debe dar 1
	*/
	@Test
	public void testColorVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaEscaleraBaja())==1);
	}


	/**
	* Se compara Color con Escalera y debe dar 1
	*/
	@Test
	public void testColorVSEscalera(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaEscalera())==1);
	}


	/**
	* Se compara Color con ColorBaja y debe dar 1
	*/
	@Test
	public void testColorVSColorBaja(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaColorBaja())==1);
	}


	/**
	* Se compara Color con Color y debe dar 0
	*/
	@Test
	public void testColorVSColor(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaColor())==0);
	}


	/**
	* Se compara Color con Poker y debe dar -1
	*/
	@Test
	public void testColorVSPoker(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaPoker())==-1);
	}


	/**
	* Se compara Color con EscaleraColorBaja y debe dar -1
	*/
	@Test
	public void testColorVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaEscaleraColorBaja())==-1);
	}


	/**
	* Se compara Color con EscaleraColor y debe dar -1
	*/
	@Test
	public void testColorVSEscaleraColor(){
		Assert.assertTrue(factManos.creaColor().compareTo(factManos.creaEscaleraColor())==-1);
	}


	/**
	* Se compara Poker con Pareja y debe dar 1
	*/
	@Test
	public void testPokerVSPareja(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara Poker con DoblesParejasBajas y debe dar 1
	*/
	@Test
	public void testPokerVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaDoblesParejasBajas())==1);
	}


	/**
	* Se compara Poker con DoblesParejas y debe dar 1
	*/
	@Test
	public void testPokerVSDoblesParejas(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaDoblesParejas())==1);
	}


	/**
	* Se compara Poker con Trio y debe dar 1
	*/
	@Test
	public void testPokerVSTrio(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaTrio())==1);
	}


	/**
	* Se compara Poker con EscaleraBaja y debe dar 1
	*/
	@Test
	public void testPokerVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaEscaleraBaja())==1);
	}


	/**
	* Se compara Poker con Escalera y debe dar 1
	*/
	@Test
	public void testPokerVSEscalera(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaEscalera())==1);
	}


	/**
	* Se compara Poker con ColorBaja y debe dar 1
	*/
	@Test
	public void testPokerVSColorBaja(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaColorBaja())==1);
	}


	/**
	* Se compara Poker con Color y debe dar 1
	*/
	@Test
	public void testPokerVSColor(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaColor())==1);
	}


	/**
	* Se compara Poker con Poker y debe dar 0
	*/
	@Test
	public void testPokerVSPoker(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaPoker())==0);
	}


	/**
	* Se compara Poker con EscaleraColorBaja y debe dar -1
	*/
	@Test
	public void testPokerVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaEscaleraColorBaja())==-1);
	}


	/**
	* Se compara Poker con EscaleraColor y debe dar -1
	*/
	@Test
	public void testPokerVSEscaleraColor(){
		Assert.assertTrue(factManos.creaPoker().compareTo(factManos.creaEscaleraColor())==-1);
	}


	/**
	* Se compara EscaleraColorBaja con Pareja y debe dar 1
	*/
	@Test
	public void testEscaleraColorBajaVSPareja(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara EscaleraColorBaja con DoblesParejasBajas y debe dar 1
	*/
	@Test
	public void testEscaleraColorBajaVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaDoblesParejasBajas())==1);
	}


	/**
	* Se compara EscaleraColorBaja con DoblesParejas y debe dar 1
	*/
	@Test
	public void testEscaleraColorBajaVSDoblesParejas(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaDoblesParejas())==1);
	}


	/**
	* Se compara EscaleraColorBaja con Trio y debe dar 1
	*/
	@Test
	public void testEscaleraColorBajaVSTrio(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaTrio())==1);
	}


	/**
	* Se compara EscaleraColorBaja con EscaleraBaja y debe dar 1
	*/
	@Test
	public void testEscaleraColorBajaVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaEscaleraBaja())==1);
	}


	/**
	* Se compara EscaleraColorBaja con Escalera y debe dar 1
	*/
	@Test
	public void testEscaleraColorBajaVSEscalera(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaEscalera())==1);
	}


	/**
	* Se compara EscaleraColorBaja con ColorBaja y debe dar 1
	*/
	@Test
	public void testEscaleraColorBajaVSColorBaja(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaColorBaja())==1);
	}


	/**
	* Se compara EscaleraColorBaja con Color y debe dar 1
	*/
	@Test
	public void testEscaleraColorBajaVSColor(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaColor())==1);
	}


	/**
	* Se compara EscaleraColorBaja con Poker y debe dar 1
	*/
	@Test
	public void testEscaleraColorBajaVSPoker(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaPoker())==1);
	}


	/**
	* Se compara EscaleraColorBaja con EscaleraColorBaja y debe dar 0
	*/
	@Test
	public void testEscaleraColorBajaVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaEscaleraColorBaja())==0);
	}


	/**
	* Se compara EscaleraColorBaja con EscaleraColor y debe dar -1
	*/
	@Test
	public void testEscaleraColorBajaVSEscaleraColor(){
		Assert.assertTrue(factManos.creaEscaleraColorBaja().compareTo(factManos.creaEscaleraColor())==-1);
	}


	/**
	* Se compara EscaleraColor con Pareja y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSPareja(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaPareja())==1);
	}


	/**
	* Se compara EscaleraColor con DoblesParejasBajas y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSDoblesParejasBajas(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaDoblesParejasBajas())==1);
	}


	/**
	* Se compara EscaleraColor con DoblesParejas y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSDoblesParejas(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaDoblesParejas())==1);
	}


	/**
	* Se compara EscaleraColor con Trio y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSTrio(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaTrio())==1);
	}


	/**
	* Se compara EscaleraColor con EscaleraBaja y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSEscaleraBaja(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaEscaleraBaja())==1);
	}


	/**
	* Se compara EscaleraColor con Escalera y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSEscalera(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaEscalera())==1);
	}


	/**
	* Se compara EscaleraColor con ColorBaja y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSColorBaja(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaColorBaja())==1);
	}


	/**
	* Se compara EscaleraColor con Color y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSColor(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaColor())==1);
	}


	/**
	* Se compara EscaleraColor con Poker y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSPoker(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaPoker())==1);
	}


	/**
	* Se compara EscaleraColor con EscaleraColorBaja y debe dar 1
	*/
	@Test
	public void testEscaleraColorVSEscaleraColorBaja(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaEscaleraColorBaja())==1);
	}


	/**
	* Se compara EscaleraColor con EscaleraColor y debe dar 0
	*/
	@Test
	public void testEscaleraColorVSEscaleraColor(){
		Assert.assertTrue(factManos.creaEscaleraColor().compareTo(factManos.creaEscaleraColor())==0);
	}




}
