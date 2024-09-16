public class schoolGrade {
    public static void main(String[] args) {
        double gradeA = 6.8;

        showStudentSituation(gradeA);

        double gradeB = 8.98;

        showStudentSituation(gradeB);

    }

    public static void showStudentSituation(double grade) {
        if (grade >= 7) {
            System.out.println("Approved");
        } else {
            System.out.println("Reproved");
        }
    }
}
