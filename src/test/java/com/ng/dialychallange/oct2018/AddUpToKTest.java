/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.dialychallange.oct2018;

import com.ng.dialychallange.oct2018.AddUpToK;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author nagasrinivask
 */
public class AddUpToKTest {

    AddUpToK instance;

    public AddUpToKTest() {
    }

    @Test
    public void testSolve() {
        Assert.assertTrue(new AddUpToK(new int[]{4, 2, 6, 4, 8, 9}, 10).solve());
        Assert.assertFalse(new AddUpToK(new int[]{4, 2, 6, 4, 8, 9}, 123).solve());
        Assert.assertTrue(new AddUpToK(new int[]{224, 12, 6, 345, 68, 9}, 77).solve());
        Assert.assertFalse(new AddUpToK(new int[]{4, 2, 6, 4, 8, 9}, 4).solve());
        Assert.assertTrue(new AddUpToK(new int[]{0, 0, 0, 0}, 0).solve());
        Assert.assertFalse(new AddUpToK(new int[]{0}, 0).solve());
        Assert.assertFalse(new AddUpToK(new int[]{1}, 1).solve());
    }

}
