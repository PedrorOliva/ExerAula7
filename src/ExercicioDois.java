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

    if(imc <= 16.9) {
      System.out.printf("O seu imc é: " + "%.2f", imc);
      System.out.println(" -> Muito abaixo do peso!");
    } else if (imc >= 18 && imc <= 18.4 ) {
      System.out.printf("O seu imc é: " + "%.2f", imc);
      System.out.println(" -> Abaixo do peso!");
    } else if (imc >= 18.5 && imc <= 24.9) {
      System.out.printf("O seu imc é: " + "%.2f", imc);
      System.out.println(" -> Peso normal!");
    } else if (imc >= 25 && imc <= 29.9 ) {
      System.out.printf("O seu imc é: " + "%.2f", imc);
      System.out.println(" -> Acima do peso!");
    } else if (imc >= 30 && imc <= 34.9) {
      System.out.printf("O seu imc é: " + "%.2f", imc);
      System.out.println(" -> Obesidade grau 1!");
    } else if (imc >= 35 && imc <= 40) {
      System.out.printf("O seu imc é: " + "%.2f", imc);
      System.out.println(" -> Obesidade grau 3!");
    } else {
      System.out.printf("O seu imc é: " + "%.2f", imc);
      System.out.println(" -> Obesidade grau 3!");
    }
  }
}
