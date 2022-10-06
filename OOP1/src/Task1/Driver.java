package Task1;

public class Driver {
    private String name;
    private int age;


    public Driver(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "is driven by "+name + ", age: " + age;
    }

    public static void main(String[] args) {
        Driver obj = new Driver("Maja", 20);

        Car ccar = new Car("Volkswagen", "up", 2011, "Mikrobil");
        ccar.setDriver(obj);

        System.out.println(ccar);
        System.out.println(obj);

        Car ccar2 = new Car("Audi", "r8", 2018, "sportsvogn");

        System.out.println(ccar2);
        System.out.println(obj);


    }
}



