
package Apex;


public abstract class Personajes {
    String nombre;
    int vida;
    int escudo;
    Arma arma;

    public Personajes(String nombre, int vida, int escudo, Arma arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = escudo;
        this.arma = arma;
    }

    public Personajes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", vida=" + vida + ", escudo=" + escudo + ", arma=" + arma.getNombre() + '}';
    }
    
    public abstract void ataque();
    
}
