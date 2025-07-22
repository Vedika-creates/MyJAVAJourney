class calculator
{
        public int add(int n1,int n2)
        {
            int r = n1+n2;
            return r;
        }
    }
public class demo_class {
    public static void main(String a[]){

        int num=1;
        int num2=3;
        calculator cal = new calculator();
        int  result= cal.add(num,num2);
        System.out.println(result);
        }
    
}
