public abstract interface QueueADT{
	public abstract boolean enqueue(Object object);
	public abstract Object dequeue();
	public abstract boolean isEmpty();
	public abstract boolean isFull();
}
