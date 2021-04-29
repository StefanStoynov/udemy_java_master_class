package section_9.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
  private String name;
  private int hitPoints;
  private int strength;

  public Monster(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
  }

  public String getName() {
    return name;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public int getStrength() {
    return strength;
  }

  @Override
  public List<String> write() {
    ArrayList<String> result = new ArrayList<>();
    result.add(this.name);
    result.add(Integer.toString(this.hitPoints));
    result.add(Integer.toString(this.strength));

    return result;
  }

  @Override
  public void read(List<String> values) {
    if (values != null && !values.isEmpty()){
      this.name = values.get(0);
      this.hitPoints = Integer.parseInt(values.get(1));
      this.strength = Integer.parseInt(values.get(2));
    }
  }

  @Override
  public String toString() {
    return "Monster{" +
           "name='" + name + '\'' +
           ", hitPoints=" + hitPoints +
           ", strength=" + strength +
           '}';
  }
}
