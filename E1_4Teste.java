public class E1_4Teste {
    public static void main(String[] args) {
        //  operadores lógicos
        boolean a = true;
        boolean b = false;
       
        if (a && b) {
            System.out.println("Linha 1 VERDADE");
        }
        if (a || b) {
            System.out.println("Linha 2 - VERDADE");
        }
        if (!(a && b)) {
            System.out.println("Linha 3 VERDADE");
        }
    }
}
