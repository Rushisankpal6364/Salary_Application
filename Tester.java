
import java.util.*;

public class Tester {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Emp[] arr=new Emp[5];

//        for(int i=0;i<arr.length;i++){
//            System.out.println("Enter id | Enter name | Enter Deptid | Enter Salary from Emp "+(i+1));
//            int id=sc.nextInt();
//            String name=sc.next();
//            int deptid= sc.nextInt();
//            double salary=sc.nextDouble();
//            arr[i]=new Emp(id,name,deptid,salary);
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        int n,index=0;

        do{
           System.out.println("1.Hire Manager | 2.Hire Worker | 3.Display All | 4.Exit");
          System.out.println("Enter the Choice : ");
           n=sc.nextInt();

            switch(n) {
                
                case 1: if(index<arr.length) {
                    System.out.println("Enter empid,name,deptid,basic salary");
                    Mgr mg=new Mgr(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble());
                    arr[index]=mg;
                    index++;
                }
                else {
                    System.out.println("Array is Full");
                }
                    break;


                case 2: if(index<arr.length) {
                    System.out.println("Enter empid,name,deptid,basic salary,hoursWorked,hourlyRate");
                    Worker w=new Worker(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextDouble());
                    arr[index]=w;
                    index++;
                }
                else {
                    System.out.println("Array is Full");
                }
                    break;

                case 3: for(int i=0;i<arr.length;i++) {
                    if(arr[i]!=null) {
                        System.out.println(arr[i]);
                        System.out.println("Net Salary : " + arr[i].netSalary());
                    }
                }
                    break;

               case 4:
                   break;

            }

        }while(n!=4);
        sc.close();

    }
}
