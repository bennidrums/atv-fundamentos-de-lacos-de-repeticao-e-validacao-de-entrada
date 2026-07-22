import java.util.Scanner;

public class AtividadeForWhile {
    public static void main(String[] args) {

    System.out.println("Digite seu nome:");
    Scanner sc = new Scanner(System.in);
    String nome = sc.nextLine();

    System.out.println("Digite um numero positivo:");
    int numeroInicial = sc.nextInt();

    for (int i = 0; i <= numeroInicial; i++){
        System.out.println("Crescente: " + i);
    }

    for (int i = numeroInicial; i >= 0; i--){
        System.out.println("Decrescente: " + i);
    } if (nome.length() > 6){
        for (int i = 0; i < numeroInicial; i++) {
            System.out.println(nome);
        }

    } else {
            System.out.println(nome);
        }
    sc.close();

    }

}
