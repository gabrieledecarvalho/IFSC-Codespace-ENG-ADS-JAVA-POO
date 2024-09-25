/* Regras: [ver o porquê]
    1. o nome da classe sempre será iniciado em maiúscula. exemplo A0HelloWorld
    2. tudo que abre -> fecha
    3. fechar as rotinas em ";"
    4. System.out inicia em maiúscula

    O programa a seguir é um exemplo em que eu só tenho a classe, não existe nenhum objeto sendo criado (não precisaria ter o println)
*/

public class MoldePecaLego { // public class: significa que esta classe pode ser usada em qualquer parte do código (outra classe pode usar), o nome da classe é MoldePecaLego
    public static void main(String[] args) { 
        /*  o método main é um acionador do código, o início de um programa java;
            ele é um método mas ele não transforma nenhum objeto e sim a classe, é o único que faz isso;
            static: significa que ele faz parte do bloco onde ele está e nada mais, posso chamar outro bloco public static void main(...); obs: o main é public, significa q pode ser acessado por outras partes do código, mas como ele é static ele é dessa parte, da classe, não de outra
            o void (vazio) significa que o método não espera nenhum retorno;
            String[] args é uma formalidade da máquina virtual java, precisa disso pra ter portabilidade
            
            agora a classe está preparada para ser molde de objeto, mas não tá fazendo nada, não temos objeto dentro, logo, não temos atributos
        */
        System.out.println("Sou um molde para peças Lego"); // a classe só faz uma coisa, entrega esta mensagem: ela é um molde
    }
} // colchete que fecha a classe ! [regra 2]