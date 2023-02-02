package components.utils;

public class CarCopy {
  private String model;
  private int year;

  public int getYear() {
    return year;
  }

  public String getModel() {
    return model;
  }

  public void setYear(int _year) {
    year = _year;
  }

  public void setModel(String _model) {
    model = _model;
  }

  public void copy(CarCopy car) {
    model = car.model;
    year = car.year;
  }
}
