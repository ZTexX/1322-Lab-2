import java.text.DecimalFormat;

public class StockItem {
  private DecimalFormat df = new DecimalFormat("0.00");
  private String itemName;
  private String description;
  private int id;
  private float price;
  private int quantity;

  private static int incrementalId = 0;

  public StockItem() {
    this.id = incrementalId;
    incrementalId++;

    this.itemName = "";
    this.description = "";
    this.price = 0.00f;
    this.quantity = 0;
  }

  public StockItem(String description, int quantity, float price) {
    this.id = incrementalId;
    incrementalId++;

    this.itemName = description.substring(description.lastIndexOf(" ") + 1);
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  public String getDescription() {
    return this.description;
  }

  public int getId() {
    return this.id;
  }

  public float getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setPrice(float price) {
    if (price < 0f) {
      System.out.print("Price can not be below $0.00");
      return;
    }

    this.price = price;
  }

  public void lowerQuantity(int quantity) {
    if (this.quantity - quantity < 0) {
      System.out.print("Quantity can not be below 0");
      return;
    }

    this.quantity -= quantity;
  }

  public void raiseQuantity(int quantity) {
    this.quantity += quantity;
  }

  public String toString() {
    return String.format("%s: Item number: %d is %s has price %s we currently have %d in stock", itemName, id, description, df.format(price), quantity);
  }
}