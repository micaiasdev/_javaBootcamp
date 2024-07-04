package estruturas_condicionais;

public class FormatadorCpf {
  public static void main(String[] args) throws CpfInvalidoException {
    System.out.println(formatarCpf("212367810"));

  }

  public static String formatarCpf(String cpf) throws CpfInvalidoException {
    if (cpf.length() != 11)
      throw new CpfInvalidoException();

    return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
  }
}
