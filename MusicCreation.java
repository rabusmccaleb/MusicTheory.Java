package xmastreee;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;/// to help randomize the numbers you need to import this
import java.util.ArrayList;

public class MusicCreation {
	
	public static void main(String arg[]) {
		
		
		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;
		int e = 4;
		int f = 5;
		int g = 6;
		int a2 = 7;
		
		/////// circle of fifth notes: FCGDAEB
		int F= 0; int C = 1; int G = 2; int D = 3; int A = 4; int E = 5; int Bm = 6;
		int[] fifths = {F,C,G,D,A,E,Bm};
		int [] majorFifths = {0,1,2,6};
		int [] minorFifths = {3,4,5,6};
		////// circle of fifth notes: FCGDAEB
		
		String Major = "Major";
		String major = "major";
		String Minor = "Minor";
		String minor = "minor";
		String Both = "Both";
		String both = "both";
		
		
		int[] note = {a, b, c, d, e, f, g, a2};
		int x = 0;
		int[] commonMajorNotes = {2,3,4,6,7,2,3,4,6,7};
		int[] commonMinorNotes = {0,1,2,4,5,7,0,1,2,4,5,7};
		String notes;
		
		Scanner MajORmin = new Scanner(System.in);
		System.out.println("Would you prefer major or minor notes? Type 'Major' or 'Minor' or 'Both'");
		String UserInput = MajORmin.nextLine(); 
		System.out.println("");
		
if( UserInput.equals(Major)||UserInput.equals(major)) {//if statement for major
			System.out.println(major(commonMajorNotes));
			System.out.println("");
			System.out.println("Major Fifth chords: " + majorFive(majorFifths));
			
		}


else if(  UserInput.equals(Minor)|| UserInput.equals(minor)) {//if statement for minor
			System.out.print(minor(commonMinorNotes));
			System.out.println("");
			System.out.println("Minor Fifth chords: " + majorFive(minorFifths));
		}


else if( UserInput.equals(Both)|| UserInput.equals(both)) {// if statement for both
////////////////////////////////Major//////////////////////////////////////////////////////////////////////////////
///////////////////////////////Major///////////////////////////////////////////////////////////////////////////////
		System.out.println("Here is a series of Major notes:");
		
		Random rnd = new Random();
		for(x = 0; x< commonMajorNotes.length; x++) {
		int swap = rnd.nextInt(commonMajorNotes.length);
		int tempt = commonMajorNotes[x];
		commonMajorNotes[x] = commonMajorNotes[swap];
		commonMajorNotes[swap] = tempt;
		//System.out.print(commonMajorNotes[swap]);
		
		switch (commonMajorNotes[swap]){
			
			case 0:
				notes = "a" ;
				break;
			case 1:
				notes = "b";
				break;
			case 2:
				notes = "c";
				break;
			case 3:
				notes = "d" ;
				break;
			case 4:
				notes = "e" ;
				break;
			case 5:
				notes = "f" ;
				break;
			case 6:
				notes = "g" ;
				break;
			default:
				notes ="A";
				break;
			
		}
		System.out.print(" " + notes + ",");
		}
		System.out.print(major(commonMajorNotes));
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("Here is a series of Minor notes:");
		
		Random rd = new Random();
		for(x = 0; x< commonMinorNotes.length; x++) {
		int swap = rd.nextInt(commonMinorNotes.length);
		int tempt = commonMinorNotes[x];
		commonMinorNotes[x] = commonMinorNotes[swap];
		commonMinorNotes[swap] = tempt;
		//System.out.print(commonMajorNotes[swap]);
		
		switch (commonMinorNotes[swap]){
			
			case 0:
				notes = "a" ;
				break;
			case 1:
				notes = "b";
				break;
			case 2:
				notes = "c";
				break;
			case 3:
				notes = "d" ;
				break;
			case 4:
				notes = "e" ;
				break;
			case 5:
				notes = "f" ;
				break;
			case 6:
				notes = "g" ;
				break;
			default:
				notes ="A";
				break;
			
		}
		System.out.print(" " + notes + ",");
		}
		System.out.print(major(commonMinorNotes));
		
		
		System.out.println("");
		System.out.println("Major Fifth chords: " + majorFive(majorFifths));
		System.out.println("");
		System.out.println("Minor Fifth chords: " + majorFive(minorFifths));
		
		}/// if statement for 'both choice close bracket'
else{System.out.println("You fucked up you idiot");
}



System.out.println("");
System.out.println("");
System.out.println("");

		System.out.println("If you want to know the notes for the fifth octaves follow the rules below");
		System.out.println("Enter 0:Cmajor , 1:Dminor , 2:Eminor , 3:Fmajor, 4:Gmajor , 5:Aminor , 6:Bminor");
		String input = MajORmin.nextLine();
		int oG = Integer.parseInt(input);
		if(oG== 0 || oG== 1 || oG== 2 || oG== 3 || oG== 4 || oG== 4 || oG== 5 || oG== 6) {
		System.out.println(FifthKeys(oG));
		}else {System.out.println("You fucking moron. How can you not follow simple instructions?");}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Choose a octave for your Fugue. follow the rules below");
		System.out.println("Enter 0: A minor, 1: A# minor , 2:B minor , 3:C minor, 4:C# minor , 5:D minor , 6:D# minor");
		System.out.println("Enter 7: E minor, 8: F minor , 9:F# minor , 10:G Minor, 11:G# minor");
		Scanner Rabus = new Scanner(System.in);
		String num = MajORmin.nextLine();
		int cow = Integer.parseInt(num);
		
		
		System.out.print(Fugue(cow));
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		
		System.out.println("Would you prefer major or minor melody for some octave? Type 'Major' or 'Minor' ");
		System.out.println("Type Major or Minor");
		
		String UserIn = MajORmin.nextLine(); 
		
		if( UserIn.equals(Minor)||UserIn.equals(minor)) {//if statement for major
		Scanner Rabii = new Scanner(System.in);
		System.out.println("Choose a octave for your melody below by choosing the number that correlates to your minor octave");
		System.out.println("Enter 0:A minor, 1:A# minor , 2:B minor , 3: C minor, 4:C# minor , 5:D minor , 6:D# minor");
		System.out.println("Enter 7: E minor, 8: F minor , 9:F# minor , 10:G Minor, 11:G# minor");
		String numss = MajORmin.nextLine();
		int moo = Integer.parseInt(numss);
		System.out.println(MinorOctMelody(moo));
		System.out.println(MinorOctMelody(moo));
		}
		
		
		else if( UserIn.equals(Major)||UserIn.equals(major)) {//if statement for major
			System.out.println("Choose a octave for your melody below by choosing the number that correlates to your major octave");
			System.out.println("Enter 0: C major, 1: C# major , 2:D major , 3:D# major, 4:E major , 5:F major , 6:F# major");
			System.out.println("Enter 7: G major, 8: G# major , 9:A major , 10:A# major, 11:B major");
			
		Scanner jew = new Scanner(System.in);
		String numJew = MajORmin.nextLine();
		int bark = Integer.parseInt(numJew);
		System.out.println(MajorOctMelody(bark));
		System.out.println(MajorOctMelody(bark));
		}
		else {System.out.println("You entered the wrong value idiot");}
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Would you prefer major or minor BASS for some octave? Type 'Major' or 'Minor' ");
		System.out.println("Type Major or Minor");
		String user = MajORmin.nextLine();
		if(user.equals(Major)|| user.equals(major)) {
			System.out.println("Choose a octave for your BASS NOTES below by choosing the number that corolates to your major octave");
			System.out.println("Enter 0: C major, 1: C# major , 2:D major , 3:D# major, 4:E major , 5:F major , 6:F# major");
			System.out.println("Enter 7: G major, 8: G# major , 9:A major , 10:A# major, 11:B major");
			
			Scanner jewMan = new Scanner(System.in);
			String numJewMan = MajORmin.nextLine(); 
			int tommy = Integer.parseInt(numJewMan);
			System.out.println(MajorBassNotes(tommy));
			
		}
		else if( user.equals(Minor)||user.equals(minor)) {//if statement for major
			Scanner Rabii = new Scanner(System.in);
			System.out.println("Choose a octave for your BASS NOTES below by choosing the number that corolates to your minor octave");
			System.out.println("Enter 0:A minor, 1:A# minor , 2:B minor , 3: C minor, 4:C# minor , 5:D minor , 6:D# minor");
			System.out.println("Enter 7: E minor, 8: F minor , 9:F# minor , 10:G Minor, 11:G# minor");
			String numss = MajORmin.nextLine();
			int moo = Integer.parseInt(numss);
			System.out.println(MinorBassNotes(moo));
			} else {System.out.println("You moron try it again");}
		//MinorBassNotes()
		//MajorBassNotes()
		}
	
	
	
	
	

	

	
	/////////////////////////////////////////////////////////////////////////////	
////////////////////////////	///////////////////////////////////////////////////////
///////////////////////Minor Class/////////////////////////////////////////////////////////////////////////
////////Minor Class/////////////////////////////////////////////////////////////////////////////////////////////
///////Minor Class//////////////////////////////////////////////////////////////////////////////////////
///////////////////////////Minor Class/////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////Minor Class/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////Minor Class//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////Minor Class///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////Minor Class//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////Minor Class///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////Minor Class///////////////////////////////
/////////////////Minor Class//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////Minor Class////////////////////////////////////////////////////////////////
	
