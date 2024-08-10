import java.util.Scanner;

public class Students_Grade {
    public static void main(String[] args) {
        // declare mth101,chm101,phy101,sen181,gst101 and gst121 as integer variables.
        int mth101;
        int chm101;
        int phy101;
        int sen181;
        int gst101;
        int gst121;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String students_name = input.next();
        System.out.println("------------------------------------------");

        System.out.println("Enter the students score for mth101: ");
        mth101 = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.println("Enter the students score for chm101: ");
        chm101 = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.println("Enter the students score for phy101: ");
        phy101 = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.println("Enter the students score for sen181: ");
        sen181 = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.println("Enter the students score for gst101: ");
        gst101 = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.println("Enter the students score for gst121: ");
        gst121 = input.nextInt();
        System.out.println("------------------------------------------");

        if (mth101 >= 70) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(mth101);
            System.out.println("The students Grade for MTH101 is: ");
            System.out.println("A");
            System.out.println("**********************************************");
        } else if (mth101 >= 60) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(mth101);
            System.out.println("The students Grade for MTH101 is: ");
            System.out.println("B");
            System.out.println("**********************************************");
        } else if (mth101 >= 50) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(mth101);
            System.out.println("The students Grade for MTH101 is: ");
            System.out.println("C");
            System.out.println("**********************************************");
        } else if (mth101 >= 45) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(mth101);
            System.out.println("The students Grade for MTH101 is: ");
            System.out.println("D");
            System.out.println("**********************************************");
        } else if (mth101 >= 40) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(mth101);
            System.out.println("The students Grade for MTH101 is: ");
            System.out.println("E");
            System.out.println("**********************************************");
        } else {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(mth101);
            System.out.println("The students Grade for MTH101 is: ");
            System.out.println("F");
            System.out.println("**********************************************");
        }

        if (chm101 >= 70) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(chm101);
            System.out.println("The students Grade for CHM101 is: ");
            System.out.println("A");
            System.out.println("**********************************************");
        } else if (chm101 >= 60) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(chm101);
            System.out.println("The students Grade for CHM101 is: ");
            System.out.println("B");
            System.out.println("**********************************************");
        } else if (chm101 >= 50) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(chm101);
            System.out.println("The students Grade for CHM101 is: ");
            System.out.println("C");
            System.out.println("**********************************************");
        } else if (chm101 >= 45) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(chm101);
            System.out.println("The students Grade for CHM101 is: ");
            System.out.println("D");
            System.out.println("**********************************************");
        } else if (chm101 >= 40) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(chm101);
            System.out.println("The students Grade for CHM101 is: ");
            System.out.println("E");
            System.out.println("**********************************************");
        } else {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(chm101);
            System.out.println("The students Grade for CHM101 is: ");
            System.out.println("F");
            System.out.println("**********************************************");
        }

        if (phy101 >= 70) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(phy101);
            System.out.println("The students Grade for PHY101 is: ");
            System.out.println("A");
            System.out.println("**********************************************");
        } else if (phy101 >= 60) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(phy101);
            System.out.println("The students Grade for PHY101 is: ");
            System.out.println("B");
            System.out.println("**********************************************");
        } else if (phy101 >= 50) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(phy101);
            System.out.println("The students Grade for PHY101 is: ");
            System.out.println("C");
            System.out.println("**********************************************");
        } else if (phy101 >= 45) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(phy101);
            System.out.println("The students Grade for PHY101 is: ");
            System.out.println("D");
            System.out.println("**********************************************");
        } else if (phy101 >= 40) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(phy101);
            System.out.println("The students Grade for PHY101 is: ");
            System.out.println("E");
            System.out.println("**********************************************");
        } else {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(phy101);
            System.out.println("The students Grade for PHY101 is: ");
            System.out.println("F");
            System.out.println("**********************************************");
        }

        if (sen181 >= 70) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(sen181);
            System.out.println("The students Grade for SEN181 is: ");
            System.out.println("A");
            System.out.println("**********************************************");
        } else if (sen181 >= 60) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(sen181);
            System.out.println("The students Grade for SEN181 is: ");
            System.out.println("B");
            System.out.println("**********************************************");
        } else if (sen181 >= 50) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(sen181);
            System.out.println("The students Grade for SEN181 is: ");
            System.out.println("C");
            System.out.println("**********************************************");
        } else if (sen181 >= 45) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(sen181);
            System.out.println("The students Grade for SEN181 is: ");
            System.out.println("D");
            System.out.println("**********************************************");
        } else if (sen181 >= 40) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(sen181);
            System.out.println("The students Grade for SEN181 is: ");
            System.out.println("E");
            System.out.println("**********************************************");
        } else {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(sen181);
            System.out.println("The students Grade for SEN181 is: ");
            System.out.println("F");
            System.out.println("**********************************************");
        }

        if (gst101 >= 70) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst101);
            System.out.println("The students Grade for GST101 is: ");
            System.out.println("A");
            System.out.println("**********************************************");
        } else if (gst101 >= 60) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst101);
            System.out.println("The students Grade for GST101 is: ");
            System.out.println("B");
            System.out.println("**********************************************");
        } else if (gst101 >= 50) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst101);
            System.out.println("The students Grade for GST101 is: ");
            System.out.println("C");
            System.out.println("**********************************************");
        } else if (gst101 >= 45) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst101);
            System.out.println("The students Grade for GST101 is: ");
            System.out.println("D");
            System.out.println("**********************************************");
        } else if (gst101 >= 40) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst101);
            System.out.println("The students Grade for GST101 is: ");
            System.out.println("E");
            System.out.println("**********************************************");
        } else {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst101);
            System.out.println("The students Grade for GST101 is: ");
            System.out.println("F");
            System.out.println("**********************************************");
        }

        if (gst121 >= 70) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst121);
            System.out.println("The students Grade for GST121 is: ");
            System.out.println("A");
            System.out.println("**********************************************");
        } else if (gst121 >= 60) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst121);
            System.out.println("The students Grade for GST121 is: ");
            System.out.println("B");
            System.out.println("**********************************************");
        } else if (gst121 >= 50) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst121);
            System.out.println("The students Grade for GST121 is: ");
            System.out.println("C");
            System.out.println("**********************************************");
        } else if (gst121 >= 45) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst121);
            System.out.println("The students Grade for GST121 is: ");
            System.out.println("D");
            System.out.println("**********************************************");
        } else if (gst121 >= 40) {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst121);
            System.out.println("The students Grade for GST121 is: ");
            System.out.println("E");
            System.out.println("**********************************************");
        } else {
            System.out.println("**********************************************");
            System.out.println(students_name);
            System.out.println(gst121);
            System.out.println("The students Grade for GST121 is: ");
            System.out.println("F");
            System.out.println("**********************************************");
        }
    }
}