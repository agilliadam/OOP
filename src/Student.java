import java.util.Random;

public class Student {


    private String firstname;
    private String lastname;
    private int batchNo;
    private boolean isOnCampus;
    private String studentID;
    private String subjects;
    private final String SCHOOL_NAME = "Duotech";
    private int numberOfStudentsCreated = 0;
    private int tuitionBalance;


    public Student() {
    }

    public Student(String firstName, String lastName, int batchNo, boolean isOnCampus) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.batchNo = batchNo;
        generateStudentID();
        this.studentID = generateStudentID();
        this.tuitionBalance = getTuitionBalance();

    }

    public int getTuitionBalance() {
        if (isOnCampus = true) {
            int tuitionBalance = 5000;
        } else if (isOnCampus = false) {
            int tuitionBalance = 4000;
        }
        return tuitionBalance;
    }

    public String generateStudentID() {
        //generate initials (first letter of the firstName+first letter of the lastname

        String initials = firstname.substring(0, 1) + lastname.substring(0, 1);

        //generate random 3digit number
        int random3numbers = 100 + (int) (Math.random() * ((999 - 100) + 1));

        String studentID = initials + "5" + random3numbers;
        return studentID;
    }
    public String[] getSubjects () {
        String[] SUBJECTS = {"Java", "HTML", "Selenium", "Cucumber", "RestAssured", "SQL"};
        return SUBJECTS;
    }
    public int payTuition() {
        int amountPayed=500;
        int  newBalance=tuitionBalance-amountPayed;
        if (newBalance>amountPayed) {
            System.out.println("The new balance is $" + newBalance);
        }else if (newBalance==0) {
            System.out.println("Tuition is paid off");
        }else if (newBalance<amountPayed)  {

            System.out.println("The tuition is paid off. A credit of "+ (newBalance*(-1)+"dollars is applied to this account."));

    }return 0;
        }


public void getStudentInfo() {
    String student = "John Doe";
    String SCHOOL_NAME = " Duotech";
    boolean isOnCampus = true;
    String studentID = generateStudentID();

    //System.out.println( "STUDENT: " +student+"\t SCHOOL: "+SCHOOL_NAME+"\t BATCH: 5 \t ON-CAMPUS: "+isOnCampus+"\t STUDENT ID: "+studentID+
//          SCHOOL: Duotech
//          BATCH: 5
//          STUDENT ID: JE5031ON-CAMPUS: yes
//
//          SUBJECTS: [Java, HTML, Selenium, Cucumber, RestAssured, SQL]
//          TUITION BALANCE: 1500);
//        String firstname,String lastname,String SCHOOL_NAME,int batchNo, String studentID,boolean isOnCampus,String subjects,int tuitionBalance

}
//          STUDENT: John Doe
//          SCHOOL: Duotech
//          BATCH: 5
//          STUDENT ID: JE5031
//          ON-CAMPUS: yes
//          SUBJECTS: [Java, HTML, Selenium, Cucumber, RestAssured, SQL]
//          TUITION BALANCE: 1500
}
//    Constructors:
//   - no-arg constructor that initializes fields to default values.
//   - constructor that initializes firstName , lastName, batchNo, isOnCampus. Besides that it needs to do the following:
//      - initializes studentId using generateStudentID() method.
//      - initializes tuitionBalance to 5000 if student isOnCampus, otherwise to 4000.
//   Methods: (You will need to determine which ones are static and which ones are instance)
//     - generateStudentID() - returns a unique student id using the following combination:
//       first letter of the first name +  last letter of the last name + batchNo + random 3 digit number
//       Example: John Doe, Batch 5 -> JE5031 (3 digit random number should allow combinations like 031)
//     - getStudentInfo() - returns the following information about the student in this format:
//          STUDENT: John Doe
//          SCHOOL: Duotech
//          BATCH: 5
//          STUDENT ID: JE5031
//          ON-CAMPUS: yes
//          SUBJECTS: [Java, HTML, Selenium, Cucumber, RestAssured, SQL]
//          TUITION BALANCE: 1500
//     - getSubjects() - returns all subjects in this format: [Java, HTML, Selenium, Cucumber, RestAssured, SQL]
//     - payTuition() - accepts an amount and deducts the amount from the tuitionBalance and displays the message  about the new balance,
//     e.g tuitionBalance is 4000 and you pay 500 and balance becomes 3500,  -> "The new balance is $3500".
//     If the balance becomes exactly 0, display the message -> "The tuition is paid off."
//     If the amount is greater than the tution balance and balance goes negative, e.g tuitionBalance is 400 and you pay 800 and balance becomes -400, display the message  ->
//     "The tuition is paid off. A credit of 400 dollars is applied to this account."
//B. In the Main class:
//   Create an application in the main method that does the following:
//  -Asks the user to enter the information about a new student to be added (use next() method to obtain the Strings)
//  -Once the information is received, creates a new student and displays information about the new student
//  -Asks the user to enter the tuition payment amount
//  -Displays the new balance after the payment
//  -Displays the amount of students created
//  -Asks the user if he/she would like to add another student. If yes, the entire process repeats again, until the answer is no (hint: use do-while). When the answer is no, the application ends with goodbye message.
//   Please refer to the attached pdf for examples of console output.