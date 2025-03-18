/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import util.Console;

import java.util.List;

/**
 * @author mcn
 */
public class GrupoAutomovelUI implements Runnable {

    private final GrupoAutomovelController controller = new GrupoAutomovelController();

    public void registarGA() {
        System.out.println("*** Registo Grupo Automóvel ***\n");
        String nome = Console.readLine("Nome:");
        int portas = Console.readInteger("Número de portas");
        String classe = Console.readLine("Classe:");
        GrupoAutomovel grupoAutomovel = controller.
                registarGrupoAutomóvel(nome, portas, classe);
        System.out.println("Grupo Automóvel" + grupoAutomovel);
    }

    public void listarGAs() {
        System.out.println("Grupos de Automoveis");
        List<GrupoAutomovel> lista = controller.listarGruposAutomoveis();
        System.out.println(lista);
    }

    public void procurarGAPorID(long id) {
        throw new UnsupportedOperationException("Ainda não implementada.");
    }

    @Override
    public void run() {
        System.out.println("Escolha a opçao que deseja:");
        System.out.println("1. Registar Grupo");
        System.out.println("2. Listar Grupos");
        System.out.println("3. Procurar Grupo");
        int numero = Console.readInteger("Escolha um numero: ");
        switch (numero) {
            case 1:
                registarGA();
                System.out.println("Grupo de automovel criado com sucesso!");
                break;
            case 2:
                listarGAs();
                break;
            case 3:
                int id = Console.readInteger("Escolha um id: ");
                procurarGAPorID(id);
        }

    }
}
