public class Car {
  String plateNumber;
  String yearModel;
  String model;
  String Color;
  String Owner;

  Car next;

  public Car getNext() {
    return next;
  }
  public void setNext(Car next) {
    this.next = next;
  }

  public String getColor() {
    return Color;
  }
  public void setColor(String color) {
    Color = color;
  }
  public String getPlateNumber() {
    return plateNumber;
  }
  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }
  public String getYearModel() {
    return yearModel;
  }
  public void setYearModel(String yearModel) {
    this.yearModel = yearModel;
  }
  public String getOwner() {
    return Owner;
  }
  public void setOwner(String owner) {
    Owner = owner;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
}
