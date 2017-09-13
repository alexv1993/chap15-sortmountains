package srс;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Alex on 13.09.2017.
 */
public class SortMountains {
    LinkedList<Mountain> mtn = new LinkedList<>();

    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return Integer.compare(two.getHeight(), one.getHeight());
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    private void go() {
        mtn.add(new Mountain("Long-Rainge", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Marun", 14156));
        mtn.add(new Mountain("Casl", 14265));

        System.out.println("By adding order:\n" + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);

        System.out.println("By name:\n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("By higher:\n" + mtn);

    }

}

class Mountain {
    private String name;
    private int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
