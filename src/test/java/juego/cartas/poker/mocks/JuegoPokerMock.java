package juego.cartas.poker.mocks;

import java.util.ArrayList;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.FactJugadores;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.TipoJugador;
import juegos.cartas.poker.mesas.MesaPokerTexasHoldem;

public class JuegoPokerMock extends JuegoPoker<Carta>{

	Apuesta<AccionPoker> ultAccion;
	private MesaPokerTexasHoldem<Carta> mesaMock;
	FactJugadores<Carta> factJug= new FactJugadores<>();
	
	
	public JuegoPokerMock(int numJug, MazoGen mazo,Apuesta<AccionPoker> ultA)
	{
		super(numJug, mazo);
		mesaMock= new MesaPokerTexasHoldem<>(factJug.creaJugadores(numJug));
		
		mesaMock.setCartasComunes(new ArrayList<>());
		factJug.creaJugadores(new TipoJugador[] {}, null);
		ultAccion=ultA;
	}
	
	public JuegoPokerMock(int numJug,Apuesta<AccionPoker> ultA)
	{
		this(numJug, null,ultA);
	}
	
	@Override
	public Apuesta<AccionPoker> getUltimaAccionRealizada() 
	{
		//System.out.println();
		return ultAccion;
	}
	
	@Override
	public MesaPokerTexasHoldem<Carta> getMesa() {
		return mesaMock;
	}

	public Apuesta<AccionPoker> getUltAccion() {
		return ultAccion;
	}

	public void setUltAccion(Apuesta<AccionPoker> ultAccion) {
		this.ultAccion = ultAccion;
	}

	public MesaPokerTexasHoldem<Carta> getMesaMock() {
		return mesaMock;
	}

	public void setMesaMock(MesaPokerTexasHoldem<Carta> mesaMock) {
		this.mesaMock = mesaMock;
	}
	
	

}
