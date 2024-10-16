// classes wrapper: não precisa definir como o scanner, faz mais coisas do que o objeto é capaz de fazer, transforma o objeto
import java.util.Scanner;

public class B1_4Teste {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     
       System.out.print("Digite um número inteiro: ");
       int numero = scanner.nextInt(); // aqui recebe inteiro e é isso
     
       // Exibindo os valores em diferentes bases
       System.out.println("Valor em decimal: " + numero);
       System.out.println("Valor em octal: " + Integer.toOctalString(numero));  // Converte para octal, o inteiro está se transformando em octal por causa do Integer, que é uma classe wrapper -> interpreta como string mesmo que seja um inteiro para nós
       System.out.println("Valor em hexadecimal: " + Integer.toHexString(numero));  // Converte para hexadecimal
       System.out.println("Valor em binário: " + Integer.toBinaryString(numero));  // Converte para binário
     
       scanner.close();
   }
}