//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        studentReportCard student1 = new studentReportCard("Max Noel", 45, 64, 50, 40);
        student1.gradeReport();
        studentReportCard student2 = new studentReportCard("Monica Singh", 80, 60, 75, 45);
        student2.gradeReport();
        studentReportCard student3 = new studentReportCard("Lucky Kumar",90,87,90,99);
        student3.gradeReport();
        studentReportCard student4 = new studentReportCard("Ashish Rao", 35,34,33,20);
        student4.gradeReport();
    }
}