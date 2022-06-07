import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        ArrayList<BigInteger> list = new ArrayList<BigInteger>();
        list.add(new BigInteger("24"));
        list.add(new BigInteger("543534"));
        list.add(new BigInteger("535"));
        list.add(new BigInteger("2342"));
        list.add(new BigInteger("9"));
        System.out.println("before sorting:- " + list);
        System.out.println("after sorting:- " + arrayListSort(list));

    }

    public static List<BigInteger> arrayListSort(List<BigInteger> list) {
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}

