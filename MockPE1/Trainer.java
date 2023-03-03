class Trainer extends People {
  private Equipment eq = null;
  private People customer = null;

  public Trainer(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Trainer: " + super.toString();
  }

  public void startSession(People customer, Equipment eq) {
    if (this.isTraining() || eq.isInUse()) {
      System.out.println("Cannot Train!");
      return;
    }

    this.eq = eq;
    this.customer = customer;

    this.startTraining();
    this.customer.startTraining();
    this.eq.useEquipment();

    System.out.printf("%s training %s using %s\n",
        this, this.customer, this.eq);
  }

  public void stopSession() {
    if (!this.isTraining()) {
      System.out.printf("%s is not training\n", this); 
      return;
    }

    this.customer.stopTraining();
    this.eq.returnEquipment();
    this.stopTraining();
    this.customer = null;
    this.eq = null;

    System.out.printf("%s has finished training\n", this);
  }
}

