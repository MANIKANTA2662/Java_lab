import java.awt.*;
import java.awt.event.*;

public class KeyEventsDemo extends Frame implements KeyListener {

    private TextArea textArea;

    public KeyEventsDemo() {
        super("Key Events Demo");
        setLayout(new BorderLayout());

        textArea = new TextArea();
        textArea.setEditable(false); // Prevent user editing
        add(textArea, BorderLayout.CENTER);

        // Register listener for key events
        addKeyListener(this);

        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        String message = "Key Pressed: ";
        int keyCode = e.getKeyCode();

        // Handle special keys (modifiers)
        if (e.isAltDown()) {
            message += "Alt + ";
        } else if (e.isControlDown()) {
            message += "Ctrl + ";
        } else if (e.isShiftDown()) {
            message += "Shift + ";
        }

        // Identify key based on keyCode
        message += KeyEvent.getKeyText(keyCode);
        textArea.append(message + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String message = "Key Released: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n";
        textArea.append(message);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        String message = "Key Typed: '" + e.getKeyChar() + "'\n";
        textArea.append(message);
    }

    public static void main(String[] args) {
        new KeyEventsDemo();
    }
}
