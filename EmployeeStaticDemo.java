public class EmployeeStaticDemo {
    // step1: instance variable (diffrent for each employee
    int empId;
    String empName;
    // step2:static variable(same for all employee)
    static String companyName = "Tech solution Pvt Ltd";

    // step3:constructor
    EmployeeStaticDemo(int Id, String Name) {
        empId = Id;
        empName = Name;
    }

    // step4: display method
    void display() {
        System.out.println("Employee ID" + empId);
        System.out.println("Employee Name:" + empName);
        System.out.println("Company Name:" + companyName);
        System.out.println("_______________");
    }

    public static void main(String[] args) {
        System.out.println("For EmployeeStaticDemo.java");
        // step5: create multiple employee objects
        EmployeeStaticDemo e1 = new EmployeeStaticDemo(101, "Abhishek Maurya");
        EmployeeStaticDemo e2 = new EmployeeStaticDemo(102, "Aman");
        // step6:display both employee
        e1.display();
        e2.display();

    }

}
