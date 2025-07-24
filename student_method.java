class student_details{

    public void display_details( String name , int roll_no)
    {
        System.out.println(name);
        System.out.println(roll_no);


    }
    public  char garde (int marks)
    {

        if (marks>80 && marks <=100)
        {
            return 'A';
        }
        else if(marks>60  && marks <80)
        {
            return 'B';

        }
        else{
            return 'C';
        }
        
    }
}



public class student_method {

    public static void main(String a[])
    {
    student_details obj = new student_details();
    obj.display_details( "vedika", 51);
     char result= obj.garde(67);
     System.out.println(result);


    }

    
}
