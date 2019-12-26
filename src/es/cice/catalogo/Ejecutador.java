package es.cice.catalogo;
/**
 * Esta clase se encarga de ejecutar  toda la aplicacion aqui se pueden apreciar todas las llamadas
 * @author Manuel veiga
 * @version: 26/12/19/ D
 * @see <a href= "https://github.com/Manumk13/catalogo.git /> enlace al repositorio Github</a>
 */
public class Ejecutador {

    public static void main(String[] args) {
        Videojuego v1 = new Videojuego("Dark Souls", "Play Station 3", "From Software", "16", 25.40f,"santa monica");
        Videojuego v2 = new Videojuego("Fifa 19", "Play Station 4", "EA Sports", "12", 25.40f,"EA sports");
        Videojuego v3 = new Videojuego("Mortal Kombat XI", "XBOX-one", "NetherRealm Studios", "18", 56.95f,"MKX");
        Videojuego v4 = new Videojuego("Fortnite", "Nintendo Swich", "Epic Games", "12", 36.95f,"Epic games");
        Videojuego v5 = new Videojuego("Naruto Generation", "pc", "Otakucenters", "16", 26.95f,"sega");
        Videojuego v6 = new Videojuego("Shekiro", "PS4	", "From Software", "16", 46.95f,"santa monica");
        Videojuego v7 = new Videojuego("Mario kart8", "Nintendo Swich", "sega", "12", 36.95f,"nintendo");
        Videojuego v8 = new Videojuego("Pshyco8", "pc", "PSY", "18", 56.95f,"CRZY");
        Videojuego v9 = new Videojuego("Uncharted", "X-box", "NetherRealm Studios", "12", 6.95f,"santa monica");
        Videojuego v10 = new Videojuego("Black ops 3", "PS4", "Treyarch", "18", 36.95f,"Treyarch");
        
        
        
        Cesta c1 = new Cesta();
        c1.agregarProducto(v1);
        c1.agregarProducto(v2);
        c1.agregarProducto(v3);
        c1.agregarProducto(v4);
        c1.agregarProducto(v5);
        c1.agregarProducto(v6);
        c1.agregarProducto(v7);
        c1.agregarProducto(v8);
        c1.agregarProducto(v9);
        c1.agregarProducto(v10);
        float importeCesta = c1.calcularImporte();
        System.out.println("Importe de la compra :" + importeCesta);
    }
}
