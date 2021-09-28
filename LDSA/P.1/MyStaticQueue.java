/**
 * Micheal O' Sullivan
 * R00128516
 * SD2C
 */
/**
/**
* ADT MyQueue: Private Part<br>. 
* The class implements all the operations available in MyQueue<br>
*/
public class MyStaticQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private int items[]; 
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	//-------------------------------------------------------------------	
	//public myQueue myCreateEmpty(){}
	
	/**
	 * The constructor creates 1 instance (1 object) of the class MyStaticQueue<br>
	 * @param m: The maximum number of items MyQueue can contain.
	 */	 
	public MyStaticQueue(int m){//TO-COMPLETE 
		items = new int[m];
		numItems = 0;
		maxItems = m;

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyQueue, it returns whether it is empty or not.<br>
	 * @return: Whether MyQueue is empty or not.
	 */	
	public boolean isEmpty(){//TO-COMPLETE 
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = true;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(this.numItems == 0) {
			res = true;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else {
			res = false;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get and remove first element from top of MyQueue: dequeue
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, it returns element at the top of the queue (if any).<br>
	 * @return: Head element from MyQueue (ERROR if there are no items in MyQueue).
	 */	
	public int dequeue(){//TO-COMPLETE 
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = -1;
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if (isEmpty()) {
			res = -1;
		}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else {
			res = items[maxItems - numItems];
			numItems--;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

		
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyQueue: enqueue
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, add an item to the back of the queue.<br>
	 * @param element: New item to be added to MyQueue.	 
	 */	
	public void enqueue(int element){//TO-COMPLETE 
		//-----------------------------
		//SET OF OPS
		//-----------------------------
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if (numItems < maxItems) {
			items[numItems] = element;
			numItems++;
			
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else {
			System.out.println("Queue is full");
		}

	}
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> get the item at the top of myqueue: front
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, get the item at the top of the queue..<br>
	 * @return: item at top of  MyQueue.	 
	 */	
	public int front(){
		//TO-COMPLETE 
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int res = 0;
		if (numItems > 0) {
			res = items[0];
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else {
			res = -1;
		}
		return res;
	}
		
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> get the item at the top of myqueue: front
	//-------------------------------------------------------------------
	/**
	* Given a concrete MyQueue, get the item at the back of the queue..<br>
	* @return: item at back of  MyQueue.	 
	*/	
	public int rear(){
		int res = 0;//TO-COMPLETE 
		//-----------------------------
		//SET OF OPS
		//-----------------------------
			
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if (numItems < maxItems) {
			res = items[numItems];
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else {
			System.out.print("Empty");
		}
		return res;

	}
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyQueue: print
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, prints all the elements (if any).<br>
	 * 
	 */	
	public void print(){//TO-COMPLETE 
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(isEmpty()) {
			System.out.println("Queue is full");
		}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else {
			for(int i =0; i < numItems-1; i++) {
				System.out.print(items[i]+", ");
			}
			System.out.print(items[numItems-1]);
		}

	}
	
}
