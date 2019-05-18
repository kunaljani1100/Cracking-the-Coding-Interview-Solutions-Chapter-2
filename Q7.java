package kunal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kunal on 19-05-2019.
 */
public class Q7 {
    LinkedList<Integer> addresses1 = new LinkedList<Integer>();
    LinkedList<Integer> elements1=new LinkedList<Integer>();
    int no_of_elements1;
    LinkedList<Integer> addresses2 = new LinkedList<Integer>();
    LinkedList<Integer> elements2=new LinkedList<Integer>();
    int no_of_elements2;
    int element;
    boolean doesIntersect=false;
    Scanner scanner=new Scanner(System.in);
    public void get_input() {
        System.out.println("Enter no of elements in first linked list:");
        {
            no_of_elements1 = scanner.nextInt();
        }
        System.out.println("Enter no of elements in second linked list:");
        {
            no_of_elements2 = scanner.nextInt();
        }
        System.out.println("Enter addresses of first linked list:");
        for (int i = 0; i < no_of_elements1; i++) {
            element = scanner.nextInt();
            addresses1.add(i, element);
        }
        System.out.println("Enter elements of first linked list:");
        for (int i = 0; i < no_of_elements1; i++) {
            element = scanner.nextInt();
            elements1.add(i, element);
        }
        System.out.println("Enter addresses of second linked list:");
        for (int i = 0; i < no_of_elements2; i++) {
            element = scanner.nextInt();
            addresses2.add(i, element);
        }
        System.out.println("Enter elements of second linked list:");
        for (int i = 0; i < no_of_elements2; i++) {
            element = scanner.nextInt();
            elements2.add(i, element);
        }
    }
    /*If any address in the first linked list matched any address in the second linked list, then the lists will intersect,
    else the lists will not intersect.
     */
    public void check_intersection() {
        for (int i = 0; i < no_of_elements1; i++) {
            for (int j = 0; j < no_of_elements2; j++) {
                if (addresses1.get(i) == addresses2.get(j)) {
                    doesIntersect = true;
                    break;
                }
            }
            if (doesIntersect) {
                break;
            }
        }
    }
    public void print_result(){
        if(doesIntersect)
        {
            System.out.println("The lists intersect.");
        }
        else
        {
            System.out.println("The lists do not intersect.");
        }
    }

    public static void main(String[] args) {
        Q7 q7=new Q7();
        q7.get_input();
        q7.check_intersection();
        q7.print_result();
    }
}