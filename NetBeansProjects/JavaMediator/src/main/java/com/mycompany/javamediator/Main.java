

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteCollegue user1 = new ConcreteCollegue(mediator, "User1");
        ConcreteCollegue user2 = new ConcreteCollegue(mediator, "User2");
        ConcreteCollegue user3 = new ConcreteCollegue(mediator, "User3");

        user1.send("Helloo!! Everyone");


    }
}
