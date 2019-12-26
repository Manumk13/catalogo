
package es.cice.catalogo;


/**
 * Esta clase  se usara cara la creacion de objetos con una serie de parametros especificos 
 * @author Manuel Veiga
 * @version: 26/12/19/ D
 * @see <a href= "https://github.com/Manumk13/catalogo.git /> enlace al repositorio Github</a>
 */
public class Videojuego {
	// atributos
    private String titulo;
    private String plataforma;
    private String desarrollador;
    private String edad;
    private float precio;
    private String company;
// constructor
    /**
     * Constructor  para meter los valores a los atributos de cad objeto que creemos
     * 
     */
    public Videojuego(String titulo, String plataforma, String desarrollador, String edad, float precio, String company) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
        this.edad = edad;
        this.precio = precio;
        this.company = company;
    }// cierre del constructor
// getter and setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getCompany() {
        return company;
    }
    public void setPrecio() {
        this.company = company;
    }
    
}// cierre de clase
