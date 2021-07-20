package studentdatabaseapp;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // Ask how many new users we want to add
        Student stu = new Student();
        stu.enroll();
        stu.payTuition(400);
        // Create n number of new students
    }

}