	public static String minor(int[] commonMinorNotes) {//
		int x = 0;
		//int [] commonMinorNotes = {0,1,2,4,5,7}; --------- will not need because array is up top
		int[] minorNotes = new int[commonMinorNotes.length+1];
		String[] letter = new String[minorNotes.length-1];
		Random rnd = new Random();
		for(x = 0; x< commonMinorNotes.length; x++) {//
		int swap = rnd.nextInt(commonMinorNotes.length);
		int tempt = commonMinorNotes[x];
		commonMinorNotes[x] = commonMinorNotes[swap];
		commonMinorNotes[swap] = tempt;
		
		//int[] majorNotes = new int[commonMajorNotes.length+1];
		minorNotes[x]= commonMinorNotes[swap];
		
		}//
		
		for(x = 0; x< minorNotes.length-1; x++) {//
			int swap = rnd.nextInt(minorNotes.length);
			int tempt = minorNotes[x];
			minorNotes[x] = minorNotes[swap];
			minorNotes[swap] = tempt;
		
			String notes;
			
			
	switch (minorNotes[swap]){
			
			case 0:
				notes = "a" ;
				break;
			case 1:
				notes = "b";
				break;
			case 2:
				notes = "c";
				break;
			case 3:
				notes = "d" ;
				break;
			case 4:
				notes = "e" ;
				break;
			case 5:
				notes = "f" ;
				break;
			case 6:
				notes = "g" ;
				break;
			default:
				notes ="A";
				break;
			
		}
	//String[] letter = new String[majorNotes.length-1];
	letter[x] = notes; 
		}
	
		return Arrays.toString(letter);
	}
	
	///////////////////Major Class//////////////////////////////////////////////	
///////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////Major Class/////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////Major Class///////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////Major Class//////////////////////////////////////////////////////////////////////////
//////////////////////Major Class/////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////Major Class///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////Major Class///////////////////////////////////
////////////////////Major Class///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////Major Class/////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////Major Class////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////Major Class////////////////////////////////////////////////////////////////////////
	
	public static String major(int[] commonMajorNotes) {//
		int x = 0;
		//int[] commonMajorNotes = {2,3,4,6,7}; --------- will not need because array is up top
		int[] majorNotes = new int[commonMajorNotes.length+1];
		String[] letter = new String[majorNotes.length-1];
		Random rnd = new Random();
		for(x = 0; x< commonMajorNotes.length; x++) {//
		int swap = rnd.nextInt(commonMajorNotes.length);
		int tempt = commonMajorNotes[x];
		commonMajorNotes[x] = commonMajorNotes[swap];
		commonMajorNotes[swap] = tempt;
		
		//int[] majorNotes = new int[commonMajorNotes.length+1];
		majorNotes[x]= commonMajorNotes[swap];
		
		}//
		
		for(x = 0; x< majorNotes.length-1; x++) {//
			int swap = rnd.nextInt(majorNotes.length);
			int tempt = majorNotes[x];
			majorNotes[x] = majorNotes[swap];
			majorNotes[swap] = tempt;
		
			String notes;
			
			
	switch (majorNotes[swap]){
			
			case 0:
				notes = "a" ;
				break;
			case 1:
				notes = "b";
				break;
			case 2:
				notes = "c";
				break;
			case 3:
				notes = "d" ;
				break;
			case 4:
				notes = "e" ;
				break;
			case 5:
				notes = "f" ;
				break;
			case 6:
				notes = "g" ;
				break;
			default:
				notes ="A";
				break;
			
		}
	//String[] letter = new String[majorNotes.length-1];
	letter[x] = notes; 
		}
	
		return Arrays.toString(letter);
	}//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String majorFive(int [] majorFifths) {
		Random rnd = new Random();
		int [] chord = new int[majorFifths.length];
		ArrayList<String> ChordnLetters = new ArrayList();
		int [] ranMajNotes = {0,1,2,4,5,7,0,1,2,4,5,7};
		String [] chordrndNotes = new String[(ranMajNotes.length)*2];
		int [] ranMajNotes2 = new int[ ranMajNotes.length];
		/* to insure I have the proper set of notes in combination with chords, the number
		of notes in this array is 12 making the array size 12, so array.size-1, next set will have to convert these notes back to letters
		and have them randomly organized twice for optimal order(other wise it will start with the same note every time)*/
		////////////////////// for random notes///////////////////////
		////////////////////// for random notes///////////////////////
		////////////////////// for random notes///////////////////////
		////////////////////// for random notes///////////////////////
		String[] rndLetter = new String[ranMajNotes.length];
		////////////////////// for random notes///////////////////////
		for(int x = 0; x< ranMajNotes.length-1; x++) {//
			int swap = rnd.nextInt(ranMajNotes.length);
			int tempt = ranMajNotes[x];
			ranMajNotes[x] = ranMajNotes[swap];
			ranMajNotes[swap] = tempt;
			///////////////////////////////////
			ranMajNotes2[x] = ranMajNotes[swap];
			}
		
