class Treadmill extends Equipment {
  private final double speed;

  public Treadmill(double speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    return super.toString() + " Treadmill at speed " + this.speed;
  }
}
