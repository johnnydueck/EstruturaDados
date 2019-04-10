


package estrutura.de.dados;


public class Node {
 
    private Integer informacao;
    private Node proximo;
    
    public Node(){
        informacao = null;
        proximo = null;
    }
    
    public void setInfo(int info){
        informacao = info;
    }
    
    public Integer getInfo(){
        return informacao;
    }
    
    public void setProximo(Node prox){
        proximo = prox;
    }
    
    public Node getProx(){
        return proximo;
    }
    
    
}
