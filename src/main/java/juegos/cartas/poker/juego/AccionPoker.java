package juegos.cartas.poker.juego;

import java.util.List;

import juegos.cartas.cartas.juego.AccionJuego;

public enum AccionPoker implements AccionJuego//AccionJugador
{
	PASAR,IGUALAR,SUBIR,ABANDONAR,ALL_IN;
	
	public List<AccionPoker> permite()
	{
		switch (this) {
			case PASAR:return List.of(values());
			case IGUALAR:return List.of(IGUALAR,SUBIR,ABANDONAR);
			case SUBIR:return List.of(IGUALAR,SUBIR,ABANDONAR);
			case ABANDONAR:return List.of(values());
			
			
	
		default: return List.of();
		
		}
	}
	
	public static AccionPoker parse(String s) {
		for (AccionPoker a : values())
		{
			if(a.toString().equalsIgnoreCase(s))
				return a;
		}

		return null;
	}
	
	public static AccionPoker getByIndex(int index) {
		for (AccionPoker a : values())
		{
			if(a.ordinal()==index)
				return a;
		}
		
		return null;

	}

}
