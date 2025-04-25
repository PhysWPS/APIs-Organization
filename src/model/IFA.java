package model;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class IFA {
    private String name;
    private int quantity;
    private Type type; // deve conter apenas sólido, líquido, pó


    public IFA() {
    }

    public IFA(String name, int quantity, Type type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

   // adicionar e remover...


    public void adicionarIFA(IFA ifa) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("DataBase.txt", true)))) {

            String linha = ifa.getName() + "||" + ifa.getType() + "||" + ifa.getQuantity();

            writer.write(linha);
            writer.newLine();

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo");
            System.out.println(e);
        }
    }


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Type getType() {
        return type;
    }
}