			for(int x = 0; x< ranMajNotes2.length-1; x++) {//
				int swap2 = rnd.nextInt(ranMajNotes2.length);
				int tempt2 = ranMajNotes2[x];
				ranMajNotes2[x] = ranMajNotes2[swap2];
				ranMajNotes2[swap2] = tempt2;
			
			String notes;
	switch (ranMajNotes2[swap2]){
			
			case 0:
				notes = "a" ;
				break;
			case 1:
				notes = "b";
				break;
			case 2:
				notes = "c";
				break;
			case 3:
				notes = "d" ;
				break;
			case 4:
				notes = "e" ;
				break;
			case 5:
				notes = "f" ;
				break;
			case 6:
				notes = "g" ;
				break;
			default:
				notes ="A";
				break;
			
		}
	rndLetter[x] = notes; 
		}
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			for(int x = 0; x< majorFifths.length-1; x++) {//
				int swap = rnd.nextInt(majorFifths.length);
				int tempt = majorFifths[x];
				majorFifths[x] = majorFifths[swap];
				majorFifths[swap] = tempt;
				///////////////////////////////////
				chord[x] = majorFifths[swap];
				}
			
				for(int x = 0; x< chord.length-1; x++) {//
					int swap2 = rnd.nextInt(chord.length);
					int tempt2 = chord[x];
					chord[x] = chord[swap2];
					chord[swap2] = tempt2;
				
		
		switch(chord[x]){
		
		case 0 :
		ChordnLetters.add("Fmaj");
		ChordnLetters.add("f");
		ChordnLetters.add("a");
		ChordnLetters.add("c");
		break;
		case 1 :
			ChordnLetters.add("Cmaj");
			ChordnLetters.add("c");
			ChordnLetters.add("e");
			ChordnLetters.add("g");
			break;
		case 2 :
			ChordnLetters.add("Gmaj");
			ChordnLetters.add("g");
			ChordnLetters.add("b");
			ChordnLetters.add("d");
			break;
		case 3 :
			ChordnLetters.add("Dmin");
			ChordnLetters.add("d");
			ChordnLetters.add("f");
			ChordnLetters.add("a");
			break;
		case 4 :
			ChordnLetters.add("Amin");
			ChordnLetters.add("a");
			ChordnLetters.add("c");
			ChordnLetters.add("e");
			break;
		case 5 :
			ChordnLetters.add("Emin");
			ChordnLetters.add("e");
			ChordnLetters.add("g");
			ChordnLetters.add("b");
			break;
		case 6 :
			ChordnLetters.add("Bmin");
			ChordnLetters.add("b");
			ChordnLetters.add("d");
			ChordnLetters.add("f#");
			break;
		}
		
				}
		
		/// for new array to convert array list "ChordLetter" into an array
		String[] arrlistConverter = new String[ChordnLetters.size()];
				
		for(int i = 0; i<ChordnLetters.size();i++) {
			 arrlistConverter[i] = ChordnLetters.get(i);
		}
		
	
	
				
				/*
		int F= 0; int C = 1; int G = 2; int D = 3; int A = 4; int E = 5; int Bm = 6;
		int[] fifths = {F,C,G,D,A,E,Bm};
		int [] majorFifths = {0,1,2,6};
		int [] minorFifths = {3,4,5,6}
				 */
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
				
				//new arraylist to combine random notes and chords/notes
		ArrayList<String> combinationList = new ArrayList<String>();
			for(int i = 0; i< ranMajNotes.length;i++ ) {
				combinationList.add(arrlistConverter[i]);
				combinationList.add(rndLetter[i]);
			}
			
			for(int x = 0;x<combinationList.size();x++) {
				chordrndNotes[x]= combinationList.get(x);
			}
		
		return Arrays.toString(chordrndNotes);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String minorrFive(int [] minorFifths) {
		Random rnd = new Random();
		int [] chord = new int[minorFifths.length];
		ArrayList<String> ChordnLetters = new ArrayList();
		int [] ranMajNotes = {2,3,4,6,7,2,3,4,6,7,2,6};
		String [] chordrndNotes = new String[((ranMajNotes.length)*2)];
		int [] ranMajNotes2 = new int[ ranMajNotes.length];
		/* to insure I have the proper set of notes in combination with chords, the number
		of notes in this array is 12 making the array size 12, so array.size-1, next set will have to convert these notes back to letters
		and have them randomly organized twice for optimal order(other wise it will start with the same note every time)*/
		////////////////////// for random notes///////////////////////
		////////////////////// for random notes///////////////////////
		////////////////////// for random notes///////////////////////
		////////////////////// for random notes///////////////////////
		String[] rndLetter = new String[ranMajNotes.length];
		////////////////////// for random notes///////////////////////
		for(int x = 0; x< ranMajNotes.length-1; x++) {//
			int swap = rnd.nextInt(ranMajNotes.length);
			int tempt = ranMajNotes[x];
			ranMajNotes[x] = ranMajNotes[swap];
			ranMajNotes[swap] = tempt;
			///////////////////////////////////
			ranMajNotes2[x] = ranMajNotes[swap];
			}
		
			for(int x = 0; x< ranMajNotes2.length-1; x++) {//
				int swap2 = rnd.nextInt(ranMajNotes2.length);
				int tempt2 = ranMajNotes2[x];
				ranMajNotes2[x] = ranMajNotes2[swap2];
				ranMajNotes2[swap2] = tempt2;
			
			String notes;
	switch (ranMajNotes2[swap2]){
			
			case 0:
				notes = "a" ;
				break;
			case 1:
				notes = "b";
				break;
			case 2:
				notes = "c";
				break;
			case 3:
				notes = "d" ;
				break;
			case 4:
				notes = "e" ;
				break;
			case 5:
				notes = "f" ;
				break;
			case 6:
				notes = "g" ;
				break;
			default:
				notes ="A";
				break;
			
		}
	rndLetter[x] = notes; 
		}
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			////////////////////// for random Chords///////////////////////
			for(int x = 0; x< minorFifths.length-1; x++) {//
				int swap = rnd.nextInt(minorFifths.length);
				int tempt = minorFifths[x];
				minorFifths[x] = minorFifths[swap];
				minorFifths[swap] = tempt;
				///////////////////////////////////
				chord[x] = minorFifths[swap];
				}
			
				for(int x = 0; x< chord.length-1; x++) {//
					int swap2 = rnd.nextInt(chord.length);
					int tempt2 = chord[x];
					chord[x] = chord[swap2];
					chord[swap2] = tempt2;
				
		
		switch(chord[x]){
		
		case 0 :
		ChordnLetters.add("Fmaj");
		ChordnLetters.add("f");
		ChordnLetters.add("a");
		ChordnLetters.add("c");
		break;
		case 1 :
			ChordnLetters.add("Cmaj");
			ChordnLetters.add("c");
			ChordnLetters.add("e");
			ChordnLetters.add("g");
			break;
		case 2 :
			ChordnLetters.add("Gmaj");
			ChordnLetters.add("g");
			ChordnLetters.add("b");
			ChordnLetters.add("d");
			break;
		case 3 :
			ChordnLetters.add("Dmin");
			ChordnLetters.add("d");
			ChordnLetters.add("f");
			ChordnLetters.add("a");
			break;
		case 4 :
			ChordnLetters.add("Amin");
			ChordnLetters.add("a");
			ChordnLetters.add("c");
			ChordnLetters.add("e");
			break;
		case 5 :
			ChordnLetters.add("Emin");
			ChordnLetters.add("e");
			ChordnLetters.add("g");
			ChordnLetters.add("b");
			break;
		case 6 :
			ChordnLetters.add("Bmin");
			ChordnLetters.add("b");
			ChordnLetters.add("d");
			ChordnLetters.add("f#");
			break;
		}
		
				}
		
		/// for new array to convert array list "ChordLetter" into an array
		String[] arrlistConverter = new String[ChordnLetters.size()];
				
		for(int i = 0; i<ChordnLetters.size();i++) {
			 arrlistConverter[i] = ChordnLetters.get(i);
		}
		
	
	
				
				/*
		int F= 0; int C = 1; int G = 2; int D = 3; int A = 4; int E = 5; int Bm = 6;
		int[] fifths = {F,C,G,D,A,E,Bm};
		int [] majorFifths = {0,1,2,6};
		int [] minorFifths = {3,4,5,6}
				 */
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
		////////////////////// for random Combination array///////////////////////
				
				//new arraylist to combine random notes and chords/notes
		ArrayList<String> combinationList = new ArrayList<String>();
			for(int i = 0; i< ranMajNotes.length;i++ ) {
				combinationList.add(arrlistConverter[i]);
				combinationList.add(rndLetter[i]);
			}
			
			for(int x = 0;x<combinationList.size();x++) {
				chordrndNotes[x]= combinationList.get(x);
			}
		
		return Arrays.toString(chordrndNotes);
	}
	
	
	
	
	
	
	
	
	
