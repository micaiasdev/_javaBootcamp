package condicionais;

import java.util.Scanner;

public class ternario {
  public static void main(String[] args) {
    while (true) {
      try (Scanner teclado = new Scanner(System.in)) {
        System.out.println("Digite a nota do aluno: ");
        double nota = teclado.nextDouble();

        String resultado = nota >= 7.0 && nota <= 10 ? "Aprovado"
            : (nota < 7) && (nota >= 5) ? "Recuperação" : nota < 5 && nota >= 0 ? "Reprovado" : "Nota inválida";

        System.err.println(resultado);
      }
    }
  }
}
