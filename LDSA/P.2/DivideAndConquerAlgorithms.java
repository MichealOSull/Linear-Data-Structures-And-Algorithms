/**
 * Micheal O' Sullivan
 * R00128516
 * SD2C
 */
/**
/**
 * The class contains the Divide and Conquer-based Algorithms we are using. 
 */
public class DivideAndConquerAlgorithms {

	//----------------------------------------------
	// Class constructor
	//----------------------------------------------	
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public DivideAndConquerAlgorithms(){}
	
	//-------------------------------------------------------------------
		// 0. iterativeDisplayElements --> Displays all elements of a MyList 
		//-------------------------------------------------------------------	
		/**
		 * Given a concrete MyList, this iterative algorithm displays its elements by screen (if any).
		 * @param m: The MyList we want to display its elements.	  
		 */	
		public void iterativeDisplayElements(MyList<Integer> m){
			//-----------------------------
			//SET OF OPS
			//-----------------------------

			//-----------------------------
			// I. SCENARIO IDENTIFICATION
			//-----------------------------
			int scenario = 0; 
			
			if (m.length() == 0) 
				scenario = 1;

			else
				scenario = 2;

			//-----------------------------
			// II. SCENARIO IMPLEMENTATION 
			//-----------------------------
			switch(scenario){	
					
			
			case 1: 
				
				System.out.println("Empty MyList");
				
				break;
				
			
			case 2: 
				
				int size = m.length();
				System.out.println("MyList Contains the following " + size + " items: ");
				
				for (int i = 0; i < size; i++)
					System.out.println("Item " + i + ": " + m.getElement(i));
				
				break;
		
			}
			
		}	
	//-------------------------------------------------------------------
	// 1. getEven --> Finds the even numbers in MyList 
	//-------------------------------------------------------------------	
	/**
	 * The function finds the even number in m. 
	 * @param m: The MyList we want to compute its maximum item.
	 * @return: A new MyList containing only the even numbers present in m	  
	 */	
	public MyList<Integer> getEven(MyList<Integer> m){
		 // TO-DO
		int scenario = 0; 
	    

	    if (m.length() < 0) 
	        scenario = 1;
	    else
	        scenario = 2;

	    switch(scenario){   
	            
	    case 1: 
	        System.out.println("Empty ");
	        break;
	        
	    case 2: 
	        int size = m.length();
	        System.out.println("MyList " + m + " Contains the following even numbers: ");
	        
	        for (int i = 0; i < size; i++){
	        	if(m.getElement(i) %2 == 0)
	        		System.out.println("Even Number: "  + m.getElement(i));
	        
	    }
	    
	}
		return m;
			
				
		
	}

	//-------------------------------------------------------------------
	// 2. getProduct --> Computes if MyList is sorted in decreasing order 
	//-------------------------------------------------------------------	
	/**
	 * The function computes the product of all items in m.  
	 * @param m: The MyList we want to check.
	 * @return: The product value calculated.  
	 */	
	public int getProduct(MyList<Integer> m){
		int res = 0;

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		
		if (m.length() == 0) 
			scenario = 1;
		else
			scenario = 2;		

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				 
		case 1: 
			res = 0;
			break;
			
		case 2: 
			if(m.length() == 1) {
				res = 1;
				break;
			}

			int e0 = m.getElement(0);
			int e1 = m.getElement(1);

			m.removeElement(0);
			res = getProduct(m);
			if(e1 > e0) {
				res = 0;
			}

			m.addElement(0, e0);
			
			break;
		}		
			
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}

		

	//-------------------------------------------------------------------
	// 3. isEqual --> Determines if two MyLists are identical  
	//-------------------------------------------------------------------	
	/**
	 * The function determines is m1 and m2 are identical.   
	 * @param m1, m2: The two MyLists we want to compare.
	 * @return: True or false 
	 */	
	public boolean isEqual(MyList<Integer> m1, MyList<Integer> m2){
		 boolean res = true;
		
		if (m1.length() == 0 && (m1.length() == 0)){
			return false;
		}
		else if (m1.length() != 0 && (m1.length() == 0)){
			return false;
		}
		else if (m1.length() == 0 && (m1.length() != 0)){
			return false;
		}
		else {
			int e0 = m1.getElement(0);
			int e1 = m2.getElement(0);
			if(e0 == e1) {
				return true;
			}
			
			return res;
			
			
		}
			
		
			
			
	}
	
		
	//-------------------------------------------------------------------
	// 4. fermat --> Computes the n-est term of the Fermat series
	//-------------------------------------------------------------------	
	/**
	 * The function computes the n-est term of the Fermat series
	 * @param n: The n-est term of the series we want to compute
	 * @return: The term being computed 
	 */	
	public int fermat(int n){
		int res = 0;
		
		if(n >= 0) {
			 int num = ((int) ((Math.pow(4, n)) + 1));
			 res = num;
		}
			
		return res;
	}
}
