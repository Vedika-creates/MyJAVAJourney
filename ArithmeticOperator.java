public class ArithmeticOperator {
    public static void main(String a[]){
        int num=1;
        int num1=10;
        int resul_sum=num+num1;
        System.out.println(resul_sum);

        //sub
         int resul_sub=num-num1;
        System.out.println(resul_sub);

        //mul
         int resul_mul=num * num1;
        System.out.println(resul_mul);

        //div
         int resul_div=num%num1;
        System.out.println(resul_mul);

        //increment
        int sol = num++ ;//post increment
        int sol1 =++num ; //pre increment
        int sol3 = num--;
        int sol4 =--num;
        System.out.println(sol);
        System.out.println(sol1);
        System.out.println(sol3); 
        System.out.println(sol4);

    }
    
}
