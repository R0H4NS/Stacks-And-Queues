package Challenge1_Savalia;

public class BathroomChallenge_Savalia {
    public static void main(String[] args) {

        Bathroom_Savalia bathroom1 = new Bathroom_Savalia(3);
        Bathroom_Savalia bathroom2 = new Bathroom_Savalia(2);

        Student_Savalia James = new Student_Savalia(1, "James", "Washington");
        Student_Savalia David = new Student_Savalia(2, "David", "Monte");
        Student_Savalia JohnDoe = new Student_Savalia(9, "John", "Doe");
        Student_Savalia JohnSmith = new Student_Savalia(8, "John", "Smith");
        Student_Savalia Chuck = new Student_Savalia(7, "Chuck", "Gary");
        Student_Savalia Charlie = new Student_Savalia(3, "Charlie", "Jackson");
        Student_Savalia Johnny = new Student_Savalia(4, "Johnny", "Johnson");
        Student_Savalia Davis = new Student_Savalia(5, "Davis", "Davidson");
        Student_Savalia Rachel = new Student_Savalia(6, "Rachel", "Bobson");
        Student_Savalia Jane = new Student_Savalia(10, "Jane", "Doe");
        Student_Savalia Michele = new Student_Savalia(12, "Michele", "Mickey");
        Student_Savalia Janette = new Student_Savalia(11, "Janette", "Reed");

        bathroom1.addStudentToLine(James);
        bathroom1.addStudentToLine(David);
        bathroom1.addStudentToLine(JohnDoe);
        bathroom1.addStudentToLine(JohnSmith);
        bathroom1.addStudentToLine(Chuck);

        bathroom2.addStudentToLine(Janette);
        bathroom2.addStudentToLine(Jane);
        bathroom2.addStudentToLine(Rachel);
        bathroom2.addStudentToLine(Michele);
        bathroom2.addStudentToLine(Chuck);

        bathroom1.studentsInBathroom.size();
        bathroom2.studentsInBathroom.size();


        System.out.println("Bathroom 1: " + bathroom1.getStudents());
        System.out.println("Bathroom 2: " + bathroom2.getStudents());
        System.out.println("James: " + bathroom1.searchStudent(1));
        System.out.println("Chuck: " + bathroom1.searchStudent(7));
        System.out.println("James: " + bathroom2.searchStudent(1));
        System.out.println("Davis: " + bathroom1.searchStudent(5));



        bathroom1.leaveBathroom(James);
        bathroom2.leaveBathroom(Jane);

        bathroom1.Test();
        bathroom2.Test();

        bathroom1.clearData();

        bathroom1.Test();

        bathroom1.setMaxAllowedInBathroom(15);
    }
}