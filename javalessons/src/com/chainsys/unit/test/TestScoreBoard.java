package com.chainsys.unit.test;

import com.chainsys.classesmethods.TtwentyScoreBoard;

public class TestScoreBoard {

	public static void testRCBMatch()
	{
		TtwentyScoreBoard sb= new TtwentyScoreBoard(129);
		System.out.println("Target : "+sb.getTarget());
		System.out.println("Max Overs : "+TtwentyScoreBoard.maxOvers);
		sb.setCurrentScore(86);
		sb.setCompleted_overs(10);
		//System.out.println("CurrentScore is : "+sb.getCurrentScore());
		//System.out.println("Overs Completed : "+sb.getCompleted_overs());
		//System.out.println("CurrentRR :"+sb.getCurrentRunRate());
		//System.out.println("RequiredRR : "+sb.setRequiredRunRate());
		
	}
}
