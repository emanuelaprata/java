import java.util.Scanner;
class Main {
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    //condições
    /*System.out.print("Digite um número:");
    int numero = sc.nextInt();
    if(numero < 0 ) {
      System.out.println("Numero digitado é negativo");
    } else {
      System.out.println("NUmero digitado é positivo");
    }
  */
  // o stacti é p não precisar ficar dando close 
    
  /*System.out.print("Quantidade de maçãs");
  double quantidade = sc.nextInt();
  if (quantidade < 12) {
    double valor = 2.50;
    double custo = quantidade * valor;
    System.out.println("Custo da compra:" + custo);
  } else {
    double valor = 1.90;
    double custo = quantidade * valor;
    System.out.println("Custo da compra:" + custo);
  }
*/
  System.out.print("Inicio:");
  int inicio = sc.nextInt();
  System.out.print("Fim:");
  int fim = sc.nextInt();

  if (inicio > fim) {
  int tempo = fim - inicio;
  System.out.println("O tempo de jogo foi:" +tempo);
  } else if ( inicio < fim){
  int tempo = inicio - 24 +fim;
  System.out.println("O tempo de jogo foi:" +tempo);
  } else if (inicio == fim) {
    System.out.println("O jogo durou 24hr.");
  }
    
  }
}