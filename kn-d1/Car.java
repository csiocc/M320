public class Car {

  private String marke;
  private String typ;
  private int price;

  public Car(String marke, String typ, int price) {
    this.marke = marke;
    this.typ = typ;
    this.price = price;
  }

  public String getMarke() {
    return marke;
  }

  public String getTyp() {
    return typ;
  }

  public int getPrice() {
    return price;
  }
  
}
