import java.util.*;

class Student{
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name;
    }
}

class AttendanceRecord {
    private String studentId;
    private String date;
    private String status; // "Present" or "Absent"

    public AttendanceRecord(String studentId, String date, String status) {
        this.studentId = studentId;
        this.date = date;
        this.status = status;
    }

    public String getStudentId() { return studentId; }
    public String getDate() { return date; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Date: " + date + ", Status: " + status;
    }
}
class AttendanceManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<AttendanceRecord> attendanceRecords = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadSampleData();

        while (true) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    markAttendance();
                    break;
                case 3:
                    viewAttendance();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    System.out.println("Thank you for using the system!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n=== Student Attendance Management System ===");
        System.out.println("1. Add Student");
        System.out.println("2. Mark Attendance");
        System.out.println("3. View Attendance");
        System.out.println("4. Generate Report");
        System.out.println("5. Exit");
        System.out.println("===========================================");
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        students.add(new Student(studentId, name));
        System.out.println("Student added successfully!");
    }

    private static void markAttendance() {
        if (students.isEmpty()) {
            System.out.println("No students available. Please add students first.");
            return;
        }

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.println("\nMarking attendance for date: " + date);
        for (Student student : students) {
            System.out.print("Is " + student.getName() + " (ID: " + student.getStudentId() + ") present? (Y/N): ");
            String response = scanner.nextLine();
            String status = response.equalsIgnoreCase("Y") ? "Present" : "Absent";

            attendanceRecords.add(new AttendanceRecord(student.getStudentId(), date, status));
        }
        System.out.println("Attendance marked successfully!");
    }

    private static void viewAttendance() {
        if (attendanceRecords.isEmpty()) {
            System.out.println("No attendance records available.");
            return;
        }

        System.out.println("\n=== Attendance Records ===");
        for (AttendanceRecord record : attendanceRecords) {
            System.out.println(record);
        }
    }

    private static void generateReport() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n=== Attendance Report ===");
        for (Student student : students) {
            int totalRecords = 0;
            int presentCount = 0;

            for (AttendanceRecord record : attendanceRecords) {
                if (record.getStudentId().equals(student.getStudentId())) {
                    totalRecords++;
                    if (record.getStatus().equals("Present")) {
                        presentCount++;
                    }
                }
            }

            double attendancePercentage = totalRecords > 0 ? (presentCount * 100.0 / totalRecords) : 0;
            System.out.printf("ID: %s, Name: %s, Attendance: %.1f%% (%d/%d)%n",
                    student.getStudentId(), student.getName(),
                    attendancePercentage, presentCount, totalRecords);
        }
    }

    private static int getIntInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

    private static void loadSampleData() {
        // Add some sample students
        students.add(new Student("S001", "Aryan"));
        students.add(new Student("S002", "Swayam"));
        students.add(new Student("S003", "Rahul"));

        // Add some sample attendance records
        attendanceRecords.add(new AttendanceRecord("S001", "2024-01-15", "Present"));
        attendanceRecords.add(new AttendanceRecord("S002", "2024-01-15", "Present"));
        attendanceRecords.add(new AttendanceRecord("S003", "2024-01-15", "Absent"));
    }
}