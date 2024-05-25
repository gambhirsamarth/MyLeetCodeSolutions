class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c,1);

        }

        List<Character> sorted= new ArrayList<>(map.keySet());


        // Sort the ArrayList in descending order of frequency using a custom comparator
        /* For example, if map.get(a) = 2 and map.get(b) = 5, then the lambda expression map.get(b) - map.get(a) will return a value of 3, which means that b should come before a in the sorted list. */

        Collections.sort(sorted, (a,b) -> map.get(b)-map.get(a));


        String t="";
        for(int i=0;i<sorted.size();i++){
            char d= sorted.get(i);
            for(int j=0; j<map.get(d);j++){
                t+=d;
            }
        }
return t;

    }

}
