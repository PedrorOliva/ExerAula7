/*
* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
* Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 * */
import java.util.Scanner;

public class ExercicioQuatro {
  public static void main(String[] args) {
    Scanner idadeUsuario = new Scanner(System.in);

    System.out.println("Informe a sua idade em anos, meses e dias:  ");
    System.out.println("Anos:  ");
    int anos = idadeUsuario.nextInt();
    System.out.println("Meses:  ");
    int meses = idadeUsuario.nextInt();
    System.out.println("Dias:  ");
    int dias = idadeUsuario.nextInt();

    dias = dias + (anos * 365) + (meses * 30);

    System.out.println("Sua idade em dias: " + dias + " dias");
  }
}
