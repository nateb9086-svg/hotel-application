package Pluralsight.com;
import java.time.LocalTime;
public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked;
    private int startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return (this.payRate * this.getRegularHours()) + (this.getOvertimeHours() * (this.payRate * 1.5));
    }

    public double getRegularHours() {
        if (this.hoursWorked > 40) {
            return 40;
        }
        return this.hoursWorked;
    }

    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }
    public void punchIn(int time) {
        this.startTime = time;
    }

    public void punchIn() {
        LocalTime now = LocalTime.now();
        this.startTime = now.getHour() + now.getMinute();
    }

    public void punchOut(int time) {
        this.hoursWorked += time-startTime;
    }


    public void punchOut() {
        LocalTime now = LocalTime.now();
        int currentTime = now.getHour() + now.getMinute();
        this.hoursWorked += currentTime - this.startTime;
    }

    public void punchTimeCard(int time) {
        if (this.startTime != -1) {
            this.startTime = time;
        } else {
            this.hoursWorked += time - startTime;
            this.startTime = -1;
        }
    }
}
