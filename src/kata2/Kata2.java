package kata2;

import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] data = {1, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8, 8};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
}
