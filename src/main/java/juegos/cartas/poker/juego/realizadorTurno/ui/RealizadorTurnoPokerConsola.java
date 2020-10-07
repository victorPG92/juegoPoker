package juegos.cartas.poker.juego.realizadorTurno.ui;

import java.util.List;
import java.util.Scanner;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;

public class RealizadorTurnoPokerConsola extends RealizadorTurnoPoker{

	JuegoPoker juegoPoker= ((JuegoPoker)juegoCartas);
	
	
	
	
	public RealizadorTurnoPokerConsola(JuegoPoker juegoPoker) {
		
		super(juegoPoker);
		juegoPoker= ((JuegoPoker)juegoCartas);
	}

	@Override
	public Apuesta<AccionPoker> escogeAccion()
	{
		AccionPoker accionJugador= null;
		Apuesta<AccionPoker> apuesta=null;
		do 
		{
			mostrarMesa();
			mostrarCartasjugador();
			System.out.println("Escoge una de las acciones posibles(Tienes " +jugador.getFichas()+" fichas):");
			JuegoPoker juegoPoker= ((JuegoPoker)juegoCartas);
			
			//System.out.println(juegoPoker.getClass());
			Apuesta<AccionPoker> ultimaApuesta=juegoPoker.getUltimaAccionRealizada();
			int fichasNecesariasParaIgualar= fichasNecesariasParaIgualar();

			StringBuilder sb= new StringBuilder();
			
			List<AccionPoker> accionesPermitidas = ultimaApuesta.getAccion().permite();
			if(fichasNecesariasParaIgualar> jugador.getFichas())
			{
				accionesPermitidas.remove(AccionPoker.SUBIR);
				accionesPermitidas.remove(AccionPoker.IGUALAR);
				//solo se permite all in?? igualar tampoco
			}
			System.out.println("Acciones permitidas " + accionesPermitidas);
			for(AccionPoker accion:accionesPermitidas)
			{
				if(AccionPoker.IGUALAR.equals(accion))
				{
					sb.append(accion+"("+fichasNecesariasParaIgualar+")"+"\n");
				}
				else
					sb.append(accion+"\n");
			}
			
			System.out.println(sb.toString());
			
			Scanner sc= new Scanner(System.in);
			
			String respuesta=sc.next();
			
			if(respuesta.length()==1 && Character.isDigit(respuesta.charAt(0)))
			{
				accionJugador= AccionPoker.getByIndex(Integer.parseInt(respuesta));
				
			}
			else
				accionJugador= AccionPoker.parse(respuesta);
			
			
			apuesta= new Apuesta<>(accionJugador);
			if(AccionPoker.IGUALAR.equals(accionJugador))
			{
				apuesta.setFichas(fichasNecesariasParaIgualar);
			}
			else  if(AccionPoker.SUBIR.equals(accionJugador))
			{
				int fichasSubir=0;
				
				while(fichasSubir<= fichasNecesariasParaIgualar)
				{
					System.out.println("Introduce el numero de fichas que quieras apostar(aunque no tengas apuesta el minimo necesario y se reajusta)");
					try {
					fichasSubir=sc.nextInt();
					}catch (Exception e) {
					}
				}
				apuesta.setFichas(fichasSubir);
			}
			else if(AccionPoker.ALL_IN.equals(accionJugador))
			{
				apuesta.setFichas(jugador.getFichas());
			}
		}while(accionJugador==null);
		
		
		return apuesta;
	}
	
	public void mostrarMesa()
	{
		juegoPoker= ((JuegoPoker)juegoCartas);
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Mesa: ");
		List<ICartaComparable> comunes = juegoPoker.
				getMesa().
				getCartasComunes();
		
		for (ICartaComparable carta : comunes) {
			sb.append(carta).append("\b");
		}
		
		System.out.println(sb.toString());
	}
	
	public void mostrarCartasjugador()
	{
		juegoPoker= ((JuegoPoker)juegoCartas);
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Jugador: ");
		List<Carta> comunes = jugador.getCartas();
		
		for (ICartaComparable carta : comunes) {
			sb.append(carta).append("\b");
		}
		
		System.out.println(sb.toString());
	}

	@Override
	public void realizaTurno()
	{
	
		
		escogeAccion();
		
	}

}
