package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    int arr[] = {1,2};
    @Test
  public void testBinarySearch(){
      assertEquals(1,BonusBinarySearch.binarySearch(arr,2));
  }

}
