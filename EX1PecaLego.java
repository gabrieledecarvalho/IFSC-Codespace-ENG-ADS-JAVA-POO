public class EX1PecaLego {
    // Atributos (características da peça)
    String cor;
    String formato;
    int numeroDePinos, altura;

    // Métodos (ações que a peça pode realizar)
    public void mostrarDetalhes() {
        System.out.println("Peça Lego " + cor + " com " + numeroDePinos + " pinos, formato " + formato + ".");
    }

    public void girar() {
        System.out.println("Peça Lego " + cor + " girou 90 graus!");
    }

    public void rotacao() {
        System.out.println("Peça Lego " + cor + " rotacionou 180 graus!");
    }

    public static void main(String[] args) {
        // Criando objetos (peças Lego reais)
        EX1PecaLego pecaVermelha = new EX1PecaLego();
        EX1PecaLego pecaAzul = new EX1PecaLego();
        EX1PecaLego pecaAmarela = new EX1PecaLego();

        // Definindo características da peça vermelha
        pecaVermelha.cor = "Vermelha";
        pecaVermelha.formato = "Retangular";
        pecaVermelha.numeroDePinos = 4;
        pecaVermelha.altura = 3;

        // Definindo características da peça azul
        pecaAzul.cor = "Azul";
        pecaAzul.formato = "Quadrado";
        pecaAzul.numeroDePinos = 2;
        pecaVermelha.altura = 5;

        pecaAmarela.cor = "Amarela";
        pecaAmarela.formato = "Retangular"
        pecaAmarela.numeroDePinos = 8;
        pecaAmarela.altura = 2;

        // Fazendo as peças realizarem ações
        pecaVermelha.mostrarDetalhes();
        pecaAzul.mostrarDetalhes();
        pecaAmarela.mostrarDetalhes();

        pecaVermelha.girar();
        pecaAzul.girar();
        pecaAmarela.girar();

        pecaVermelha.rotacao();
        pecaAzul.rotacao();
        pecaAmarela.rotacao();
    }
}