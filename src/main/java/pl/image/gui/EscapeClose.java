package pl.image.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * Created by Krzysztof on 12.01.2017.
 */
public class EscapeClose {

    public static void doIt(final JFrame frame) {
        KeyStroke escapeKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false);
        Action escapeAction = new AbstractAction() {
            // close the frame when the user presses escape
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        };
        frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(escapeKeyStroke, "ESCAPE");
        frame.getRootPane().getActionMap().put("ESCAPE", escapeAction);
    }
}