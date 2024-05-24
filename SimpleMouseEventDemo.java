import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMouseEventDemo extends JPanel implements MouseListener, MouseMotionListener {

    private JLabel statusLabel;

    public SimpleMouseEventDemo() {
        super();
        setLayout(new FlowLayout());

        statusLabel = new JLabel("Waiting for mouse events...");
        add(statusLabel);

        // Register listener for mouse events
        addMouseListener(this);
        addMouseMotionListener(this);

        setPreferredSize(new Dimension(300, 200));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        updateStatusLabel("Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        updateStatusLabel("Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        updateStatusLabel("Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        updateStatusLabel("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        updateStatusLabel("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        updateStatusLabel("Dragging at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        updateStatusLabel("Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    private void updateStatusLabel(String message) {
        statusLabel.setText(message);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Demo");
        frame.add(new SimpleMouseEventDemo());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
