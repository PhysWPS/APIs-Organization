package controller;

import model.IFA;
import view.View;

public class Controller {
    private IFA ifa;
    private View view;


    public Controller(IFA ifa, View view) {
        this.ifa = ifa;
        this.view = view;
    }

// Opções da view.
    public void inicializar(){
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerValorDeEntradaOpcao();
            processarOpcao(opcao);
        }while (opcao != 5);
    }


    public void processarOpcao(int opcao){
        switch (opcao){
            case 1:
                cadastrarIFA();
                break;

            case 5:
                System.out.println("Saindo do sistema...");
                break;
        }
    }


    public void cadastrarIFA(){
        //ler dados console
        IFA ifaDados = view.lerDadosIFA();
        ifa.adicionarIFA(ifaDados);
    }


}
