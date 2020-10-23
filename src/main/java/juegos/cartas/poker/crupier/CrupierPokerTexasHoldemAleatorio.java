package juegos.cartas.poker.crupier;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mazos.modelos.func.MazoCartasSimple;
import juegos.cartas.cartas.mesas.crupier.CrupierMazoAleatoria;
import juegos.cartas.cartas.mesas.crupier.CrupierMesa;
import juegos.cartas.poker.juego.FasesPoker;

/**
 * El crupier del texas holdem sabe cuantas cartas repartir a la mesa en cada fase
 * @author victor
 *
 */
public class CrupierPokerTexasHoldemAleatorio<C extends ICartaComparable> 
extends CrupierMazoAleatoria<C>
implements CrupierMesa<C>
{
	
	FasesPoker fase;
	
	boolean quemarCarta;

	public CrupierPokerTexasHoldemAleatorio(MazoCartasSimple<C> mazo) {
		super(mazo);
		fase=FasesPoker.PREFLOP;
	}
	
	

	

	public CrupierPokerTexasHoldemAleatorio(MazoCartasSimple<C> mazo, boolean quemarCarta) {
		this(mazo);
		this.quemarCarta = quemarCarta;
	}





	@Override
	public List<C> reparteCartasJugador() {
		return reparteNCartas(2);
	}

	@Override
	public List<C> reparteCartasMesa() {
		switch (fase)
		{
			case PREFLOP:
				return reparteNCartas(0);
				
			case FLOP:
				if(quemarCarta)quemarCarta();
				return reparteNCartas(3);
				
			case TURN:
				if(quemarCarta)quemarCarta();	
				return reparteNCartas(1);
				
			case RIVER:
				if(quemarCarta)quemarCarta();	
				return reparteNCartas(1);

		default:
			return List.of();
		}
	}

	/**
	 * avanza  a la fase siguiente si existe
	 */
	public FasesPoker avanzarFase()
	{
		if(fase!=null && fase.sig()!=null)
			fase=fase.sig();
		
		return fase;
	}





	public final FasesPoker getFase() {
		return fase;
	}
	
	

}
