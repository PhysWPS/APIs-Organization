import controller.IFAcontroller;
import model.IFA;
import model.Type;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IFAcontroller controller = new IFAcontroller();

        System.out.println("Digite nome: ");

        String name = scanner.nextLine();
        System.out.println("Quantidade:");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tipo:");
        String input = scanner.nextLine().toUpperCase();

        try {
            Type type = Type.valueOf(input);
            IFA ifa = new IFA(name, quantity, type);
            controller.cadastroIFA(ifa);
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }





    }
}