public class Product{

    public static boolean weeklimietTest(boolean a, boolean b){


        boolean D = false;
        if (a && b){
            D = true;

        }
        return D;
    }



    public static boolean EQKRTest(double gekozenBedrag){
        boolean D = false;
        double overgeblevenBedrag = 800;

        if(gekozenBedrag <= overgeblevenBedrag){
            D = true;
        }

        return D;
    }

}
