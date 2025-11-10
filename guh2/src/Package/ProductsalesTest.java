package Package;
public class ProductsalesTest {
    public static void main(String[] args) {
        Productsales ps = new Productsales();
        ps.setData(new int[]{300, 150, 700, 250, 200, 600});
        
        if (ps.GetSalesOverLimit() != 2) throw new RuntimeException("OverLimit failed");
        if (ps.GetSalesUnderLimit() != 4) throw new RuntimeException("UnderLimit failed");
        if (ps.GetTotalSales() != 2200) throw new RuntimeException("Total failed");
        if (Math.round(ps.GetAverageSales()) != 367) throw new RuntimeException("Average failed");
    }
}