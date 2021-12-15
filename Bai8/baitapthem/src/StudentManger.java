import java.util.Scanner;

public class StudentManger {
    public static final String FEMALE = "F";
    public static final String MALE = "M";
    private Student[] students;


    public StudentManger() {
    }

    public StudentManger(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void getStudent(Scanner scanner){
        System.out.println("Nhập số lượng sinh viên:");
        int studentNum = scanner.nextInt();

        Student[] students = new Student[studentNum];
        for (int i = 0; i < students.length; i++) {
            students[i] = setStudent(scanner);
        }
         this.students = students;
    }

    public Student setStudent(Scanner scanner){
        scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi của sinh viên:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính của sinh viên:");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ của sinh viên:");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình của sinh viên:");
        double mediumCore = scanner.nextDouble();

        return new Student(name,age,gender,address,mediumCore);
    }

    public void displayStudents(Student[] students){
        for (Student student: students ) {
            System.out.println(student.toString());
        }
    }

    public void findMaxAndMinMediumStudent(Student[] students){
        double maxMediumCore = students[0].getMediumScore();
        double minMediumCore = students[0].getMediumScore();
        for (Student student: students) {
            if (maxMediumCore < student.getMediumScore())
                maxMediumCore = student.getMediumScore();
            if(minMediumCore > student.getMediumScore())
                minMediumCore = student.getMediumScore();
        }
        System.out.println("Những sinh viên có điểm trung bình cao nhất:");
        for (Student student: students) {
            if (maxMediumCore == student.getMediumScore())
                System.out.println(student);
        }
        System.out.println("Những sinh viên có điểm trung bình thấp nhất:");
        for (Student student: students) {
            if (minMediumCore == student.getMediumScore())
                System.out.println(student);
        }
    }

    public void addAStudent(Scanner scanner){
        Student [] newStudents = new Student[this.students.length+1];
        for (int i = 0; i < newStudents.length - 1; i++) {
            newStudents[i] = this.students[i];
        }
        newStudents[this.students.length] = setStudent(scanner);

        this.students = newStudents;
        displayStudents(newStudents);
    }

    public void deleteStudentByName(Scanner scanner){
        scanner.nextLine();
        System.out.println("Nhập tên sinh viên muốn xóa:");
        String deleteName = scanner.nextLine();
        int countSameName = 0;
        for (Student student: students) {
            if (student.getName().equals(deleteName)){
                countSameName++;
            }
        }
        if (countSameName!= 0){
            Student[] newStudents = new Student[this.students.length - countSameName];
            int index = 0;
            for (Student student: students) {
                if(!student.getName().equals(deleteName)){
                    newStudents[index] = student;
                    index++;
                }
            }
            this.students = newStudents;
            displayStudents(newStudents);
        } else {
            System.out.println("Không có sinh viên muốn xóa!");
        }
    }

    public void findStudentByName(Student[] students, Scanner scanner){
        scanner.nextLine();
        System.out.println("Nhập tên sinh viên muốn tìm:");
        String findName = scanner.nextLine();
        boolean checkName = false;
        for (Student student:students) {
            if(student.getName().equals(findName)){
                System.out.println(student);
                checkName = true;
            }
        }
        if(!checkName){
            System.out.println("Không có sinh viên muốn tìm");
        }
    }

    public void displayStudentByGender(Student[] students,Scanner scanner){
        int choice = -1;
        do {
            System.out.println("Hãy chọn giớ tính muốn hiển thị");
            System.out.println("1.Hiển thị tất cả sinh viên Nam");
            System.out.println("2.Hiển thị tất cả sinh viên Nữ");
            System.out.println("0.Exit");

            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Những sinh viên nữ:");
                    for (Student student:students) {
                        if (student.getGender().equals(FEMALE))
                            System.out.println(student);
                    }
                    break;
                case 2:
                    System.out.println("Những sinh viên nam:");
                    for (Student student:students) {
                        if (student.getGender().equals(MALE))
                            System.out.println(student);
                    }
                    break;
            }
        }while (choice !=0);

    }

    public void editStudentById(Student[] students,Scanner scanner){
        System.out.println("Nhập ID của sinh viên muốn sửa");
        int editId = scanner.nextInt();

        for (Student student: students) {
            if (student.getId() == editId){
                int choice = -1;
                do {
                    System.out.println("Lựa chọn thông tin muốn sửa:");
                    System.out.println("1.Sửa tên của sinh viên");
                    System.out.println("2.Sửa tuổi của sinh viên");
                    System.out.println("3.Sửa giới tính của sinh viên");
                    System.out.println("4.Sửa địa chỉ của sinh viên");
                    System.out.println("5.Sửa điểm trung bình của sinh viên");
                    System.out.println("0.Exit");
                    choice = scanner.nextInt();

                    switch (choice){
                        case 1:
                            scanner.nextLine();
                            System.out.println("Nhập lại tên của sinh viên");
                            String name = scanner.nextLine();
                            student.setName(name);
                            break;
                        case 2:
                            scanner.nextLine();
                            System.out.println("Nhập lại tuổi của sinh viên");
                            int age = scanner.nextInt();
                            student.setAge(age);
                            break;
                        case 3:
                            scanner.nextLine();
                            System.out.println("Nhập lại giới tính của sinh viên");
                            String gender = scanner.nextLine();
                            student.setGender(gender);
                            break;
                        case 4:
                            scanner.nextLine();
                            System.out.println("Nhập lại địa chỉ của sinh viên");
                            String address = scanner.nextLine();
                            student.setAddress(address);
                            break;
                        case 5:
                            scanner.nextLine();
                            System.out.println("Nhập lại điểm trung bình của sinh viên");
                            double mediumCore = scanner.nextDouble();
                            student.setMediumScore(mediumCore);
                            break;
                    }
                }while (choice !=0);
            }
        }
        this.students = students;
        displayStudents(students);
    }
}
