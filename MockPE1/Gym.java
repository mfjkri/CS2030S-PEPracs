class Gym {
  private final PeopleManager pplManager;
  private final EquipmentManager eqManager;
  private final int capacity;
  private int currentCapacity;

  public Gym(PeopleManager pplManager, EquipmentManager eqManager, int capacity) {
    this.pplManager = pplManager;
    this.eqManager = eqManager;
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return String.format("Gym Capacity: %d/%d", this.currentCapacity, this.capacity);
  }

  public void action(Action action) {
    action.complete();
  }

  public void admitPerson(People p) {
    if (this.currentCapacity == this.capacity) {
      System.out.printf("%s cannot enter\n", p);
      return;
    }

    this.currentCapacity++;
    System.out.printf("%s can enter\n", p);
  }

  public Customer getCustomer(int ci) {
    return this.pplManager.getCustomer(ci);
  }

  public Trainer getTrainer(int ti) {
    return this.pplManager.getTrainer(ti);
  }

  public Equipment getEquipment(int index) {
    return this.eqManager.getEquipment(index);
  }

  public void printPeople() {
    System.out.println(this.pplManager);
  }

  public void printEquipment() {
    System.out.println(this.eqManager);
  }
}
