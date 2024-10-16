import java.util.Scanner; // importando uma biblioteca/classe para criar o objeto scanner depois

public class B1_1Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // criando o objeto (instância da classe) scanner da classe Scanner
       
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
       
        System.out.println("Você digitou: " + numero);
       
        scanner.close();
    }
}