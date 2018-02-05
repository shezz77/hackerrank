package Practice.CrackingInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by {Shehzada} on 05-Jan-17.
 */
public class RansomNote {
    public static void main(String[] args) {
        String s1 = "wi z ne we ebixk yvrd qrd ojckw q xe e bcco xb ieqym dwuu w dnapw achkt xqdhs nstms zmqu csqxi rim tvic arq fvjqx x su ty zl zmah y tv rkjq hpvpx ujj f i u fl iv n mnrvx tho diz k tidi gr ptkq z tho su diz yvrd dwuu dnapw xb arq xb mnrvx xe bcco qrd y ptkq rim fvjqx bcco q q wi i tidi gr mnrvx hpvpx tv f y mnrvx we fvjqx tv f wi ptkq ujj rim ebixk tho ptkq rkjq yvrd dwuu zl ujj zl qrd e ieqym";
        String s2 = "dwuu tvic y dnapw ujj tidi nstms x xe achkt x su zmqu iv zmqu xb ojckw we fvjqx tvic tv ne rkjq diz tvic we rkjq nstms zmah ieqym zmah fl xb wi tho x z ty u i gr ptkq q su tho rim tv iv iv yvrd xe qrd y dnapw q zmah arq we ieqym su zl q xb arq rkjq q e xb zl ty fvjqx ptkq ieqym qrd y wi wi nstms diz dnapw zmah q ebixk su e xb q i mnrvx wi x x tidi w ojckw bcco e tv rkjq tho";

        System.out.println(isRansom(s1, s2) ? "Yes" : "No");
    }

    public static boolean isRansom(String s1, String s2){
        boolean b = false;
        Map<String, Integer> mMap = new HashMap<>();
        Map<String, Integer> rMap = new HashMap<>();

        for (String word: s1.split(" ")){
            int count = mMap.containsKey(word) ? mMap.get(word) : 0;
            mMap.put(word, (count+1));
        }

        for (String word: s2.split(" ")){
            int count = rMap.containsKey(word) ? rMap.get(word) : 0;
            rMap.put(word, (count+1));
        }

        System.out.println(mMap.toString());
        System.out.println(rMap.toString());

        for (String s: rMap.keySet()){
            int mCount = mMap.containsKey(s) ? mMap.get(s) : 0;
            int rCount = rMap.containsKey(s) ? rMap.get(s) : 0;
            if (mCount == rCount){
                b= true;
            }else {
                b=false;
                break;
            }
        }

        return b;
    }
}
