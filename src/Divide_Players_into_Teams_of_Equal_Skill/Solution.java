import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class Solution {
    public static void main(String[] args) {
        int[] test = {3,4,2,2};
        System.out.println(dividePlayers(test));
    }

    public static long dividePlayers(int[] skill) {
        List<Pair<Integer, Integer>> teams = new ArrayList<>();
        ConcurrentHashMap<Integer, Integer> frequency = new ConcurrentHashMap<>();
        int totalArraySum = 0;
        for (int i = 0; i < skill.length; i++) {
            totalArraySum += skill[i];
        }
        int sumOfTeam = totalArraySum / (skill.length / 2);
        for (int j : skill) {
            if (frequency.containsKey(sumOfTeam - j) && frequency.get(sumOfTeam - j) > 0) {
                Pair<Integer, Integer> team = new Pair<>(j, (sumOfTeam - j));
                teams.add(team);
                frequency.put(sumOfTeam - j, frequency.getOrDefault(sumOfTeam - j, 0) - 1);
            } else {
                frequency.put(j, frequency.getOrDefault(j, 0) + 1);
            }
        }
        if (teams.size() != skill.length / 2) return -1;
        long result = 0;
        for (Pair<Integer, Integer> team : teams) {
            result += ((long) team.getKey() * team.getValue());
        }
        return result;
    }
}
