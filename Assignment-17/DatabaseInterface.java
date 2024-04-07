import java.sql.*;

public class DatabaseInterface {
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    static PreparedStatement pstmt = null;

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
            stmt = conn.createStatement();

            String query = "Select * from emp";

            // createTable();
            rs= stmt.executeQuery(query);

            boolean exit = false;
            while (!exit) {
                System.out.println("\nMenu:");
                System.out.println("1. Insert records");
                System.out.println("2. Display all records");
                System.out.println("3. Update a record");
                System.out.println("4. Delete a record");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(System.console().readLine());

                switch (choice) {
                    case 1:
                        insertRecords();
                        break;
                    case 2:
                        displayRecords();
                        break;
                    case 3:
                        updateRecord();
                        break;
                    case 4:
                        deleteRecord();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    static void createTable() throws SQLException {
        System.out.print("Enter table name: ");
        String tableName = System.console().readLine();

        System.out.print("Enter number of columns: ");
        int numColumns = Integer.parseInt(System.console().readLine());

        StringBuilder query = new StringBuilder("CREATE TABLE " + tableName + " (");
        for (int i = 0; i < numColumns; i++) {
            System.out.print("Enter column name: ");
            String columnName = System.console().readLine();

            System.out.print("Enter column type: ");
            String columnType = System.console().readLine();

            System.out.print("Enter column size: ");
            int columnSize = Integer.parseInt(System.console().readLine());

            query.append(columnName).append(" ").append(columnType).append("(").append(columnSize).append(")");
            if (i < numColumns - 1) {
                query.append(", ");
            }
        }
        query.append(")");

        stmt.executeUpdate(query.toString());
        System.out.println("Table created successfully.");
    }

    static void insertRecords() throws SQLException {
        System.out.print("Enter table name: ");
        String tableName = System.console().readLine();

        System.out.print("Enter number of records to insert: ");
        int numRecords = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < numRecords; i++) {
            System.out.println("Record " + (i + 1) + ":");
            StringBuilder query = new StringBuilder("INSERT INTO " + tableName + " VALUES (");
            ResultSetMetaData metaData = stmt.executeQuery("SELECT * FROM " + tableName).getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int j = 1; j <= columnCount; j++) {
                System.out.print("Enter value for " + metaData.getColumnName(j) + ": ");
                String value = System.console().readLine();
                query.append("'").append(value).append("'");
                if (j < columnCount) {
                    query.append(", ");
                }
            }
            query.append(")");
            stmt.executeUpdate(query.toString());
        }
        System.out.println(numRecords + " records inserted successfully.");
    }

    static void displayRecords() throws SQLException {
        System.out.print("Enter table name: ");
        String tableName = System.console().readLine();

        rs = stmt.executeQuery("SELECT * FROM " + tableName);
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + ": " + rs.getString(i) + "\t");
            }
            System.out.println();
        }
    }

    static void updateRecord() throws SQLException {
        System.out.print("Enter table name: ");
        String tableName = System.console().readLine();

        System.out.print("Enter column name to search by: ");
        String columnName = System.console().readLine();

        System.out.print("Enter value to search for: ");
        String searchValue = System.console().readLine();

        System.out.print("Enter column name to update: ");
        String updateColumnName = System.console().readLine();

        System.out.print("Enter new value: ");
        String newValue = System.console().readLine();

        String query = "UPDATE " + tableName + " SET " + updateColumnName + " = ? WHERE " + columnName + " = ?";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, newValue);
        pstmt.setString(2, searchValue);
        int rowsAffected = pstmt.executeUpdate();
        System.out.println(rowsAffected + " record(s) updated successfully.");
    }

    static void deleteRecord() throws SQLException {
        System.out.print("Enter table name: ");
        String tableName = System.console().readLine();

        System.out.print("Enter column name to search by: ");
        String columnName = System.console().readLine();

        System.out.print("Enter value to search for: ");
        String searchValue = System.console().readLine();

        String query = "DELETE FROM " + tableName + " WHERE " + columnName + " = ?";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, searchValue);
        int rowsAffected = pstmt.executeUpdate();
        System.out.println(rowsAffected + " record(s) deleted successfully.");
    }
}
