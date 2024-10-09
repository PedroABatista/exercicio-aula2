import br.com.alura.exercicio2.som.Musica;
import br.com.alura.exercicio2.som.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.setTitulo("Girassol");
        musica1.setDuracao(201);
        musica1.setTotalDeReproducao(10);
        musica1.setCurtidas(5);
        musica1.setClassificacao(10);
        musica1.setArtista("Ivyson");

        musica1.descricao();

        Podcast podcast1 = new Podcast();
        podcast1.setAutor("PodPah");
        podcast1.setCategoria("Comédia");
        podcast1.setEpisodios(1);
        podcast1.setIdioma("PTBR");
        podcast1.setCurtidas(10);
    }
}
