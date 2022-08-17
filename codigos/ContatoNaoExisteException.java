package codigos;

public class ContatoNaoExisteException extends Exception {
    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "O contato " + nomeContato + " nao existe na agenda!";
    }
    
    
}
