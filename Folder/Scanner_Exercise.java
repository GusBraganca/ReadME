import java.util.Scanner;

public class Scanner_Exercise {
 
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite seu primeiro nome: ");
    String primeiroNome = scan.nextLine();

    System.out.println("Digite seu sobrenome: ");
    String sobreNome = scan.nextLine();

    System.out.println("Digite sua idade: ");
    int Idade = scan.nextInt();

    System.out.println("Seu nome completo e :" + primeiroNome + " " + sobreNome);
    System.out.println("Sua idade e: " + Idade);

    }
}
