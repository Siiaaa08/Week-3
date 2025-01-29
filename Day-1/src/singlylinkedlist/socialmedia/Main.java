package singlylinkedlist.socialmedia;

public class Main {
        public static void main(String[] args) {
            SocialMedia smConnections = new SocialMedia();

            // Add users to the system
            smConnections.addUser(1, "Alice", 25);
            smConnections.addUser(2, "Bob", 30);
            smConnections.addUser(3, "Charlie", 28);

            smConnections.addFriendConnection(1, 2);
            smConnections.addFriendConnection(1, 3);

            System.out.println("All Users:");
            smConnections.displayAllUsers();

            smConnections.displayFriends(1);

            smConnections.findMutualFriends(1, 2);
            smConnections.removeFriendConnection(1, 2);
            smConnections.displayFriends(1);

            smConnections.countFriends();
        }
    }


