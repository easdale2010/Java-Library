public class ReversedArray extends SortedArray implements ReversedADT{
    public ReversedArray(){
    }
    
    public ReversedArray(int size){
        super(size);
    }
    
    public ReversedADT reverse(){
        // create reversed array with size based on the number of objects in the array to be reversed
        ReversedArray reversedObjects=new ReversedArray(this.objectCount);
		for (int index=this.objectCount-1;index>=0;index--)
			reversedObjects.objects[this.objectCount-index-1]=this.objects[index];
        reversedObjects.objectCount=this.objectCount;
        return reversedObjects;
    }

}