import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            studentAdder adder = new studentAdder();
            adder.addStudent(new AssessmentResults("John Smith", 02624129, false, 60.4, 72.8, 0.0 ));
            adder.addStudent(new AssessmentResults("Ken Miles", 04937529, false, 68.2, 77.4, 0.0));
            adder.addStudent(new AssessmentResults("Alan Jones", 02457255, true, 58.2, 66.7, 81.2));
            adder.addStudent(new AssessmentResults("Japhet Tanganga", 03628926, true, 55.6, 88.0, 71.2);


            JFrame frame = new JFrame("Student Results");
            JPanel grid = new JPanel(new GridLayout(5, 7));
            for (Monitor m : controller.getMonitors()) grid.add(m.getPanel());
            frame.add(grid);
            frame.setSize(900, 350);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });
    }
}