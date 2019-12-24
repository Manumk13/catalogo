
package es.cice.catalogo;

import java.util.ArrayList;


public class Cesta {
    ArrayList<Videojuego> listaJuegos = new ArrayList<Videojuego>();
    public void agregarProducto(Videojuego v){
        listaJuegos.add(v);
    }
    public float calcularImporte(){
        float importe = 0;
        for (int i = 0; i <listaJuegos.size(); i++) {
        importe = importe + listaJuegos.get(i).getPrecio();
        }
        return importe;
}
}
