public class Ford extends Car {
  int year;
  int manuDiscount;
  public Ford(int speed, double regularPrice, String color, int year, int manuDiscount) {
    super(speed, regularPrice, color);
    this.year = year;
    this.manuDiscount = manuDiscount;
  }
  
  @Override
  public
  double getSalePrice() {
    return super.getSalePrice() - manuDiscount;
   }
}
