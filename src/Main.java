//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RegistroIP ip1 = new RegistroIP("192.168.1.10", "08:30", true);
        RegistroIP ip2 = new RegistroIP("10.0.0.99", "23:15", false);

        ip1.mostrarEstado();
        ip2.mostrarEstado();
    }
}