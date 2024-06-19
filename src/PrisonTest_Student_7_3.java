public class PrisonTest_Student_7_3 {
    private static int prisonerCount = 0;
    private int bookingNumber;

    public PrisonTest_Student_7_3() {
        prisonerCount++;
        bookingNumber = prisonerCount;
    }

    public void display() {
        System.out.println("Booking Number: " + bookingNumber);
        System.out.println("Prisoner Count: " + prisonerCount);
    }

    public static void main(String[] args) {
        PrisonTest_Student_7_3 prisoner1 = new PrisonTest_Student_7_3();
        PrisonTest_Student_7_3 prisoner2 = new PrisonTest_Student_7_3();
        PrisonTest_Student_7_3 prisoner3 = new PrisonTest_Student_7_3();

        System.out.println("Prisoner 1:");
        prisoner1.display();
        System.out.println();

        System.out.println("Prisoner 2:");
        prisoner2.display();
        System.out.println();

        System.out.println("Prisoner 3:");
        prisoner3.display();
        System.out.println();
    }
}

