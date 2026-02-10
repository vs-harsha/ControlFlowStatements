package com.switchcases;

class GradeSwitch {

    static void grade(int marks) {

        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Grade A (90 - 100)");
                break;

            case 8:
                System.out.println("Grade B (80 - 89)");
                break;

            case 7:
                System.out.println("Grade C (70 - 79)");
                break;

            case 6:
                System.out.println("Grade D (60 - 69)");
                break;

            case 5:
                System.out.println("Grade E (50 - 59)");
                break;

            default:
                System.out.println("Fail (Below 50)");
        }
    }

    public static void main(String[] args) {
        grade(85);
        grade(72);
        grade(45);
    }
}
