public class Pairwise {


    public double percentage(double spaardoel, double inkomen, int leeftijd, double vasteLasten){

        double percentageSpaardoel = inkomen * 0.4;
        double betaalPercentage = 0;

        if (spaardoel >= 0 && spaardoel <= 10000){
            betaalPercentage += 1;
        }

        if (spaardoel > 10000 && spaardoel <= 100000){
            betaalPercentage += 0.12;
        }

        if (spaardoel > 100000 ){
            betaalPercentage += 0.015;
        }

        if (leeftijd < 18){
            betaalPercentage = 0;
        }

        if (inkomen >= 2500){

            betaalPercentage += 0.1;
        }

        if (vasteLasten <= percentageSpaardoel){

            betaalPercentage += 0.1;
        }
        return betaalPercentage;
    }

}
