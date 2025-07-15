import jdk.jfr.Percentage;

public class studentReportCard {
    //Instance Variable
    String studentName;
    int computerScience;
    int english;
    int math;
    int  socialStudy;



// Constructor (initialize the parameterize variables)
    public  studentReportCard (String studentName,int computerScience, int english, int math, int socialStudy){
        this.studentName= studentName;
        this.computerScience = computerScience;
        this.english = english;
        this.math = math;
        this.socialStudy = socialStudy;
        //this.grade =grade;

    }

//Method using class variables  (local variable)
    public void gradeReport() {
        //Arithmetic operator
        int totalMarks = computerScience + english + math + socialStudy;
        int numOfSubjects = 4;
        double totalPercentage = (double) totalMarks / numOfSubjects;

        //pass or failed using Assignment + Relational + Logical Operator logic
        boolean isPassed = (totalPercentage >= 45) && (computerScience >= 40) && (english >= 40) &&
                (math >= 40) && (socialStudy >= 40);

        //grade calculation using if else condition
        char grade;
        if (totalPercentage >= 90) {
            grade = 'A';
        } else if (totalPercentage >= 75) {
            grade = 'B';
        } else if (totalPercentage >= 60) {
            grade = 'C';
        } else if (totalPercentage >= 45) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("==== Student Report Card ====");
        System.out.println("Student Name: " + studentName + "\nSubjects : Computer Science: "
                + computerScience + ", English: " + english + ", Math: " + math + ", Social Study: "
                + socialStudy + " \nStudent Total Mark: " + totalMarks + "\nPercentage: " + totalPercentage + "%" + "\nGrade: " + grade);

        //ternary conditional
        System.out.println("Result: " + (isPassed ? "Passed" : "Failed"));
        System.out.println();



    }

}
