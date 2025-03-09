public class Student {
    String studentName;
    int studentRollNumber;
    int studentMarks;

    public Student(String name, int rollNumber, int marks) {
        this.studentName = name;
        this.studentRollNumber= rollNumber;
        this.studentMarks = marks;
    }


    public void getStudentName(){
        System.out.println("Student name is: "+studentName);
    }

    public void getStudentRollNumber(){
        System.out.println("Student roll number is: "+studentRollNumber);
    }

    public void getStudentMarks(){
        System.out.println("Student marks is: "+studentMarks);
    }

    public String calculateGrade() {
        if (studentMarks >= 90) {
            return "A+";
        } else if (studentMarks >= 80) {
            return "A";
        } else if (studentMarks >= 70) {
            return "B";
        } else if (studentMarks >= 60) {
            return "C";
        } else if (studentMarks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + studentRollNumber);
        System.out.println("Marks: " +studentMarks);
        System.out.println("Grade: " + calculateGrade());
    }
     

    public static void main(String[] args) {
        Student student1 = new Student("Naman Malhotra",2110990913, 90);
        student1.displayDetails();
    }
}


// Output
// Student Name: Naman Malhotra
// Roll Number: 2110990913
// Marks: 90
// Grade: A+