	public static String FifthKeys(int x) {
		/*
		 Cmaj > Dmin > Emin > Fmaj > Gmaj > Amin > Bmin > Cmaj
		 */
		ArrayList<String> FifthKeyList = new ArrayList<String>();
		String [] Cmaj = {"C4","D","E","F","G","A","B","C5"};
		String [] Dmin = {"D4","E","F","G","A","A#","C","D5"};
		String [] Emin = {"E4","F#","G","A","B","C","D","E"};
		String [] Fmaj = {"F4","G","A","A#","C","D","E","F5"};
		String [] Gmaj = {"G4","A","B","C","D","E","F#","G5"};
		String [] Amin = {"A4","B","C","D","E","F","G","A5"};
		String [] Bmin = {"B","C#","D","E","F#","G","A","B"};
		
		
	
		
		switch (x){
		case 0:
			for(int i = 0; i<8;i++) {
				FifthKeyList.add(Cmaj[i]);
			}
			break;
			
		case 1:
			for(int i = 0; i<8;i++) {
				FifthKeyList.add(Dmin[i]);
			}
			break;
			
		case 2:
			for(int i = 0; i<8;i++) {
				FifthKeyList.add(Emin[i]);
			}
			break;
			
		case 3:
			for(int i = 0; i<8;i++) {
				FifthKeyList.add(Fmaj[i]);
			}
			break;
			
		case 4:
			for(int i = 0; i<8;i++) {
				FifthKeyList.add(Gmaj[i]);
			}
			break;
			
		case 5:
			for(int i = 0; i<8;i++) {
				FifthKeyList.add(Amin[i]);
			}
			break;
			
		case 6:
			for(int i = 0; i<8;i++) {
				FifthKeyList.add(Bmin[i]);
			}
			break;
		}
		
	String[] notes = new String[8];
	for(int j = 0; j< 8; j++) {
		notes [j] = FifthKeyList.get(j);
	}

		return Arrays.toString(notes);
		
	}
	////////////////////////////
	///////////////////////
	/////////////////////////
	//////////////////////
	
	public static String [] MinorOctaveFugue (int letter) {
		ArrayList<String> ANotes = new ArrayList();
		int[] allNotes = {0,1,2,3,4,5,6,7,8,9,10,11,0,1,2,3,4,5,6,7,8,9,10,11};
		int [] Am = {0,2,3,5,7,8,10,0,11,9};/* note the last two numbers 11 and 9 break octave for dissonance
		If I want to reuse this code for just minor notes I will have to 11 and 9... and 0 is in there twice* it is a repeater note
		 of k in that octave*/
	
		String [] Notes = new String[Am.length];// 
		int [] MNotes = new int[Am.length];
		
		////////////////////////// Switch case begins//////////////////////
		switch (letter){
		case 0:
			MNotes = Am;
			break;
		case 1:
			int [] A_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				A_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = A_m;
			break;
		case 2:
			int [] Bm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Bm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Bm;
			break;
		case 3:
			int [] Cm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Cm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Cm;
			break;
		case 4:
			int [] C_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				C_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = C_m;
			break;
		case 5:
			int [] Dm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Dm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Dm;
			break;
		case 6:
			int [] D_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				D_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = D_m;
			break;
		case 7:
			int [] Em = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Em [x] = allNotes[Am[x]+letter];
			}
			MNotes = Em;
			break;
		case 8:
			int [] Fm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Fm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Fm;
			break;
		case 9:
			int [] F_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				F_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = F_m;
			break;
		case 10:
			int [] Gm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Gm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Gm;
			break;
		case 11:
			int [] G_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				G_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = G_m;
			break;		
		}
		/////////////////////////////END OF ABOBE SWITCH CASE//////////////////////////
		
		
		
		//////////////////////BEGINING OF NUMBER TO LETTER LOOP///////////////////
		
		for(int i = 0; i <MNotes.length; i++) {
			int LetterCon = MNotes[i];
			
		
			switch (LetterCon){
			case 0:
				String A = "A";
				ANotes.add(A);
				break;
			case 1:
				String A_ = "A#";
				ANotes.add(A_);
				break;
			case 2:
				String B = "B";
				ANotes.add(B);
				break;
			case 3:
				String C = "C";
				ANotes.add(C);
				break;
			case 4:
				String C_ = "C#";
				ANotes.add(C_);
				break;
			case 5:
				String D = "D";
				ANotes.add(D);
				break;
			case 6:
				String D_ = "D#";
				ANotes.add(D_);
				break;
			case 7:
				String E = "E";
				ANotes.add(E);
				break;
			case 8:
				String F = "F";
				ANotes.add(F);
				break;
			case 9:
				String F_ = "F#";
				ANotes.add(F_);
				break;
			case 10:
				String G = "G";
				ANotes.add(G);
				break;
			case 11:
				String G_ = "G#";
				ANotes.add(G_);
				break;		
			}
		}
		////////////////////// END OF SWITCH CASE//////////
		
