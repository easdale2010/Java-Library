public class SortedStringsArrayTest{
	public static void main(String[] args){
		SortedADT sorted=new SortedArray();
		boolean inserted;
		String value; // type of value
		int option;
		do{
			System.out.println("0: quit");
			System.out.println("1: insert");
			System.out.println("2: remove");
			System.out.println("3: find");
			System.out.println("4: display");
			option=Input.getInteger("input option: ");
			switch (option){
				case 0:	break;
				case 1: inserted=sorted.insert(Input.getString("input string: "));//type of input
	   					if (inserted)
							System.out.println("inserted");
				        break;
				case 2: value=(String)sorted.remove(Input.getString("input string: "));//type of input
      					if (value!=null)
							System.out.println("removed");
						else
							System.out.println("not found");
				        break;
				case 3: value=(String)sorted.find(Input.getString("input string: "));//type of input
      					if (value!=null)
							System.out.println("found");
						else
							System.out.println("not found");
				        break;
				case 4:	System.out.println(sorted);
                     	break;
			}
		} while(option!=0);
	}
}

