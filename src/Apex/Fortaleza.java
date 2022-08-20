
package Apex;


public class Fortaleza extends Personajes{

    public Fortaleza() {
        super();
    }

    public Fortaleza(String nombre, int vida, int escudo, Arma arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public Personajes ataque(Usuario atacante, Usuario atacado) {
        if(atacado.getPersonaje().getEscudo() > 0){
            if(atacado.getPersonaje() instanceof Fortaleza){
                atacado.getPersonaje().setEscudo((int) (atacado.getPersonaje().getEscudo() - (0.15 * atacante.getPersonaje().getArma().getDano())));
            }else{
                if(atacado.getPersonaje() instanceof Medico){
                    atacado.getPersonaje().setEscudo((int) (atacado.getPersonaje().getEscudo() - ((0.15 * atacante.getPersonaje().getArma().getDano()) + atacante.getPersonaje().getArma().getDano())));
                }else{
                    atacado.getPersonaje().setEscudo(atacado.getPersonaje().getEscudo() - atacante.getPersonaje().getArma().getDano());
                }
            }
        }else{
            if(atacado.getPersonaje() instanceof Fortaleza){
                atacado.getPersonaje().setVida((int) (atacado.getPersonaje().getVida() - (0.15 * atacante.getPersonaje().getArma().getDano())));
            }else{
                if(atacado.getPersonaje() instanceof Medico){
                    atacado.getPersonaje().setVida((int) (atacado.getPersonaje().getVida() - ((0.15 * atacante.getPersonaje().getArma().getDano()) + atacante.getPersonaje().getArma().getDano())));
                }else{
                    atacado.getPersonaje().setVida(atacado.getPersonaje().getVida() - atacante.getPersonaje().getArma().getDano());
                }
            }            
        }
        return atacado.getPersonaje();
    }
    
    
}
