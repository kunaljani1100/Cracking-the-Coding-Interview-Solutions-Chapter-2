package kunal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kunal on 18-05-2019.
 */
public class Q6 {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Integer> linkedList = new LinkedList<>();
    int element;
    int no_of_elements;
    boolean flag = true;
    public void get_input() {
        System.out.println("Enter number of elements in the linked list:");
        no_of_elements = scanner.nextInt();
        System.out.println("Enter elements in the linked list:");
        for (int i = 0; i < no_of_elements; i++) {
            element = scanner.nextInt();
            linkedList.add(i, element);
        }
    }
    public void check_palindrome() {
        for (int i = 0; i < linkedList.size()/2; i++) {
            //if any of the elements are not matching, flag is false else flag is true.
            if (!linkedList.get(i).equals(linkedList.get(linkedList.size() - 1 - i))) {
                flag = false;
                break;
            }
        }
    }
    public void print_result(){
        if(flag)
        {
            System.out.println("The linked list is a palindrome.");
        }
        else
        {
            System.out.println("The linked list is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Q6 q6=new Q6();
        q6.get_input();
        q6.check_palindrome();
        q6.print_result();
    }
}
