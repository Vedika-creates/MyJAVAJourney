public class while_loop {
    public static void main(String a[]){
        //variable declaration
        int i=1;
        //while loop declaration
        while(i<=5){
            System.out.println("hello vedika" +  i);
            //varible 2 declaration
            int j=1;
            //nested while loop
            while(j<=4){
                System.out.println("welcome to the my javajourney" +  j);
                //increment
                j++;
            }
            //increment
            i++;
        }
        System.out.println("Succesfully completed while loop" +  i);

    }
    
}
