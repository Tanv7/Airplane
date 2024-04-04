public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}class Plane {
    private String name;
    String length;
    private double weight;

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public double getWeight() {
        System.out.println("Измеряем вес");
        return weight;
    }

    public Boeing757(String name, String length,String color,String maxCapacity, double weight) {
        this.name = name;
        this.length= lenght;
        this.color=color;
        this.maxCapacity=maxCapacity;
        this.weight = weight;
    }
    public String toString() {
        String P = "самолет: " + name + "lenght" + color + maxCapacity+" весом " + weight + " кг";
        return P;
    }

    public void setName(String name) {
        System.out.println("переименование " + this.name + " в " + name);
        this.name = name;
    }
}
private static void printArray (String)














