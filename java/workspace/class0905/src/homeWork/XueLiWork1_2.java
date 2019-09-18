package homeWork;

public class XueLiWork1_2 {
    public static void main(String[] args)
    {
        int cnt=0;
        for (int i = 15; i >9 ; i--) {
            for (int k = 0; k <cnt ; k++) {
                System.out.print("          ");
            }
            for (int j = 10; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            cnt++;
            System.out.print("\n");
        }
    }
}
