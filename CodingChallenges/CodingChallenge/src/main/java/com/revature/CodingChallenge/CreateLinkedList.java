package com.revature.CodingChallenge;


/*
- Create a class that will implement your own version of a LinkedList
(Java collection where elements are stored as nodes, each node contains a 
link to the *next* node, and whatever data you wish to hold, let's say a string 
value) without using any Java collection classes   
 - Write a method that will take in an int (whole number base 10) 
 and return its hexadecimal value (whole number base 16)
*/
public class CreateLinkedList 
{
	//public static newLinkedList aList;

	
	public static void main(String[] args)
	{
		
//make the list
int[] nums = { 1,2,18,30,15,50,100};
//make it nodes without a linkedlist?
Object[][] linkedList = new Object[1][2];
aLinkedList(nums,linkedList);
 
//System.out.println(nums);
//System.out.println(linkedList);

}
 
public static void aLinkedList(int []nums,Object[][] linkedList)
{
	//so object to node 
Object node[][] = null;
Object newnode[][] = null;
node=new Object[1][2];
linkedList[0][1]=node;

//for loop to go to next node? 
for(int i=0;i<nums.length;i++)
{
node[0][0]=new Integer(nums[i]);
newnode=new Object[1][2];
node[0][1]=newnode;
node=newnode;
 
//System.out.println(newnode);
}
//return node;
//return newnode;
node =null;
newnode = null;
    }
}



