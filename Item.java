abstract class Item
{
    char type;
    String name;

    //Abstract method use(). Initiates the item's "use", or potential actions.
    abstract void use();

    //Abstract method toss(). Removes the item from its container (inventory, chest, etc).
    abstract void toss();

    //Abstract method swapBetween(). Moves the item between the selected container and the player's inventory.
    abstract void swapBetween();

} //Item