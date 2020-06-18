import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        DemoList demoList = new DemoList();
        int choice;

        do
        {
            System.out.println("1. Add Element.\n" +
                    "2. Get Element by Index.\n" +
                    "3. Get Index of the Element.\n" +
                    "4. Remove Element by Index.\n" +
                    "5. Remove First Element.\n" +
                    "6. Remove Last Element.\n" +
                    "7. Print List.\n" +
                    "0. Exit.\n");

            System.out.println("Enter Your Choice.");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter value.");
                    demoList.addElement(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter index.");
                    int value = demoList.printByPos(sc.nextInt());
                    System.out.println("Element is : " + value);
                    break;
                case 3:
                    System.out.println("Enter value.");
                    int index = demoList.getPos(sc.nextInt());
                    System.out.println("Index is : " + index);
                    break;
                case 4:
                    System.out.println("Enter index.");
                    demoList.remove(sc.nextInt());
                    break;
                case 5:
                    demoList.removeFromFirst();
                    break;
                case 6:
                    demoList.removeFromLast();
                    break;
                case 7:
                    demoList.printAll();
                    break;

                    default:
                        System.out.println("Invalid Option\nPlese enter a correct one\n");
                        break;
            }

        } while(choice != 0);
    }
}
