
package Apex;

public class Arma {
    String nombre;
    int dano;
    int presicion;

    public Arma() {
    }

    public Arma(String nombre, int dano, int presicion) {
        this.nombre = nombre;
        this.dano = dano;
        this.presicion = presicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getPresicion() {
        return presicion;
    }

    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }

    
}
