public class app {
  public static void main(String[] args) {
    Werkstatt werkstatt = new Werkstatt();
    System.out.println(werkstatt.calcCost());
    System.out.println(werkstatt.getFinished());
    Car car = werkstatt.getCars().get(0);
    werkstatt.finish(car);
    System.out.println(werkstatt.getFinished());
  }
  
}
