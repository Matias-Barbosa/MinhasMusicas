package br.com.alura.minhasmusicas.modelos.principal;

import br.com.alura.minhasmusicas.modelos.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.modelos.minhasPreferidas;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Forever");
        minhamusica.setCantor("Kiss");

        for(int i=0; i < 2000; i++) {
            minhamusica.reproduz();
        }

        for(int i=0; i < 1000; i++) {
            minhamusica.curte();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("Marcus Mendes");
        meupodcast.setTitulo("BolhaDev");

        for(int i=0; i < 5000; i++) {
            meupodcast.reproduz();
        }

        for(int i=0; i < 5000; i++) {
            meupodcast.curte();
        }

        minhasPreferidas preferidas = new minhasPreferidas();
        preferidas.inclui(meupodcast);
        preferidas.inclui(minhamusica);
    }
}
