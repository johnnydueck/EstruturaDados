
package estrutura.de.dados;



public class EstruturaDeDados {


    public static void main(String[] args) {
        
        
        ListaEncadeada l = new ListaEncadeada();
        l.inserePrimeiro(3);
        l.inserePrimeiro(2);
        l.inserePrimeiro(1);
        l.imprime();
        l.insereUltimo(4);
        l.insereUltimo(5);
        l.inserePrimeiro(0);
        l.imprime();
        

    }
    
}
