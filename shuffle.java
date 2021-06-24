package datastruc;

import java.util.Stack;

public class shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] typeCards = new String[]
				{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] classCards = new String[]
				{"S", "D", "C", "H"};
		String[] deck = new String[52];
		int count = 0;
		
		for(int a = 0; a < classCards.length; a++)
		{
			for(int b = 0; b < typeCards.length; b++)
			{
				deck[count] = classCards[a] + "-" + typeCards[b];
				count++;
			}
		}
		System.out.print("unshuffled deck\n");
		for(int a = 0; a < deck.length; a++)
		{
			System.out.print(deck[a] + " ");
		}
		
		System.out.print("\n\n");
		System.out.print("shuffled deck\n");

		Stack<String> theStack = new Stack<String>();
		for(int i = 0; i < deck.length; i++)
		{
			int j = (int)(Math.random() * deck.length);
			if(deck[j].equals(" "))
			{
				i--;
			}
			else
			{
				theStack.push(deck[j]);
				System.out.print(deck[j] + " ");
				deck[j] = " ";
			}
		}
		
		System.out.print("\n\n");
		System.out.print("hand of 7 cards\n");
		for(int x = 0; x < 7; x++)
		{
			System.out.print(theStack.pop() + " ");
		}

	}

}
