package ogaitw.introducaoaoSpring.entities;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}