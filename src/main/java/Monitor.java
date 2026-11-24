import javax.swing.*;
import java.awt.*;

public abstract class Monitor {
    private final JLabel label = new JLabel();
    private final JPanel panel = new JPanel();

    public Monitor() {
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.add(label);
    }
    protected abstract String getScore();
    protected abstract control();

    public void update() {                     // same steps for every monitor
        control();
        label.setText("<html>" + getReadingText().replace("\n", "<br>") + "</html>");
        panel.setBackground(isInRange() ? Color.WHITE : Color.RED);



}
