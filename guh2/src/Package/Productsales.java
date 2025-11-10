package Package;
// The actual calcultaor that does the work
public class Productsales implements iProductsales {
    private int[] data;  // This will hold our sales numbers
    
    // Put our sales data in here
    public void setData(int[] data) { 
        this.data = data; 
    }
    
    // Add up all the numbers in our data
    public int GetTotalSales() {
        int total = 0;
        for (int sale : data) {
            total += sale;  // Just keep adding
        }
        return total;
    }
    
    // Count how many sales were over 500
    public int GetSalesOverLimit() {
        int count = 0;
        for (int sale : data) {
            if (sale > 500) {  // This one is over 500!
                count++;
            }
        }
        return count;
    }
    
    // Count how many sales were 500 or less
    public int GetSalesUnderLimit() {
        int count = 0;
        for (int sale : data) {
            if (sale <= 500) {  // This one is 500 or less
                count++;
            }
        }
        return count;
    }
    
    // Total divided by how many numbers
    public double GetAverageSales() {
        return (double) GetTotalSales() / data.length;
    }
}