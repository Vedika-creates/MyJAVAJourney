public class logical_operator {
    public static void main(String s[]){
        int x=10;
        int y=20;
        int a= 30;
        int b=40;
        boolean result = x<y && a<b;
        System.out.println(result);

        boolean result_1 = x>y || a>b;
        System.out.println(result_1);

        boolean result_2 = x!=y && a!=b;
        System.out.println(result_2);

        boolean result_3 = x ==y || a !=b;
        System.out.println(result_3);


    }
}
