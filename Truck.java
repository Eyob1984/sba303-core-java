public class Truck extends Car {
  int weight;

  public Truck(int speed, double regularPrice, String color) {
    
    super(speed, regularPrice, color);
    this.weight = weight;
  }

  public double getSalePrice() {
    if (weight > 2000) {
      return super.getSalePrice() * 0.9;
    }else {
    return super.getSalePrice() * 0.8;
  }
  } 
  
}
