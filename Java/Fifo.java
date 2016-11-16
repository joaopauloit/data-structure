import java.*;

public class Fifo {

	public int capacity;
	public String[] collection;
	public int first;
	public int last;
	public int numberItens;

	public Fifo(int capacity){

		this.capacity = capacity;
		this.collection = new String[this.capacity];
		this.first = 0;
		this.last = -1;
		this.numberItens = 0;

	}

	public boolean full(){

		return this.numberItens == this.capacity;

	}

  public boolean free(){

		return this.numberItens == 0;

	}

	public void insert(String value){

		if(this.last == this.capacity-1)
			this.last = -1;

		this.last++;
		this.collection[last] = value; // incrementa ultimo e insere
		this.numberItens++; // mais um item inserido

	}

	public void remove(){
		
	}

	public String[] GetItens(){
		return this.collection;
	}

};
