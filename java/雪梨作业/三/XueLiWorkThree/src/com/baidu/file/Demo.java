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

         FileReader fileReader = new FileReader("F:\\�����\\TheSeconedNote\\java\\ѩ����ҵ\\��\\original.txt");
         //���Txt�ļ�������������ȡTxt�ļ������ļ���Ϣ���浽fileReader��

         BufferedReader bufferedReader = new BufferedReader(fileReader);
         //���ַ��������ж�ȡ�ı��������ַ����Ա���Ч�ض�ȡ�ַ���������У��������ַ����浽buttereReader��

         Writer writer = new FileWriter(new File("F:\\�����\\TheSeconedNote\\java\\ѩ����ҵ\\��\\modified.txt"));
         //����д���ַ����ĳ����࣬���ļ�д��writer�У�д��ָ����·���У���·��û�д��ļ�����ᴴ�����ļ�

         String str;
         //����һ��String���ͣ����ڱ����ַ�

         while ((str = bufferedReader.readLine()) != null) {

            writer.write(str +"		2018011702"+" ���"+"\r\n");
            //д�������ǣ�ͨ���ַ�����+�������ݺ������"		2018011702"���������ݺ���

         }
         //ͨ��ѭ���Դζ�ȡbufferedReader��ÿһ�����ݣ�ͨ��str����¼��ȡ�����ݣ�ͨ��write������д��writer��

         bufferedReader.close();
         //�ر�bufferedReader��modified.txt��

         fileReader.close();
         //�ر�fileReader����������

         writer.close();
         //�ر�fileReader��original.txt��

      } catch (IOException e) {

         e.printStackTrace();
         //���˿��׳�������ݴ�ӡ����׼��������

      }

   }

}