package Class0912;
import java.util.Arrays;
public class ʵ�� {

	public static void main(String[] args) {
		String[] stuNo = { "2019011535", "2019011534", "2019011539", "2019011538", "2019011537" };
        String[] stuName = { "����", "����", "����", "����", "����" };
        int[] stuScore = { 53, 78, 96, 66, 85 };
        System.out.println("1������ɼ����������ֵ����Сֵ������ֵ֮�ͣ������������̨:");
        int[] stuScore1=Arrays.copyOf(stuScore,5);
        //stuScore1=Arrays.copyOf(stuScore);
        //System.out.print(Arrays.toString(stuScore1));
        Arrays.sort(stuScore1);
        int sum=0;
        for (int i = 0; i < stuScore1.length ; i++) {
            sum+=stuScore1[i];
        }
        System.out.println("���ֵ��"+stuScore1[stuScore1.length-1]+"   ��Сֵ��"+stuScore1[0]+"    ����ֵ֮�ͣ�"+sum);


        System.out.println("2���ֱ�����������������������̨�������ǰ������������:");
        String[] stuNo1=Arrays.copyOf(stuNo,stuNo.length);
        String[] stuName1=Arrays.copyOf(stuName,stuName.length);
        Arrays.sort(stuNo1);
        Arrays.sort(stuName1);
        System.out.println(Arrays.toString(stuNo1));
        System.out.println(Arrays.toString(stuName1));
        System.out.println(Arrays.toString(stuScore1));
        System.out.println("\n \n");

        System.out.println("����2��������õ����ݸ��Ƶ���������������:�Ѿ��ֱ�����stuNo1��stuName1��stuScore1��");
        //�Ѿ��ֱ�����stuNo1��stuName1��stuScore1��
        System.out.println("\n \n");


        System.out.println("4�����ݳɼ�����Ҫ�󱣳�ѧ�š��������ɼ���Ӧ:");//ʹ�ö�ά����

        String[][] stuNo2 = { {"2019011535","1"}, {"2019011534","2"}, {"2019011539","3"},{ "2019011538","4"},{"2019011537","5"}};
        String[][] stuName2 = { {"����","1"}, {"����","2"}, {"����","3"}, {"����","4"}, {"����","5"}};
        int[][] stuScore2 = { {53,1}, {78,2}, {96,3}, {66,4}, {85,5}};
        int score,xvhao;
        
        for (int i = 0; i <stuScore2.length-1 ; i++) 
        {
            for (int j = 0; j <stuScore2.length-i-1 ; j++) 
            {
                if(stuScore2[j][0]>stuScore2[j+1][0])
                {
                    score=stuScore2[j][0];
                    xvhao=stuScore2[j][1];
                    
                    stuScore2[j][0]=stuScore2[j+1][0];
                    stuScore2[j][1]=stuScore2[j+1][1];
                    
                    stuScore2[j+1][0]=score;
                    stuScore2[j+1][1]=xvhao;
                }
            }
        }
        
        for (int i = 0; i <stuScore2.length ; i++) {
            for (int j = 0; j <stuNo2.length ; j++) {
                if ( (stuScore2[i][1]+"").equals(stuNo2[j][1])){
                    System.out.print(stuNo2[j][0]+" ");
                    break;
                }
            }
            for (int j = 0; j <stuName2.length ; j++) {
                if ((stuScore2[i][1]+"").equals(stuName2[j][1])){
                    System.out.print(stuName2[j][0]+"   ");
                    break;
                }
            }
            System.out.println(stuScore2[i][0]);
        }

    }

}



