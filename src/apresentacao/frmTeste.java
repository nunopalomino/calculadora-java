package apresentacao;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class frmTeste extends JFrame
{
    private JPanel canvas;
    
    public frmTeste()
    {
        super();
        setSize(400, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        canvas = new Canvas();
        this.add(canvas);
        
        
        
        
    }
}

class Canvas extends JPanel
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawLine(10, 10, 100, 100);
        
    }
}
