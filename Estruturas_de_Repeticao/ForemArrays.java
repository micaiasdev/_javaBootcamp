package Estruturas_de_Repeticao;

import java.util.ArrayList;
import java.util.Arrays;

public class ForemArrays {
  public static void main(String[] args) {
    ArrayList<String> nomes = new ArrayList<>(Arrays.asList("João", "Maria", "José", "Pedro", "Paulo"));
    int idades[] = { 20, 30, 40, 50, 60 };

    nomes.forEach(nome -> {
      int i = 0;
      System.out.println("Nome: " + nome + ", Idade: " + idades[i++]);
    });

  }
}
