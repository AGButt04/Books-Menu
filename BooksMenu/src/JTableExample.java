import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JTableExample {
    private static final String[][] books = {
        {"1", "Sherlock Holmes", "Mystery"},
        {"2", "Harry Potter", "Fantasy"},
        {"3", "Twilight", "Romance"},
        {"4", "Batman", "Action"},
        {"5", "The Hobbit", "Fantasy"}
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("📘 Book Category Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        String[] columns = {"ID", "Title", "Category"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        table.setRowHeight(24);

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel filterLabel = new JLabel("Filter by Category:");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"All", "Mystery", "Fantasy", "Romance", "Action"});
        JLabel countLabel = new JLabel("Total: 0");
        JButton clearBtn = new JButton("Clear Table");

        topPanel.add(filterLabel);
        topPanel.add(comboBox);
        topPanel.add(countLabel);
        topPanel.add(clearBtn);

        // Populate Table based on selection
        comboBox.addActionListener((ActionEvent e) -> {
            String selected = (String) comboBox.getSelectedItem();
            model.setRowCount(0);
            int count = 0;
            for (String[] book : books) {
                if ("All".equals(selected) || book[2].equalsIgnoreCase(selected)) {
                    model.addRow(book);
                    count++;
                }
            }
            countLabel.setText("Total: " + count);
        });

        // Clear table
        clearBtn.addActionListener(e -> {
            model.setRowCount(0);
            countLabel.setText("Total: 0");
        });

        // Initial Load
        comboBox.setSelectedItem("All");

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}