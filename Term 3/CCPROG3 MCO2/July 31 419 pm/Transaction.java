public class Transaction {
    public Transaction(String n, int q, int p) {
        name = n;
        quantity = q;
        price = p*quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String n) {
        name = n;
    }

    public void setQuantity(int q) {
        quantity = q;
        price = price * quantity;
    }

    private String name;
    private int quantity;
    private int price;
}
