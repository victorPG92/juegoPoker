package juegos.cartas.poker.juego;

import java.util.ArrayList;
import java.util.List;

import juegos.cartas.cartas.juego.JuegoCartas;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.cartas.mesas.Mesa;
import juegos.cartas.poker.crupier.CrupierPokerTexasHoldem;
import juegos.cartas.poker.crupier.FasesPoker;

public class JuegoPoker implements JuegoCartas
{
	private MesaPokerTexasHoldem mesa;
	private int numJug;
	CrupierPokerTexasHoldem crupier;
	MazoGen mazo;
	private int fichasIniciales=200;
	FasesPoker fase;
	
	int turno;//indica el numero de jugador por el que va las rondas
	
	
	
	public JuegoPoker(int numJug,MazoGen mazo)
	{
		super();
		this.numJug = numJug;
		this.mazo=mazo;
		crupier= new CrupierPokerTexasHoldem(mazo);
		
		List<Jugador> jugadores= new ArrayList<>();
		for (int i = 0; i < this.numJug; i++) 
		{
			Jugador jug= new Jugador();
			jug.setId(""+ i);
			jug.setFichas(fichasIniciales);
			
			jugadores.add(jug);
			
			
		}
		mesa= new MesaPokerTexasHoldem(jugadores);

		fase= crupier.getFase();
	}

	@Override
	public void faseInicializacion()
	{
		
		fasePreflop();
	}

	

	@Override
	public void faseRondas() 
	{
		
		
	}
	
	

	@Override
	public void faseValoracionManos() {
		
	}
	
	protected void fasePreflop() 
	{
		System.out.println(crupier.getFase());
		for(Jugador j: mesa.getJugadores())
		{
			j.setCartas(crupier.reparteCartasJugador());
		}
		
		//quien debe avanzar la fase, el juego o el crupier?
		fase=crupier.avanzarFase();
		
	}
	
	protected void faseFlop()
	{
		
	}

}
