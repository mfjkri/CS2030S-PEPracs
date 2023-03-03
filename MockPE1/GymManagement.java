import java.util.Scanner;

class GymManagement {
  private final Gym gym;

  private static final int ENTER = 0;
  private static final int START = 1;
  private static final int FINISH = 2;

  public void printEquipment() {
    this.gym.printEquipment();
  }

  public void printPeople() {
    this.gym.printPeople();
  }

  public GymManagement() {
    Scanner scanner = new Scanner(System.in);

    // Read Equipment
    int numEquipment = scanner.nextInt();
    EquipmentManager eqManager = new EquipmentManager(numEquipment);
    for (int i = 0; i < numEquipment; i++) {
      int equipmentType = scanner.nextInt();
      double stats = scanner.nextDouble();
      eqManager.addEquipment(equipmentType, stats);
    }

    // Read Customers
    int numPeople = scanner.nextInt();
    PeopleManager pplManager = new PeopleManager(numPeople);
    for (int i = 0; i < numPeople; i++) {
      int peopleKind = scanner.nextInt();
      String name = scanner.next();
      pplManager.addPerson(peopleKind, name);
    }

    // Read Gym Capacity
    this.gym = new Gym(pplManager, eqManager, scanner.nextInt());

    // Read Actions
    int numActions = scanner.nextInt();
    for (int i = 0; i < numActions; i++) {
      int action = scanner.nextInt();
      if (action == GymManagement.ENTER) {
        int customer = scanner.nextInt();
        gym.action(new CustomerEnteringAction(customer, this.gym));
      } else if (action == GymManagement.START) {
        int trainer = scanner.nextInt();
        int customer = scanner.nextInt();
        int equipment = scanner.nextInt();
        gym.action(new TrainingStartAction(trainer, customer, equipment, this.gym));
      } else if (action == GymManagement.FINISH) {
        int trainer = scanner.nextInt();
        gym.action(new TrainingEndAction(trainer, this.gym));
      }
    }

    scanner.close();
  }
}
