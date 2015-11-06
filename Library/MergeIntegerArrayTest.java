public class MergeIntegerArrayTest{
	public static void main(String[] args){
		MergedADT sorted1=new MergedArray();
		MergedADT sorted2=new MergedArray();
		// for result from merge
      	MergedADT merged=null;
		boolean inserted;
		int option;
		do{
			System.out.println("0: quit");
			System.out.println("1: insert into 1");
			System.out.println("2: insert into 2");
			System.out.println("3: merge 1 and 2");
			System.out.println("4: display");
			option=Input.getInteger("input option: ");
			switch (option){
				case 0:	break;
				case 1: inserted=sorted1.insert(Input.getInteger("input value: "));
						if (inserted)
							System.out.println("inserted");
				         break;
				case 2: inserted=sorted2.insert(Input.getInteger("input value: "));
						if (inserted)
							System.out.println("inserted");
				        break;
				case 3: merged=sorted1.merge(sorted2);
                     	break;
				case 4:	System.out.println("list1");
						System.out.println(sorted1);
                     	System.out.println("list2");
						System.out.println(sorted2);
                     	System.out.println("merged");
                     	if (merged!=null)
    						System.out.println(merged);
                     	break;
			}
		} while(option!=0);
	}
}
