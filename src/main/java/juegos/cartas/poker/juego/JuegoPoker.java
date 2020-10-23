package juegos.cartas.poker.juego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.juego.Apuesta;
import juegos.cartas.cartas.juego.JuegoCartas;
import juegos.cartas.cartas.juego.valorador.ValoradorJugadores;
import juegos.cartas.cartas.juego.valorador.ValoradorJugadoresPorMano;
import juegos.cartas.cartas.mazos.modelos.func.MazoCartasSimple;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.poker.crupier.CrupierPokerTexasHoldemAleatorio;
import juegos.cartas.poker.juego.realizadorTurno.ia.RealizadorTurnoIAPoker;
import juegos.cartas.poker.mesas.Apuestas;
import juegos.cartas.poker.mesas.MesaPokerTexasHoldem;
import juegos.cartas.poker.mesas.PosicionJugador;

public class JuegoPoker<C extends ICartaComparable> implements JuegoCartas<FasesPoker>
{
	private MesaPokerTexasHoldem<C> mesa;
	private int numJug;
	CrupierPokerTexasHoldemAleatorio<C> crupier;
	MazoCartasSimple<C> mazo;
	private int fichasIniciales=200;
	FasesPoker fase;
	
	/**indica el numero de jugador por el que va las rondas */
	int turno;
	
	
	
	/**fichas acumuladas que se estan apostando */
	int bote;
	
	/**mayor numero de fichas que se han apostado en el turno */
	int apuestaTurno;
	
	/**fichas que se han apostado en el turno por cada jugador */
	//Map<Jugador<C>,Integer> apuestaJugador= new HashMap<>();
	Apuestas<C>  apuestas= new Apuestas<>();
	
	/**Ultima accion realizada que afecta a las reaccines que puedan realizar los jugadores restantes */
	Apuesta<AccionPoker> ultimaAccionRealizada;
	
	/**Realiza turno de cada jugador */
	Map<Jugador<C>, RealizadorTurnoIAPoker<C>>realizadores= new HashMap<>();
	
	/**Valora los jugadores */
	ValoradorJugadores<C,JugadorPokerTexasHoldem<C>> valorador= new ValoradorJugadoresPorMano<>();
	
	
	
	public JuegoPoker(int numJug,MazoCartasSimple<C> mazo)
	{
		super();
		this.numJug = numJug;
		this.mazo=mazo;
		crupier= new CrupierPokerTexasHoldemAleatorio<>(mazo);
		
		List<JugadorPokerTexasHoldem<C>> jugadores=creaJugadores();
		
		mesa= new MesaPokerTexasHoldem<>(jugadores);

		fase= crupier.getFase();
	}
	
	private List<JugadorPokerTexasHoldem<C>> creaJugadores()
	{

		List<JugadorPokerTexasHoldem<C>> jugadores= new ArrayList<>();
		for (int i = 0; i < this.numJug; i++) 
		{
			JugadorPokerTexasHoldem<C> jug= new JugadorPokerTexasHoldem<>();
			jug.setId(""+ i);
			jug.setFichas(fichasIniciales);
			
			jugadores.add(jug);
			
			
		}
		
		return jugadores;
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
			Jugador<C> jugador= mesa.getPosiciones().getJugador(pos);
			if(jugador!=null)//puede que no esten todas las posiciones ocupadas
			{
				realizadores.get(jugador).realizaTurno();
			}
		}
		
	}
	
	

	@Override
	public void faseValoracionManos() 
	{
		while(!apuestas.estanApuestasFinalizadas())
		{
			JugadorPokerTexasHoldem<C> ganador=valorador.encontrarMejorJugador(mesa.getJugadores());
			ganador.recibirFichas(bote);
			bote=0;
			
			apuestaTurno=0;
			
		//	apuestas.getApuestaJugador()
		}
		
		apuestas.setApuestaJugador(new HashMap<>());
		
	}
	
	
	
	protected void fasePreflop() 
	{
		System.out.println(crupier.getFase());
		System.out.println(mesa);
		System.out.println(mesa.getPosiciones());
		
		for(Jugador<C> j: mesa.getJugadores())
		{
			j.setCartas(crupier.reparteCartasJugador());
		}
		
		System.out.println("Fase apuesta jugadores");
		//los jugadores realizan las apuestas despues de repartir las cartas
		faseApuestaJugadores();
		
		//quien debe avanzar la fase, el juego o el crupier?
		fase=crupier.avanzarFase();
		
	}
	
	protected void faseFlop()
	{
		System.out.println(crupier.getFase());
		
		List<C> cartasMesa = crupier.reparteCartasMesa();
		mesa.insertaCartasComunes(cartasMesa);
		//mesa.setCartasComunes(crupier.reparteCartasMesa());
		
		//quien debe avanzar la fase, el juego o el crupier?
		fase=crupier.avanzarFase();
		
	}
	
	
	protected void faseApuestaJugadores()
	{
		System.out.println(crupier.getFase());
		System.out.println(mesa);
		System.out.println(mesa.getPosiciones());
		for(Jugador<C> jugador: mesa.getPosiciones())
		{
			realizadores.get(jugador).realizaTurno();
		}

		
	}
	public MesaPokerTexasHoldem<C> getMesa() {
		return mesa;
	}

	public int getNumJug() {
		return numJug;
	}

	public CrupierPokerTexasHoldemAleatorio<C> getCrupier() {
		return crupier;
	}

	public MazoCartasSimple<C> getMazo() {
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

	public Map<Jugador<C>, RealizadorTurnoIAPoker<C>> getRealizadores() {
		return realizadores;
	}

	public int getBote() {
		return bote;
	}

	public int getApuestaTurno() {
		return apuestaTurno;
	}

	/*public Map<Jugador<C>, Integer> getApuestaJugador() {
		return apuestaJugador;
	}*/

	public Apuesta<AccionPoker> getUltimaAccionRealizada() {
		return ultimaAccionRealizada;
	}

	public Apuestas<C> getApuestas() {
		return apuestas;
	}

	public ValoradorJugadores<C,JugadorPokerTexasHoldem<C>> getValorador() {
		return valorador;
	}
	
	

}
