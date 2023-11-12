import java.util.Scanner;

public class InstituteWebpage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Jawaharlal Darda Institute of Engineering and Technology, Yavatmal");
        while (true) {
            System.out.println("\nChoose a department to view information:");
            System.out.println("1. Computer Science Engineering");
            System.out.println("2. Electrical Engineering");
            System.out.println("3. Mechanical Engineering");
            System.out.println("4. Civil Engineering");
            System.out.println("5. Textile Engineering");
            System.out.println("6. Chemical Engineering");
            System.out.println("7. Electronics & Telecommunication Engineering");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    displayDepartmentInfo("Computer Science Engineering");
                    break;
                case 2:
                    displayDepartmentInfo("Electrical Engineering");
                    break;
                case 3:
                    displayDepartmentInfo("Mechanical Engineering");
                    break;
                case 4:
                    displayDepartmentInfo("Civil Engineering");
                    break;
                case 5:
                    displayDepartmentInfo("Textile Engineering");
                    break;
                case 6:
                    displayDepartmentInfo("Chemical Engineering");
                    break;
                case 7:
                    displayDepartmentInfo("Electronics & Telecommunication Engineering");
                    break;

                case 0:
                    System.out.println("Thank you for visiting!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }
    }

    private static void displayDepartmentInfo(String department) {
        System.out.println("Department: " + department);
        System.out.println("Faculty:");
        switch (department) {
            case "Computer Science Engineering":
                System.out.println("Dr. Dinesh N. Chaudhari (Professor & Head of Department)");
                System.out.println("Mr. Aditya P. Bakshi (Assistant Professor)");
                System.out.println("Mr. Mohit K. Popat (Assistant Professor)");
                System.out.println("Mrs. Sonali R. Waghe (Assistant Professor)");
                System.out.println("Mrs. Nikita Datta Chandure (Assistant Professor)");
                System.out.println("Clubs:");
                System.out.println("a. PACE Club: Benefits for Students: Students can improve their skills by taking involvement in various activities.");
                System.out.println("b. Computer Society of India (CSI)");
                break;
            case "Electrical Engineering":
                System.out.println("Dr. Pankaj M. Pandit (Associate Professor & HOD)");
                System.out.println("Mr. Anurag D. Borkhade (Assistant Professor)");
                System.out.println("Mr. Akash A. Gophane (Assistant Professor)");
                break;
            case "Mechanical Engineering":
                System.out.println("Dr. U . V. Kongre (Associate Professor & Head of Department)");
                System.out.println("Dr. R. U. Sambhe (Assistant Professor)");
                System.out.println("Dr. V. R. Gandhewar (Assistant Professor)");
                break;
            case "Civil Engineering":
                System.out.println("Mrs. R.N. Pantawane (Associate Professor & HOD)");
                System.out.println("Mr. A. R. Bansod (Assistant Professor)");
                System.out.println("Mr. S. N. Kitey (Assistant Professor)");
                break;
            case "Textile Engineering":
                System.out.println("Dr. Ganesh S. Kakad (Associate Professor & HOD)");
                System.out.println("Dr. Sandip K. Soni (Assistant Professor)");
                System.out.println("Dr. Ajay R. Rathod (Assistant Professor)");
                break;
            case "Chemical Engineering":
                System.out.println("Dr. AJAY PRABHAKARRAO PARDEY (Associate Professor & Head of Department)");
                System.out.println("Dr. SANJAY HARISHCHANDRA AMALEY (Assistant Professor)");
                System.out.println("Mr. PRAKASH RAMSINGH CHAVAN (Assistant Professor)");
            case "Electronics & Telecommunication Engineering":
                System.out.println("Mr. Umesh Wasudeorao Kaware(Associate Professor & Head of Department)");
                System.out.println("Dr. Pragati Damodhar Pawar(Assistant Professor)");
                System.out.println("Mr. Atul N. Shire(Assistant Professor)");
                break;
        }
    }
}
