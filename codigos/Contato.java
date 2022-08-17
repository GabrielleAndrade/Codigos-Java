package codigos;
public class Contato {
    private static int contador=0;
    private String nome;
    private int telefone;
    private int id;
 
     public int getId() {
         return id;
     }
     
     public String getNome() {
         return nome;
     }
 
     public void setNome(String nome) {
         this.nome = nome;
     }
 
     public int getTelefone() {
         return telefone;
     }
 
     public void setTelefone(int telefone) {
         this.telefone = telefone;
     }
 
 
     public Contato() {
         contador++;
         id=contador;
     }
 
     @Override
     public String toString() {
         String s = "[";
         s+= "Id: " + id;
         s+= " ,Nome: " + nome;
         s+= " ,Telefone: " + telefone +" ]";
         return s;
     }
     
     
 }