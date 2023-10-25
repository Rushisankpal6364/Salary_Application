public class Mgr extends Emp {

    private static double bonus;

    public Mgr(int empid,String name,int deptId,double basicSalary) {
        super(empid,name,deptId,basicSalary);

    }

    @Override
    public String toString() {
        return super.toString()+"  "+bonus;
    }

    @Override
    public double netSalary() {
        return basicSalary+bonus;
    }

    public double getBonus(){
        return bonus;
    }

    static {
        bonus=2000;
    }

}
