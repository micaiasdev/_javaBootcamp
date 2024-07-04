import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um número inteiro:");
    int parametro1 = teclado.nextInt();
    System.out.println("Digite outro número inteiro:");
    int parametro2 = teclado.nextInt();

    try {
      contar(parametro1, parametro2);
    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    }
  }

  static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
    int repeticoes = parametro2 - parametro1;
    if (repeticoes < 0)
      throw new ParametrosInvalidosException("O 2º parâmetro deve ser maior que o 1º");
    for (int i = 0; i < repeticoes; i++) {
      System.out.println("Numero " + (i + 1) + "Impresso");
    }
  }
}