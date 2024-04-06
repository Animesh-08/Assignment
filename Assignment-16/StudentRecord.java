import java.io.*;

public class StudentRecord {

    public static void writeRecord(int rollNo, String name) {
        try (FileOutputStream fos = new FileOutputStream("student.txt", true)) {
            String recordString = rollNo + "," + name + "\n";
            byte[] bytes = recordString.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readRecords() {
        try (FileInputStream fis = new FileInputStream("student.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                String recordString = new String(buffer, 0, bytesRead);
                System.out.print(recordString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchRecord(int rollNo) {
        try (BufferedReader br = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int rNo = Integer.parseInt(parts[0]);
                if (rNo == rollNo) {
                    System.out.println("Record found: " + line);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Record not found for roll no: " + rollNo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Writing records to the file
        writeRecord(1, "Anand");
        writeRecord(18, "Bikash");
        writeRecord(7, "Akash");

        // Reading all records from the file
        System.out.println("All records:");
        readRecords();

        // Taking user input for searching a record by roll number
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("\nEnter roll number to search: ");
            int rollNumber = Integer.parseInt(reader.readLine());
            System.out.println("Searching record for roll no " + rollNumber + ":");
            searchRecord(rollNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}