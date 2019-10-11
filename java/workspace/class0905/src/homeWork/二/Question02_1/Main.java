package homeWork.二.Question02_1;

public class Main {
    static void searchEmployee(Employee[] employees, String name)
    {
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i].getName().equals(name))
            {
                System.out.println("名字是"+name+"的人是:");
                System.out.println(employees[i].getName());
            }
        }
    }
    static void searchContainNameEmployee(Employee[] employees, String containName)
    {
        System.out.println("名字包含"+containName+"的人是：");
        for(int i = 0; i <employees.length ; i++) {
            if(employees[i].getName().contains(containName))
            {
                System.out.println(employees[i].getName());
            }
        }
    }
    static void searchStartNameEmployee(Employee[] employees, String startName)
    {
        System.out.println("名字以"+startName+"开头的人是：");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().startsWith(startName))
            {
                System.out.println(employees[i].getName());
            }
        }
    }
    static void searchEndNameEmployee(Employee[] employees, String endName)
    {
        System.out.println("名字以"+endName+"结尾的人是：");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().endsWith(endName))
            {
                System.out.println(employees[i].getName());
            }
        }
    }
    static void showEmployeeBMI(Employee[] employees)
    {
        for (int i = 0; i <employees.length ; i++) {
            System.out.print(employees[i].getName()+"：");
            double cnt=employees[i].getBMI();
            //System.out.println(cnt);
            if(cnt>40.0)
            {
                System.out.println("重度肥胖");
            }else if(cnt>35.0)
            {
                System.out.println("中度肥胖");
            }else if(cnt>30.0)
            {
                System.out.println("轻度肥胖");
            }else if(cnt>25.0)
            {
                System.out.println("超重");
            }else if(cnt>18.0)
            {
                System.out.println("正常体重");
            }
        }
    }

    public static void main(String[] args)
    {
       Employee[] arr=new Employee[5];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=new Employee();
        }
        arr[0].scan(01,"张三",1.0,20.0);
        arr[1].scan(02,"李四",1.0,27.0);
        arr[2].scan(03,"王五",1.0,31.0);
        arr[3].scan(04,"赵六",1.0,38.0);
        arr[4].scan(05,"张三丰",1.0,50.0);
        searchEmployee(arr,"张三");
        searchContainNameEmployee(arr,"三");
        searchStartNameEmployee(arr,"张");
        searchEndNameEmployee(arr,"六");
        showEmployeeBMI(arr);
    }
}
