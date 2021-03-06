public class ArrayQueue implements QueueADT{
	private Object[] objects;
	private int head;
	private int tail;
	
	public ArrayQueue(){
		int size;
		size=Input.getInteger("input array size: ");
		this.objects=new Object[size];
	}
	
	public boolean enqueue(Object object){
		/* algorithm
		if queue is not full then
			note add is successful
			add object at tail slot
			increment tail slot
			if tail slot is off the end of the array then
				set the tail slot to the first slot in the array
			end if
		else
			note add is unsuccessful
		end if
		*/
		boolean canAdd=!this.isFull();
		if (canAdd){
			this.objects[this.tail]=object;
			this.tail++;
			if (this.tail==this.objects.length)
				this.tail=0;
		}
		return canAdd;
	}
	
	public Object dequeue(){
		/* algorithm
		if queue is not empty then
			save the object at the head slot
			delete the object at the head slot
			increment the head slot
			if head slot is beyond the end of the array then
				set the head slot to the first slot in the array
			end if
		else
			note that no object is available
		end if
		*/
		Object removedObject=null;
		if(!this.isEmpty()){
			removedObject=this.objects[this.head];
			this.objects[this.head]=null;
			this.head++;
			if (this.head==this.objects.length)
				this.head=0;
		}
		return removedObject;
	}
	
	public boolean isEmpty(){
		return this.objects[this.head]==null;
	}
	
	
	public boolean isFull(){
		return this.objects[this.tail]!=null;
	}
	
	public String toString(){
		/* algorithm
		set up a string to contain the queue details
		if queue is not empty then
			set the current slot as the head slot
			do
				add the current slot object to the string
				increment the current slot
				if current slot is beyond the end of the array then
					set current slot to the first slot in the array
				end if
			while not yet reached the tail slot
		else
			add empty queue message to the string
		end if
		*/
		String queueDetails=new String();
		if (!this.isEmpty()){
			int current=this.head;
			do{
				queueDetails+=this.objects[current].toString()+"  ";
				current++;
				if (current==this.objects.length)
					current=0;
			}while (current!=this.tail);
			queueDetails+='\n';
		}
		else
			queueDetails+="queue is empty"+'\n';
		return queueDetails;
	}
}
