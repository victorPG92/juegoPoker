package juegos.cartas.poker.manos.draws;


/**
 * Estructura que representa una posicion con coordenadas en el cuadro de rango 
 * @author victor
 *
 */
public class PosicionXY 
{

	int x;
	int y;
	
	
	public PosicionXY(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
