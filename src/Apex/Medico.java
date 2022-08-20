
package Apex;

import java.util.Random;


public class Medico extends Personajes{
    
    Random r = new Random();

    public Medico() {
        super();
    }

    public Medico(String nombre, int vida, int escudo, Arma arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public Personajes ataque(Usuario atacante, Usuario atacado)  {
        int n = 1+r.nextInt(10);
        double restauracion = 0.01 * n;
        atacante.getPersonaje().setVida((int) (atacante.getPersonaje().getVida() + (atacante.getPersonaje().getVida() * restauracion)));
        if(atacado.getPersonaje().getEscudo() > 0){
            if(atacado.getPersonaje() instanceof Fortaleza){
                atacado.getPersonaje().setEscudo((int) (atacado.getPersonaje().getEscudo() - (0.15 * atacante.getPersonaje().getArma().getDano())));
            }else{
                if(atacado.getPersonaje() instanceof Rastreador){
                    atacado.getPersonaje().setEscudo((int) (atacado.getPersonaje().getEscudo() - (0.5 * atacante.getPersonaje().getArma().getDano())));
                }else{
                    atacado.getPersonaje().setEscudo(atacado.getPersonaje().getEscudo() - atacante.getPersonaje().getArma().getDano());
                }
            }  
        }else{
            if(atacado.getPersonaje() instanceof Fortaleza){
                atacado.getPersonaje().setVida((int) (atacado.getPersonaje().getVida() - (0.15 * atacante.getPersonaje().getArma().getDano())));
            }else{
                if(atacado.getPersonaje() instanceof Rastreador){
                    atacado.getPersonaje().setVida((int) (atacado.getPersonaje().getVida() - ((0.5 * atacante.getPersonaje().getArma().getDano()) + atacante.getPersonaje().getArma().getDano())));
                }else{
                    atacado.getPersonaje().setVida(atacado.getPersonaje().getVida() - atacante.getPersonaje().getArma().getDano());
                }
            }              
        }
        return atacado.getPersonaje();
    }
    
}
