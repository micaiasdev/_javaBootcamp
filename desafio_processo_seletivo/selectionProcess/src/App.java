import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        ligacaoCandidatos("João");
    }

    static void ligacaoCandidatos(String candidato) {
        boolean contato = false;
        for (int i = 0; i < 3; i++) {
            contato = ThreadLocalRandom.current().nextBoolean();
            if (contato) {
                System.out.println("Conseguimos contato com o candidato após " + (i + 1) + " tentativas");
                break;
            } else {
                System.out.println("Contato não realizado! Tentando novamente...");
            }
        }
        if (!contato)
            System.out.println("Não conseguimos contato com o candidato " + candidato + " após 3 tentativas");

    }

    static void candidatosSelecionados() {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos" };
        for (String candidato : candidatos) {
            System.out.println("O candidato " + candidato + " foi selecionado");
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas",
                "Lucia" };
        Random random = new Random();
        int quantidadeSelecionados = 0;
        double salarioBase = 2000;
        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
            if (quantidadeSelecionados == 5)
                break;
            System.out.println("O candidato " + candidato + " Exigiu ese valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                quantidadeSelecionados++;
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500, 2500);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;

        if (salarioPretendido < salarioBase)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salarioPretendido == salarioBase)
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
    }
}
