package com.mycompany.teste1;

import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Contato[] contatos = new Contato[3];
        Agenda a = new Agenda();

        System.out.println("Digite o nome da Agenda:");
        a.setNome(s.nextLine());
       
        for (int i = 0; i < contatos.length; i++) {
            Contato contato = new Contato();
            System.out.println("Digite o nome do "+i+" contato da agenda " + a.getNome());
            contato.setNome(s.nextLine());
            System.out.println("Digite o email:");
            contato.setEmail(s.nextLine());
            System.out.println("Digite o telefone:");
            contato.setTelefone(s.nextLine());
            contatos[i]=contato;
        }
        a.setContatos(contatos);
        a.info();

    }
}
