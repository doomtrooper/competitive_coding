package leetcode.medium;

import java.io.*;
import java.util.*;

public class MinimumCostForTickets {
    public static void main(String[] args) {
//        System.out.println(mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}));
//        System.out.println(mincostTickets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15}));
//        System.out.println(mincostTickets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30}, new int[]{2, 7, 15}));
//        System.out.println(mincostTickets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{2, 7, 15}));
//        System.out.println(mincostTickets(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{2, 7, 15}));
//        System.out.println(mincostTickets(new int[]{1, 2}, new int[]{2, 7, 15}));
//        System.out.println(mincostTickets(new int[]{3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 20, 21, 23, 25, 26, 27, 29, 30, 33, 34, 35, 36, 38, 39, 40, 42, 45, 46, 47, 48, 49, 51, 53, 54, 56, 57, 58, 59, 60, 61, 63, 64, 67, 68, 69, 70, 72, 74, 77, 78, 79, 80, 81, 82, 83, 84, 85, 88, 91, 92, 93, 96}, new int[]{2, 7, 15}));
//        System.out.println(mincostTickets(new int[]{1, 4, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 27, 28}, new int[]{3, 13, 45}));
        System.out.println(mincostTickets(new int[]{1,4,6,7,8,20}, new int[]{7,2,15}));
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int[] ticketCosts = new int[days.length];
        Arrays.fill(ticketCosts, Integer.MAX_VALUE);
        for (int i = 0; i < days.length; i++) {
            boolean newticketBought = false;
            if (i == 0) {
                newticketBought = true;
                ticketCosts[i] = costs[0];
            } else if (ticketCosts[i] >= ticketCosts[i - 1] + costs[0]) {
                newticketBought = true;
                ticketCosts[i] = ticketCosts[i - 1] + costs[0];
            }
            for (int j = i; j < days.length && days[j] < days[i] + 7; j++) {
                ticketCosts[j] = Math.min(ticketCosts[j], ticketCosts[i] + costs[1] - (newticketBought ? costs[0] : 0));
            }
            for (int j = i; j < days.length && days[j] < days[i] + 30; j++) {
                ticketCosts[j] = Math.min(ticketCosts[j], ticketCosts[i] + costs[2] - (newticketBought ? costs[0] : 0));
            }
        }
        return ticketCosts[days.length - 1];
    }
}

