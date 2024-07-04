
public class App {
  public static void main(String[] args) {
    String nome = args[0];
    int idade = Integer.parseInt(args[1]);
    double altura = Double.parseDouble(args[2]);

    System.out.println("Olá meu nome é: " + nome);
    System.out.println("Tenho: " + idade + " Anos");
    System.out.println("Messo: " + altura + " metros");
  }
}
