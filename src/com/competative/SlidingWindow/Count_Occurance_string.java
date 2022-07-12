package com.competative.SlidingWindow;

import java.util.HashMap;

public class Count_Occurance_string {

    static int getOccuranceString(String str, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();

        int k = str2.length();
        int res = 0;

        // Occrance check
        for(int i=0; i<k; i++){
            char ch = str2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }

        int count = map.size();

        // Fist sliding window
        for(int i=0; i< k; i++){
            char ch1 = str.charAt(i);
            if(map.containsKey(ch1)) {
                map.put(ch1, map.get(ch1) - 1);
                if (map.get(ch1) == 0) {
                    count--;
                }
            }
            if(count == 0){
                res++;
            }
        }

        // remaining Occurance
        for( int j = k; j < str.length(); j++){
            char ch2 = str.charAt(j-k);

            //reset previous string which outside sliding window
            if(map.containsKey(ch2)){
                map.put(ch2, map.get(ch2)+ 1);
                if(map.get(ch2) == 1){
                    count++;
                }
            }
            // check occourunces of substring in string
            if(map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j)) - 1);
                if (map.get(str.charAt(j)) == 0) {
                    count--;
                }
            }
            if(count == 0){
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "forxxorfxdofr";
        String str2 = "for";
        System.out.println( getOccuranceString(str, str2));
    }
}
