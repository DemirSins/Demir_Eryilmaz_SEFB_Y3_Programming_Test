import javax.swing.*;
import java.awt.*;

public abstract class Monitor {
    private final JLabel label = new JLabel();
    private final JPanel panel = new JPanel();

    public Monitor() {
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.add(label);
    }
    ;

    public void log() {
        label.setText("<html>" + getReadingText().replace("\n", "<br>") + "</html>");
        panel.setBackground(usesAi() ? Color.WHITE : Color.RED);



}
