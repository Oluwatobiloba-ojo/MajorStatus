package chapterthree;

public class Car {
    private String name;
    private int model;
    private double price;
    private int tyres;
    public Car(String name, int model, double price, int tyres) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.tyres = tyres;
    }

    public String getName() {
        return name;
    }

    public int getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getTyres(int numberOfTyre) {
        return tyres;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setModel(int model){
        this.model = model;
    }
    public void setPrice(double price){
        if (price > 0) {
            this.price = price;
        }
    }
    public void setTyres(int tyres){
        this.tyres = tyres;
    }

    public void percentageOf(int percentage) {
    if (percentage > 0){
        double price1 = price * ((double) percentage / 100);
        double result = price - price1;
        String price2 = String.format("%.1f", result);
        this.price = Double.parseDouble(price2);
    }
    }
}
