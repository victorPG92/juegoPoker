package juegos.cartas.poker.crupier;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.crupier.Crupier;
import juegos.cartas.cartas.mesas.crupier.CrupierMesa;

/**
 * El crupier del texas holdem sabe cuantas cartas repartir a la mesa en cada fase
 * @author victor
 *
 */
public class CrupierPokerTexasHoldemDelegado<C extends ICartaComparable> implements CrupierMesa<C>
{
	
	FasesPoker fase;
	Crupier<C> crupierDelegado;
	
	boolean quemarCarta;

	public CrupierPokerTexasHoldemDelegado(Crupier<C> cr) {
		crupierDelegado=cr;
		fase=FasesPoker.PREFLOP;
	}
	
	

	

	public CrupierPokerTexasHoldemDelegado(Crupier<C> cr, boolean quemarCarta) {
		this(cr);
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
	public void avanzarFase()
	{
		if(fase!=null && fase.sig()!=null)
			fase=fase.sig();
	}


//////DELEGADOS


	public C reparteCarta() {
		return crupierDelegado.reparteCarta();
	}





	public List<C> reparteNCartas(int numCartas) {
		return crupierDelegado.reparteNCartas(numCartas);
	}





	public void quemarCarta() {
		crupierDelegado.quemarCarta();
	}
	

	
	
}
