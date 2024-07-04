<<<<<<< HEAD
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
       ContaTerminal account = new ContaTerminal();
       
       System.out.println("Digite o número da Conta:");
       account.setNumero(teclado.nextInt());

       System.out.println("Digite o número da Agência:");
       account.setAgencia(teclado.next());
       
       System.out.println("Digite Seu nome:");
       account.setNomeCliente(teclado.next());
       teclado.nextLine();

       System.out.println("Digite Seu Saldo:");
       account.setSaldo(Double.parseDouble(teclado.next()));
       
       account.printfeedbackCreateAccount();
       
    }
}
=======
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
       ContaTerminal account = new ContaTerminal();
       
       System.out.println("Digite o número da Conta:");
       account.setNumero(teclado.nextInt());

       System.out.println("Digite o número da Agência:");
       account.setAgencia(teclado.next());
       
       System.out.println("Digite Seu nome:");
       account.setNomeCliente(teclado.next());
       teclado.nextLine();

       System.out.println("Digite Seu Saldo:");
       account.setSaldo(Double.parseDouble(teclado.next()));
       
       account.printfeedbackCreateAccount();
       
    }
}
>>>>>>> a9dddb795bc9408cce9168657aae95eef2f81677
