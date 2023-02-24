package Car.isep.tp3;

public class Car {
    private String brand;
    private int year;
  private int maxSpeed;
    private int nbHorses;

    public Car(String myBrand, int year, int maxSpeed, int horses){
        this.brand = myBrand;
        this.year= year;
        this.maxSpeed=maxSpeed;
        this.nbHorses= horses;
    }



    public static void main(String[] args) {
        Car car = new Car("BMW", 2002, 120, 1);
        System.out.println(car.brand    );
    }
}

