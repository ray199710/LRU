import java.util.LinkedList;

public class LRUCache {
    public static void main(String[] args) {
        // ["A", "B", "E", "D", "C", "F", "A"]
        // e d c f a
        System.out.println("referfreUii jjjjj");
        String[] ans = lru(new String[]{"A", "B", "E", "D", "C", "F", "A", "B", "A"});
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static String[] lru(String[] input) {
        LinkedList<String> resList = new LinkedList<>();
        for (String value : input) {
            int index = isInArray(value, resList);
            if (index != -1) {
                resList.remove(index);
            } else {
                if (resList.size() > 4) resList.removeFirst();
            }
            resList.add(value);
        }

        return resList.toArray(new String[0]);
    }

    // 1 4 8 9 11

    // f(x, y)
    // isInArray(String[] strArr, String str)
    public static int isInArray(String s, LinkedList<String> a) {
        for (int j = 0; j < a.size(); j++) {
            if (s.equals(a.get(j))) return j;
        }
        return -1;

    }
}
