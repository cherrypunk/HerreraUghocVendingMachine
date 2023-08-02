import javax.swing.*;

public class MainMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vending Machine Factory");
        //setSize(500);
        frame.setContentPane(new MainMenu().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private JPanel rootPanel;
    private JButton button1;


    private void createUIComponents() {

    }
}
