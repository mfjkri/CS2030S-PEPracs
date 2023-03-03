class CustomerEnteringAction implements Action {
  private final Customer customer;
  private final Gym gym;

  public CustomerEnteringAction(int ci, Gym gym) {
    this.customer = gym.getCustomer(ci);
    this.gym = gym;
  }

  @Override
  public void complete() {
    this.gym.admitPerson(this.customer);
    System.out.println(this.gym);
  }
}
