package Package;
// What our sales calculator needs to be able to do
public interface iProductsales {
    int GetTotalSales();           // Add up all sales
    int GetSalesOverLimit();       // Count sales over 500
    int GetSalesUnderLimit();      // Count sales under/equal to 500
    double GetAverageSales();      // Find the average
}