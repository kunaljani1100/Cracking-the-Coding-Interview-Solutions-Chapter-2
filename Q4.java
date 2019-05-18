package kunal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kunal on 12-05-2019.
 */
public class Q4 {
    LinkedList<Integer> linkedList = new LinkedList<>();
    LinkedList<Integer> linkedList2 = new LinkedList<>();
    int no_of_elements, temporary_location1 = 0, temporary_location2 = 0, tmp1 = 0, tmp2 = 0;
    Scanner scanner = new Scanner(System.in);
    int element;
    int partition_index;
    public void get_input()
    {
        System.out.println("Enter number of elements to be entered in the linked list.");
        no_of_elements = scanner.nextInt();

        System.out.println("Enter the elements to be entered in the linked list:");
        for (int i = 0; i < no_of_elements; i++) {
            element = scanner.nextInt();
            linkedList.add(element);
        }
        System.out.println("Enter partition index:");
        partition_index = scanner.nextInt();
    }
    public void do_partition() {
        for (int k = 0; k < no_of_elements; k++)
        {
            for (int i = 0; i < no_of_elements; i++)
            {
                if (linkedList.get(i) < linkedList.get(partition_index) && i > partition_index)
                {  //If element is located at the left of partition and greater than value at partition index, then shift
                    //element to the end.
                    int buffer = linkedList.get(i);
                    linkedList.remove(i);
                    linkedList.add(0, buffer);
                    partition_index++;
                    i++;
                }
                if (linkedList.get(i) > linkedList.get(partition_index) && i < partition_index)
                {
                    //If element is located at the right of partition and less than value at partition index, then shift
                    //element to the start.
                    int buffer = linkedList.get(i);
                    linkedList.remove(i);
                    linkedList.add(no_of_elements - 1, buffer);
                    partition_index--;
                    i--;
                }
                //Printing the list after each iteration.
                for (int j = 0; j < no_of_elements; j++)
                {
                    System.out.print(linkedList.get(j) + " ");
                }
                System.out.println("\n");
                System.out.println("Partition index:" + partition_index + "\n");
            }
            //printing out the final list
            System.out.println("Linked list after partition:");
            for (int i = 0; i < no_of_elements; i++)
            {
                System.out.println(linkedList.get(i));
            }
        }
    }
    public static void main(String []args)
    {
        Q4 q4=new Q4();
        q4.get_input();
        q4.do_partition();
    }
}