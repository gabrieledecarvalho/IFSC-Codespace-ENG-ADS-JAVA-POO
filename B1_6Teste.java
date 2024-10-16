public class B1_6Teste {
    public static void main(String[] args) {
        // Trabalhando com Character
        char letra1 = 'b'; // char é um tipo primitivo, por isso que precisamos chamar as classes embrulhadoras
        System.out.println("Maiúsculo: " + Character.toUpperCase(letra1));
        System.out.println("É digito? " + Character.isDigit(letra1));
        System.out.println("É letra? " + Character.isLetter(letra1));
        // System.out.println("É ? " + Character.is(letra1)); verificar os métodos que tem

        char letra2 = 'B';
        System.out.println("Maiúsculo: " + Character.toLowerCase(letra2));

    }

}