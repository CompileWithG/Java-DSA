import java.util.Scanner;

class Menu {
    public static void main(String[] args) {
        int n;
        System.out.println(
                "Enter 1. to get personal details/2.to get educational details/3.Tech Skills/4.Other Skills/5.Exit");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        switch (n) {
            case 1:
                System.out.println("RollNo:23BRS1156");
                System.out.println("name:Karthik Anish");
                System.out.println(
                        "Computer Science Engineering with specialization in Artifical intelligence and robotics");
                break;
            case 2:
                System.out.println("10th:Ryan Internation School");
                System.out.println("12th:Alpine Public School");
                break;
            case 3:
                System.out.println("Tech Skills:C,c++,python");
                break;
            case 4:
                System.out.println("other Skills:Table Tennis,Football,Weight lifting");
                break;
            case 5:
                break;
            default:
                System.out.println("invalid input");

        }
        obj.close();
    }
}