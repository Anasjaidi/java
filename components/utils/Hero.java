package components.utils;

public class Hero extends Person{
  String power;
  public Hero(String _name, int _age, String _power) {
    super(_name, _age);
    this.power = _power;
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString()+power+"\n";
  }
}
