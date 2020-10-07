package juegos.cartas.poker.juego;

import juegos.cartas.cartas.juego.FaseJuego;

/**
 * representa las fases del poker
 * 
 * pr
 * @author victor
 *
 */
public enum FasesPoker implements FaseJuego<FasesPoker>
{
	
	PREFLOP,FLOP,TURN,RIVER;
	
	public FasesPoker sig()
	{
		if(this.equals(PREFLOP))
			return FLOP;
		else if(this.equals(FLOP))
			return TURN;
		else if(this.equals(TURN))
			return RIVER;
		else //if(this.equals(PREFLOP))
			return null;
		
	}

}
