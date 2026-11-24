public class AssessmentResults extends Monitor {
    private final String studentName();
    private final int CID();
    private final boolean isMsc();
    private float programmingTestMark();
    private float projectMark();
    private float vivaMark();
    private boolean completedProject();

    public AssessmentResults(String studentName, int CID, boolean isMsc, float programmingTestMark, float projectMark, float vivaMark) {
        this.studentName = studentName;
        this.CID = CID;
        this.isMsc = isMsc;
        this.programmingTestMark = programmingTestMark;
        this.projectMark = projectMark;
        this.vivaMark = vivaMark;
        this.completedProject = completedProject;
    }

    @Override
    protected void calculateStudentResult() {
        protected static final float finalMark();
        if (boolean isMsc = true){
            finalMark = ((programmingTestMark * 0.25) + projectMark * 0.45) + (vivaMark * 0.3 ));
        else{
             finalMark = ((programmingTestMark * 0.3) + (projectMark * 0.7))
            }
        return finalMark
        }

        if (boolean completedProject = true){
            return finalMark;
        }
        else if (boolean completedProject = true && finalMark>40){
            return (40);
        }
        else{
            return finalMark;
        }
