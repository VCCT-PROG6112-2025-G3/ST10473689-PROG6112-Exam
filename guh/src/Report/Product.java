package Report;
// Just the rules for what our sales calculator gotta do
public interface Product {
    int TotalSales(int[][] sales);          // Add up all the sales
    double AverageSales(int[][] sales);     // Figure out the average
    int MaxSales(int[][] sales);            // Find the biggest sale
    int MinSales(int[][] sales);            // Find the smallest sale
}