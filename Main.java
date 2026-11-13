import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Treinador treinador = new Treinador(
            1, "Filipe Luís", "111.222.333-44",
            LocalDate.of(1985, 8, 9), "CBF-9876", "4-2-3-1"
        );

        Time meuTime = new Time(1, "Flamengo", treinador);

        Jogador[] jogadores = {
            new Jogador(2, "Agustín Rossi", "001.001.001-01", LocalDate.of(1995, 8, 21), 1, "Goleiro"),
            new Jogador(3, "Guillermo Varela", "002.002.002-02", LocalDate.of(1993, 3, 24), 2, "Lateral Direito"),
            new Jogador(4, "Léo Ortiz", "003.003.003-03", LocalDate.of(1996, 1, 3), 3, "Zagueiro"),
            new Jogador(5, "Léo Pereira", "004.004.004-04", LocalDate.of(1996, 1, 31), 4, "Zagueiro"),
            new Jogador(6, "Alex Sandro", "005.005.005-05", LocalDate.of(1991, 1, 26), 26, "Lateral Esquerdo"),
            new Jogador(7, "Erick Pulgar", "006.006.006-06", LocalDate.of(1994, 1, 15), 5, "Volante"),
            new Jogador(8, "Nicolás de la Cruz", "007.007.007-07", LocalDate.of(1997, 6, 1), 18, "Meio-Campo"),
            new Jogador(9, "Giorgian de Arrascaeta", "008.008.008-08", LocalDate.of(1994, 6, 1), 10, "Meia Atacante"),
            new Jogador(10, "Gonzalo Plata", "009.009.009-09", LocalDate.of(2000, 11, 1), 50, "Ponta Direita"),
            new Jogador(11, "Bruno Henrique", "010.010.010-10", LocalDate.of(1990, 12, 30), 27, "Ponta Esquerda"),
            new Jogador(12, "Pedro", "011.011.011-11", LocalDate.of(1997, 6, 20), 9, "Centroavante")
        };

        for (Jogador j : jogadores) {
            meuTime.adicionarJogador(j);
        }

        Partida partida = new Partida(
            1,
            LocalDateTime.of(2026, 11, 22, 16, 0),
            "Atlético Mineiro",
            "Maracanã"
        );

        Escalacao escalacao = new Escalacao(1, partida, treinador);
        for (Jogador j : jogadores) {
            escalacao.escalarJogador(j);
        }

        escalacao.exibirEscalacao();
    }
}