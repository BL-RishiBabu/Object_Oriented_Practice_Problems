import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    String name;
    int numShares;
    double sharePrice;

    public Stock(String name, int numShares, double sharePrice) {
        this.name = name;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    public double calculateStockValue() {
        return numShares * sharePrice;
    }
}

class StockPortfolio {
    ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void displayReport() {
        double totalValue = 0;
        System.out.println("\n--- STOCK REPORT ---");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Name", "Shares", "Price", "Value");
        
        for (Stock s : stocks) {
            double value = s.calculateStockValue();
            totalValue += value;
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", s.name, s.numShares, s.sharePrice, value);
        }
        System.out.println("-------------------------------------------");
        System.out.printf("Total Portfolio Value: %.2f\n", totalValue);
    }
}

public class StockManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Stock " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Shares: ");
            int shares = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            portfolio.addStock(new Stock(name, shares, price));
        }
        portfolio.displayReport();
        sc.close();
    }
}