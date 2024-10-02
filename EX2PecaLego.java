public class EX2PecaLego {
    // Atributos (características da peça)
    String cor;
    String formato;
    int numeroDePinos;

    // Métodos (ações que a peça pode realizar)
    public void mostrarDetalhes() {
        System.out.println("Peça Lego " + cor + " com " + numeroDePinos + " pinos, formato " + formato + ".");
    }

    public void girar() {
        System.out.println("Peça Lego " + cor + " girou 90 graus!");
    }

    // Novo método para interação entre peças
    public void empilharSobre(EX1PecaLego outraPeca) {
        System.out.println("Peça Lego " + this.cor + " foi empilhada sobre a peça Lego " + outraPeca.cor + "."); 
    } 


    public static void main(String[] args) {
        // Criando objetos (peças Lego reais)
        EX2PecaLego pecaVermelha = new EX2PecaLego();
        EX2PecaLego pecaAzul = new EX2PecaLego();

        // Definindo características da peça vermelha
        pecaVermelha.cor = "Vermelha";
        pecaVermelha.formato = "Retangular";
        pecaVermelha.numeroDePinos = 4;

        // Definindo características da peça azul
        pecaAzul.cor = "Azul";
        pecaAzul.formato = "Quadrado";
        pecaAzul.numeroDePinos = 2;

        // Fazendo as peças realizarem ações individuais
        pecaVermelha.mostrarDetalhes();
        pecaAzul.mostrarDetalhes();

        pecaVermelha.girar();
        pecaAzul.girar();

        // Fazendo as peças interagirem
        pecaVermelha.empilharSobre(pecaAzul);
    }
}

