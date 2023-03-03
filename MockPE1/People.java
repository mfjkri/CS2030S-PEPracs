abstract class People {
  private final String name;
  private boolean training;

  public People(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }

  public boolean isTraining() {
    return this.training;
  }

  public void startTraining() {
    this.training = true;
  }

  public void stopTraining() {
    this.training = false;
  }
}
