public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    // Test Change for L3
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this("Unknown", "Unknown", "Unknown");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Sanvi", "Ottawa", "613-805-6702");
        System.out.println("Hello " + buddy.getName());
    }

}
