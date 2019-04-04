


package estruturadados;



public class listaEncadeada {
    
    private Node lista;
    private int cont = 0;
    
    public listaEncadeada(){
        lista = null;
    }
    
    public void inserePrimeiro(int info){
        Node n = new Node();
        
        if(vazia()){
            n.setInfo(info);
            n.setProximo(null);
            lista = n;
            cont++;
        }else{
            n.setProximo(lista);
            lista = n;
            n.setInfo(info);
            cont++;
        }
    }
    
    public void insereUltimo(int info){
        Node n = new Node();
     
        if(lista != null){
            lista = lista.getProx();
        }else{
            lista = n;
            lista.setInfo(info);
            lista.setProximo(null);
            cont++;
        }
        
                   
     }
        
                
    
    
    public void imprime(){
        Node listaImpressao = lista;
        while(listaImpressao != null){
            System.out.println("Info: "+listaImpressao.getInfo());
            System.out.println("Prox: "+ listaImpressao.getProx());
            listaImpressao = listaImpressao.getProx();
        }
    }
    
    public boolean vazia(){
        if(lista == null)
            return true;
        else
            return false;
    }
    
    public Node getLista(){
        return lista;
    }
    
    
    
}
