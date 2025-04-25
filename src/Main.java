import controller.Controller;
import model.IFA;
import view.View;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        View view = new View();
        IFA ifa = new IFA();

        Controller controller = new Controller(ifa, view);
        controller.inicializar();





    }
}