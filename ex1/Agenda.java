
package ex1;


public class Agenda {
    
    private Contato[] contatos;
    private String nome;
    

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void info(){
        System.out.println("A agenda "+getNome());
         for (Contato c : getContatos()){
             System.out.println("Dados do contato:");
             System.out.println(c.getNome()+" "+c.getEmail()+" "+c.getTelefone());
         } 
      }
}
