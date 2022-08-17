package codigos;
public class Contato {
    private static int contador=0;
    private String nome;
    private String telefone;
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
 
     public String getTelefone() {
         return telefone;
     }
 
     public void setTelefone(String telefone) {
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
 