/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frequencycounter;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {
        
        String sentence = "ABACBB";
        HashMap<Character, Integer> frequency = new HashMap<>();

       
        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }
        }

       
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

}
