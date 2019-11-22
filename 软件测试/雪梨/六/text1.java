class text{


    public void coveragel(int i,int j){
        int x=0;
        int y=0;
        if(i>0&&j>0){
            y=y+1;
        }else{
            if(i>-5||j>-5)
                y=y-1;
            else
                x=x-2;
        }

        System.out.println("x="+x+";y="+y);
    }

    
    public void coverage2(int tag,int i,int j){
        int x=0;
        int y=0;
        while(tag>0){
            x=x+1;
            if(i>0&&j>0){
                y=y+1;
                tag=0;
            }else{
                if(i>-5||j>-5)
                    y=y-1;
                else
                    x=x-2;
                tag--;
            }
        }
        System.out.println("x="+x+";y="+y);
    }

    public static void main(String[] args) {
        
    }
}
