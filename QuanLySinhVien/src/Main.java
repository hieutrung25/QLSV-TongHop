import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentManagement studentManagement = new StudentManagement();
        do {
            int choice = -1;
            int option = -1;
            customerManagementMenu();
            int choice1 = studentManagement.checkInputType(choice);
            switch (choice1) {
                case 1:
                    studentManagement.addStudent();
                    break;
                case 2:
                    searchingMenu();
                    int option1 = studentManagement.checkInputType(option);
                    switch (option1) {
                        case 1:
                            studentManagement.searchStudentById();
                            studentManagement.displaySearchList();
                            break;
                        case 2:
                            studentManagement.searchStudentByName();
                            studentManagement.displaySearchList();
                            break;
                        case 3:
                            studentManagement.searchStudentByAgeRange();
                            studentManagement.displaySearchList();
                            break;
                        case 4:
                            studentManagement.searchStudentByScoreMediumRange();
                            studentManagement.displaySearchList();
                            break;
                        default:
                            System.out.println("Invalid!");
                    }
                    break;
                case 3:
                    studentManagement.sort();
                    break;
                case 4:
                    List<Student> studentList = studentManagement.searchStudentById();
                    if (studentList == null) {
                        System.out.println("No information!");
                    } else {
                        Student student = studentList.get(0);
                        studentManagement.displaySearchList();
                        editingMenu();
                        option1 = studentManagement.checkInputType(option);
                        switch (option1) {
                            case 1:
                                studentManagement.editID(student);
                                break;
                            case 2:
                                studentManagement.editName(student);
                                break;
                            case 3:
                                studentManagement.editBirthDay(student);
                                break;
                            case 4:
                                studentManagement.editGender(student);
                                break;
                            case 5:
                                studentManagement.editAddress(student);
                                break;
                            case 6:
                                studentManagement.editEmail(student);
                                break;
                            case 7:
                                studentManagement.editScore(student);
                                break;
                            case 8:
                                studentManagement.editInformation(student);
                                break;
                            default:
                                System.out.println("Invalid!");
                        }
                    }
                    break;
                case 5:
                    studentManagement.display();
                    break;
                case 6:
                    studentManagement.deleteStudentById();
                    ;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Errol input, re input (0-6):");
            }
        } while (true);
    }

    static void customerManagementMenu() {
        System.out.println("Student Management");
        System.out.println("1. Add student");
        System.out.println("2. Search student");
        System.out.println("3. Sort student");
        System.out.println("4. Edit student");
        System.out.println("5. Display list student");
        System.out.println("6. Delete student");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    static void searchingMenu() {
        System.out.println("Searching menu");
        System.out.println("1. Search student by ID");
        System.out.println("2. Search student by name");
        System.out.println("3. Search student by age");
        System.out.println("4. Search student by scoreMedium");
        System.out.print("Enter your option: ");
    }

    static void editingMenu() {
        System.out.println("Editing menu");
        System.out.println("1. Edit ID");
        System.out.println("2. Edit name");
        System.out.println("3. Edit birthday");
        System.out.println("4. Edit gender");
        System.out.println("5. Edit address");
        System.out.println("6. Edit email");
        System.out.println("7. Edit scoreMedium");
        System.out.println("8. Edit whole information");
        System.out.print("Enter your option: ");
    }
}
