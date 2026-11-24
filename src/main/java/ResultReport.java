import java.util.ArrayList;
import javax.swing.*;

public class ResultReport{
    private final ArrayList<Monitor> logs = new ArrayList<>();
    private final String studentName();
    private final int CID();
    private final boolean isMsc();
    private float programmingTestMark();
    private float projectMark();
    private float vivaMark();
    private boolean completedProject();
    private boolean usesAI();

    public ResultReport(String studentName, int CID, boolean isMsc, float programmingTestMark, float projectMark, float vivaMark) {
        this.studentName = studentName;
        this.CID = CID;
        this.isMsc = isMsc;
        this.programmingTestMark = programmingTestMark;
        this.projectMark = projectMark;
        this.vivaMark = vivaMark;

        public static void addResult(Result r) {
            results.add(r);
        }
        public ArrayList<Result> getResult() { return results; }

        public void printLog(); {
            System.out.println("Student results =" + results);
        }

    }

}
