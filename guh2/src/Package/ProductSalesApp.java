package Package;
import javax.swing.*;
import java.awt.*;

// The window with buttons and stuff
public class ProductSalesApp extends JFrame {
    
    public ProductSalesApp() {
        setTitle("Product Sales Application");  // Window title
        setLayout(new FlowLayout());  // Just put stuff in a row
        
        // Make some buttons
        JButton loadBtn = new JButton("Load Product Data");
        JButton saveBtn = new JButton("Save Product Data");
        add(loadBtn);
        add(saveBtn);
        
        // Big text area for showing data
        JTextArea textArea = new JTextArea(10, 25);
        add(new JScrollPane(textArea));  // Add scroll bars
        
        // Labels to show the results
        add(new JLabel("Total Sales: 0"));
        add(new JLabel("Average Sales: 0"));
        add(new JLabel("Sales over limit: 0"));
        add(new JLabel("Sales under limit: 0"));
        add(new JLabel("Years Processed: 0"));
        
        pack();  // Make window fit everything
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Close button works
    }
    
    public static void main(String[] args) {
        // Start the program and show the window
        new ProductSalesApp().setVisible(true);
    }
}