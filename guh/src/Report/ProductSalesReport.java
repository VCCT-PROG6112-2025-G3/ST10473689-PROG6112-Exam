package Report;

// This just prints out the report to the screen
public class ProductSalesReport {
    public static void main(String[] args) {
        // Our sales data - year 1 and year 2 quarters
        int[][] sales = {
            {300, 150, 700},  // Year 1: Q1, Q2, Q3
            {250, 200, 600}   // Year 2: Q1, Q2, Q3
        };
        
        ProductSales ps = new ProductSales();  // Make our calculator
        
        // Print the report
        System.out.println("PRODUCT SALES REPORT = 2014");
        System.out.println("============================");
        System.out.println("Product Sales\t\t" + ps.TotalSales(sales));
        System.out.println("Average Market\t\t" + Math.round(ps.AverageSales(sales)));
        System.out.println("Maximum Market\t\t" + ps.MaxSales(sales));
        System.out.println("Minimum Market\t\t" + ps.MinSales(sales));
    }
}