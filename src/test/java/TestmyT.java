import java.util.Arrays;
import java.util.List;
import org.junit.Test;


public class TestmyT {

    @Test
    public void testmy() {
        List<Integer> profit = Arrays.asList(1, 4, -3, -6, 3, 6);
        System.out.println(rotLeft(4, profit));
    }

    public long rotLeft(int k, List<Integer> profit) {
        int n = profit.size();
//        if (n == 2) {
//            return profit.stream().mapToLong(Long::longValue).sum();
//        }
//        List<Long> segmentsProf = new ArrayList<>();
//
//        long segmentsSum = 0L;
//        for (int j = 2; j < )
//            int j;
//        for (j = 2; j < j+k; j++){
//            segmentsSum = segmentsSum + profit.get(j);
//        }
//        for (j = j+1; j < j+k; j++){
//            segmentsSum = segmentsSum + profit.get(j);
//        }
//        segmentsProf.add(segmentsSum);

        return 0L;
    }

}
