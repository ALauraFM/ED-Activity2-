import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List list = new List();
        list.List();
        int option;
        do {
            System.out.println("Choose an option:");
            System.out.println("""
                    1-)Verify the list is empty
                    2-)Insert an element
                    3-)Obtain a position or element
                    4-)Modify an element
                    5-)Obtain the size of the list
                    6-)Remove an element
                    7-)Print the list
                    8-)Leave
                    """);
            option = sc.nextInt();

            switch (option) {

                case 1:
                    if (list.emptyList()) {
                        System.out.println("The list is empty");
                    } else {
                        System.out.println("The list is filled");
                    }
                    break;

                case 2:
                    System.out.println("Type the element and position you would like to insert the element");
                    System.out.println("Element");
                    int element1 = sc.nextInt();
                    System.out.println("Position");
                    int position1 = sc.nextInt();

                    if(position1 == 1){
                        list.insertBeginning(element1);
                    }else if(position1 == list.getSize()){
                        list.insertEnd(element1);
                    }else{
                        list.insertMiddle(element1, position1);
                    }
                    break;

                case 3:
                    System.out.println("""
                            Would you like to know:  
                            a)The element, by saying the position
                            b)The position, by saying the element
                            """);
                    char answer = sc.next().charAt(0);
                    if (answer == 'a') {
                        System.out.println("Type the position you would like to know the element:");
                        int element = sc.nextInt();
                        System.out.println(list.obtainPosition(element));
                    } else {
                        System.out.println("Type the element you would like to know the position:");
                        int element = sc.nextInt();
                        System.out.println(list.obtainElement(element));
                    }
                    break;

                case 4:
                    System.out.println("Type the element and position you would like to chance:");
                    System.out.println("Element");
                    int element = sc.nextInt();
                    System.out.println("Position");
                    int position = sc.nextInt();
                    System.out.println(list.modify(element, position));
                    break;

                case 5:
                    System.out.println(list.getSize());
                    break;

                case 6:
                    System.out.println("Type the position you would like to remove");
                    int position2 = sc.nextInt();
                    if(position2 == 1){
                        System.out.println(list.removeBeginning(position2));
                    }else{
                        System.out.println(list.removeMiddle(position2));
                    }
                    break;
                case 7:
                    System.out.println(list.showList());
                    break;
            }
        }while(option != 8);
    }
}