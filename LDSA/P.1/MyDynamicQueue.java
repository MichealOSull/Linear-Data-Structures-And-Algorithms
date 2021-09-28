
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
public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
		private MyNode head;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	//public myQueue myCreateEmpty(){}
	
	public MyDynamicQueue(){//TO-COMPLETE 
		head = null;
		

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	

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
		if(head == null) {
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
		if(head == null) {
			res = -1;
		}
		

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else {
			MyNode t = head;
			head = head.getNext();
			res = t.getInfo();
			t.setNext(null);
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyQueue: enqueue
	//-------------------------------------------------------------------
	
	public void enqueue(int element){//TO-COMPLETE 
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(head != null) {
			MyNode pushNode = new MyNode(element, head);
			head = pushNode;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		
		else {
			MyNode pushNode = new MyNode(element, head);
			head = pushNode;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> get the item at the top of myqueue: front
	//-------------------------------------------------------------------
	/**
	* Given a concrete MyQueue, get the item at the back of the queue..<br>
	* @return: item at back of  MyQueue.	 
	*/	
	public int rear(){
		return 0;//TO-COMPLETE 
		//-----------------------------
		//SET OF OPS
		//-----------------------------
			
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------


		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------

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
		if(!isEmpty()) {

			return head.getInfo();

		}
			return 0;
	}	

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------


	
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyQueue: print
	//-------------------------------------------------------------------
	
	public void print(){//TO-COMPLETE 

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		if(head == null) {
			System.out.print("Queue is Empty");
		}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		else {
			System.out.print(head.getInfo());
			head = head.getNext();
		}

	}
	
	
}
