public class studentss {
    // step1: Declare student attributes (fields)
    int Rollno;
    String name;
    double marks;

    // step2: create a method to display student details
    void displayDetails() {
        System.out.println("RollNo:" + Rollno);
        System.out.println("Name:" + name);
        System.out.println("Marks:" + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("For studentss.java");
        // step3: create object of student class
        studentss s1 = new studentss();
        // step4: assign values to object properties
        s1.Rollno = 101;
        s1.name = "Abhishek Maurya";
        s1.marks = 89.5;

        studentss s2 = new studentss();
        s2.Rollno = 102;
        s2.name = "Aman";
        s2.marks = 87;

        // step5:call display method
        s1.displayDetails();
        s2.displayDetails();
    }
}