/*
 * This Problem was asked by Google
 */
package com.ng.dialychallenge.oct2018;

import java.util.Arrays;

/**
 *
 * @author nagasrinivask
 */
public class AddUpToK {

    private int[] vals;
    private int k;

    public AddUpToK(int[] vals, int k) {
        this.vals = vals;
        this.k = k;
    }

    public boolean solve() {
        Arrays.sort(vals);
        int len = vals.length;
        for (int i = 0; i < len; i++) {
            int bal = k - vals[i];
            if (bal >= 0) {
                if (find(i + 1, bal, 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(int ind, int val, int inc) {
        for (int i = ind; i < vals.length; i += inc) {
            if (vals[i] == val) {
                return true;
            }
        }
        return false;
    }

}
