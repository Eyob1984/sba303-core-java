public class OwnAutoShop {
  public static void main(String[] args) {
    Sedan sedan = new Sedan(180, 19000, "Green", 25);
    Ford ford1 = new Ford(140, 23000, "Blue", 2020, 2000);
    Ford ford2 = new Ford(120, 21000, "White", 2023, 1500);
    Car car = new Car(90, 17000, "Black");

    System.out.println("Sedan Sale Price: " + sedan.getSalePrice());
    System.out.println("Ford 1 Sale Price: " + ford1.getSalePrice());
    System.out.println("Ford 2 Sale Price: " + ford2.getSalePrice());
    System.out.println("Car Sale Price: " + car.getSalePrice());
}
}
