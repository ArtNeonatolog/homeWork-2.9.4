import java.util.*;

public class NewMap {

    private Random RANDOM = new Random();
    private final Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> addList () {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; list.size() < 3; i ++) {
            list.add(RANDOM.nextInt(1000));
        }
        return list;
    }

    public Set<Map.Entry <String, List<Integer>>> getMapEntries () {
        return map.entrySet();
    }

    public NewMap () {
        for (int i = 0; i < 5; i++) {
            map.put(String.valueOf(i), addList());
        }
    }

    public Map <String, Integer> transformedMap () {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            int sum = 0;
            for (Integer integer : entry.getValue()) {
                sum += integer;
            }
            result.put(entry.getKey(), sum);
        }
        return result;
    }

    @Override
    public String toString() {
        return
                "Рандомный мап" + map;
    }
}
