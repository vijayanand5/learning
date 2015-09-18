import java.util.Comparator;

/**
 * Comparator class to sort Workers within the range by Index
 * 
 * @author viperias
 *
 */
public class WorkerComparator implements Comparator<Worker> {

	public int compare(Worker w1, Worker w2) {

		return Integer.compare(w1.getIndex(), w2.getIndex());

	}

}
