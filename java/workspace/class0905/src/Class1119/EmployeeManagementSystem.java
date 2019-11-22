package Class1119;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class EmployeeManagementSystem {
    final static int max=100;
    private static int cnt=0;
    Employee[] arr=new Employee[max];
    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        cnt = cnt;
    }

    public int getMax() {
        return max;
    }
    public void readfile(){
        for (int i = 0; i < max; i++) {
            arr[i]=new Employee();
        }
        try {
            FileReader fReader = new FileReader("F:\\employees.txt");
            BufferedReader bufferedReader = new BufferedReader(fReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] str1=str.split(" ");
                arr[cnt].setNo(Integer.parseInt(str1[0]));
                arr[cnt].setName(str1[1]);
                arr[cnt].setHeight(Float.parseFloat(str1[2]));
                arr[cnt].setWeight(Float.parseFloat(str1[3]));
                cnt++;
            }
            bufferedReader.close();
            fReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addpeo(){
        Scanner in =new Scanner(System.in);
        int id=in.nextInt();
        String name=in.next();
        float height=in.nextFloat();
        float weight=in.nextFloat();

        arr[cnt].setNo(id);
        arr[cnt].setName(name);
        arr[cnt].setHeight(height);
        arr[cnt].setWeight(weight);
        cnt++;
        writepeo();
    }
    public void xiugai() {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        for (int i = 0; i < cnt; i++) {
            if (arr[i].getNo() == id) {
                float n = in.nextFloat();
                arr[i].setWeight(n);
                writepeo();
                break;
            }
        }
    }
    public void findpeo() {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        for (int i = 0; i < cnt; i++) {
            if (arr[i].getName().equals(name)) {
                arr[i].toString1();
                break;
            }
        }
    }
    public void delepeo() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        for (i = 0; i < cnt; i++) {
            if (arr[i].getNo() == n) {
                arr[i]=null;
                writepeo();
                break;
            }
        }
        for (int j = i; j < cnt-1; j++) {
            arr[j]=arr[j+1];
        }
        cnt--;
        writepeo();
    }
    public void printALL(){
        for (int i = 0; i <cnt ; i++) {
            arr[i].toString1();
        }

    }
    private void writepeo(){
        try {
            Writer writer = new FileWriter(new File("F:\\employees.txt"));
            String str;
            for (int i = 0; i <cnt ; i++) {
                if(arr[i]!=null) {
                    str = arr[i].getNo() + " " + arr[i].getName() + " " + arr[i].getHeight() + " " + arr[i].getWeight();
                    writer.write(str + "\r\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}




