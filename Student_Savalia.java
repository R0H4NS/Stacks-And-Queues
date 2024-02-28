package Challenge1_Savalia;

class Student_Savalia {
    private final int id;
    private final String firstName;
    private final String lastName;

    public Student_Savalia(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student_Savalia student = (Student_Savalia) obj;
        return id == student.id;
    }
}