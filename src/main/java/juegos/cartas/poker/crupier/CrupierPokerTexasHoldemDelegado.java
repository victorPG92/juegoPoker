package juegos.cartas.poker.crupier;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mazos.modelos.MazoCartasSimple;
import juegos.cartas.cartas.mesas.crupier.Crupier;
import juegos.cartas.cartas.mesas.crupier.CrupierMazo;
import juegos.cartas.cartas.mesas.crupier.CrupierMesa;

/**
 * El crupier del texas holdem sabe cuantas cartas repartir a la mesa en cada fase
 * @author victor
 *
 */
public class CrupierPokerTexasHoldemDelegado implements CrupierMesa
{
	
	FasesPoker fase;
	Crupier crupierDelegado;
	
	boolean quemarCarta;

	public CrupierPokerTexasHoldemDelegado(Crupier cr) {
		crupierDelegado=cr;
		fase=FasesPoker.PREFLOP;
	}
	
	

	

	public CrupierPokerTexasHoldemDelegado(Crupier cr, boolean quemarCarta) {
		this(cr);
		this.quemarCarta = quemarCarta;
	}





	@Override
	public List<ICartaComparable> reparteCartasJugador() {
		return reparteNCartas(2);
	}

	@Override
	public List<ICartaComparable> reparteCartasMesa() {
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


	public ICartaComparable reparteCarta() {
		return crupierDelegado.reparteCarta();
	}





	public List<ICartaComparable> reparteNCartas(int numCartas) {
		return crupierDelegado.reparteNCartas(numCartas);
	}





	public void quemarCarta() {
		crupierDelegado.quemarCarta();
	}
	

	
	
}
