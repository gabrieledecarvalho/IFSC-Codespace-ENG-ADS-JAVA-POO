public class 20241001_PecaLego {
    // Atributo (característica da peça)
    int numeroDePinos;

    // Método (ação que a peça pode realizar)
    public void mostrarPinos() {
        System.out.println("Mostra peça Lego com " + numeroDePinos + " pinos");
    }

    public static void main(String[] args) {
        // Criando um objeto (uma peça Lego real)
        PecaLego minhaPeca = new PecaLego();
        
        // Definindo a característica da peça
        minhaPeca.numeroDePinos = 4;
        
        // Fazendo a peça realizar uma ação
        minhaPeca.mostrarPinos();
    }
}