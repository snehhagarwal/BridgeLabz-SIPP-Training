package HashMap;

import java.util.*;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        List<int[]> result = findZeroSumSubarrays(arr);

        if (result.isEmpty()) {
            System.out.println("No subarray with zero sum found.");
        } else {
            System.out.println("Zero-sum subarrays (start to end indices):");
            for (int[] pair : result) {
                System.out.println(Arrays.toString(pair));
            }
        }
    }

    static List<int[]> findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        int sum = 0;
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);  // Handles case when subarray starts from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIdx : map.get(sum)) {
                    result.add(new int[]{startIdx + 1, i});
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }
}
