import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StockItem milk = new StockItem("1 Gallon of Milk", 15, 3.60f);
    StockItem bread = new StockItem("1 Loaf of Bread", 30, 1.98f);

    String menu = "1. Sold One Milk\n2. Sold One Bread\n3. Change price of Milk\n4. Change price of Bread\n5. Add Milk to Inventory\n6. Add Bread to Inventory\n7. See Inventory\n8. Quit";

    int userChoice = 0;
    do {
      System.out.println(menu);
      userChoice = Integer.parseInt(br.readLine());

      switch (userChoice) {
        case 1:
          milk.lowerQuantity(1);
          break;
        case 2:
          bread.lowerQuantity(1);
          break;
        case 3:
          System.out.println("What is the new price for Milk");
          float newMilkPrice = Float.parseFloat(br.readLine());
          milk.setPrice(newMilkPrice);
          break;
        case 4:
          System.out.println("What is the new price for Bread");
          float newBreadPrice = Float.parseFloat(br.readLine());
          bread.setPrice(newBreadPrice);
          break;
        case 5:
          System.out.println("How many milk did we get?");
          int howManyMilk = Integer.parseInt(br.readLine());
          milk.raiseQuantity(howManyMilk);
          break;
        case 6:
          System.out.println("How many bread did we get?");
          int howManyBread = Integer.parseInt(br.readLine());
          bread.raiseQuantity(howManyBread);
          break;
        case 7:
          System.out.println("\n" + milk);
          System.out.println(bread);
          break;
        case 8:
          break;
        default:
          System.out.println("That is not an option. Please try again.");
          break;
      }
      System.out.println();
    } while (userChoice != 8);
  }
}