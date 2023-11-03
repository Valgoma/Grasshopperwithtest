package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AppTest
{
    @Test
    public void testCalcDist(){
        Assertions.assertEquals(0, App.countDistance(0,0,0,0));
        Assertions.assertEquals(4, App.countDistance(7,0,3,0));
        Assertions.assertEquals(4, App.countDistance(3,0,7,0));
        Assertions.assertEquals(5, App.countDistance(0,0,3,4));
    }
  @Test
    public void testAnswer() throws IOException {
      int[][] anArray = {{1,1},{2,2}};
        Assertions.assertEquals(1, App.countAll(anArray, 0, 0, 1));
    }
}

