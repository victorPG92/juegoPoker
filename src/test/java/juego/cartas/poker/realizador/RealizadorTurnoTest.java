package juego.cartas.poker.realizador;

import java.io.File;
import java.util.List;

import org.junit.jupiter.api.Test;

import juego.cartas.clasicos.cartas.CartaFrancesaOld;
import juego.cartas.clasicos.palos.PaloFrances;
import juego.cartas.poker.mocks.JuegoPokerMock;
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
		RealizadorTurnoPoker<CartaFrancesaOld> r= new RealizadorTurnoPokerConsola<>(new JuegoPokerMock(2,apuesta));
		
		escogerAccionTurno(r);
		
		
	}*/
	
	private JugadorPokerTexasHoldem<CartaFrancesaOld> jugador=new JugadorPokerTexasHoldem<>();

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
				RealizadorTurnoPoker<CartaFrancesaOld> r= new RealizadorTurnoPokerConsola<CartaFrancesaOld>(jugador,new JuegoPokerMock(2,apuesta), fichero);
				escogerAccionTurno(r);
			}
		}
		
		
		
	}
	
	public void escogerAccionTurno(RealizadorTurnoPoker<CartaFrancesaOld> r)
	{
		r.setJugador(jugador);
		r.getJugador().setId("67");
		CartaFrancesaOld c1=new CartaFrancesaOld(1, PaloFrances.CORAZONES);
		CartaFrancesaOld c2= new CartaFrancesaOld(2, PaloFrances.CORAZONES);
		
		System.out.println(c1+" y  " +c2);
		r.getJugador().setCartas(List.of(c1,c2));
		
		System.out.println(r.getJugador());
		
		Apuesta<AccionPoker> apuesta = r.escogeAccion();
		
		
		System.out.println("accion elegida "+apuesta+"-----------------");
	}
	
	

}
