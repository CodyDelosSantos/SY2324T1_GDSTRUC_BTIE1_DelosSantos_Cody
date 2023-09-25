import java.util.Objects;

public class PlayerLinkedList {
    private PlayerNode head;
    int size = determineSize();

    public int determineSize()
    {
        PlayerNode current = head;
        while (current != null)
        {
            size++;
            current = current.getNextPlayer();
        }
        return size;
    }

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);

        head = playerNode;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("Head ->");

        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");

            current = current.getNextPlayer();
        }

        System.out.print("null");
    }

    public void removeFirstElement()
    {
        PlayerNode current = head;
        current = current.getNextPlayer();
        head = current;
    }

    public void contains(Player player)
    {
        int bool = 0;
        PlayerNode current = head;
        PlayerNode playerNode = new PlayerNode(player);

        while (current != null)
        {
            String currentString = String.valueOf(current);
            String playerNodeString = String.valueOf(playerNode);
            if (Objects.equals(currentString, playerNodeString))
            {
                bool = 1;
                break;
            }
            current = current.getNextPlayer();
        }

        if (bool == 1)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }

    public int indexOf(Player player)
    {
        int index = 0;
        PlayerNode playerNode = new PlayerNode(player);
        PlayerNode current = head;
        while (current != null)
        {
            String currentString = String.valueOf(current);
            String playerNodeString = String.valueOf(playerNode);
            if (Objects.equals(currentString, playerNodeString))
            {
                break;
            }
            else
            {
                index++;
                current = current.getNextPlayer();
            }
        }
        return index;
    }

}