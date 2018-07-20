import java.util.Comparator;

public class TreeToy2 implements Comparator<ChristmasTreeToy> {
    @Override
    public int compare(ChristmasTreeToy o1, ChristmasTreeToy o2) {
        return o1.toString().compareTo(o2.toString());
    }
}