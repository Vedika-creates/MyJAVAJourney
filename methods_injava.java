class music_playing
{

    public void playlist()
    {

        System.out.println("music is playing");
    }
    public int dancing(int x)
    {
        if (x>10)
        {
            return x;
        }
        else
        {
            return 0;
        }

    }
}



public class methods_injava {
    public static void main(String a[])
    {

        music_playing obj= new music_playing();
        obj.playlist();
        int result=obj.dancing(2);
        System.out.println(result);


    }
    
}
