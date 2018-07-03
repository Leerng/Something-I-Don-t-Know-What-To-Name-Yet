import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class TitleLabel extends JPanel {
    public TitleLabel(String title) {
        Font font = new Font(Font.SERIF, Font.BOLD, 32);
        setFont(font);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setOpaque(true);
        setHorizontalAlignment(JLabel.CENTER);
        setText(title);
    }
}
