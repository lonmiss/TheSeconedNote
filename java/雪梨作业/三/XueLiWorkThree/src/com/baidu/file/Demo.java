package com.baidu.file;



import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.io.Writer;



public class Demo {



   public static void main(String[] args) {

      try {

         FileReader fileReader = new FileReader("F:\\大二上\\TheSeconedNote\\java\\雪梨作业\\五\\original.txt");
         //获得Txt文件的输入流，读取Txt文件，将文件信息保存到fileReader中

         BufferedReader bufferedReader = new BufferedReader(fileReader);
         //从字符输入流中读取文本，缓冲字符，以便有效地读取字符、数组和行，将缓冲字符保存到buttereReader中

         Writer writer = new FileWriter(new File("F:\\大二上\\TheSeconedNote\\java\\雪梨作业\\五\\modified.txt"));
         //用于写入字符流的抽象类，将文件写入writer中，写入指定的路径中，此路径没有此文件，则会创建此文件

         String str;
         //定义一个String类型，用于保存字符

         while ((str = bufferedReader.readLine()) != null) {

            writer.write(str +"		2018011702"+" 李建民"+"\r\n");
            //写入数据是，通过字符连接+，在数据后面插入"		2018011702"，插入数据后面

         }
         //通过循环以次读取bufferedReader的每一行数据，通过str来记录读取的数据，通过write方法，写入writer中

         bufferedReader.close();
         //关闭bufferedReader（modified.txt）

         fileReader.close();
         //关闭fileReader（输入流）

         writer.close();
         //关闭fileReader（original.txt）

      } catch (IOException e) {

         e.printStackTrace();
         //将此可抛程序及其回溯打印到标准错误流。

      }

   }

}