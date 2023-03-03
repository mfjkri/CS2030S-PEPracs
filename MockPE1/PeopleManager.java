class PeopleManager {
  private final People[] ppl;
  private int pplPtr;

  private static final int TRAINER = 0;
  private static final int CUSTOMER = 1;

  public PeopleManager(int numPeople) {
    this.ppl = new People[numPeople];
  }

  @Override
  public String toString() {
    String str = "";
    for (People e : this.ppl) {
      if (str != "") {
        str += "\n";
      }
      str += e;
    }
    return str;
  }

  public void addPerson(int kind, String name) {
    if (this.pplPtr == this.ppl.length) {
      return;
    }

    if (kind == PeopleManager.TRAINER) {
      this.ppl[this.pplPtr++] = new Trainer(name);
    } else if (kind == PeopleManager.CUSTOMER) {
      this.ppl[this.pplPtr++] = new Customer(name);
    }
  }

  public Customer getCustomer(int ci) {
    return (Customer) this.getPerson(ci);
  }

  public Trainer getTrainer(int ti) {
    return (Trainer) this.getPerson(ti);
  }

  public People getPerson(int index) {
    if (index < 0 || index >= this.ppl.length) {
      return null;
    }

    return this.ppl[index];
  }
}
