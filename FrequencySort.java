//sort by frequency of data
// Use the HashMap<String,Integer> to maintain your counts. 
// This will be the most efficient way to process the arbitrary list of strings.
// Create an ArrayList<Map.Entry<String,Integer>> from the map's entrySet().
// Sort this list using a Collections.sort() and a custom comparator
// you can solve this in two steps:
// 
// Create a counter object - a Map<String, Integer> listing for each string the number of times it appears 
// in the input: in other words, it's a frequency map. This is O(n), as you only need to traverse the input once for building the map
// With the previous map, create a list with its keys, sorted using the frequency of items (the values in the map) as ordering criteria.
// This is O(n log n), and you can call Collections.sort(), with a Comparator that uses the string frequency for the comparisons
String[] stringArray = {"x", "y", "z", "x", "x", "y", "a"};

final Map<String, Integer> counter = new HashMap<String, Integer>();
for (String str : stringArray)
    counter.put(str, 1 + (counter.containsKey(str) ? counter.get(str) : 0));

List<String> list = new ArrayList<String>(counter.keySet());
Collections.sort(list, new Comparator<String>() {
    @Override
    public int compare(String x, String y) {
        return counter.get(y) - counter.get(x);
    }
});