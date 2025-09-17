package HahMapFrom0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 1 --- 2 --- 4
// A
// C

public class HashMapCustom {
    public int dim;

    public List<ListNode> headList = new ArrayList<>();

    public HashMapCustom(int dim) {
        this.dim = dim;
    }

    public int hashFunction(int key) {
        return key % dim;
    }

    public void put(int key, String val) {
        int hash = hashFunction(key);
        ListNode headSublist = headList.get(hash);
        headSublist = headSublist.insert(headSublist, val, key);
    }
}
