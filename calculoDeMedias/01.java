import java.util.Scanner;
import java.util.Arrays;

  class Main 
  {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

/*ARRAY NO JAVA
aceita apenas um tipo de dado, se a informação não puder ser convertida da erro

String array [] = new String [quantidade de indice que o array tem]
*/ 
      
  double medias[] = new double[5];
  String aluno[] = new String[5];
  for (int i = 0; i < medias.length; i++) {
    System.out.print("Nome do aluno: ");
    aluno[i] = sc.next();
    double nota[] = new double [2];
    System.out.print("Nota 01: ");
    nota[0] = sc.nextDouble();
    System.out.print("Nota 02: ");
    nota[1] = sc.nextDouble();
    while ( nota[0] < 0 || nota[0]> 10 ) {
    System.out.print("Nota 01 inválida, informe a nota: ");
    nota[0] = sc.nextDouble();;
    }
    while ( nota[1] < 0 || nota[1]> 10 ) {
    System.out.print("Valor inválido, informe a nota:  ");
        nota[1] = sc.nextDouble();
    }
    if (+Arrays.stream(nota).sum()/2 < 6) {
      System.out.println(aluno[i] +", foi reprovado! Sua média foi de: " +Arrays.stream(nota).sum()/2);
      medias[i] = Arrays.stream(nota).sum()/2;
      } else {
        System.out.println(aluno[i] +", foi aprovado! Sua média foi de: " +Arrays.stream(nota).sum()/2);
      medias[i] = Arrays.stream(nota).sum()/2;
      }
    }
      for (int i = 0; i < medias.length; i++){
        if (medias[i] < 6) {
          System.out.println(aluno[i] +", reprovado(a): " +medias[i]);
        } else {
          System.out.println(aluno[i] +", aprovado(a): " +medias[i]);
        }
      
      }
}
  
}