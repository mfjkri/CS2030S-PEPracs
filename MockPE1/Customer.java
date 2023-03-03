class Customer extends People {
  public Customer(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Customer: " + super.toString();
  }
}

