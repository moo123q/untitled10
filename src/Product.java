public class Product {
    private String name;

    public Product(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean weeklimiet(boolean a, boolean b){

        boolean limiet = false;

        if (a && b){
            limiet = true;
        }
        return limiet;
    }

}
