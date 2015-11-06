public abstract interface SortedADT{
	// returns true if object parameter inserted successfully, false otherwise
	public abstract boolean insert(Comparable object);
	// returns object removed or null if object parameter not found
   public abstract Comparable remove(Comparable object);
	// returns object found or null if object parameter not found
   public abstract Comparable find(Comparable object);
}
