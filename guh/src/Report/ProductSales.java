package Report;

// This class actually doess the math stuff
public class ProductSales implements Product {
    
    // Just loop through everything and add it up
    public int TotalSales(int[][] sales) {
        int total = 0;
        for (int[] year : sales) {
            for (int sale : year) {
                total += sale;  // Keep adding each number
            }
        }
        return total;
    }
    
    // Total divided by how many numbers we got
    public double AverageSales(int[][] sales) {
        int count = sales.length * sales[0].length;  // Rows × columns
        return (double) TotalSales(sales) / count;
    }
    
    // Look for the biggest number in the whole thing
    public int MaxSales(int[][] sales) {
        int max = sales[0][0];  // Start with first number
        for (int[] year : sales) {
            for (int sale : year) {
                if (sale > max) max = sale;  // Found a bigger one!
            }
        }
        return max;
    }
    
    // Look for the smallest number
    public int MinSales(int[][] sales) {
        int min = sales[0][0];  // Start with first number
        for (int[] year : sales) {
            for (int sale : year) {
                if (sale < min) min = sale;  // Found a smaller one!
            }
        }
        return min;
    }
}