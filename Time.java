import java.util.ArrayList;
import java.util.List;

public class Time {
    private int id;
    private String nome;
    private Treinador treinador;
    private List<Jogador> elenco;

    public Time(int id, String nome, Treinador treinador) {
        this.id = id;
        this.nome = nome;
        this.treinador = treinador;
        this.elenco = new ArrayList<>();
    }

    public void adicionarJogador(Jogador j) {
        this.elenco.add(j);
    }

    public void removerJogador(Jogador j) {
        this.elenco.remove(j);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Treinador getTreinador() { return treinador; }
    public void setTreinador(Treinador treinador) { this.treinador = treinador; }

    public List<Jogador> getElenco() { return elenco; }
}