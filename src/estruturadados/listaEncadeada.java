
package estrutura.de.dados;


public class ListaEncadeada {
    
    private Node lista;
    private int cont = 0;
    private Node ultimo;
    
    public ListaEncadeada(){
        lista = null;
    }
    
    public void inserePrimeiro(int info){
        Node n = new Node();
        
        if(vazia()){
            n.setInfo(info);
            n.setProximo(null);
            lista = n;
            cont++;
            ultimo = lista;
        }else{
            n.setProximo(lista);
            lista = n;
            n.setInfo(info);
            cont++;
        }
    }
    
    public void insereUltimo(int info){
        Node n = new Node();
        
        n.setProximo(null);
        n.setInfo(info);        
        ultimo.setProximo(n);
        ultimo = n;        
        cont++;
     
     }
        
                
    
    
    public void imprime(){
        Node listaImpressao = lista;
        while(listaImpressao != null){
            System.out.println("Info: "+listaImpressao.getInfo());
            System.out.println("Prox: "+ listaImpressao.getProx());
            System.out.println("Ultimo: "+ultimo.getInfo());
            
            listaImpressao = listaImpressao.getProx();
        }
    }
    
    public boolean vazia(){
        return lista == null;
    }
    
    public Node getLista(){
        return lista;
    }
    
    
}
