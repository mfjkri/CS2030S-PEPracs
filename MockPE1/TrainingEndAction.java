class TrainingEndAction implements Action {
  private final Trainer trainer;

  public TrainingEndAction(int ti, Gym gym) {
    this.trainer = gym.getTrainer(ti);
  }

  @Override
  public void complete() {
    this.trainer.stopSession();
  }
}
