package juego.cartas.poker.realizador;

import java.io.File;
import java.util.List;

import org.junit.jupiter.api.Test;

import juego.cartas.poker.mocks.JuegoPokerMock;
import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.palos.PaloFrances;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.JugadorPokerTexasHoldem;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;
import juegos.cartas.poker.juego.realizadorTurno.ui.RealizadorTurnoPokerConsola;

class RealizadorTurnoTest {

	/*
	@Test
	void testConsola() 
	{
		Apuesta<AccionPoker> apuesta= new Apuesta<AccionPoker>(AccionPoker.PASAR); 
		RealizadorTurnoPoker<Carta> r= new RealizadorTurnoPokerConsola<>(new JuegoPokerMock(2,apuesta));
		
		escogerAccionTurno(r);
		
		
	}*/
	
	private JugadorPokerTexasHoldem<Carta> jugador=new JugadorPokerTexasHoldem<>();

	@Test
	void testFichero() 
	{
		
		Apuesta<AccionPoker> apuesta= new Apuesta<AccionPoker>(AccionPoker.PASAR); 		
		String path= "C:\\Users\\victor\\git\\juegoPoker\\src\\test\\java\\accionestest\\";
		File dir= new File(path);
		
		
		if(dir.exists() && dir.isDirectory())
		{
			for(File fichero: dir.listFiles())
			{
				RealizadorTurnoPoker<Carta> r= new RealizadorTurnoPokerConsola<Carta>(jugador,new JuegoPokerMock(2,apuesta), fichero);
				escogerAccionTurno(r);
			}
		}
		
		
		
	}
	
	public void escogerAccionTurno(RealizadorTurnoPoker<Carta> r)
	{
		r.setJugador(jugador);
		r.getJugador().setId("67");
		Carta c1=new Carta(1, PaloFrances.CORAZONES);
		Carta c2= new Carta(2, PaloFrances.CORAZONES);
		
		System.out.println(c1+" y  " +c2);
		r.getJugador().setCartas(List.of(c1,c2));
		
		System.out.println(r.getJugador());
		
		Apuesta<AccionPoker> apuesta = r.escogeAccion();
		
		
		System.out.println("accion elegida "+apuesta+"-----------------");
	}
	
	

}
