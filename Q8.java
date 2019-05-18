package kunal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kunal on 19-05-2019.
 */
public class Q8 {
    LinkedList<Integer> elements = new LinkedList<Integer>();
    int no_of_elements;
    Scanner scanner = new Scanner(System.in);
    int element;
    int position=-1;
    public void get_input() {
        System.out.println("Enter no of elements:");
        no_of_elements = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < no_of_elements; i++) {
            element = scanner.nextInt();
            elements.add(i, element);
        }
    }
    public void check_starting_point_of_loop() {
        for (int i = 0; i < no_of_elements; i++) {
            for (int j = i + 1; j < no_of_elements; j++) {
                if (elements.get(i).equals(elements.get(j))) {
                    position = j;
                }
            }
        }
    }
    public void print_result()
    {
        if(position==-1)
        {
            System.out.println("No circular linked list");
        }
        else {
            System.out.println("Circular list begins at position:" + position);
        }
    }

    public static void main(String[] args) {
        Q8 q8=new Q8();
        q8.get_input();
        q8.check_starting_point_of_loop();
        q8.print_result();
    }
}
