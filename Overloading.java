class concept_overloading{


    public int add(int n1 ,int n2)
    {
        return n1+n2;
    }
    public double add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}



public class Overloading {
    public static void main(String a[])
    {
        concept_overloading obj =new concept_overloading();
        int result= obj.add(10, 200);
        System.out.println(result);
        

    }
    
}
