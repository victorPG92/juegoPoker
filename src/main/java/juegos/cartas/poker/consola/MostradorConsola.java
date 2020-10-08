package juegos.cartas.poker.consola;

import java.util.List;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mesas.CeldaCartaMesa;
import juegos.cartas.cartas.mesas.Jugador;
import juegos.cartas.poker.mesas.MesaPokerTexasHoldem;

/**
 * Muestra por consola los elementos del poker
 * @author victor
 *
 * @param <C>
 */
public class MostradorConsola<C extends ICartaComparable> 
{
	
	public void mostrarMesa(MesaPokerTexasHoldem<C> mesa)
	{
	//	juegoPoker= ((JuegoPoker<C>)juegoCartas);
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Mesa: ");
		List<CeldaCartaMesa<C>> comunes =mesa.
				getCartasComunes();
		
		for (CeldaCartaMesa<C> carta : comunes) {
			sb.append(carta).append("\b");
		}
		
		System.out.println(sb.toString());
	}
	
	public void mostrarCartasjugador(Jugador<C> jugador)
	{
		
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Jugador: ");
		List<C> comunes = jugador.getCartas();
		
		for (ICartaComparable carta : comunes) {
			sb.append(carta).append("\b");
		}
		
		System.out.println(sb.toString());
	}
	
	public void mostrarTexto(String texto)
	{
		System.out.println(texto);
	}

}
