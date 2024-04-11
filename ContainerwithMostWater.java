import java.util.*;

public class ContainerWithMostWater {
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int length;
        int breadth;
        int Water;
        int MaxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                length = Math.min(height.get(i), height.get(j));
                breadth = j - i;
                Water = length * breadth;
                MaxWater = Math.max(MaxWater, Water);
            }
        }
        System.out.println(MaxWater);
    }
}
