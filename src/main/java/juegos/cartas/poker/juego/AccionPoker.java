package juegos.cartas.poker.juego;

import java.util.List;

import juegos.cartas.cartas.juego.AccionJuego;
import juegos.cartas.cartas.juego.AccionJugador;

public enum AccionPoker implements AccionJuego//AccionJugador
{
	PASAR,IGUALAR,SUBIR,ABANDONAR;
	
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

}
