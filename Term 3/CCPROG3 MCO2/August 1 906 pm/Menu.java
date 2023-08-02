import javax.swing.*;

public class Menu {
    private JPanel rootPanel;
    private JLabel mainLabel;
    private JButton createLabel;
    private JButton testVendingMachineButton;
    private JButton exitButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(new Menu().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
