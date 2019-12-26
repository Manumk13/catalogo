
package es.cice.catalogo;
import java.util.ArrayList;

/**
 * 
 * @author Manuel Veiga
 * @version: 26/12/19/ D
 * @see <a href= "https://github.com/Manumk13/catalogo.git /> enlace al repositorio Github</a>
 * esta clase se encarga de almacenar todos los videjoegos dentro de una misma lista y ademas devuelve el importe total de la suma de todos los juegos introducidos
 */
public class Cesta {
    ArrayList<Videojuego> listaJuegos = new ArrayList<Videojuego>();
    public void agregarProducto(Videojuego v){
        listaJuegos.add(v);
    }//cierre del metodo
    
    /**
     * 
     * @return devuelve el valor total del importe
     */
    public float calcularImporte(){
        float importe = 0;
        for (int i = 0; i <listaJuegos.size(); i++) {
        importe = importe + listaJuegos.get(i).getPrecio();
        }
        return importe;
}//cierre del metodo calcular importe
}//cierre de la clase
