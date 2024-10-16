import java.util.Scanner;

public class B1_2Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // classe System, utilitária já dentro do java, não precisa importar

        System.out.print("Digite um número inteiro: ");
        int numeroInt = entrada.nextInt(); // nextInt é o método que o objeto pode fazer (vindo da classe)
        System.out.println("Você digitou o inteiro: " + numeroInt);

        System.out.print("Digite um número decimal (float): ");
        float numeroFloat = entrada.nextFloat();
        System.out.println("Você digitou o float: " + numeroFloat);

        System.out.print("Digite um número decimal (double): ");
        double numeroDouble = entrada.nextDouble();
        System.out.println("Você digitou o double: " + numeroDouble);

        System.out.print("Digite uma palavra: ");
        // String é uma classe java.lang.String
        String palavra = entrada.next(); // método que pega a palavra até o espaço
        System.out.println("Você digitou a palavra: " + palavra);

        // Consumir a quebra de linha residual após a leitura do double
        entrada.nextLine(); // método que pega uma linha inteira (enter)

        System.out.print("Digite uma linha de texto: ");
        String linha = entrada.nextLine();  // Lê toda a linha de texto
        System.out.println("Você digitou a linha: " + linha);

        entrada.close();
    }
}