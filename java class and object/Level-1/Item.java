class Item {
    int itemCode;
    String itemName;
    double price;

    void display() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 101;
        item.itemName = "Pen";
        item.price = 10;
        item.display();
        System.out.println("Total Cost for 5 items: " + item.totalCost(5));
    }
}
