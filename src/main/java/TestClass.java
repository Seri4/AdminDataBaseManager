import entites.User;
import entites.UserType;
import utils.ActionsImpl;

public class TestClass {
    public static void main(String[] args) {
        ActionsImpl actions = new ActionsImpl();
        User currentUser = new User("56448456","sdjkfsf","akjfajksdhas", UserType.Entry);
        actions.createEntry(currentUser);


    }
}
