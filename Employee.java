public class Employee {
    // step1:Declare employee attributes(fildes)
    int empId;
    String empName;
    double salary;

    // step2:create c onstructor t o initialize object values
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // step3:method to display employee details
    void displayEmployee() {
        System.out.println("Employee ID:" + empId);
        System.out.println("Employee name:" + empName);
        System.out.println("salary:" + salary);
    }

    public static void main(String[] args) {
        System.out.println("For Employee.java");
        // step4:create a object and pass values directly
        Employee e1 = new Employee(201, "Abhishek Maurya", 45000);
        // step5:display employee details
        e1.displayEmployee();
    }

}
