
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements MediatorInterface{
    private List<CollegueInterface> users;
    public ConcreteMediator()
    {
        this.users = new ArrayList<CollegueInterface>();
    }
    public void addUser(CollegueInterface user)
    {
        users.add(user);
    }
    @Override

    public void sendMessage(String message, CollegueInterface sender) {
        for(CollegueInterface user: users)
        {
            if (user!=sender)
            {
                user.receiveMessage(message);
            }
        }


    }

}
