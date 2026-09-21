import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies = new ArrayList<>();
    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Sanvi", "Ottawa", "613-805-6702");

        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}