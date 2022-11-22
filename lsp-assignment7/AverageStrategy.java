import java.util.Collections;
import java.util.List;
/** Tyson Gouche
 *
 * @author tysongouche
 *
 * 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
 */

/** The AverageStrategy interface defines methods that
 * facilitate the problem of computing an average for a list of submitted grades
 * All the methods below have a description included.
 */
public interface AverageStrategy {

    /**
     * Calculate the average grade for a list of integer numbers
     *
     * @return int, that is the calculation of the average grades in the given list.
     */
    static int compute1(List<Integer> grades) throws EmptyListException {
        if (grades.isEmpty()){
            throw new EmptyListException();
        } else {
            int total = 0;
            for(int x: grades){
                total += x;
            }
            total = total/grades.size();
            System.out.println(grades);
            return total;
        }
    }
    /**
     * Calculate the average grade for a list of integer numbers, without the lowest 2 scores
     *
     * @return int, that is the calculation of the average grades in the given list, without lowest 2 scores.
     */
    static int compute2(List<Integer> grades) {
        int index = grades.size() - 2;
        Collections.sort(grades);
        Collections.reverse(grades);
        List<Integer> list2 = grades.subList(0, index);
        int total = 0;
        for(int x: list2){
            total += x;
        }
        total = total/list2.size();
        return total;
    }
}
