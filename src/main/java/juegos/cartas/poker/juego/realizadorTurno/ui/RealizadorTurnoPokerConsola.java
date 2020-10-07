package juegos.cartas.poker.juego.realizadorTurno.ui;

import java.util.Scanner;

import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;

public class RealizadorTurnoPokerConsola extends RealizadorTurnoPoker{

	@Override
	public AccionPoker escogeAccion()
	{
		AccionPoker accionJugador= null;
	
		do {
		System.out.println("Escoge una de las acciones posibles(Tienes " +jugador.getFichas()+"):");
		JuegoPoker juegoPoker= ((JuegoPoker)juegoCartas);
		
		AccionPoker ultimaAccion=juegoPoker.getUltimaAccionRealizada();
		StringBuilder sb= new StringBuilder();
		for(AccionPoker accion:ultimaAccion.permite())
		{
			if(AccionPoker.IGUALAR.equals(accion))
			{
				int fichasNecesariasParaIgualar= juegoPoker.getApuestaTurno()-(Integer)juegoPoker.getApuestaJugador().get(jugador);
				sb.append(accion+"("+fichasNecesariasParaIgualar+")"+"\n");
			}
			sb.append(accion);
		}
		
		Scanner sc= new Scanner(System.in);
		
		String respuesta=sc.next();
		
		if(respuesta.length()==1 && Character.isDigit(respuesta.charAt(0)))
		{
			accionJugador= AccionPoker.getByIndex(Integer.parseInt(respuesta));
			
		}
		else
			accionJugador= AccionPoker.parse(respuesta);
		
		}while(accionJugador==null);
		
		
		return accionJugador;
	}

	@Override
	public void realizaTurno()
	{
		
		escogeAccion();
		
	}

}
