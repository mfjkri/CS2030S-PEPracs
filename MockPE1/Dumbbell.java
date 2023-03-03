class Dumbbell extends Equipment {
  private final double weight;

  public Dumbbell(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return super.toString() + " Dumbbell with weight " + this.weight;
  }
}
