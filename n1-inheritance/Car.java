
public class Car extends Vehicle{

  private int seats;
  private int maxSpeed;

  public Car(String marke, String typ, int price, int seats, int maxSpeed) {
    super(marke, typ, price);
    this.seats = seats;
    this.maxSpeed = maxSpeed;
  }

  public void overrideMaxSpeed(int override) {
    this.maxSpeed = override;
  }

  public int getSeats() {
    return seats;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }
}