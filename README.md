# 📘 Book Category Viewer

A Java Swing desktop application for browsing and filtering book collections by category. Features a tabular interface with dynamic filtering, real-time count updates, and table management controls for efficient data exploration.

## 🎯 What I Built
- **Category-Based Filtering**: Filter books by genre (Mystery, Fantasy, Romance, Action)
- **Tabular Data Display**: Professional table interface with proper formatting
- **Real-Time Counting**: Dynamic display of filtered results count
- **Data Management**: Clear table functionality for data reset
- **Responsive UI**: Clean layout with intuitive controls and navigation

## ✨ Key Features
- 🔍 **Smart Filtering**: Dropdown filter to view books by specific categories or all books
- 📊 **Dynamic Table**: Automatically updates table contents based on filter selection
- 🔢 **Live Count Display**: Real-time counter showing number of filtered results
- 🗑️ **Clear Functionality**: One-click table clearing for data management
- 📋 **Professional Layout**: Structured table with ID, Title, and Category columns
- 🎨 **Modern Styling**: Clean fonts and proper row spacing for readability

## 🏗️ Project Architecture
```
src/
├── JTableExample.java    # Main application with table management and filtering
└── README.md            # Project documentation
```

### Core Components
- **Data Layer**: Static book array with structured data (ID, Title, Category)
- **View Layer**: JTable with DefaultTableModel for dynamic data display
- **Control Layer**: ComboBox filtering and button event handling

## 🔧 Implementation Details
- **Table Management**: DefaultTableModel for dynamic row addition/removal
- **Event Handling**: ActionListener implementations for filtering and clearing
- **Data Filtering**: String comparison logic for category-based filtering
- **UI Components**: JTable, JComboBox, JButton with proper layout management
- **Real-Time Updates**: Automatic counter updates with each filter operation

## 🚀 Getting Started
```bash
# Clone the repository
git clone https://github.com/AGButt04/Books-List.git

# Navigate to project directory
cd Books-List

# Compile the Java file
javac JTableExample.java

# Run the application
java JTableExample
```

**IDE Setup:**
1. Import the project into your Java IDE (IntelliJ IDEA, Eclipse, VS Code)
2. Ensure JDK 8+ is configured
3. Run `JTableExample.java` as the main class

## 🔧 Technologies & Concepts
- **Java SE** - Core programming language
- **Swing Framework** - Desktop GUI components (JTable, JComboBox, JScrollPane)
- **Event-Driven Architecture** - ActionListener pattern for user interactions
- **Data Structures** - 2D String arrays for structured data storage
- **Model-View Pattern** - DefaultTableModel for data representation
- **Lambda Expressions** - Modern Java syntax for event handling

## 💡 Technical Highlights
- **Dynamic Data Filtering**: Real-time table updates based on category selection
- **Memory Efficient Design**: Static data with dynamic view updates
- **Professional Table Formatting**: Custom fonts, row heights, and scrollable interface
- **Case-Insensitive Filtering**: Robust string comparison for category matching
- **Clean Event Handling**: Lambda expressions for concise ActionListener implementation

## 📖 Learning Outcomes
This project demonstrates proficiency in:
- **Table-Based UI Development**: Creating professional data display interfaces
- **Dynamic Content Management**: Real-time filtering and data manipulation
- **Event-Driven Programming**: Implementing responsive user controls
- **Data Presentation**: Structured display of information with proper formatting
- **User Interface Design**: Clean, intuitive controls with immediate feedback

## 🎮 Usage Instructions
1. **View All Books**: Select "All" from the dropdown to see the complete book collection
2. **Filter by Category**: Choose a specific category (Mystery, Fantasy, Romance, Action) to filter results
3. **Check Count**: View "Total: X" label to see the number of books displayed
4. **Clear Table**: Click the "Clear Table" button to empty the display
5. **Navigate Data**: Use scroll functionality for larger datasets

---
**Part of my programming portfolio** | [Github Profile](https://github.com/AGButt04) | [LinkedIn](https://www.linkedin.com/in/abdul-ghani-butt-290056338/)
