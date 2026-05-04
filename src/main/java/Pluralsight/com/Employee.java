package Pluralsight.com;

public class Employee {
    private double employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    //public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
  //      this.employeeId = employeeId;
   //     this.name = name;
    //    this.department = department;
    //    this.payRate = payRate;
    //    this.hoursWorked = hoursWorked;
    //}


    public double getTotalPay(){return hoursWorked * payRate;}
    public int getRegularHours;
    public int getOvertimeHours;


}
