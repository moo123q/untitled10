public class EQKR {
    private double inkomen = 2000;
    private double vasteLasten = 1200;

    double overgeblevenBedrag = inkomen - vasteLasten;


    public boolean EQKRTest(double gekozenBedrag){
        boolean D = false;

        if(gekozenBedrag <= overgeblevenBedrag){
            D = true;
        }

        return D;
    }


}
