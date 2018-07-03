import javax.swing.UIManager;

public class Something extends JPanel {

    public Something() {
        initGUI();
        setTitle();
        setResizable(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    public static void main(String[] args) {
        try{
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        }
        catch (Exception e) {}
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Something();
            }
        });
    }
}
            
            
