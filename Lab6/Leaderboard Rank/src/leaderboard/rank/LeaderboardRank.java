/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leaderboard.rank;

import static leaderboard.rank.sub.insertionSortDescending;

public class LeaderboardRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] scores = {12, 50, 30, 91, 150};

        System.out.println("Leaderboard (Highest to Lowest):");
        for (int s : insertionSortDescending(scores)) {
            System.out.print(s + " ");
        }
    
    }
    
}
