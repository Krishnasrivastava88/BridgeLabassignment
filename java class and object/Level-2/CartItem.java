class CartItem {
    String itemName;
    double price;
    int quantity;

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.itemName = "Notebook";
        item.price = 50;
        item.quantity = 3;
        item.display();
    }
}
