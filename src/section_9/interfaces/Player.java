package section_9.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
  private String name;
  private String weapon;
  private int hitPoints;
  private int strength;

  public Player(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
    this.weapon = "Sword"; //should be a static final
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWeapon() {
    return weapon;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  @Override
  public String toString() {
    return "Player{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength + ", weapon='" + this.weapon + "'}";
  }

  @Override
  public List<String> write() {
    ArrayList<String> result = new ArrayList<>();
    result.add(this.name);
    result.add(Integer.toString(this.hitPoints));
    result.add(Integer.toString(this.strength));
    result.add(this.weapon);

    return result;
  }

  @Override
  public void read(List<String> values) {
    if (values != null && !values.isEmpty()){
      this.name = values.get(0);
      this.hitPoints = Integer.parseInt(values.get(1));
      this.strength = Integer.parseInt(values.get(2));
      this.weapon = values.get(3);
    }
  }
}
