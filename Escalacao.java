import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Escalacao {
    private int id;
    private Partida partida;
    private Treinador treinador;
    private List<Jogador> jogadoresEscalados;

    public Escalacao(int id, Partida partida, Treinador treinador) {
        this.id = id;
        this.partida = partida;
        this.treinador = treinador;
        this.jogadoresEscalados = new ArrayList<>();
    }

    public void escalarJogador(Jogador j) {
        if (!this.jogadoresEscalados.contains(j)) {
            this.jogadoresEscalados.add(j);
        }
    }

    public void removerJogadorEscalado(Jogador j) {
        this.jogadoresEscalados.remove(j);
    }

    public void exibirEscalacao() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        System.out.println("==========================================");
        System.out.println("DATA DA PARTIDA: " + partida.getDataHora().format(fmt));
        System.out.println("TIME ADVERSÁRIO: " + partida.getTimeAdversario());
        System.out.println("LOCAL: " + partida.getLocal());
        System.out.println("TREINADOR: " + treinador.getNome());
        System.out.println("------------------------------------------");
        System.out.println("JOGADORES ESCALADOS:");
        for (Jogador j : jogadoresEscalados) {
            System.out.println("  ° " + j);
        }
        System.out.println("==========================================\n");
    }

    public int getId() { return id; }
    public Partida getPartida() { return partida; }
    public Treinador getTreinador() { return treinador; }
    public List<Jogador> getJogadoresEscalados() { return jogadoresEscalados; }
}