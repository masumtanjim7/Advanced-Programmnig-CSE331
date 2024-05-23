
public class ConcreteCollegue implements CollegueInterface{
    private ConcreteMediator mediator;
    private String username;

    public ConcreteCollegue(ConcreteMediator mediator, String username)
    {
        this.mediator = mediator;
        this.username = username;
        mediator.addUser(this);
    }
    public void send(String message)
    {
        System.out.println(username + " sends message "+message);
        mediator.sendMessage(message,this);
    }
    @Override
    public void receiveMessage(String message) {
        System.out.println(username + " receives message "+message);

    }

}
