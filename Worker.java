
/*
 * This class holds the data and index of the array elements
 */
public class Worker {

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

	private int index;
	private long data;

	public Worker(int index, long data) {
		this.index = index;
		this.data = data;
	}
	
	Worker leftNode;
	Worker rightNode;
 
    public Worker getLeftNode() {
        return leftNode;
    }
 
    public void setLeftNode(Worker leftNode) {
        this.leftNode = leftNode;
    }
 
    public Worker getRightNode() {
        return rightNode;
    }
 
    public void setRightNode(Worker rightNode) {
        this.rightNode = rightNode;
    }

}
