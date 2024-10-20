package lab8;

import java.awt.event.*;

public class GameController implements MouseListener
{
    @Override
    public void mousePressed(MouseEvent e) {
        for (Box box : GameData.getBoxes())
        {
            if (box.contains(e.getX(), e.getY()))
            {
                box.drawTurn(null, GameData.getTurn());
                GameData.switchTurn();
                break;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

}
