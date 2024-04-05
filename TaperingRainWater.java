public class RainwaterTappering {
    public static int Finding(int heights[]) {
        int TapperedWater = 0;
        int LeftMax[] = new int[heights.length];
        int RightMax[] = new int[heights.length];
        LeftMax[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            LeftMax[i] = Math.max(LeftMax[i - 1], heights[i]);
        }
        RightMax[heights.length - 1] = heights[heights.length - 1];
        for (int i = heights.length - 2; i >= 0; i--) {
            RightMax[i] = Math.max(heights[i], RightMax[i + 1]);
        }
        for (int i = 0; i < heights.length; i++) {
            int waterlevel = Math.min(RightMax[i], LeftMax[i]);
            TapperedWater = TapperedWater + (waterlevel - heights[i]);
        }
        return TapperedWater;
    }

    public static void main(String args[]) {
        int heights[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(Finding(heights));
    }
}
