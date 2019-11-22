package homeWork.SixWork06_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class EmployeeManagementSystem {

    final static int maxSize=100;
    private int count=0;
    Employee[] arr=new Employee[maxSize];

    public static int getMaxSize() {
        return maxSize;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void startStaff(){

        for (int i = 0; i < maxSize; i++) {
            arr[i]=new Employee();
        }
    }
    public int readStaff(){
        try {
            FileReader fReader = new FileReader("F:\\大二上\\TheSeconedNote\\java\\workspace\\class0905\\src\\homeWork\\SixWork06_1\\dates.txt");
            BufferedReader bufferedReader = new BufferedReader(fReader);
            System.out.println(bufferedReader);

            String cnt;
            while ((cnt = bufferedReader.readLine()) != null){
                String[] dates=cnt.split(" ");

                arr[count].setNo(Integer.parseInt(dates[0]));
                arr[count].setName(dates[1]);
                arr[count].setHeight(Float.parseFloat(dates[2]));
                arr[count].setWeight(Float.parseFloat(dates[3]));
                this.count++;
            }

            bufferedReader.close();
            fReader.close();
        } catch (IOException e) {
        e.printStackTrace();
    }
        return count;
}

    public  void PrintStaff(){
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            if(arr[i]!=null){
                System.out.println(arr[i].toString());
            }
        }
    }
    public  void replaceWeight(int tNo,float tweight){
        for (int i = 0; i < count; i++) {
            if(arr[i].getNo()==tNo){
                arr[i].setWeight(tweight);
                System.out.println(arr[i].toString());
                break;
            }
        }
    }
    public void addStaff(int no,String name,float height,float weight){
        if(count==100){
            System.out.println("此系统所容纳的员工信息已满，无法在添加员工信息。");
        }else{
            arr[count].setNo(no);
            arr[count].setName(name);
            arr[count].setHeight(height);
            arr[count].setWeight(weight);
            count++;
            System.out.println("添加员工成功");
        }
    }
    public  void reload(){
        try {
            FileReader fReader = new FileReader("F:\\大二上\\TheSeconedNote\\java\\workspace\\class0905\\src\\homeWork\\SixWork06_1\\dates.txt");
            BufferedReader bufferedReader = new BufferedReader(fReader);
            Writer writer = new FileWriter(new File("F:\\大二上\\TheSeconedNote\\java\\workspace\\class0905\\src\\homeWork\\SixWork06_1\\dates.txt"));
            for (int i = 0; i <count; i++) {
                writer.write(arr[i].getNo()+" "+arr[i].getName()+" "+arr[i].getHeight()+" "+arr[i].getWeight()+"\r\n");
                bufferedReader.readLine();
            }
            bufferedReader.close();
            fReader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void searchStaff(String name){
        int flag=0;
        for (int i = 0; i <count ; i++) {
            if(arr[i].getName().equals(name)){
                System.out.println(arr[i].toString());
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("没有找到该员工");
        }
    }
    public void deleteStaff(int no){
        int flag=0;
        int i;
        for (i = 0; i <count ; i++) {
            if(arr[i].getNo()==no){
                flag=1;
                break;
            }
        }
        for (int j = i; j < count -1; j++) {
            arr[j]=arr[j+1];
        }
        if(flag==1){
            count-=1;
            System.out.println("删除成功");
        }else{
            System.out.println("没有找到该员工");
        }
    }
}
