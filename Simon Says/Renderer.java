import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Renderer extends JPanel
{
    private Simon simon;

    public Renderer(Simon simon)
    {
        this.simon = simon;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        simon.paint((Graphics2D) g);
    }
}
