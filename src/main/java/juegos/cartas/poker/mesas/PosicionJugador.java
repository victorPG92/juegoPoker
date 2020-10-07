package juegos.cartas.poker.mesas;

/**
 * Posicion del jugador.
 * @author victor
 *
 */
public enum PosicionJugador 
{
	UTG,//under the gun
	UTG_1,   // tambien llamado MP o LO
	CO,
	btn, 
	SB,
	BB  // preguntar rango a manuel 
	
	;
	
	public static  PosicionJugador parse(String s)
	{
	
		String mayus= s.toUpperCase();
		for(PosicionJugador p: PosicionJugador.values())
		{
			if(p.name().equalsIgnoreCase(mayus)) return p;
		}
		
		
		return null;
	}
	
	/**
	 * Muestra la posicion siguiente
	 * @return
	 */
	public PosicionJugador sig()
	{
		switch (this) 
		{
		case UTG: return UTG_1;
		case UTG_1: return CO;
		case CO: return btn;
		case btn: return SB;
		case SB: return BB;
		case BB: return UTG;
			

		default: return null;
			
		}
	}
	
	/**
	 * Muestra la posicion anterior
	 * @return
	 */
	public PosicionJugador ant()
	{
		switch (this) 
		{
		case UTG_1: return UTG;
		case CO: return UTG_1;
		case btn: return CO;
		case SB: return btn;
		case BB: return SB;
		case UTG: return BB;
			

		default: return null;
			
		}
	}
	
	
}
