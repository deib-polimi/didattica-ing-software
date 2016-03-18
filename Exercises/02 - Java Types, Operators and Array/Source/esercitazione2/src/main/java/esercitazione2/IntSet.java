package esercitazione2;

public class IntSet {
    // Rappresentazione interna: array di interi
    // Solo i primi currentSize elementi contengono gli elementi del set
    // La Keyword final specifica che il reference all'array di interi non puo' cambiare durante l'esecuzione: una volta inizializzato l'array non e' possibile associare il reference elements a un nuovo array
    private final int[] elements;
    
    // dimensione effettiva dell'insieme
    private int currentSize;
    
    // costante che rappresenta la dimensione massima del set
    private final static int MAX_SIZE = 100;
    
    // costruttore di default
    public IntSet() {
        this.currentSize = 0;
        this.elements = new int[MAX_SIZE];
   }

    // ACCESSORI
    // controlla che l'elemento sia contenuto nell'insieme
    public boolean contains(int n) {
	    for (int i = 0; i < this.currentSize; i++) {
		    if (elements[i]==n){
		            return true;
                }
	    }
	    /*
	    * // alternativa NON CORRETTA
	    *
	    * for (int i: elements) { if (i==n){ return true; } }
	    */
	
	    /* default: non trovato */
	    return false;
    }
    
    // restituisce la dimensione dell'insieme
    public int size() {
        return this.currentSize;
    }
    
    public boolean isFull() {
        return currentSize >= MAX_SIZE;
    }
    
    // MODIFICATORI
    // Aggiunge un intero all'insieme.
    public void add(int n) {
        // invoco il metodo che controlla
        // la presenza dell'elemento nel set.
        boolean containsElement = this.contains(n);
        
        // se e' gia' presente non faccio nulla
        if (containsElement){
		    return;
    	}
    	/* controllo che il set non sia pieno */
    	if (this.currentSize < elements.length) {
    	    // inserisco l'elemento
    	    this.elements[currentSize] = n;
    	    // aggiorno contatore elementi
    	    this.currentSize++;
    	} 
    }

     // rimuove un elemento dall'insieme.
    public void remove(int element) {
        // recupero l'elemento
        int pos = find(element);
	
    	if (pos >= 0) {
    	    /*
    	    * Altra soluzione:
    	    * for (int i = pos; i < this.currentSize - 1; i++)
    	    *	elements[i] = elements[i + 1];
    	    *	this.currentSize = this.currentSize - 1;
    	    */						
    	    this.currentSize = this.currentSize - 1;
    	    elements[pos] = elements[currentSize];
    	}
    }
    // metodo privato. restituisce la posizione
    // di un elemento nell'array se esiste (ed e'
    // entro this.size), -1 altrimenti
    private int find(int n) {
        for (int i = 0; i < this.currentSize; i++) {
            if (elements[i]==n){
                return i;
            }
        }
        /* default */
        return -1;
        // Perche' non ha senso che questo metodo sia pubblico?
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0; i< currentSize; i++){
            if(i>0){
                builder.append(", ");
            }
         builder.append(elements[i]);
         }
         builder.append("]");
         return builder.toString();
    }
}