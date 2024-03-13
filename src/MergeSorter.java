import java.util.Arrays;
import java.util.Comparator;

/**
 * A simple way to sort arrays using merge sort.
 *
 * @author YourName Here
 * @author Your NameHere
 * @author Samuel A. Rebelsky
 */
public class MergeSorter {

  // +------------------+--------------------------------------------
  // | Exported methods |
  // +------------------+

  /**
   * Sort an array using the merge sort algorithm.
   */
  public static <T> void sort(T[] vals, Comparator<? super T> comparator) {
    int start = 0;
    int final = vals.length();
  } // sort

  // +-----------------+---------------------------------------------
  // | Local utilities |
  // +-----------------+

  /**
   * Merge the values from positions [lo..mid) and [mid..hi) back into
   * the same part of the array.
   *
   * Preconditions: Each subarray is sorted accorting to comparator.
   */
  static <T> void merge(int[] nums, int lo, int mid, int hi, Comparator<Integer> compareInts) {
    int initialMid = mid;
    int initialLo = lo;
    int[] newVals = Arrays.copyOfRange(nums, lo, hi+1);
    int count = 0;
    while (lo < initialMid && mid <= hi) {
      //System.out.println(count);
      if (compareInts.compare(nums[lo], nums[mid]) <= 0) {
        newVals[count] = nums[lo];
        lo++;
      } else {
        newVals[count] = nums[mid];
        mid++;
      }
      count++;
    }
    if (lo == initialMid) {
      
      while (mid < hi) {
        //ystem.out.println(count);
        newVals[count] = nums[mid];
        mid++;
        count++;
      }
    } else {
      while (lo < initialMid) {
        //System.out.println(count);
        newVals[count] = nums[lo];
        lo++;
        count++;
      }
    }
    int j = 0;
    for (int i = initialLo; i < hi+1; i++) {
      nums[i] = newVals[j++];
    }
  } // merge

}// class MergeSorter
