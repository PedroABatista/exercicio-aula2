package br.com.alura.exercicio2.som;

public class Musica extends Audio{
    private String artista;

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void descricao() {
        super.descricao();
        System.out.println("Artista : " + artista);
    }
}
