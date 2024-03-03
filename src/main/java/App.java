import gui.Main_Panel;

public class App {
    public static void main(String[] args) {
        Main_Panel gui = new Main_Panel();
        gui.startGUI();
        Calculator calculator = new Calculator();
        calculator.startCalculation();

    }
}
