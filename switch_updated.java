public class switch_updated {
    public static void main(String a[]){


        String name ="vedika";
        String result ="";
        result = switch(name)
        {
            //we can use -> insted of yield
            case "vedika","shreya" : yield "student of BTech";
            case "siddhi" : yield "topper";
            default :yield"All are jr";


        };
        System.out.println(result);
    }
    
}
