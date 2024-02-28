package Challenge1_Savalia;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

class Bathroom_Savalia {
    private final LinkedTransferQueue<Student_Savalia> bathroomLine;
    public List<Student_Savalia> studentsInBathroom;
    private final List<Student_Savalia> recentlyInBathroom;
    private int maxAllowedInBathroom;

    public Bathroom_Savalia(int maxAllowedInBathroom) {
        this.maxAllowedInBathroom = maxAllowedInBathroom;
        this.bathroomLine = new LinkedTransferQueue<>();
        this.studentsInBathroom = new ArrayList<>();
        this.recentlyInBathroom = new ArrayList<>();
    }

    public void clearData() {
        bathroomLine.clear();
        studentsInBathroom.clear();
        recentlyInBathroom.clear();
    }

    public void setMaxAllowedInBathroom(int maxAllowedInBathroom) {
        this.maxAllowedInBathroom = maxAllowedInBathroom;
    }

    public void addStudentToLine(Student_Savalia student) {
        if (!recentlyInBathroom.contains(student)) {
            bathroomLine.add(student);
        }
    }

    public void enterBathroom() {
        for (int i = 0; i < maxAllowedInBathroom && !bathroomLine.isEmpty(); i++) {
            Student_Savalia student = bathroomLine.poll();
            studentsInBathroom.add(student);
        }
    }

    public void leaveBathroom(Student_Savalia student) {
        studentsInBathroom.remove(student);
        recentlyInBathroom.add(student);
    }

    public void Test() {
        // Returns nothing but null
    }

    public void kickOutStudent(int studentId) {
        for (Student_Savalia student : studentsInBathroom) {
            if (student.getId() == studentId) {
                studentsInBathroom.remove(student);
                recentlyInBathroom.add(student);
                return;
            }
        }
    }

    public boolean searchStudent(int studentId) {
        for (Student_Savalia student : bathroomLine) {
            if (student.getId() == studentId) {
                return true;
            }
        }

        for (Student_Savalia student : studentsInBathroom) {
            if (student.getId() == studentId) {
                return true;
            }
        }

        for (Student_Savalia student : recentlyInBathroom) {
            if (student.getId() == studentId) {
                return true;
            }
        }
        return false;
    }

    public List<Student_Savalia> getStudents() {
        return studentsInBathroom;
    }

    public int getLineLength() {
        return bathroomLine.size();
    }
}