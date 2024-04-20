import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String args[]) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> all = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            all.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            all.add(arr2[i]);

        }
        System.out.println(all.size());
        all.clear();
        for (int i = 0; i < arr1.length; i++) {
            all.add(arr1[i]);

        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (all.contains(arr2[i])) {
                count++;
                all.remove(arr2[i]);
            }
        }
        System.out.println(count);

    }
}
