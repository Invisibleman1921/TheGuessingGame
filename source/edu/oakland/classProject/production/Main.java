package edu.oakland.classProject.production;

import edu.oakland.classProject.production.Display;
import edu.oakland.classProject.production.Core;

public class Main{

	private static Display display = new Display();
	private static Core core = new Core();
	
	public static void main(String[] args){
		startGame();
		makeGuess("higher");
	}
	
	public static void startGame(){
		char playSelection = display.getPlaySelection();
		switch (playSelection){
			case 'Q': /// Quit
				return;
			case 'S': /// Simple Play
				/// keep default upperBoundInput
				break;
			case 'A': /// Advanced Play
				int upperBoundSelection = display.getUpperBoundSelection();
				core.setUpperBoundSelection(upperBoundSelection);
				break;
		}
		
		int upperBoundComputed = core.getUpperBound();
		int maxNumOfGuesses = core.getMaxNumOfGuesses();
			
		display.getUserConfirmation(upperBoundComputed, maxNumOfGuesses);
			
	}
	
	public static void makeGuess(String userSelection){
		core.setGuessFeedbackSelection(userSelection);
		
		int currentGuessIteration = core.getGuessIteration();
		int currentGuess = core.getGuess();

		
	}

	public static void endGame(){
		//display.getEndGameConfirmation(guess, guessIteration);
	}
	
}