		for(int x = 0; x<ANotes.size();x++) {
			Notes[x] = ANotes.get(x);
			
		}
		return Notes;
		
	} /// END OF MINOR OCTAVE FUGUE CLASS
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String Fugue(int letter) {
		int[] allNotes = {0,1,2,3,4,5,6,7,8,9,10,11,0,1,2,3,4,5,6,7,8,9,10,11};
		String[] NoTeS = MinorOctaveFugue (letter);
		int[] FugueSub = {0,1,2,3,4,5,6,7,8,9};
		int[] FugueSub2 = new int[FugueSub.length];
		int[] Fug = {0,1,2,3,4,5,6,7,8,9};
		int[] Fug2 = new int[FugueSub.length];
		int [] subject = new int [FugueSub.length];
		int [] CounterArray = new int [FugueSub.length];
		int[] CounterSubject1 = new int [FugueSub.length];
		int[] CounterSubject2 = new int [FugueSub.length];
		int [] episode = new int [FugueSub.length];
		
		Random rnd = new Random();
		
		for(int x = 0; x< FugueSub.length-1; x++) {//
			int swap = rnd.nextInt(FugueSub.length);
			int tempt = FugueSub[x];
			FugueSub[x] = FugueSub[swap];
			FugueSub[swap] = tempt;
			///////////////////////////////////
			FugueSub2[x] = FugueSub[swap];
			}
		
			for(int x = 0; x< FugueSub2.length-1; x++) {//
				int swap2 = rnd.nextInt(FugueSub2.length);
				int tempt2 = FugueSub2[x];
				FugueSub2[x] = FugueSub2[swap2];
				FugueSub2[swap2] = tempt2;
				// subject connection
				subject[x] = FugueSub2[swap2];
			}
			
			//counter subject 1 will change the last 3 of 10 notes of the subject
			//counter subject 2 will change the last 5 notes 10 of counter subject 1
			
			for(int x = 0; x< Fug.length-1; x++) {//
				int swap = rnd.nextInt(FugueSub.length);
				int tempt = Fug[x];
				Fug[x] = Fug[swap];
				Fug[swap] = tempt;
				///////////////////////////////////
				Fug2[x] = Fug[swap];
				}
			
				for(int x = 0; x< Fug2.length-1; x++) {//
					int swap2 = rnd.nextInt(Fug2.length);
					int tempt2 = Fug2[x];
					Fug2[x] = Fug2[swap2];
					Fug2[swap2] = tempt2;
					// subject connection
					CounterArray[x] = Fug2[swap2];
				}
				
				for(int x = 0; x< Fug.length-1; x++) {//
					int swap = rnd.nextInt(FugueSub.length);
					int tempt = Fug[x];
					Fug[x] = Fug[swap];
					Fug[swap] = tempt;
					///////////////////////////////////
					Fug2[x] = Fug[swap];
					}
				
					for(int x = 0; x< Fug2.length-1; x++) {//
						int swap2 = rnd.nextInt(Fug2.length);
						int tempt2 = Fug2[x];
						Fug2[x] = Fug2[swap2];
						Fug2[swap2] = tempt2;
						// subject connection
						episode[x] = Fug2[swap2];
					}
				
				
					for(int j = 0; j< subject.length; j++){
						CounterSubject1[j] = subject[j];
						}
					
				//CounterSubject1 = subject;
				CounterSubject1[9] = episode[0];
				CounterSubject1[8] = episode[1];
				CounterSubject1[7] = episode[2];
				
				for(int j = 0; j< subject.length; j++){
					CounterSubject2[j] = CounterSubject1[j];
					}
				
				
				CounterSubject2[9] = episode[9];
				CounterSubject2[8] = episode[8];
				CounterSubject2[7] = episode[7];
				CounterSubject2[6] = episode[6];
				CounterSubject2[5] = episode[5];
				
				/// arrays for converting numbers to notes
				String [] SubjectNotes = new String[subject.length];
				String [] CounterSubject1Notes = new String[subject.length];
				String [] CounterSubject2Notes = new String[subject.length];
				String [] CounterArrayNotes = new String[subject.length];
				String [] episodeNotes = new String [(subject.length)];
				// converting subject into letters
				for(int j = 0; j< subject.length; j++){
					SubjectNotes[j] = NoTeS[subject[j]];
				}
				// converting counter subject 1 into letters
				for(int j = 0; j< subject.length; j++){
					CounterSubject1Notes[j] = NoTeS[CounterSubject1[j]];
				}
				/// converting counter subject 2 into letters
				for(int j = 0; j< subject.length; j++){
					CounterSubject2Notes[j] = NoTeS[CounterSubject2[j]];
				}
				// converting episode into letters both for loops below addare added to one array
				for(int j = 0; j< subject.length; j++){
					CounterArrayNotes[j] = NoTeS[CounterArray[j]];
				}
				for(int j = 0; j< subject.length; j++){
					episodeNotes[j] = NoTeS[episode[j]];
				}
				
				String[] actualFugue = {"Subject:////",Arrays.toString(SubjectNotes),"Count1:///", Arrays.toString(CounterSubject1Notes),"Count 2:////", Arrays.toString(CounterSubject2Notes),"Episode1////",Arrays.toString(CounterArrayNotes),"Episode2:////",Arrays.toString(episodeNotes), "Subject:////",Arrays.toString(SubjectNotes), "Count1:///",Arrays.toString(CounterSubject1Notes),"Subject:////",Arrays.toString(SubjectNotes),};
				
		
		
	
		
		
		return Arrays.toString(actualFugue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String [] MinorOctaves (int letter) {
		ArrayList<String> ANotes = new ArrayList();
		int[] allNotes = {0,1,2,3,4,5,6,7,8,9,10,11,0,1,2,3,4,5,6,7,8,9,10,11};
		int [] Am = {0,2,3,5,7,8,10,0};/* note the last two numbers 11 and 9 break octave for dissonance
		If I want to reuse this code for just minor notes I will have to 11 and 9... and 0 is in there twice* it is a repeater note
		 of k in that octave*/
	
		String [] Notes = new String[Am.length];// 
		int [] MNotes = new int[Am.length];
		
		////////////////////////// Switch case begins//////////////////////
		switch (letter){
		case 0:
			MNotes = Am;
			break;
		case 1:
			int [] A_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				A_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = A_m;
			break;
		case 2:
			int [] Bm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Bm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Bm;
			break;
		case 3:
			int [] Cm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Cm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Cm;
			break;
		case 4:
			int [] C_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				C_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = C_m;
			break;
		case 5:
			int [] Dm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Dm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Dm;
			break;
		case 6:
			int [] D_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				D_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = D_m;
			break;
		case 7:
			int [] Em = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Em [x] = allNotes[Am[x]+letter];
			}
			MNotes = Em;
			break;
		case 8:
			int [] Fm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Fm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Fm;
			break;
		case 9:
			int [] F_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				F_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = F_m;
			break;
		case 10:
			int [] Gm = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				Gm [x] = allNotes[Am[x]+letter];
			}
			MNotes = Gm;
			break;
		case 11:
			int [] G_m = new int[Am.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< Am.length;x++ ) {
				G_m [x] = allNotes[Am[x]+letter];
			}
			MNotes = G_m;
			break;		
		}/////////////////////////////END OF ABOBE SWITCH CASE//////////////////////////
		
		//////////////////////BEGINING OF NUMBER TO LETTER LOOP///////////////////
		
		for(int i = 0; i <MNotes.length; i++) {
			int LetterCon = MNotes[i];
			
		
			switch (LetterCon){
			case 0:
				String A = "A";
				ANotes.add(A);
				break;
			case 1:
				String A_ = "A#";
				ANotes.add(A_);
				break;
			case 2:
				String B = "B";
				ANotes.add(B);
				break;
			case 3:
				String C = "C";
				ANotes.add(C);
				break;
			case 4:
				String C_ = "C#";
				ANotes.add(C_);
				break;
			case 5:
				String D = "D";
				ANotes.add(D);
				break;
			case 6:
				String D_ = "D#";
				ANotes.add(D_);
				break;
			case 7:
				String E = "E";
				ANotes.add(E);
				break;
			case 8:
				String F = "F";
				ANotes.add(F);
				break;
			case 9:
				String F_ = "F#";
				ANotes.add(F_);
				break;
			case 10:
				String G = "G";
				ANotes.add(G);
				break;
			case 11:
				String G_ = "G#";
				ANotes.add(G_);
				break;		
			}
		}
		////////////////////// END OF SWITCH CASE//////////
		
		for(int x = 0; x<ANotes.size();x++) {
			Notes[x] = ANotes.get(x);
			
		}
		return Notes;

	}	
	
	
	public static String [] MajorOctaves (int letter) {
		ArrayList<String> ANotes = new ArrayList();
		int[] allNotes = {0,1,2,3,4,5,6,7,8,9,10,11,0,1,2,3,4,5,6,7,8,9,10,11};
		int [] C = {0,2,4,5,7,8,9,11,0};/* note the last two numbers 11 and 9 break octave for dissonance
		If I want to reuse this code for just minor notes I will have to 11 and 9... and 0 is in there twice* it is a repeater note
		 of k in that octave*/
	
		String [] Notes = new String[C.length];// 
		int [] MNotes = new int[C.length];
		
		////////////////////////// Switch case begins//////////////////////
		switch (letter){
		case 0:
			MNotes = C;
			break;
		case 1:
			int [] C_ = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				C_ [x] = allNotes[C[x]+letter];
			}
			MNotes = C_;
			break;
		case 2:
			int [] D = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				D [x] = allNotes[C[x]+letter];
			}
			MNotes = D;
			break;
		case 3:
			int [] D_ = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				D_ [x] = allNotes[C[x]+letter];
			}
			MNotes = D_;
			break;
		case 4:
			int [] E = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				E [x] = allNotes[C[x]+letter];
			}
			MNotes = E;
			break;
		case 5:
			int [] F = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				F [x] = allNotes[C[x]+letter];
			}
			MNotes = F;
			break;
		case 6:
			int [] F_ = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				F_ [x] = allNotes[C[x]+letter];
			}
			MNotes = F_;
			break;
		case 7:
			int [] G = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				G [x] = allNotes[C[x]+letter];
			}
			MNotes = G;
			break;
		case 8:
			int [] G_ = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				G_ [x] = allNotes[C[x]+letter];
			}
			MNotes = G_;
			break;		
		case 9:
			int [] A = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				A [x] = allNotes[C[x]+letter];
			}
			MNotes = A;
			break;
		case 10:
			int [] A_ = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				A_ [x] = allNotes[C[x]+letter];
			}
			MNotes = A_;
			break;
		case 11:
			int [] B = new int[C.length];//The underscore in A_m stands for sharp.
			for(int x = 0; x< C.length;x++ ) {
				B [x] = allNotes[C[x]+letter];
			}
			MNotes = B;
			break;
	
		}/////////////////////////////END OF ABOBE SWITCH CASE//////////////////////////
		
		for(int i = 0; i <MNotes.length; i++) {
			int LetterCon = MNotes[i];
			
		
			switch (LetterCon){
			case 0:
				String Cnote = "C";
				ANotes.add(Cnote);
				break;
			case 1:
				String C_ = "C#";
				ANotes.add(C_);
				break;
			case 2:
				String D = "D";
				ANotes.add(D);
				break;
			case 3:
				String D_ = "D#";
				ANotes.add(D_);
				break;
			case 4:
				String E = "E";
				ANotes.add(E);
				break;
			case 5:
				String F = "F";
				ANotes.add(F);
				break;
			case 6:
				String F_ = "F#";
				ANotes.add(F_);
				break;
			case 7:
				String G = "G";
				ANotes.add(G);
				break;
			case 8:
				String G_ = "G#";
				ANotes.add(G_);
				break;
			case 9:
				String A = "A";
				ANotes.add(A);
				break;
			case 10:
				String A_ = "A#";
				ANotes.add(A_);
				break;
			case 11:
				String B = "B";
				ANotes.add(B);
				break;
			}
		}
		
		for(int j = 0; j< C.length;j++) {
			Notes[j]= ANotes.get(j);
		}
		return Notes;
	}
	
	
	
	
	
	
	
	public static String MajorOctMelody(int letter) {
		int[] allNotes = {0,1,2,3,4,5,6,7,8,9,10,11,0,1,2,3,4,5,6,7,8,9,10,11};
		String[] NoTeS = MajorOctaves (letter);
		int[] FugueSub = {0,1,2,3,4,5,6,7};
		int[] FugueSub2 = new int[FugueSub.length];
		int[] Fug = {0,1,2,3,4,5,6,7};
		int[] Fug2 = new int[FugueSub.length];
		int [] subject = new int [FugueSub.length];
		int [] CounterArray = new int [FugueSub.length];
		int[] CounterSubject1 = new int [FugueSub.length];
		int[] CounterSubject2 = new int [FugueSub.length];
		int [] episode = new int [FugueSub.length];
		
		Random rnd = new Random();
		
		for(int x = 0; x< FugueSub.length-1; x++) {//
			int swap = rnd.nextInt(FugueSub.length);
			int tempt = FugueSub[x];
			FugueSub[x] = FugueSub[swap];
			FugueSub[swap] = tempt;
			///////////////////////////////////
			FugueSub2[x] = FugueSub[swap];
			}
		
			for(int x = 0; x< FugueSub2.length-1; x++) {//
				int swap2 = rnd.nextInt(FugueSub2.length);
				int tempt2 = FugueSub2[x];
				FugueSub2[x] = FugueSub2[swap2];
				FugueSub2[swap2] = tempt2;
				// subject connection
				subject[x] = FugueSub2[swap2];
			}
			
			//counter subject 1 will change the last 3 of 10 notes of the subject
			//counter subject 2 will change the last 5 notes 10 of counter subject 1
			
			for(int x = 0; x< Fug.length-1; x++) {//
				int swap = rnd.nextInt(FugueSub.length);
				int tempt = Fug[x];
				Fug[x] = Fug[swap];
				Fug[swap] = tempt;
				///////////////////////////////////
				Fug2[x] = Fug[swap];
				}
			
				for(int x = 0; x< Fug2.length-1; x++) {//
					int swap2 = rnd.nextInt(Fug2.length);
					int tempt2 = Fug2[x];
					Fug2[x] = Fug2[swap2];
					Fug2[swap2] = tempt2;
					// subject connection
					CounterArray[x] = Fug2[swap2];
				}
				
				for(int x = 0; x< Fug.length-1; x++) {//
					int swap = rnd.nextInt(FugueSub.length);
					int tempt = Fug[x];
					Fug[x] = Fug[swap];
					Fug[swap] = tempt;
					///////////////////////////////////
					Fug2[x] = Fug[swap];
					}
				
					for(int x = 0; x< Fug2.length-1; x++) {//
						int swap2 = rnd.nextInt(Fug2.length);
						int tempt2 = Fug2[x];
						Fug2[x] = Fug2[swap2];
						Fug2[swap2] = tempt2;
						// subject connection
						episode[x] = Fug2[swap2];
					}
				
				
					for(int j = 0; j< subject.length; j++){
						CounterSubject1[j] = subject[j];
						}
					
				//CounterSubject1 = subject;
				CounterSubject1[7] = episode[0];
				CounterSubject1[6] = episode[1];
				CounterSubject1[5] = episode[2];
				
				for(int j = 0; j< subject.length; j++){
					CounterSubject2[j] = CounterSubject1[j];
					}
				
				
				CounterSubject2[7] = episode[7];
				CounterSubject2[0] = episode[6];
				CounterSubject2[5] = episode[5];
				CounterSubject2[4] = episode[4];
				CounterSubject2[3] = episode[3];
				
				/// arrays for converting numbers to notes
				String [] SubjectNotes = new String[subject.length];
				String [] CounterSubject1Notes = new String[subject.length];
				String [] CounterSubject2Notes = new String[subject.length];
				String [] CounterArrayNotes = new String[subject.length];
				String [] episodeNotes = new String [(subject.length)];
				// converting subject into letters
				for(int j = 0; j< subject.length; j++){
					SubjectNotes[j] = NoTeS[subject[j]];
				}
				// converting counter subject 1 into letters
				for(int j = 0; j< subject.length; j++){
					CounterSubject1Notes[j] = NoTeS[CounterSubject1[j]];
				}
				/// converting counter subject 2 into letters
				for(int j = 0; j< subject.length; j++){
					CounterSubject2Notes[j] = NoTeS[CounterSubject2[j]];
				}
				// converting episode into letters both for loops below addare added to one array
				for(int j = 0; j< subject.length; j++){
					CounterArrayNotes[j] = NoTeS[CounterArray[j]];
				}
				for(int j = 0; j< subject.length; j++){
					episodeNotes[j] = NoTeS[episode[j]];
				}
				
				String[] actual = {Arrays.toString(CounterSubject2Notes),Arrays.toString(episodeNotes)};
				
		
		
	
		
		
		return Arrays.toString(actual);
	}
	
	
	
	public static String MinorOctMelody(int letter) {
		int[] allNotes = {0,1,2,3,4,5,6,7,8,9,10,11,0,1,2,3,4,5,6,7,8,9,10,11};
		String[] NoTeS = MinorOctaves (letter);
		int[] FugueSub = {0,1,2,3,4,5,6,7};
		int[] FugueSub2 = new int[FugueSub.length];
		int[] Fug = {0,1,2,3,4,5,6,7};
		int[] Fug2 = new int[FugueSub.length];
		int [] subject = new int [FugueSub.length];
		int [] CounterArray = new int [FugueSub.length];
		int[] CounterSubject1 = new int [FugueSub.length];
		int[] CounterSubject2 = new int [FugueSub.length];
		int [] episode = new int [FugueSub.length];
		
		Random rnd = new Random();
		
		for(int x = 0; x< FugueSub.length-1; x++) {//
			int swap = rnd.nextInt(FugueSub.length);
			int tempt = FugueSub[x];
			FugueSub[x] = FugueSub[swap];
			FugueSub[swap] = tempt;
			///////////////////////////////////
			FugueSub2[x] = FugueSub[swap];
			}
		
			for(int x = 0; x< FugueSub2.length-1; x++) {//
				int swap2 = rnd.nextInt(FugueSub2.length);
				int tempt2 = FugueSub2[x];
				FugueSub2[x] = FugueSub2[swap2];
				FugueSub2[swap2] = tempt2;
				// subject connection
				subject[x] = FugueSub2[swap2];
			}
			
			//counter subject 1 will change the last 3 of 10 notes of the subject
			//counter subject 2 will change the last 5 notes 10 of counter subject 1
			
			for(int x = 0; x< Fug.length-1; x++) {//
				int swap = rnd.nextInt(FugueSub.length);
				int tempt = Fug[x];
				Fug[x] = Fug[swap];
				Fug[swap] = tempt;
				///////////////////////////////////
				Fug2[x] = Fug[swap];
				}
			
				for(int x = 0; x< Fug2.length-1; x++) {//
					int swap2 = rnd.nextInt(Fug2.length);
					int tempt2 = Fug2[x];
					Fug2[x] = Fug2[swap2];
					Fug2[swap2] = tempt2;
					// subject connection
					CounterArray[x] = Fug2[swap2];
				}
				
				for(int x = 0; x< Fug.length-1; x++) {//
					int swap = rnd.nextInt(FugueSub.length);
					int tempt = Fug[x];
					Fug[x] = Fug[swap];
					Fug[swap] = tempt;
					///////////////////////////////////
					Fug2[x] = Fug[swap];
					}
				
					for(int x = 0; x< Fug2.length-1; x++) {//
						int swap2 = rnd.nextInt(Fug2.length);
						int tempt2 = Fug2[x];
						Fug2[x] = Fug2[swap2];
						Fug2[swap2] = tempt2;
						// subject connection
						episode[x] = Fug2[swap2];
					}
				
				
					for(int j = 0; j< subject.length; j++){
						CounterSubject1[j] = subject[j];
						}
					
				//CounterSubject1 = subject;
					CounterSubject1[7] = episode[0];
					CounterSubject1[6] = episode[1];
					CounterSubject1[5] = episode[2];
					
					for(int j = 0; j< subject.length; j++){
						CounterSubject2[j] = CounterSubject1[j];
						}
					
					
					CounterSubject2[7] = episode[2];
					CounterSubject2[0] = episode[6];
					CounterSubject2[5] = episode[5];
					CounterSubject2[4] = episode[4];
					CounterSubject2[3] = episode[3];
					
					episode[7] = subject[2];
				
				/// arrays for converting numbers to notes
				String [] SubjectNotes = new String[subject.length];
				String [] CounterSubject1Notes = new String[subject.length];
				String [] CounterSubject2Notes = new String[subject.length];
				String [] CounterArrayNotes = new String[subject.length];
				String [] episodeNotes = new String [(subject.length)];
				// converting subject into letters
				for(int j = 0; j< subject.length; j++){
					SubjectNotes[j] = NoTeS[subject[j]];
				}
				// converting counter subject 1 into letters
				for(int j = 0; j< subject.length; j++){
					CounterSubject1Notes[j] = NoTeS[CounterSubject1[j]];
				}
				/// converting counter subject 2 into letters
				for(int j = 0; j< subject.length; j++){
					CounterSubject2Notes[j] = NoTeS[CounterSubject2[j]];
				}
				// converting episode into letters both for loops below addare added to one array
				for(int j = 0; j< subject.length; j++){
					CounterArrayNotes[j] = NoTeS[CounterArray[j]];
				}
				for(int j = 0; j< subject.length; j++){
					episodeNotes[j] = NoTeS[episode[j]];
				}
				
				String[] actual = {Arrays.toString(CounterSubject2Notes),Arrays.toString(episodeNotes)};
				
		
		
	
		
		
		return Arrays.toString(actual);
	}
	
	
	public static String MinorBassNotes(int mainK) {
		String [] Bass = MinorOctaves(mainK);
		ArrayList<String> BassAList = new ArrayList<String>();
		String bN1 = Bass[0];
		String bN2 = Bass[2];
		String bN3 = Bass[4];
		String bN4 = Bass[5];
		String bN5 = Bass[6];
		String [] BassNotes = {bN1, bN2, bN3, bN4,bN5};
		String[] BNotes = new String[BassNotes.length];/* at this point we have all the notes for the bass stored in a string
		 to be either organized or printed as is now, I'm not certain of which I should do. Because frankly this set of
		 bass notes should function well for any music creation without the added need to be randomly organized for the user 
		*/
		int [] bassCon = {0,1,2,3,4};
		int [] bassCon2 = new int [BassNotes.length];
		int [] Conversion = new int[BassNotes.length];
		int [] Conversion2 = new int [BassNotes.length];
		
		// this array above is used to run the bass notes through an algorithm and turn these values
				//into numbers to be turned back into values again
Random rnd = new Random();
		
		for(int x = 0; x< bassCon.length-1; x++) {//
			int swap = rnd.nextInt(bassCon.length);
			int tempt = bassCon[x];
			bassCon[x] = bassCon[swap];
			bassCon[swap] = tempt;
			///////////////////////////////////
			bassCon2[x] = bassCon[swap];
			}
		for(int x = 0; x< bassCon2.length-1; x++) {//
			int swap = rnd.nextInt(bassCon2.length);
			int tempt = bassCon2[x];
			bassCon2[x] = bassCon2[swap];
			bassCon2[swap] = tempt;
			///////////////////////////////////
			Conversion[x] = bassCon2[swap];
			}
		for(int x = 0; x< Conversion.length-1; x++) {//
			int swap = rnd.nextInt(Conversion.length);
			int tempt = Conversion[x];
			Conversion[x] = Conversion[swap];
			Conversion[swap] = tempt;
			///////////////////////////////////
			Conversion2[x] = Conversion[swap];
			}
		for(int i = 0; i<BassNotes.length; i++) {
			int tim = Conversion2[i];
			switch(tim) {
			case 0:
				BassAList.add(bN1);
				break;
			case 1:
				BassAList.add(bN2);
				break;
			case 2:
				BassAList.add(bN3);
				break;
			case 3:
				BassAList.add(bN4);
				break;
			case 4:
				BassAList.add(bN5);
				break;
			}
			
		}
		
		for(int j = 0; j<BassNotes.length; j++) {
			BNotes[j] = BassAList.get(j);
		}
	
		
		return Arrays.toString(BNotes);
			
	}
	
	
	
	
	
	
	public static String MajorBassNotes(int mainK) {
		String [] Bass = MajorOctaves(mainK);
		ArrayList<String> BassAList = new ArrayList<String>();
		String bN1 = Bass[0];
		String bN2 = Bass[1];
		String bN3 = Bass[2];
		String bN4 = Bass[4];
		String bN5 = Bass[5];
		String [] BassNotes = {bN1, bN2, bN3, bN4,bN5};
		String[] BNotes = new String[BassNotes.length];/* at this point we have all the notes for the bass stored in a string
		 to be either organized or printed as is now, I'm not certain of which I should do. Because frankly this set of
		 bass notes should function well for any music creation without the added need to be randomly organized for the user 
		*/
		int [] bassCon = {0,1,2,3,4};
		int [] bassCon2 = new int [BassNotes.length];
		int [] Conversion = new int[BassNotes.length];
		int [] Conversion2 = new int [BassNotes.length];
		
		// this array above is used to run the bass notes through an algorithm and turn these values
				//into numbers to be turned back into values again
		
	Random rnd = new Random();
		
		for(int x = 0; x< bassCon.length-1; x++) {//
			int swap = rnd.nextInt(bassCon.length);
			int tempt = bassCon[x];
			bassCon[x] = bassCon[swap];
			bassCon[swap] = tempt;
			///////////////////////////////////
			bassCon2[x] = bassCon[swap];
			}
		for(int x = 0; x< bassCon2.length-1; x++) {//
			int swap = rnd.nextInt(bassCon2.length);
			int tempt = bassCon2[x];
			bassCon2[x] = bassCon2[swap];
			bassCon2[swap] = tempt;
			///////////////////////////////////
			Conversion[x] = bassCon2[swap];
			}
		for(int x = 0; x< Conversion.length-1; x++) {//
			int swap = rnd.nextInt(Conversion.length);
			int tempt = Conversion[x];
			Conversion[x] = Conversion[swap];
			Conversion[swap] = tempt;
			///////////////////////////////////
			Conversion2[x] = Conversion[swap];
			}
		for(int i = 0; i<BassNotes.length; i++) {
			int tim = Conversion2[i];
			switch(tim) {
			case 0:
				BassAList.add(bN1);
				break;
			case 1:
				BassAList.add(bN2);
				break;
			case 2:
				BassAList.add(bN3);
				break;
			case 3:
				BassAList.add(bN4);
				break;
			case 4:
				BassAList.add(bN5);
				break;
			}
			
		}
		
		for(int j = 0; j<BassNotes.length; j++) {
			BNotes[j] = BassAList.get(j);
		}
	
		
		return Arrays.toString(BNotes);
		
	}
	
	

}//


