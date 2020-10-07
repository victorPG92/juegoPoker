package juegos.cartas.poker.juego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import juegos.cartas.cartas.cartas.Carta;
import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.JuegoCartas;
import juegos.cartas.cartas.juego.Mano;
import juegos.cartas.cartas.juego.ValoradorJugadores;
import juegos.cartas.cartas.juego.ValoradorJugadoresSimple;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.cartas.mesas.Mesa;
import juegos.cartas.poker.crupier.CrupierPokerTexasHoldemAleatorio;
import juegos.cartas.poker.crupier.FasesPoker;
import juegos.cartas.poker.juego.realizadorTurno.ia.RealizadorTurnoIAPoker;

public class JuegoPoker<C extends ICartaComparable> implements JuegoCartas
{
	private MesaPokerTexasHoldem<C> mesa;
	private int numJug;
	CrupierPokerTexasHoldemAleatorio crupier;
	MazoGen mazo;
	private int fichasIniciales=200;
	FasesPoker fase;
	
	/**indica el numero de jugador por el que va las rondas */
	int turno;
	
	Map<Jugador<C>, RealizadorTurnoIAPoker>realizadores= new HashMap<>();
	
	/**fichas acumuladas que se estan apostando */
	int bote;
	
	/**mayor numero de fichas que se han apostado en el turno */
	int apuestaTurno;
	
	/**fichas que se han apostado en el turno por cada jugador */
	Map<Jugador<C>,Integer> apuestaJugador= new HashMap<>();
	
	
	/**Ultima accion realizada que afecta a las reaccines que puedan realizar los jugadores restantes */
	AccionPoker ultimaAccionRealizada;
	
	ValoradorJugadores<C> valorador= new ValoradorJugadoresSimple<>();
	
	public JuegoPoker(int numJug,MazoGen mazo)
	{
		super();
		this.numJug = numJug;
		this.mazo=mazo;
		crupier= new CrupierPokerTexasHoldemAleatorio(mazo);
		
		List<Jugador> jugadores= new ArrayList<>();
		for (int i = 0; i < this.numJug; i++) 
		{
			Jugador jug= new Jugador();
			jug.setId(""+ i);
			jug.setFichas(fichasIniciales);
			
			jugadores.add(jug);
			
			
		}
		mesa= new MesaPokerTexasHoldem(jugadores);

		fase= crupier.getFase();
	}

	@Override
	public void faseInicializacion()
	{
		
		fasePreflop();
	}

	

	@Override
	public void faseRondas() 
	{
		for(PosicionJugador pos: PosicionJugador.values())
		{
			Jugador jugador= mesa.getPosiciones().getJugador(pos);
			if(jugador!=null)//puede que no esten todas las posiciones ocupadas
			{
				realizadores.get(jugador).realizaTurno();
			}
		}
		
	}
	
	

	@Override
	public void faseValoracionManos() 
	{
		Jugador<C> ganador=valorador.encontrarMejorJugada(mesa.getJugadores());
		ganador.recibirFichas(bote);
		bote=0;
		apuestaJugador= new HashMap<>();
		apuestaTurno=0;
		
		
	}
	
	
	
	protected void fasePreflop() 
	{
		System.out.println(crupier.getFase());
		for(Jugador j: mesa.getJugadores())
		{
			j.setCartas(crupier.reparteCartasJugador());
		}
		
		//quien debe avanzar la fase, el juego o el crupier?
		fase=crupier.avanzarFase();
		
	}
	
	protected void faseFlop()
	{
		System.out.println(crupier.getFase());
		
		mesa.setCartasComunes(crupier.reparteCartasMesa());
		
		//quien debe avanzar la fase, el juego o el crupier?
		fase=crupier.avanzarFase();
		
	}

	public MesaPokerTexasHoldem<C> getMesa() {
		return mesa;
	}

	public int getNumJug() {
		return numJug;
	}

	public CrupierPokerTexasHoldemAleatorio getCrupier() {
		return crupier;
	}

	public MazoGen getMazo() {
		return mazo;
	}

	public int getFichasIniciales() {
		return fichasIniciales;
	}

	public FasesPoker getFase() {
		return fase;
	}

	public int getTurno() {
		return turno;
	}

	public Map<Jugador<C>, RealizadorTurnoIAPoker> getRealizadores() {
		return realizadores;
	}

	public int getBote() {
		return bote;
	}

	public int getApuestaTurno() {
		return apuestaTurno;
	}

	public Map<Jugador<C>, Integer> getApuestaJugador() {
		return apuestaJugador;
	}

	public AccionPoker getUltimaAccionRealizada() {
		return ultimaAccionRealizada;
	}

	public ValoradorJugadores<C> getValorador() {
		return valorador;
	}
	
	

}
