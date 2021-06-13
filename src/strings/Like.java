package strings;

/**
 * likes {"Peter"} // must be "Peter likes this"
 * likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
 * likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
 * likes {"Alex", "Jacob", "Mark", "Max"} // "Alex and 3 others like this"
 */
public class Like {

    public static void main(String[] args) {

        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob","Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Andy", "John", "Roger", "Dave"));

    }


    public static String whoLikesIt(String... names) {

        int numOfFriends = names.length;

        if (numOfFriends == 0) return "no one likes this";

        if (numOfFriends == 1) return names[0] + " likes this";

        if (numOfFriends == 2) return names[0] + " and " + names[1] + " like this";

        if (numOfFriends == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";

        return names[0] + " and " + Integer.toString(numOfFriends - 1) + " others like this";

    }
}
