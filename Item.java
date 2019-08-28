import java.util.Scanner;

abstract class Item
{
    char type;
    String name;

    //Abstract method use(). Initiates the item's "use", or potential actions.
    abstract void use();

    //Abstract method toss(). Removes the item from its container (inventory, chest, etc).
    void toss()
    {
        Scanner s = new Scanner(System.in);

        System.out.printf("Are you sure that you would like to remove %s from your inventory? Y/N: ", this.name);

        if (s.nextChar() == 'Y')
        {
            
        }
    }

    //Abstract method swapBetween(). Moves the item between the selected container and the player's inventory.
    abstract void swapBetween();

} //Item