
package Apex;

public class Usuario {
    String nombre;
    int ID;
    String contra;
    Personajes personaje;

    public Usuario() {
    }

    public Usuario(String nombre, int ID, String contra, Personajes personaje) {
        this.nombre = nombre;
        this.ID = ID;
        this.contra = contra;
        this.personaje = personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Personajes getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personajes personaje) {
        this.personaje = personaje;
    }
    
    
}
