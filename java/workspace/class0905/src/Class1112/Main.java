package Class1112;

public class Main {
    // throws代表fun1方法可能会抛出Exception类型的异常，一般情况下不写效果也差不多（类似）
    public static void fun1() throws Exception{
        int a=10;
        if(a>5){
            throw new Exception();//throw后跟异常类类型的对象，代表当前抛出这种类型的异常
        }

    }
    public static void main(String[] args) {
        try {
            //try块中可能会抛出异常的代码
            //如果抛出异常的话，从抛出异常的代码行停止执行try块其他代码，继续执行catch代码
            //如果没有抛出异常的话，执行完try块，执性catch块后面的代码
        }catch (NullPointerException n){

        } catch (IndexOutOfBoundsException i){

        }catch (Exception e){
            //如果出现Exception类型的异常后，执行代码

        }catch (Throwable t){

        }finally {
            //无论try是否发生异常，无论catch是否捕获异常，finally都会被执行
            /*
            不执行finally语句块的特殊情况
            在执行finally之前首先执行了“System.exit(0)”
            finally语句的典型应用
                * 回收资源
             */
        }
        //catch匹配顺序是按着书写顺序匹配
    }
}
