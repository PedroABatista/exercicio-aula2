package br.com.alura.exercicio2.principal;

import br.com.alura.exercicio2.som.Musica;
import br.com.alura.exercicio2.som.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.setTitulo("Girassol");
        musica1.setDuracao(201);
        musica1.setTotalDeReproducao(10);
        musica1.avalia(8);
        musica1.avalia(10);
        musica1.avalia(7);
        musica1.setClassificacao(10);
        musica1.setArtista("Ivyson");

        musica1.descricao();
        System.out.println("Total de Avaliações : " + musica1.getSomaDasCurtidas());

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("PodPah");
        podcast1.setAutor("Igão e Mitico");
        podcast1.setCategoria("Comédia");
        podcast1.setEpisodios(1);
        podcast1.setIdioma("PTBR");
        podcast1.avalia(10);
        podcast1.avalia(5);
        podcast1.avalia(7);

        System.out.println("");
        podcast1.descricao();
        System.out.println("Total de Avaliações : " + podcast1.getSomaDasCurtidas());
    }
}