package codigos;

public class Agenda {
    private Contato[] contatos;
    
    public Agenda(){
        contatos= new Contato[5];
    }
    public boolean Addcontato(Contato c){
        boolean cheia = true;
        for (int i=0;i<contatos.length;i++){
           if (contatos[i] !=null){
               contatos[i]=c;
               //enquanto o indice do contato for diferente de nulo recebe c
               cheia=false;
           }
       }
        if (cheia)
        
        return false;
    }
    @Override
    public String toString() {
        
        return "Agenda{" + "contatos=" + contatos + '}';
    }
    
}

