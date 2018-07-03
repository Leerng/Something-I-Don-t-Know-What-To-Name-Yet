public class Panel extends JPanel {
    private int width;
    private int height
    
    public Panel() {
    
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.draw______(0, height);
    }
    
    pubic Dimension getPreferredSize() {
        Dimension size = new Dimension(width, height);
        return size;
    }
