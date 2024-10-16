// string é uma classe utilitária, não precisa importar, faz parte da linguagem
public class B1_7Teste {
    public static void main(String[] args) {
        // Trabalhando com Character
        String palavra = "teste";
        System.out.println("Maiúsculo: " + palavra.toUpperCase()); // não preciso chamar a classe embrulhadora para expandir a String, posso chamar direto a variável
        // string é uma cadeia de tipos primitivos, não é um tipo primitivo, por isso não pode ser wrapper
        // a string se torna um objeto no java
    }

}