public class User {
    // main method
    public static void main (String[] args) {
        // method calls for the UserIdentifier class and returns the Username of the class
        String Username = UserIdentifier.getUserName();
        // method calls for the UserIdentifier class and returns the OSName of the class
        String OSName = UserIdentifier.getOSName();
        System.out.println ("I am " + Username + " on " + OSName);
    }
}
