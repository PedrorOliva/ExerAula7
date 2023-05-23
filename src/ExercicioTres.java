import java.util.Scanner;

/*
*  Crie um algoritmo que leia o valor do salário de um usuário, calcule a quantidade de salários mínimos
* que esse usuário ganha e imprima o resultado. (1SM=R$1.212,00).
* */
public class ExercicioTres {
  public static void main(String[] args) {
    Scanner salarioUsuario = new Scanner(System.in);

    float salarioMinimo = 1212;

    System.out.println("Informe o seu salário: ");
    float salario = salarioUsuario.nextFloat();

    float qtdSalarios = salario / salarioMinimo;

    System.out.println("Você ganha " + qtdSalarios + " salários mínimos");
  }
}
