package juego.cartas.poker.mocks;

import java.util.ArrayList;
import java.util.List;

import juego.cartas.clasicos.cartas.CartaFrancesaOld;
import juego.cartas.clasicos.mazos.fact.FactFachadaMazoEspFr;
import juego.cartas.clasicos.palos.PaloFrances;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.FactJugadores;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.JugadorPokerTexasHoldem;
import juegos.cartas.poker.juego.TipoJugador;
import juegos.cartas.poker.mesas.MesaPokerTexasHoldem;

public class JuegoPokerMock extends JuegoPoker<CartaFrancesaOld>{

	Apuesta<AccionPoker> ultAccion;
	private MesaPokerTexasHoldem<CartaFrancesaOld> mesaMock;
	FactJugadores<CartaFrancesaOld> factJug= new FactJugadores<>();
	FactFachadaMazoEspFr f= FactFachadaMazoEspFr.getInst();
	
	
	public JuegoPokerMock(int numJug, MazoGen<CartaFrancesaOld,Integer,PaloFrances> mazo,Apuesta<AccionPoker> ultA)
	{
		super(numJug, mazo);
		List<JugadorPokerTexasHoldem<CartaFrancesaOld>> jugadores = factJug.creaJugadores(numJug);
		mesaMock= new MesaPokerTexasHoldem<CartaFrancesaOld>(jugadores);
		
		mesaMock.setCartasComunes(new ArrayList<>());
		factJug.creaJugadores(jugadores,new TipoJugador[] {}, null);
		ultAccion=ultA;
	}
	
	public JuegoPokerMock(int numJug,Apuesta<AccionPoker> ultA)
	{
		this(numJug, FactFachadaMazoEspFr.getInst().crearBarajaFrancesaIE(),ultA);
	}
	
	@Override
	public Apuesta<AccionPoker> getUltimaAccionRealizada() 
	{
		//System.out.println();
		return ultAccion;
	}
	
	@Override
	public MesaPokerTexasHoldem<CartaFrancesaOld> getMesa() {
		return mesaMock;
	}

	public Apuesta<AccionPoker> getUltAccion() {
		return ultAccion;
	}

	public void setUltAccion(Apuesta<AccionPoker> ultAccion) {
		this.ultAccion = ultAccion;
	}

	public MesaPokerTexasHoldem<CartaFrancesaOld> getMesaMock() {
		return mesaMock;
	}

	public void setMesaMock(MesaPokerTexasHoldem<CartaFrancesaOld> mesaMock) {
		this.mesaMock = mesaMock;
	}
	
	

}
