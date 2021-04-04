public class CarRegistry {
  Car registry[];
  int size;
  public CarRegistry() {
    registry = new Car[5];
    size = 0;
  }
  public void register(Car item) {
    if (size >= registry.length) {
      Car [] oldRegistry = registry;
      registry = new Car[registry.length + 5];
      for (int i = 0; i < oldRegistry.length; i++) {
        registry[i] = oldRegistry[i];
      }
    }
    registry[size] = item;
    size++;
  }
  public Car queryCar(String plateNumber) {
    for (int i = 0; i < registry.length; i++) {
      if (registry[i].plateNumber.equals(plateNumber)) {
        return registry[i];
      }
    }
    return null;
  }
  public Car[] getList() {
    return registry;
  }
}
