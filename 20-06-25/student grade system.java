class Student {
    String name;
    int[] marks = new int[3];

    void display() {
        int total = 0;
        for (int mark : marks) total += mark;
        double avg = total / 3.0;
        System.out.println(name + " Average: " + avg);
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        students[0] = new Student();
        students[0].name = "Ram";
        students[0].marks = new int[]{80, 90, 70};

        students[1] = new Student();
        students[1].name = "Sam";
        students[1].marks = new int[]{85, 60, 75};

        for (Student s : students)
            s.display();
    }
}
