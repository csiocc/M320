import java.util.ArrayList;
import java.util.List;

public class Werkstatt {

  private List<Car> carsList;
  private List<Car> finishedList;

  public Werkstatt() {
    this.carsList = seedCars();
    this.finishedList = new ArrayList<>();
  }

  private List<Car> seedCars() {
    List<Car> carsList = new ArrayList<>();
    carsList.add(new Car("Ferraris", "F40", 500));
    carsList.add(new Car("Mercedes", "C60", 300));
    carsList.add(new Car("Vw", "Golf", 100));
    carsList.add(new Car("Vw", "Polo", 130));
    return carsList;
  }

  public void registerNewCar(String marke, String typ, int price) {
    this.carsList.add(new Car(marke, typ, price));
  }

  public void finish(Car car) {
    carsList.remove(car);
    finishedList.add(car);
  }

  public List<Car> getFinished() {
    return finishedList;
  }
  
  public List<Car> getCars() {
    return carsList;
  }

  public int calcCost() {
    int result = 0;
    for (Car car : carsList) {
      result += car.getPrice();
    }
    return result;
  }
}
