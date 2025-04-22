package controller;

import model.IFA;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IFAcontroller {
    private IFA ifa;

    public IFAcontroller() {
    }

    public void cadastroIFA(IFA ifa){
        try{
            //escrita
            OutputStream os = new FileOutputStream("DataBase.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            String linha = ifa.getName().toUpperCase() + "||" + ifa.getQuantity() + "||" + ifa.getType();
            bw.write(linha);
            bw.newLine();

            bw.close();
            osw.close();
            os.close();

            System.out.println("Medicamento " +ifa.getName() + " cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Database não encontrado");
            System.out.println(e);
        }
    }
}
