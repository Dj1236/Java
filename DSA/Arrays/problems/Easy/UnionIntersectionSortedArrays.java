package DSA.Arrays.problems.Easy;

import java.util.ArrayList;
import java.util.List;

public class UnionIntersectionSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        List<Integer> unionResult = findUnion(arr1, arr2);
        List<Integer> intersectionResult = findIntersection(arr1, arr2);

        System.out.print("Union: ");
        for (int num : unionResult) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Intersection: ");
        for (int num : intersectionResult) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to find the union of two sorted arrays
    static List<Integer> findUnion(int[] arr1, int[] arr2) {
        List<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                unionList.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                unionList.add(arr2[j]);
                j++;
            } else {
                unionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < arr1.length) {
            unionList.add(arr1[i]);
            i++;
        }

        // Add remaining elements of arr2
        while (j < arr2.length) {
            unionList.add(arr2[j]);
            j++;
        }

        return unionList;
    }

    // Method to find the intersection of two sorted arrays
    static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersectionList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                intersectionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        return intersectionList;
    }
}

