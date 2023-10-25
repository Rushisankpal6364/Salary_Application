import java.util.Scanner;

public class Worker extends Emp{


    private int hoursWorked;
    private double hourlyRate;

    public Worker(int id,String name,int deptId,double basicSalary,int hoursWorked,double hourlyRate) {
        super(id,name,deptId,basicSalary);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString()+" "+hoursWorked+" "+hourlyRate;
    }

    @Override
    public double netSalary(){
        return basicSalary+(hoursWorked*hourlyRate);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

}


