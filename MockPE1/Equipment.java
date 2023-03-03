abstract class Equipment {
  private boolean inUse;

  @Override
  public String toString() {
    return "Equipment:";
  }

  public boolean isInUse() {
    return this.inUse;
  }

  public void useEquipment() {
    this.inUse = true;
  }

  public void returnEquipment() {
    this.inUse = false;
  }
}
