import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]) {
        int arr[] = { 3, 2, 4 };
        int k = 6;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(k - arr[i])) {
                System.out.println(h.get(k - arr[i]) + "," + i);
                break;
            }
            h.put(arr[i], i);
        }

    }
}
