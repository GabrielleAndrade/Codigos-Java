package codigos;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
             Agenda agenda= new Agenda();
            int opcao = 1;
            while (opcao !=3){
                opcao = obterOpcaoMenu(s);
                if (opcao ==1){
                consultarContato(s,agenda);
            }   else if (opcao ==2){
                adicionarContato(s,agenda);
            } 
            }
        }   public static void adicionarContato(Scanner s,Agenda agenda){
                    try {
                        System.out.println("Criando um contato,entre com as infos: ");
                    
                    String nome=leInformacaoString(s,"Nome: ");
                    String telefone=leInformacaoString(s,"Telefone: ");
                    
                    Contato contato = new Contato();
                    contato.setNome(nome);
                    contato.setTelefone(telefone);
                    
                    System.out.println("Contato a ser criado :");
                    System.out.println(contato);
                    agenda.Addcontato(contato);
                    } catch (AgendaCheiaException ex){
                        System.out.println(ex.getMessage());   
                        System.out.println("Contatos da agenda");
                        System.out.println(agenda);
                    }
        }
            public static void consultarContato(Scanner s,Agenda agenda){
            String nomeContato = leInformacaoString (s,"Entre com o nome do contato para pesquisar :");
            try {
                if (agenda.consultaContatoPorNome(nomeContato)>=0){
                    System.out.println("Contato existe.");
                }
            } catch (ContatoNaoExisteException ex) {
                System.out.println(ex.getMessage());
            }
        }
            public static String leInformacaoString (Scanner s,String msg){
                System.out.println(msg);
                String entrada = s.nextLine();
                return entrada;
            }
            public static int obterOpcaoMenu(Scanner s){
                boolean entradaValida=false;
                int opcao =3;
                while (!entradaValida){
                
                System.out.println("Digite a opção desejada:");
                System.out.println("Escolha 1 para Consultar um contato");
                System.out.println("2 Add contato à agenda:");
                System.out.println("3 sair.");
                try {
                    String entrada =s.nextLine();
                    opcao = Integer.parseInt(entrada);
                    
                    if (opcao==1 || opcao == 2 || opcao ==3){
                    entradaValida=true;
         
                    }else {
                     throw new Exception ("Entrada inválida");
        
                    }
                }
                catch (Exception e){
                    System.out.println("Entrada inválida,digite novamente\n");
                }
                }
                return opcao;
            }
                
        }
        

