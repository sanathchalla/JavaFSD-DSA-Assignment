package com.gl.javafsd.dsa.binarysearchtree.pathfinder;

public class BinarySerachTreePairFinderTest {
	
	public static void main(String[] args) {
		
		pairFinderTest(130);
		
		
	}
	static void pairFinderTest(int sum) {
		
		BinarySearchTree sampleTree
		= BinarySearchTreeTest.sampleBinaryTree1();
		
		BinarySearchTreePairFinder finder =
				new BinarySearchTreePairFinder(sampleTree);
		
		finder.findPair(sum);
		System.out.println("---------------------------------");
	}

}
