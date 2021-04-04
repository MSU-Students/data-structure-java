public class CarRegistry {
  Car head;
 
  public CarRegistry() {
    head = null;    
  }
  public void register(Car newCar) {
    if (size() == 0) {
      head = newCar;
    } else {
      //insert head
      // newCar.setNext(head);
      // head = newCar;

      //insert tail
      Car cursor = head;
      while (cursor.getNext() != null) {
        cursor = cursor.getNext();
      }
      //cursor now is pointing to the last item
      cursor.setNext(newCar);
    }    
  }
  public Car queryCar(String plateNumber) {
   
    return null;
  }
  public int size() {
    int counter = 0;
    Car cursor = head;
    while (cursor != null) {
      cursor = cursor.getNext();
      counter++;
    }
    return counter;
  }
  public Car[] getList() {
    Car [] registry =  new Car[size()];
    int counter = 0;
    Car cursor = head;
    while (cursor != null) {
      registry[counter] = cursor;
      cursor = cursor.getNext();
      counter++;
    }
    return registry;
  }
}
