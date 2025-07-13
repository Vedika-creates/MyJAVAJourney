public class Typecasting {
    public static void main(String a[])
    {
        //conversion of int to byte i.e higher datatype to lower datatype using typecasting
        int x=15;
        byte b= (byte)x;
        System.out.println(b);

        //higher datatypr upper higher range will cause lossy conversion
        int y =245;
        byte c=(byte)y;
        System.out.println(c);

        //datatype pramotion to higher datatype due to range limitation
        byte v =35;
        byte t =35;
        int result = v*t;
        System.out.println(result);
    }
    
}
