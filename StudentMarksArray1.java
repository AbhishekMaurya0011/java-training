//for storing 5 array marks
// declear a class 
public class StudentMarksArray1 {
    public static void main(String[] args) {
        System.out.println("For StudentMarksArray1.java");
        // declear marks in the array
        int[] marks = { 45, 65, 86, 97, 78 };
        // using the loop for display the marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student" + (i + 1) + "Marks=" + marks[i]);

        }

    }
}
