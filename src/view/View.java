package view;

import model.IFA;
import model.Type;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        System.out.println("------ Sistema de Organização IFAS ------");
        System.out.println("by Wender.");
        System.out.println("Opções disponíveis: ");
        System.out.println("1. Adicionar IFA");
        System.out.println("2. Remover IFA");
        System.out.println("3. Visualizar DataBase");
        System.out.println("4. Mudança de informações");
        System.out.println("5. Sair");

    }

    public int lerValorDeEntradaOpcao(){
        return scanner.nextInt();
    }

    public IFA lerDadosIFA(){
        scanner.nextLine();

        System.out.println("Nome do IFA: ");
        String nome = scanner.nextLine();

        System.out.println("Quantidade do IFA: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tipo do produto (SOLID, LIQUID, POWDER): ");
        String tipoStr = scanner.nextLine();

        try{
            Type tipo = Type.valueOf(tipoStr);
            return new IFA(nome, quantidade, tipo);
        } catch (Exception e){
            System.out.println("Tipo do produto INVÁLIDO!");
            return null;
        }
    }


}
