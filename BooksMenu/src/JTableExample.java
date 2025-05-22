import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox and JTable Example");
        frame.setLayout(new BorderLayout());

        // Create data for the table
        String[] columns = {"ID", "Name", "Category"};
        String[][] books = {
                {"1", "Sherlock Holmes", "Mystery"},
                {"2", "Harry Potter", "Fantasy"},
                {"3", "Twilight", "Romance"},
                {"4", "Batman", "Action"}
        };

        // Create a JTable
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        // Create a JComboBox
        String[] categories = {"All", "Mystery", "Fantasy", "Romance", "Action"};
        JComboBox<String> comboBox = new JComboBox<>(categories);

        // Add ActionListener to JComboBox
        comboBox.addActionListener(e -> {
            String selectedCategory = (String) comboBox.getSelectedItem();
            model.setRowCount(0); // Clear existing rows
            for (String[] book : books) {
                if ("All".equals(selectedCategory) || book[2].equals(selectedCategory)) {
                    model.addRow(book); // Add rows that match the selected category
                }
            }
        });

        // Initialize table with all data
        comboBox.setSelectedItem("All");

        // Add components to frame
        frame.add(comboBox, BorderLayout.NORTH);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
