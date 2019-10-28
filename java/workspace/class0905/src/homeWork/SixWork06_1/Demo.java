package homeWork.SixWork06_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo {

    public static void main(String[] args) {
        try {
            FileReader fReader = new FileReader("F:\\original.txt");
            BufferedReader bufferedReader = new BufferedReader(fReader);
            Writer writer = new FileWriter(new File("F:\\modify.txt"));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                writer.write(str + "\r\n");
            }
            bufferedReader.close();
            fReader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

