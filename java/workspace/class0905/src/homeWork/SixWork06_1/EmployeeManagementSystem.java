package homeWork.SixWork06_1;

public class EmployeeManagementSystem {
    private int SizePeople=100;
    private int NumPeople;
    Employee[] Peoples=new Employee[SizePeople];




    public void addPeople(int no,String name,float height,float weight){
        Peoples[NumPeople].setNo(no);
        Peoples[NumPeople].setName(name);
        Peoples[NumPeople].setHeight(height);
        Peoples[NumPeople].setWeight(weight);
        NumPeople++;
    }

}
