package lab8;

import java.awt.Graphics;
import javax.swing.JPanel;

public class TicPanel extends JPanel
{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Box box : GameData.getBoxes())
        {
            box.draw(g);
        }
    }
}
