package juegos.cartas.poker.juego.realizadorTurno.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.poker.consola.MostradorConsola;
import juegos.cartas.poker.juego.AccionPoker;
import juegos.cartas.poker.juego.ConocedorAccionesJugador;
import juegos.cartas.poker.juego.JuegoPoker;
import juegos.cartas.poker.juego.JugadorPokerTexasHoldem;
import juegos.cartas.poker.juego.realizadorTurno.RealizadorTurnoPoker;

/**
 * Realiza el turno  atraves de interaccion con un usuario por consola
 * @author victor
 *
 * @param <C>
 */
public class RealizadorTurnoPokerConsola<C extends ICartaComparable> extends RealizadorTurnoPoker<C>{

	//JuegoPoker<C> juegoPoker= ((JuegoPoker<C>)juegoCartas);
	private MostradorConsola<C> consola= new MostradorConsola<>();
	
	/**permite flexibilizar la entrada de datos, consola o fichero */
	private InputStream flujoIn;//=System.in;
	private Readable readable;
	private File file;
	
	
	private ConocedorAccionesJugador<C>conocedorAccionesJugador= new ConocedorAccionesJugador<>();
	
	public RealizadorTurnoPokerConsola(JugadorPokerTexasHoldem<C> jugador, JuegoPoker<C> juegoCartas) {
		super(jugador, juegoCartas);
		flujoIn=System.in;
	}
	
	
	
	

	public RealizadorTurnoPokerConsola(JugadorPokerTexasHoldem<C> jugador, JuegoPoker<C> juegoCartas, InputStream flujoIn) {
		this(jugador,juegoCartas);
		this.flujoIn = flujoIn;
	}
	
	public RealizadorTurnoPokerConsola(JugadorPokerTexasHoldem<C> jugador, JuegoPoker<C> juegoCartas, Readable readable) {
		this(jugador,juegoCartas);
		this.readable = readable;
	}
	
	public RealizadorTurnoPokerConsola(JugadorPokerTexasHoldem<C> jugador, JuegoPoker<C> juegoCartas, File file) {
		this(jugador,juegoCartas);
		this.file = file;
	}



	/**
	 * Escoge la accion del jugador en el turno
	 */
	@Override
	public Apuesta<AccionPoker> escogeAccion()
	{
		
		Apuesta<AccionPoker> apuesta=null;
		do 
		{
			mostrarEstado();
			
			int fichasNecesariasParaIgualar= fichasNecesariasParaIgualar();

			mostrarAccionesPosibles(fichasNecesariasParaIgualar);
			
			apuesta= creaApuesta(fichasNecesariasParaIgualar);
			
		}while(apuesta==null);
		
		
		return apuesta;
	}
	
	/**
	 * Muestra el estado del juego, la mesa y las cartas del jugador
	 */
	private void mostrarEstado() 
	{
		consola.mostrarMesa(juegoCartas.getMesa());
		consola.mostrarCartasjugador(jugador);
		
		
	}



	/**
	 * Muestra las acciones posibles
	 * @param fichasNecesariasParaIgualar
	 */
	private void mostrarAccionesPosibles(int fichasNecesariasParaIgualar) 
	{
		
		consola.mostrarTexto("Escoge una de las acciones posibles(Tienes " +jugador.getFichas()+" fichas):");
		StringBuilder sb= new StringBuilder();
		
		List<AccionPoker> accionesPermitidas =conocedorAccionesJugador.accionesPermitidas(fichasNecesariasParaIgualar,jugador,juegoCartas);
		consola.mostrarTexto("Acciones permitidas " + accionesPermitidas);
		for(AccionPoker accion:accionesPermitidas)
		{
			if(AccionPoker.IGUALAR.equals(accion))
			{
				sb.append(accion+"("+fichasNecesariasParaIgualar+")"+"\n");
			}
			else
				sb.append(accion+"\n");
		}
		
		consola.mostrarTexto(sb.toString());
		
	}



	/**
	 * Crea la apuesta a partr de los datos y entradas
	 * @param fichasNecesariasParaIgualar
	 * @return
	 */
	private Apuesta<AccionPoker> creaApuesta(int fichasNecesariasParaIgualar)
	{
		
		Apuesta<AccionPoker> apuesta;
		
		Scanner sc;
		if(flujoIn!=null)
			sc= new Scanner(flujoIn);
		else if(readable!=null)
			sc = new Scanner(readable);
		else if(file!=null)
			try {
				sc = new Scanner(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		else 
			return null;
		
		String respuesta=sc.next();
		AccionPoker accionJugador = parseaRespuesta(respuesta);
		
		
		if(AccionPoker.SUBIR.equals(accionJugador))
		{
			int fichasSubir=solicitaFichasSubir(fichasNecesariasParaIgualar, sc);				
			apuesta= new Apuesta<>(accionJugador, fichasSubir);
		}			
		else
			apuesta= conocedorAccionesJugador.accion2Apuesta(accionJugador, fichasNecesariasParaIgualar,jugador);
		
		
		if(!System.in.equals(flujoIn))
			sc.close();
		
		return apuesta;
	}
	
	/**
	 * Parsea la respuesta sobre la peticion de accion
	 * @param respuesta
	 * @return
	 */
	private AccionPoker parseaRespuesta(String respuesta) {
		
		AccionPoker accionJugador;
		
		if(respuesta.length()==1 && Character.isDigit(respuesta.charAt(0)))
		{
			accionJugador= AccionPoker.getByIndex(Integer.parseInt(respuesta));			
		}
		else
		{
			accionJugador= AccionPoker.parse(respuesta);		
		}
		
		return accionJugador;
	}
	
	/**
	 * Solicita las fichas para subir de una entrada con scanner
	 * @param fichasNecesariasParaIgualar
	 * @param sc
	 * @return
	 */
	private int solicitaFichasSubir(int fichasNecesariasParaIgualar,Scanner sc)
	{
		int fichasSubir=0;
		while(fichasSubir<= fichasNecesariasParaIgualar)
		{
			consola.mostrarTexto("Introduce el numero de fichas que quieras apostar(aunque no tengas apuesta el minimo necesario y se reajusta)");
			try {
			fichasSubir=sc.nextInt();
			}catch (Exception e) {
			}
		}
		
		return fichasSubir;
	}

	

	

	@Override
	public void realizaTurno()
	{		
		escogeAccion();
		
	}

}
