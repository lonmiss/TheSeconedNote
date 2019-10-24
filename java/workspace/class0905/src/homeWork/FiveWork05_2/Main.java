package homeWork.FiveWork05_2;

public class Main {
    public static void main(String[] args){
        Circle[] arrC=new Circle[4];

        arrC[0]=new Circle(1.0,"red","No");
        arrC[1]=new Circle(3.0,"green","No");
        arrC[2]=new Circle(2.0,"blue","No");
        arrC[3]=new Circle(4.0,"blue","No");
        Circle tC=arrC[0];

        Rectangle[] arrR=new Rectangle[4];
        arrR[0]=new Rectangle(2,1,"red","Yes");
        arrR[1]=new Rectangle(6,1,"red","Yes");
        arrR[2]=new Rectangle(4,1,"red","Yes");
        arrR[3]=new Rectangle(5,1,"red","Yes");
        Rectangle tR=new Rectangle(arrR[0].getLength(),arrR[0].getWide(),arrR[0].getPen_color(),arrR[0].getFill());

        Square[] arrS=new Square[4];
        arrS[0]=new Square(6,"blue","No");
        arrS[1]=new Square(4,"blue","No");
        arrS[2]=new Square(5,"blue","No");
        arrS[3]=new Square(1,"blue","No");
        Square tS=new Square(arrS[0].getSide(),arrS[0].getPen_color(),arrS[0].getFill());



        //寻找最大的圆
        for (int i = 1; i < arrC.length; i++) {
            //System.out.println(arrC[i].toString());
            if(tC.compareTo(arrC[i])<0){
                tC=arrC[i];
            }
        }
        System.out.println("最大的圆是："+ tC.toString());

        //寻找最大的长方形
        for (int i = 1; i < arrR.length; i++) {
            if(tR.compareTo(arrR[i])<0){
                tR=arrR[i];
            }
        }
        System.out.println("最大的长方形是："+ tR.toString());

        //寻找最大的正方形
        for (int i = 1; i < arrS.length; i++) {
            if(tS.compareTo(arrS[i])<0){
                tS=arrS[i];
            }
        }
        System.out.println("最大的正方形是："+ tS.toString());
    }
}
