package juegos.cartas.poker.analisis.probs;

import juegos.cartas.cartas.cartas.ICartaComparable;
import juegos.cartas.cartas.mazos.modelos.func.MazoBarajear;
import juegos.cartas.cartas.mazos.modelos.func.MazoInsercion;

public interface MazoInsertaBarajea<C extends ICartaComparable>
extends MazoInsercion<C>,
MazoBarajear

{

}
