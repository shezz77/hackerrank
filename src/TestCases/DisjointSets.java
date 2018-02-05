package TestCases;

import java.util.*;

public class DisjointSets
{
    public List<Map<Integer, Set<Integer>>> disjointSet;

    public DisjointSets()
    {
        disjointSet = new ArrayList<>();
    }

    public void create_set(int element)
    {
        Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
        Set<Integer> set = new HashSet<Integer>();
        set.add(element);
        map.put(element, set);
        disjointSet.add(map);
    }

    public void union(int first, int second)
    {
        int first_rep = find_set(first);
        int second_rep = find_set(second);

        Set<Integer> first_set = null;
        Set<Integer> second_set = null;

        for (int index = 0; index < disjointSet.size(); index++)
        {
            Map<Integer, Set<Integer>> map = disjointSet.get(index);
            if (map.containsKey(first_rep))
            {
                first_set = map.get(first_rep);
            } else if (map.containsKey(second_rep))
            {
                second_set = map.get(second_rep);
            }
        }

        if (first_set != null && second_set != null)
            first_set.addAll(second_set);

        for (int index = 0; index < disjointSet.size(); index++)
        {
            Map<Integer, Set<Integer>> map = disjointSet.get(index);
            if (map.containsKey(first_rep))
            {
                map.put(first_rep, first_set);
            } else if (map.containsKey(second_rep))
            {
                map.remove(second_rep);
                disjointSet.remove(index);
            }
        }

        return;
    }

    public int find_set(int element)
    {
        for (int index = 0; index < disjointSet.size(); index++)
        {
            Map<Integer, Set<Integer>> map = disjointSet.get(index);
            Set<Integer> keySet = map.keySet();
            for (Integer key : keySet)
            {
                Set<Integer> set = map.get(key);
                if (set.contains(element))
                {
                    return key;
                }
            }
        }
        return -1;
    }

    public int getNumberofDisjointSets()
    {
        return disjointSet.size();
    }

    public static void main(String... arg)
    {
        DisjointSets disjointSet = new DisjointSets();

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int ans = 0;

        while (q-- > 0){
            int numberOfStd = sc.nextInt();
            for (int i = 1; i <= numberOfStd; i++)
            {
                disjointSet.create_set(i);
            }

            int numberOfRel =sc.nextInt();
            while (numberOfRel-- > 0){
                int std1 = sc.nextInt();
                int std2 = sc.nextInt();

                int result = 0;
                disjointSet.union(std1, std2);
                int max = 0;
                for (Map<Integer, Set<Integer>> map: disjointSet.disjointSet){
                    for (Set<Integer> set: map.values()){
                        max = Math.max(set.size(), max);
                    }
                }
                System.out.println("Max in func" + max);

                result = max * (max-1);
                ans += result;
                System.out.println(result);

            }

        }

        System.out.println(ans);

    }

}