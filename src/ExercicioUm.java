/*
*   João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
* diário de seu trabalho.
*   Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de
* pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente.
*   João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
*   Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João
* deverá pagar. Imprima os dados do programa com as mensagens adequadas.

 * */

import java.util.Scanner;

public class ExercicioUm {
  public static void main(String[] args) {

    Scanner inputUsuario = new Scanner(System.in);

    float peso;
    float excesso;

    System.out.println("Insira a quantidade de peixes em kilos: ");
    peso = inputUsuario.nextFloat();

    if(peso > 50) {
      excesso = peso - 50;
      float multa = excesso * 4;
      System.out.println("Limite de pesca excedido em: " + excesso + "kgs");
      System.out.println("Multa a pagar R$" + multa);
    } else {
      System.out.println("Nenhuma multa a pagar");
    }
  }
}
