import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends JFrame implements KeyListener {

    private JLabel label;

    public KeyEventDemo() {
        setTitle("Key Event Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label to display key event information
        label = new JLabel("Press a key...");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        // Add key listener to the frame
        addKeyListener(this);

        // Set focusable to true to receive key events
        setFocusable(true);
    }

    // KeyListener methods
    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KeyEventDemo demo = new KeyEventDemo();
            demo.setVisible(true);
        });
    }
}
