//  declarando a classe pública e chamando-a de "PecaLego", uma classe pública significa que ela pode ser acessada de qualquer parte do código!
public class PecaLego {
    // Atributos (características da peça)
    String cor; //  definindo o atributo cor, do tipo String
    String formato; //  definindo o atributo formato, do tipo String também
    int numeroDePinos; //   definindo a variável numeroDePinos, do tipo inteiro

    // Métodos (ações que a peça pode realizar)
    public void mostrarDetalhes() { //  método público, que não retorna nada [void], mas mostra na tela os detalhes da peça
        System.out.println("Peça Lego " + cor + " com " + numeroDePinos + " pinos, formato " + formato + ".");
    }

    public void girar() { // método público e que também não retorna nada [void], o método faz a peça girar em 90 graus
        System.out.println("Peça Lego " + cor + " girou 90 graus!");
    }

    // Novo método para interação entre peças
    public void empilharSobre(PecaLego outraPeca) { // outro método público que não retorna nada, mas que faz uma peça interagir com outra
        System.out.println("Peça Lego " + this.cor + " foi empilhada sobre a peça Lego " + outraPeca.cor + "."); 
        //  o this. é referente à peça que está sendo modificada (a que está chamando o método) e que aqui irá interagir com outra peça
    } 


    public static void main(String[] args) {
        // Criando objetos (peças Lego reais)
        PecaLego pecaVermelha = new PecaLego();
        PecaLego pecaAzul = new PecaLego();

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