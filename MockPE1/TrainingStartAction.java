class TrainingStartAction implements Action {
  private final Trainer trainer;
  private final Customer customer;
  private final Equipment equipment;

  public TrainingStartAction(int ti, int ci, int ei, Gym gym) {
    this.trainer = gym.getTrainer(ti);
    this.customer = gym.getCustomer(ci);
    this.equipment = gym.getEquipment(ei);
  }

  @Override
  public void complete() {
    this.trainer.startSession(this.customer, this.equipment);
  }
}
