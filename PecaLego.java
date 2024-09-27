public class PecaLego { // classe pública PecaLego
    // Atributo (característica da peça)
    int numeroDePinos;
    int largura;

    public static void main(String[] args) {
        // Criando um objeto (uma peça Lego real)
        PecaLego minhaPeca = new PecaLego();
        PecaLego minhaPeca2 = new PecaLego(); // criando um novo objeto dentro da mesma classe, posso utilizar os mesmos atributos definidos na classe com valores diferentes

        // Definindo o atributo (característica da peça)
        minhaPeca.numeroDePinos = 4; // quando tem pontinho significa que tem a ver com atributo da peça 
        minhaPeca.largura = 5;
        
        // utilizando um atribudo da classe na peça número 2
        minhaPeca2.numeroDePinos = 6;
        
        // Mostrando o atributo da peça
        System.out.println("Minha peça Lego tem " + minhaPeca.numeroDePinos + " pinos"); // inprimindo minhaPeca + atributo dela
        System.out.println("Minha peça Lego tem " + minhaPeca.largura + " de largura"); // inprimindo minhaPeca + atributo dela

        System.out.println("Minha peça Lego tem " + minhaPeca2.numeroDePinos + " pinos"); // inprimindo minhaPeca + atributo dela
    } 
}