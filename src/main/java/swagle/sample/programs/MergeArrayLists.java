package swagle.sample.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeArrayLists {

    private static int arrList1_size = 0;
    private static int arrList2_size = 0;

    public static void main(String[] args) {
        System.out.println("Start-----");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ArrayList 1 size followed by elements");
        arrList1_size = scanner.nextInt();
        List<Integer> arrList1 =  new ArrayList<>();
        for (int i=0; i<arrList1_size; i++)
            arrList1.add(scanner.nextInt());

        System.out.println("Enter ArrayList 2 size followed by elements");
        arrList2_size = scanner.nextInt();
        List<Integer> arrList2 =  new ArrayList<>();
        for (int i=0; i<arrList2_size; i++)
            arrList2.add(scanner.nextInt());

        mergeArrayList(arrList1, arrList2);
    }

    private static void mergeArrayList(List<Integer> arrList1, List<Integer> arrList2) {

        for (int i=0; i<arrList2_size; i++) {
            arrList1.add(arrList2.get(i));
        }

        System.out.println("-----Arraylist after merge: " + arrList1);

        removeDuplicateElements(arrList1);

        sortArrayList(arrList1);
    }

    private static void sortArrayList(List<Integer> arrList1) {
        for (int i=0; i<arrList1.size(); i++) {
            for (int j=i+1; j<arrList1.size(); j++) {
                if (arrList1.get(i) > arrList1.get(j)) {
                    int temp = arrList1.get(i);
                    arrList1.set(i, arrList1.get(j));
                    arrList1.set(j, temp);
                }
            }
        }

        System.out.println("-----Sorted Arraylist: " + arrList1);
    }

    private static void removeDuplicateElements(List<Integer> arrList1) {
        int totalSize = arrList1_size + arrList2_size;
        List<Integer> duplicates = new ArrayList<>();
        int deplicateCount = 0;

        for (int i=0; i<totalSize; i++) {
            for (int j=i+1; j<totalSize; j++) {

                // compare each element with next all list elements
                if (arrList1.get(i) == arrList1.get(j)) {

                    int duplicate = arrList1.get(j);
                    boolean isPresent = false;

                    // if match found add to duplicates list, only if element not inserted before
                    for (int k=0; k<duplicates.size(); k++) {
                        if (duplicates.get(k) == duplicate) {
                            isPresent = true;
                            break;
                        }
                    }
                    if (!isPresent) {
                        duplicates.add(duplicate);
                        deplicateCount++;
                    }
                    arrList1.remove(duplicate);

                    // decrease size since element is removed --- this is required else it will throw error
                    totalSize--;
                }
            }
        }
        System.out.println("-----Arraylist after removing duplicates: " + arrList1);

        System.out.println("-----Duplicate Elements List: " + duplicates);

        System.out.println("-----Total number of duplicate elements: " + deplicateCount);
    }
}
