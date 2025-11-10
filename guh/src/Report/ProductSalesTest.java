package Report;

// Testing if our math actually works right
public class ProductSalesTest {
    
    public static void main(String[] args) {
        System.out.println("Testing our sales calculator...");
        
        // Test data from the paper
        int[][] testData = {{300, 150, 700}, {250, 200, 600}};
        ProductSales ps = new ProductSales();
        
        // Test 1: Check if total is right
        if (ps.TotalSales(testData) != 2200) {
            throw new RuntimeException("Oops! Total should be 2200");
        }
        
        // Test 2: Check if average is right (rounded)
        if (Math.round(ps.AverageSales(testData)) != 367) {
            throw new RuntimeException("Hmm, average should be 367");
        }
        
        // Test 3: Check if max is right
        if (ps.MaxSales(testData) != 700) {
            throw new RuntimeException("Max should be 700");
        }
        
        // Test 4: Check if min is right
        if (ps.MinSales(testData) != 150) {
            throw new RuntimeException("Min should be 150");
        }
        
        System.out.println("All tests passed! Our math is good :)");
    }
}