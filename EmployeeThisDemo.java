public class EmployeeThisDemo {
    // step1: instance variable
    int empId;
    String empName;

    // step2: contructor with same variable names as instance variables
    EmployeeThisDemo(int empId, String empName) {

        // step3:use'this' to refer to current object variables
        this.empId = empId;
        this.empName = empName;

    }

    // step4: display method
    void display() {
        System.out.println("Employee ID:" + empId);
        System.out.println("Employee Name:" + empName);
    }

    public static void main(String[] args) {
        System.out.println("For EmployeeThisDemo.java");
        // step5:create object
        EmployeeThisDemo e1 = new EmployeeThisDemo(301, "Abhishek Maurya");

        // step6:display values
        e1.display();

    }

}