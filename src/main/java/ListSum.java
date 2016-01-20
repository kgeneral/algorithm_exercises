import java.util.List;

public class ListSum {

    private List<Integer> list;

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public int getSum() {
        int sum = 0;
        return list.stream().mapToInt(x -> x.intValue()).sum();

    }
}
