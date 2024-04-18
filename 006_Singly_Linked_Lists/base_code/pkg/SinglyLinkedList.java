package pkg;
import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
	Node head;

	/* 
		Postcondition: The head will be null 
	*/
	public SinglyLinkedList() {

	}

	/* 
		Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
	   	If the position doesn't exist, it returns -1
	*/ 
	public int get(int pos){
		Node current = head;
		int cnt = 0;
		boolean flag = false;


		while(current != null ){
			if(cnt == pos){
				flag = true;
				break;
			}
			else{
				cnt++;
				current = current.getNext();
			}
		}
		if(flag){
			return current.getData();
		}else{
			return -1;
		}
		
		
		
	}

	/*
		Insert a new Node at the given position with the data given
	*/
	public void insert(int pos, int data){
		int cnt = 0;
		Node current = head;
		Node temp = new Node(data);

		if(current == null){
			return;
		}

		while(current != null){
			if(cnt == pos-1){
				current.setNext(temp);
			}else{
				current = current.getNext();
			}
		}
	}

	/*
		Remove the node at the given position
		If no position exists, don't change the list
	*/
	public void remove(int pos){
		Node current = head;
		Node current2 = head;
	
		int data = 0;

		for(int i=0; i<=pos+1; i++){
			if(i == pos+1){
				data = current2.getData();
			}
			current2 = current2.getNext();
		}

		for(int i=0; i<pos; i++){
			if(pos-1 == i){
				current.setNext()
			}
		}
	}

	/*
		Swap two Nodes with the two positions given
	*/
	public void swap(int pos1, int pos2){
		Node current = head;
		for(int i=0; i<pos1; i++){
			
		}
	}

	/*
		Print all data values in the LinkedList 
	*/
	public void printList(){

	}
}
