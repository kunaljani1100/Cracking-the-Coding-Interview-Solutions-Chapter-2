package kunal;

import java.util.LinkedList;
import java.util.Scanner;
import java.lang.*;

/**
 * Created by kunal on 18-05-2019.
 */
public class Q5 {
    Scanner scanner=new Scanner(System.in);
    LinkedList<Integer> linkedList=new LinkedList<>();
    LinkedList<Integer> linkedList1=new LinkedList<>();
    LinkedList<Integer> linkedList2=new LinkedList<>();
    int no_of_elements,no_of_elements1;
    public void get_input() {
        System.out.println("Enter no of elements in first linked list:");
        no_of_elements = scanner.nextInt();
        System.out.println("Enter no of elements in next linked list:");
        no_of_elements1 = scanner.nextInt();
        System.out.println("Enter elements in first linked list:");
        int element;
        for (int i = 0; i < no_of_elements; i++) {
            element = scanner.nextInt();
            linkedList.add(i, element);
        }
        System.out.println("Enter elements in next linked list:");
        for (int i = 0; i < no_of_elements1; i++) {
            element = scanner.nextInt();
            linkedList1.add(i, element);
        }
    }
    public void calculate_linked_list_sum() {
        int number = 0, number1 = 0;
        for (int i = 0; i < no_of_elements; i++) {
            number = number + linkedList.get(i) * (int) Math.pow(10, i);
        }
        for (int i = 0; i < no_of_elements1; i++) {
            number1 = number1 + linkedList1.get(i) * (int) Math.pow(10, i);
        }
        //converting the digits in a linked list into a number.
        int number2 = number + number1;//adding the number
        int i = 0;
        while (number2 != 0) {//storing the digits in the linked list
            int digit = number2 % 10;
            linkedList2.add(i, digit);
            number2 = number2 / 10;
            i++;
        }
    }
    public void print_final_list() {
        System.out.println("Final linked list:");//printing out the final list.
        for (int j = 0; j < linkedList2.size(); j++) {
            System.out.println(linkedList2.get(j) + " ");
        }
    }

    public static void main(String[] args) {
        Q5 q5=new Q5();
        q5.get_input();
        q5.calculate_linked_list_sum();
        q5.print_final_list();
    }
}
