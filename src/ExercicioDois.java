import java.util.Scanner;

/*
* Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba seu valor.
 OBS:  Fórmula: IMC = peso/ (altura x altura).
* */
public class ExercicioDois {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe seu peso: ");
    float peso = inputUsuario.nextFloat();
    System.out.println("Informe sua altura: ");
    float altura = inputUsuario.nextFloat();

    float imc = peso / (altura * altura);

    System.out.printf("O seu imc é: " + "%.2f", imc);


  }
}
