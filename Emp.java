
import java.util.Scanner;

public class Emp{
    private int eid;
    private String name;
    private int deptId;
    protected double basicSalary;

    public Emp (int eid,String name,int deptId,double basicSalary) {
        this.eid=eid;
        this.name=name;
        this.deptId=deptId;
        this.basicSalary=basicSalary;
    }


    @Override
    public String toString() {
        return eid+"  "+name+"  "+deptId+"  "+basicSalary;
    }

    public double netSalary() {
        return 0;
    }

}
