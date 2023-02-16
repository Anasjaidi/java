import java.io.*;
import java.text.*;

class Solution {
  public int numJewelsInStones(String jewels, String stones) {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    CharacterIterator it = new StringCharacterIterator(stones);
    while (it.current() != CharacterIterator.DONE) {
      if (map.get(it.current()) != null)
        map.put(it.current(), map.get(it.current()) + 1);
      else
        map.put(it.current(), 1);
      it.next();
    }
    int count = 0;
    it = new StringCharacterIterator(jewels);
    while (it.current() != CharacterIterator.DONE) {
      if (map.get(it.current()) != null)
        count += map.get(it.current());
      it.next();
    }
    return count;
  }
}