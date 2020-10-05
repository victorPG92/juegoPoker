package juegos.cartas.poker;

import juegos.cartas.cartas.juego.JuegoCartas;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.cartas.mesas.Mesa;
import juegos.cartas.poker.crupier.CrupierPokerTexasHoldem;

public class JuegoPoker implements JuegoCartas
{
	private Mesa mesa= new Mesa();
	private int numJug;
	CrupierPokerTexasHoldem crupier;
	MazoGen mazo;

	public JuegoPoker(int numJug,MazoGen mazo)
	{
		super();
		this.numJug = numJug;
		this.mazo=mazo;
		crupier= new CrupierPokerTexasHoldem(mazo);
		
		
	}

	@Override
	public void faseInicializacion()
	{
		
		
		
	}

	@Override
	public void faseRondas() 
	{
		
		
	}

	@Override
	public void faseValoracionManos() {
		// TODO Auto-generated method stub
		
	}

}
