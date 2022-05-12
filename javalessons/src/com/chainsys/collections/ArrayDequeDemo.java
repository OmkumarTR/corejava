package com.chainsys.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque <String> arraydeque = new ArrayDeque<String>();
		// Use an ArrayDeque like a Stack
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");	//Duplicate value
		arraydeque.push("Z");	//Dublicate value
		arraydeque.push("E");
		arraydeque.push("F");
//		System.out.println("*Before Popping the Stack : "+arraydeque.size());
//		while (arraydeque.peek()!=null)
//		{
//			System.out.println(arraydeque.pop()+ " ");
//			System.out.println("After Popping the Stack :"+arraydeque.size());
		Iterator<String>iterator=arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t "+iterator.next());
		}
		System.out.println("Descending Iterator");
		Iterator<String>terator=arraydeque.descendingIterator();
		while(terator.hasNext())
		{
			System.out.println("\t "+terator.next());
		}
		System.out.println();
		arraydeque.addFirst("H");
		arraydeque.addLast("I");
		iterator=arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t "+iterator.next());
		}
		//
		//PollFirst
		//Retrieves and removes the first element of this deque, or
		// Returns null if this deque is empty
		System.out.println("*******Poll First :"+arraydeque.pollFirst());
		System.out.println(arraydeque);
		System.out.println("*******Poll Last :"+arraydeque.pollLast());
		System.out.println(arraydeque);
		//PeekFirst
		//Retrieves and but does not removes the first element of this deque, or
		// Returns null if this deque is empty
		System.out.println("*******Peek First :"+arraydeque.peekFirst());
		System.out.println(arraydeque);
		System.out.println("*******Peek Last :"+arraydeque.peekLast());
		System.out.println(arraydeque);
		//RemoveFirst
		//Retrieves and removes the first element of this deque, or
		// This method differs from pollFirst only in that it throws an exception 
		//If this deque is empty
		System.out.println("*******Remove First :"+arraydeque.removeFirst());
		System.out.println(arraydeque);
		System.out.println("*******Remove Last :"+arraydeque.removeLast());
		System.out.println(arraydeque);
		// RemoveFirstOccurrence
		System.out.println("*******Remove First Occurrence:"+arraydeque.removeFirstOccurrence("X"));
		System.out.println(arraydeque);
		System.out.println("*******Remove Last Occurrence :"+arraydeque.removeLastOccurrence("Z"));
		System.out.println(arraydeque);
		
		
		
	}
}
