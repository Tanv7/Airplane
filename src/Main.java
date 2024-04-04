public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
 Plane =[] arrayPlanes
    Plane p1=new Plane ("Airbus A320","белый",135);
    Plane p2=new Plane ("Boeing 777-300ER","черный",0,168);
    Plane p3=new Plane ("Airbus A320","розовый",100);
    Plane p4=new Plane ("Су-25","камуфляж",25);
    // Plane[] aiplanes=new Plane [4];
    //planes[0]=a1;
    Plane [] planes={a1,a2,a3,a4}




    private String name;
    int length;

    private double weight;


    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public double getWeight() {
        System.out.println("Измеряем вес");
        return weight;
    }

    public (String name, int length,String color,int maxCapacity, double weight) {
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















