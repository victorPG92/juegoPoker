package juegos.cartas.poker.crupier;

/**
 * representa las fases del poker
 * 
 * pr
 * @author victor
 *
 */
public enum FasesPoker 
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
