class EquipmentManager {
  private final Equipment[] eq;
  private int eqPtr;

  private static final int TREADMILL = 0;
  private static final int DUMBBELL = 1;

  public EquipmentManager(int numEquipment) {
    this.eq = new Equipment[numEquipment];
  }

  @Override
  public String toString() {
    String str = "";
    for (Equipment e : this.eq) {
      if (str != "") {
        str += "\n";
      }
      str += e;
    }
    return str;
  }

  public void addEquipment(int kind, double stats) {
    if (this.eqPtr == this.eq.length) {
      return;
    }

    if (kind == EquipmentManager.TREADMILL) {
      this.eq[this.eqPtr++] = new Treadmill(stats);
    } else if (kind == EquipmentManager.DUMBBELL) {
      this.eq[this.eqPtr++] = new Dumbbell(stats);
    }
  }

  public Equipment getEquipment(int index) {
    if (index < 0 || index >= this.eq.length) {
      return null;
    }

    return this.eq[index];
  }
}
