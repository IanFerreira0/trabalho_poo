import java.time.LocalDate;

public class Jogador extends Pessoa {
    private int numeroCamisa;
    private String posicao;

    public Jogador() {
        super();
    }

    public Jogador(int id, String nome, String cpf, LocalDate dataNascimento, int numeroCamisa, String posicao) {
        super(id, nome, cpf, dataNascimento);
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
    }

    public int getNumeroCamisa() { return numeroCamisa; }
    public void setNumeroCamisa(int numeroCamisa) { this.numeroCamisa = numeroCamisa; }

    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }

    @Override
    public String toString() {
        return String.format("Camisa %02d - %s (%s)", numeroCamisa, nome, posicao);
    }
}