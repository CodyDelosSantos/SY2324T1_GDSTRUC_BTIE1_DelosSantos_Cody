import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Player> playerList = new ArrayList<Player>();
//
//        playerList.add(new Player(123, "Ed Perez", 50));
//        playerList.add(new Player(762, "Ayran Gauna", 30));
//        playerList.add(new Player(121, "AJ Astilla", 1));
//
//        //System.out.println("Player at index 1 is" + playerList.get(1));
//
//        playerList.add(1, new Player(843, "Ramon Samson", 28));
//
//        System.out.println("\nDoes the list contain Ed Perez?");
//        System.out.println(playerList.contains(new Player(123, "Ed Perez", 50)));
//
//        System.out.println("\nAfter adding Ramon Samson and Before removing");
//        printArrayList(playerList);
//
//        playerList.remove(2);
//
//        System.out.println("\nAfter removing");
//        printArrayList(playerList);
//
//        System.out.println("\nAJ Astilla can be found at index " +
//                playerList.indexOf(new Player(121, "AJ Astilla", 1)));
//
//        System.out.println("new student can be found at index " +
//                playerList.indexOf(new Player(123, "new student", 0)));

        System.out.println("Linked List");

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(new Player(123, "Ed Perez", 50));
        playerLinkedList.addToFront(new Player(762, "Ayran Gauna", 30));
        playerLinkedList.addToFront(new Player(121, "AJ Astilla", 1));

        System.out.println("\nBefore Removal:");
        playerLinkedList.printList();

        System.out.println("\nAfter Removal:");
        playerLinkedList.removeFirstElement();
        playerLinkedList.printList();

        System.out.println("\nDoes the list contain AJ Astilla?");
        playerLinkedList.contains(new Player(121, "AJ Astilla", 1));

        System.out.println("\nDoes the list contain Ed Perez?");
        playerLinkedList.contains(new Player(123, "Ed Perez", 50));

        System.out.println("\nAyran Gauna can be found at index " + playerLinkedList.indexOf(new Player(762, "Ayran Gauna", 30)));
        System.out.println("\nEd Perez can be found at index " + playerLinkedList.indexOf(new Player(123, "Ed Perez", 50)));

    }

    public static void printArrayList(ArrayList<Player> array)
    {
        for (Player player : array)
        {
            System.out.println(player.toString());
        }
    }
}