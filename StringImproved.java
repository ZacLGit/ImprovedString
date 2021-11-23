package unisa.util;

/**
 * This program replaces the string class with a mutable string.
 * <p>
 * This class represents a character array and provide functionalities need to
 * do basic string processing. It contains an array of characters,
 * representing a textual string. 
 * <p>
 * <strong>Overview</strong><p>
 * In Java, Strings are a great device for storing arrays of characters.  One limitation of 
 * Strings in Java, however (there is always at least one), is that they are immutable (ie. 
 * they cannot be changed once created). Your mission is to create a mutable String Class 
 * (called StringImproved) with some clever features. You will also need to ensure that 
 * your program is bug free.  Your StringImproved Class should be uncrashable as possible. 
 * If your code detects faulty/incorrect input it should handle it as instructed in this java API 
 * <p>
 * <strong>Data Structure</strong><p>
 * To make your life easier you will be provided with an API specification 
 * (just like the JavaDocs you use for your programming).  You must use a char array to store your 
 * String in your Class. You are not permitted to use any collection Classes in this assignment. You 
 * will need to implement the entire class based on the API specification. This class will encapsulate 
 * all the functionality required.
 * <p>
 * <strong>Testing</strong><p>
 * A test program is also provided for you to use.  Please read it carefully as you will be expected
 * to generate your own in assignment 2.  Use the test driver as a starting point to test your Class
 * as thoroughly as possible.  Note that the marker reserves the right to test more conditions 
 * if they think of them.
 * <p>
 * <strong>How to Do The Assignment</strong><p>
 * I suggest you do your assignment in the following order
 * <ul>
 * <li>Create all the method signatures in the StringImproved Class. Each method 
 * 		should just be blank (with a return null or -1 if necessary).
 * <li>Compile and make sure that the program works (well, technically it won't because the methods are empty, 
 * but make sure it compiles with no error). 
 * <li>Write the constructors.  Test.
 * <li>Write the length method. Test.
 * <li>Write the charAt method. Test.
 * <li>Write the endsWith method. Test.
 * <li>Write the toLowerCase method.  Test.
 * <li>Write the toUpperCase method. Test.
 * <li>Write the lastIndexOf method. Test.
 * <li>Write the increaseArray method. Test (note there is no provided test you will need to do it).
 * <li>Write the shrinkArray method. Test (note there is no provided test you will need to do it).
 * <li>Write the contains method. Test.
 * <li>Write the substring method. Test.
 * <li>Write the insert method.  Test.
 * <li>Write the append method. Test.
 * <li>Write the deleteSubString int int method. Test.
 * <li>Write the deleteSubString string method. Test. 
 * <li>Write the deleteCharAt method. Test.
 * <li>Write the prepend method. Test.
 * <li>Write the replaceString method. Test.
 * <li>Write the sort (advanced students) method. Test.
 * </ul>
 * <p>
 * Note that when you add functionality you may have to add test scenarios to other test methods to 
 * ensure you have covered all the possibilities. 
 * <p>
 * <strong>Additional Requirement.</strong><p>
 * In addition to what is above there are a number of requirements for this assignment. Most of these are 
 * to introduce interesting problems for you to solve and must be obeyed. 
 * <ul>
 * <li>	As you are programming you will also need to comment your code thoroughly in each of your methods.   
 * <li>	Whenever you use a String class (for example passed as a parameter) you can only use the charAt() method of 
 *      String to get content.  Sorry we can’t make this too easy.  
 * <li>	The char array in your structure must always have only the space that is required.  
 * <li> You are not permitted to use any String methods in this class.  If you use a String method you will get 
 *      zero for the offending method. There is one exception you are permitted to use the Strings toCharArray 
 *      method
 * </ul>
 * <p>
 * <strong>How We Will Mark Your Assignment.</strong><p>
 * <ul>
 * <li>We will run javadoc on your code to see if your code generates the API correctly.
 * <li>We will read your code to look for style and commenting problems.
 * <li>We will use the test driver to test your testing code. 
 * </ul>
 * <p>
 * <strong>Marking Scheme</strong><p>
 * 75 Percent for it working totally correct (eg no issues with the testing system)<br>
 * 25 Percent for commenting/style of code etc...<br>
 * <p>
 * Hint:  Many of the more complicated methods can use the easier methods to do part of their job.  
 * For instance if you have a method to delete some string you can use contains and delete (by index)
 * together to achieve your aim.
 * <p>
 * Date 20130801
 * @version 1.2
 * @author G Stewart Von Itzstein and You
 */
public class StringImproved {
	/**
	 * The storage for the characters in the StringImproved class.
	 */
	char[] content;

	
	/**
	 * Returns the string representation of the StringImproved object
	 * This method is complete so you can see how it goes together.
	 * 
	 * @return String representation
	 */	
	public String toString() {
		if (content==null) return "INCOMPLETE PROGRAM";
		if (content.length == 0) return "";
		else return subString(0,content.length);
	}
	
	
	
	
	
	
	/**
	 * Constructor to create a character array with the initial contents of nothing.
	 * <p>
	 * Difficulty 1/10 
	 */
	public StringImproved() {
		content = new char[] {};
	}

	/**
	 * Constructor to create a character array with the initial contents of the
	 * supplied char. 
	 * <p>
	 * Difficulty 1/10
	 * @param newChar Create the StringImproved using the char as the first char in the array
	 */
	public StringImproved(char newChar) {
		content = new char[1];
		content[0] = newChar;
	}

	/**
	 * Constructor to create a character array with the initial contents of the
	 * supplied char array. 
	 * <p>
	 * Difficulty 1/10
	 * @param newString Create the StringImproved using the char array.
	 */
	public StringImproved(char[] newString) {
		content = new char[newString.length];
		for(int i = 0; i < newString.length; i++){
			content[i] = newString[i];
		}
	}


	/**
	 * Constructor to create a character array with the initial contents of the
	 * supplied java.lang.String. 
	 * <p>
	 * Difficulty 1/10
	 * @param newString The string to create a character array with.
	 */
	public StringImproved(String newString) {
		content = newString.toCharArray();
	}

	
	/**
	 * Append the nominated string to the StringImproved object.
	 * <p>
	 * Difficulty 1/10 (if your clever)
	 * @param newString The string to append to the existing string.
	 * @return True if successful false otherwise.
	 */	
	public boolean append(String newString) {
		//break down string into array
		char[] newArray = newString.toCharArray();
		//clone the old array
		char[] oldArray = content.clone();
		//create the new array for content
		content = new char[content.length + newArray.length];
		
		//first recreate the old array within content
		for(int i = 0; i < oldArray.length; i++){
			content[i] = oldArray[i];
		}
		
		//second add the new array to content from where the old array stopped
		for(int j = 0; j < newArray.length; j++){
			for(int h = oldArray.length; h < content.length; h++){
				content[h] = newArray[j];
			}
		}
		
		//if String appended return true
		if(content.length > oldArray.length){
			return true;
		}
		//else String wasn't appended return false
		return false;
	}

	

	/**
	 * Get the character at the specified index. The index is an integer value
	 * ranging from 0 to (length - 1), specifying the position of the character
	 * in the character array. For example, "w" has an index of 6 inside
	 * "Hello world."
	 * <p>
	 * Normally you would use exceptions to report error but in this case we are going to return \0 
	 * in any case where the result will not make sense (e.g. index > than length)
	 * <p>
	 * Difficulty 2/10
	 * 
	 * @param location The index of the character required.
	 * @return The character at the specified index. Return \0 in the event of an error.
	 */	
	public char charAt(int location) {
		//set default value for the return char
		char c ='\0';
		//reset counter
		int counter = 0;
		
		//check for errors
		if(location>=0){
			
		//while counter is not the same as location and less than length add 1 to counter
		while(counter < content.length){
			
			//if counter equals location then char equals contents location
			if(counter == location) {
				
				//if charAt found then set content to char
				c = content[location];
				}
			counter += 1;
			}
				//return location char value
				return c;
				}
		
			else{
				return c;
			}
		
}
	 
	

	/**
	 * Checks if the current StringImproved contains the nominated subString.
	 * <p>
	 * HINT:  Think about using two loops.  The outer loop checks against each character
	 * in your character array.  When you detect the first matching letter in the search subString 
	 * you use an inner loop to check if the rest of the characters match.
	 * <p>
	 * Difficulty: 10/10
	 * @param subString The nominated string to search for. 
	 * @return The position of the located substring in the object -1 otherwise.
	 */	
	public int contains(String subString) {
		//break the subString down into an array
		char[] subArray = subString.toCharArray();
		//location of contents
		int location = 0;
		//check for false starts
		boolean check = false;
		
		//for each item in content check if it is the same as the first item in subArray
		for(int i = 0; i < content.length; i++){

				//if match found check rest of content within the subArray length
					if(content[i] == subArray[0]){
						//save location
						location = i;
						
						//for each item in subArray check to see if it is within contents
						for(int j = location, k = 0; k < subArray.length; j++, k++){
							
							//check each item in subArray against content at location
							if(content[j] == subArray[k]){
								check = true;
							}else{
								check = false;
							}
						}
					}
					//if worked return location
					if(check == true){
						return location;
					}
		}
	//if not there return -1
	return -1;
}
	
	
	
	/**
	 * Delete the character at the nominated position.
	 * <p>
	 * Difficulty 1/10 (if your clever)
	 * @param delChar The position of the character to delete.
	 * @return Returns true if successful false otherwise.
	 */
	public boolean deleteCharAt(int delChar) {
		//check for errors
		if(delChar < 0 || delChar > content.length){
		return false;
		}
		
		//recreate content
		deleteSubString(delChar, delChar +1);
		//if worked return true
		return true;
	}

	
	
	



	/**
	 * Delete the substring nominated by the index parameters.
	 * <p>
	 * Difficulty 5/10
	 * @param start The first position to start the deletion.
	 * @param finish The first position after the last character to be deleted. 
	 * @return The start position of the deletion if successful -1 otherwise.
	 */
	public int deleteSubString(int start, int finish) {		
		//check for errors
		if(start >= 0 && finish <= content.length){	
			
			//recreate content
			for(int i = finish, k = start; i < content.length; i++, k++){
				content[k] = content[i];
			}
			//shrink content
			shrinkArray(content.length - (finish - start));		
		}
		else{
			return -1;
		}
		
		//if worked return start point
		return start;	
		
	}
	
	
	
	



	/**
	 * Delete the nominated string from the StringImproved object.
	 * <p>
	 * Difficulty 7/10 Easier if you are clever.
	 * @param delSubString The substring to delete.
	 * @return Returns the index of the deleted substring -1 otherwise.
	 */
	public int deleteSubString(String delSubString) {
		//find if the subString is in content
		int there = contains(delSubString);
		//get the length of the subString
		int length = delSubString.length();
		
		//check for errors
		if(there < 0 || there > content.length){
			return -1;
		}
		
		//delete bug quick fix, to get the correct length
		if(there != 0){
			length += 1;
		}
		
		if(there < length){
			
			//recreate content and delete the subString
			deleteSubString(there, length);
		}else{
			
			//if contains returns a values greater length use this to get around the error
			deleteSubString(there, there + length -1);
		}
		//return location of subString
		return there;
	}

	
	



	/**
	 * Check if the StringImproved object ends with the nominated string. 
	 * <p>
	 * Difficulty 6/10
	 * @param subString The string to check.
	 * @return true. If found false otherwise.
	 */	
	public boolean endsWith(String subString) {
	
		//create array for subString
		char[] subArray = subString.toCharArray();
		
		//check if subString is less than or equal to content
		if(subArray.length <= content.length){
			
			//if true start from end of subArray and work back
			for(int j = subArray.length -1; j > 0; j--){
				
				//start at end item the work back
				for(int i = content.length -1; i > 0; i--){
					
					//check if subArray item is the same as content item
					if(subArray[j] == content[i]){
						return true;
					}
				}
			}
		}
				return false;
		
	}

	


	/**
	 * Increase the capacity of the array to accommodate a different size string. This
	 * method is a private method, to be used internally whenever the size of
	 * the array required is different than the current array. This method will not
	 * alter the contents of the current character array. This method resizes it to the 
	 * new size specified.  If the new size is smaller than the current size it will fail.
	 * <p>
	 * Difficulty 3/10
	 * @param newSize The new size of the array.
	 * @return True if successful false if not.  
	 */	
	private boolean increaseArray(int newSize) {
		//save old size of content
		char[] oldContent = content;
		
		//if newSize is smaller than oldContent then there is input error  
		if(newSize < oldContent.length){
			return false;
		}
		
		//create new size for content
		content = new char[newSize];
		//iterate through array
		int count = 0;
		
		//create new array
		for (char c : oldContent){
			content[count++] = c;
		}
		
		//if changed return true
		return true;
	}


	



	/**
	 * Insert the nominated string at the index.
	 * <p>
	 * Difficulty 7/10
	 * @param insertionString The string to insert into StringImproved object.
	 * @param index The position to insert at.
	 * @return True if successful false otherwise.
	 */	
	public boolean insert(String insertionString, int index) {
		//check for errors
		if (index < 0 || index > content.length){
			return false;
		}
		//break down the string
		char[] insArray = insertionString.toCharArray();
		//save old content with a minus of index to length
		char[] oldArray = new char[content.length - index];
		
		//add each item to old array after the index
		for (int i = index, j = 0; i < content.length; i++, j++){
			oldArray[j] = content[i];
		}
		
		//increase array size to fit insert content
		increaseArray(insArray.length + content.length);
		
		//increment through the list with counter
		int count = index;

		//insert insArray into content at index
		for (char c : insArray){
			content[count++] = c;
		}
		
		//insert the rest of old content after the index point and insArray
		for (char c : oldArray){
			content[count++] = c;
		}
		
		//check to see if worked and return true
		if (content != oldArray){
			return true;
		}
		
		//if it didn't work return false
		return false;
	}
	
	
	
	
	/**
	 * Find the last instance of the character in the StringBuffer.
	 * <p>
	 * Difficulty 3/10
	 * @param ch The character to search for.
	 * @return The index of the last instance of the nominated character.  -1 otherwise.
	 */	
	public int lastIndexOf(char ch) {
		//save the location of where the char is found
		int lastLocation = -1;
		
		//check each item in array for supplied character
		for(int i = 0; i < content.length; i++){
			
			//if char is found save lastLocation
			//if char found again and is greater than lastLocation save new location
			if(ch == content[i] && content[i] > lastLocation){
			
			//change the location
			lastLocation = i;			
			}
		}

		//if char wasn't there return -1 else return lastLocation
		return lastLocation;
	}


	

	/**
	 * Returns the length of the string. The length of the string is the number
	 * of characters, digits, and punctuation, including space, in the string.
	 * For example, "Hello" has a length of 5, and "Hello world." is length 12.
	 * <p>
	 * Difficulty: 1/10
	 * @return The length of the string. -1 in the event of an error.
	 */	
	public int length() {
		//resets counter
		int counter = 0;
		
		//check for errors
		if(content.length >= counter){
			//for each item in the array counter is increased by 1
			for(char c : content){ 
				counter += 1;
				}
			//returns the string length
			return counter;
		}else{
			return -1;
			}
	}


	



	/**
	 * Prepend the nominated string to the StringImproved object.
	 * <p>
	 * Difficulty 1/10 (if your clever)
	 * @param newString The string to append.
	 * @return True if successful false otherwise.
	 */	
	public boolean prepend(String newString) {
		//change newString to char array
		char[] subArray = newString.toCharArray();
		//save old content
		char[] oldContent = content.clone();
		
		//check if there is anything being prepended
		if(newString != ""){
			//new size for content
			increaseArray(subArray.length + content.length);
		
			//for each item in subArray add to the start of content
			for(int i = 0; i < subArray.length; i ++){
				content[i] = subArray[i];
			}
		
			//for each item in oldContent add after subArray length
			for(int i = 0, j = subArray.length; j < content.length; j++, i++){
				content[j] = oldContent[i];
			}
			return true;
		}
		//else false 
		return false;
	}
	
	
	
	
	
		
		
	
	/**
	 * Replace the nominated string in the StringImproved object with the specified String.
	 * <p>
	 * Difficulty 10/10 if you do it the hard way 2/10 if you do it the easy way.
	 * @param oldSubString The string to replace.
	 * @param newSubString The string to insert into the location of the old string.
	 * @return True if successful false otherwise.
	 */	
	public boolean replaceString(String oldSubString, String newSubString) {
		//get the replace location
		int location = contains(oldSubString);
		
		//check for errors
		if(location < 0 || newSubString.length() > content.length){
			return false;
		}

		//if oldString is at the end of content just shrink the array
		if(location +1 == content.length){
			//shrink array by one
			shrinkArray(content.length -1);
		}
		//else delete
		else{
			
		//delete oldSubString from content
		deleteSubString(oldSubString);
		}
		
		//insert newSubString at location
		insert(newSubString, location);

		return true;
		
	}
	
	
	

	/**
	 * Shrink the capacity of the array to accommodate a different size string. This
	 * method is a private method, to be used internally whenever the size of
	 * the array required is different than the current array. This method can destroy the 
	 * contents of the current character array. This method resizes it to the 
	 * new size specified.  If the new size is smaller than the current size it will fail.
	 * <p>
	 * Difficulty 3/10
	 * @param newSize The new size of the array
	 * @return True if successful false if not.  
	 */	
	private boolean shrinkArray(int newSize) {
		//if nothing changed return false
		if(content.length < newSize){
		return false;
		}
		
		//save old size of content
		char[] oldContent = new char[newSize];
		
		//place items back into content
		for(int i = 0; i < newSize; i++){
			 oldContent[i] = content[i];
		}
		
		//recreate content
		content = oldContent;
	
		//if size was changed the return true
		return true;
	}





	/**
	 *  <strong>Advanced Students</strong>
	 *  Not required to get full marks for non advanced students.  Feel free to have a go though.
	 *  Sorts the characters in the StringImproved object using mergeSort.
	 *  <p>
	 *  Difficulty 12/10
	 *  <p>
	 *  Must write own code not use bundled code in API
	 */
	public void sort() {
		
	}
	
	
	

	/**
	 * Extract a subsection of the character array. The returned string 
	 * contains characters from the start (inclusive) to the character
	 * before end. The existing character array will not be changed after
	 * calling this method. For example, calling substring (3, 7) on
	 * "Hello World." returns "lo W" You must not use any java classes from the
	 * java API for this method.
	 * <p>
	 * Difficulty 3/10
	 * @param start The beginning index, inclusive.
	 * @param end The end index, exclusive.
	 * @return the specified substring.  null in the event of an error
	 */
	public String subString(int start, int end) {
		//create the default value
		String newString = "";
		//error catch return null value
		if(start > end || start < 0 || start > content.length || end > content.length){
			return null;
		}else{
		//for each item in content within the start and end parameters add to the new string
		for(int i = start; i < end; i++){
				newString += content[i];
			}
		}
		return newString;
	}





	/**
	 * Convert all characters of the character array to lower case. For all
	 * characters in the character array, if it is already lower case, it
	 * remains lower case; if it is upper case, it will be converted to lower
	 * case. This only applies to characters. Digits and punctuation are not
	 * affected. You must not use any java classes from the java API for this
	 * method. HINT: There might be a method call in another class that will 
	 * prove useful (other than the String class)
	 * <p>
	 * Difficulty 2/10
	 * @return The lowercase representation of the string.
	 */	
	public String toLowerCase() {
		//iterate though content
		int index = 0;
		
		//convert each character in content to lower case
		for(char c : content){
			content[index++] = Character.toLowerCase(c);
		}
		
		//return the new content as a string
		return new String(content);
	}



	/**
	 * Convert all characters of the character array to upper case. For all
	 * characters in the character array, if it is already uppercase, it remains
	 * uppercase; if it is lowercase, it will be converted to upper case. This
	 * only applies to characters. Digits and punctuation are not affected. You
	 * must not use any java classes from the java API for this method. HINT: There 
	 * might be a method call in another class that will prove useful (other 
	 * than the String class)
	 * <p>
	 * Difficulty 2/10
	 * @return The uppercase representation of the string.
	 */	
	public String toUpperCase() {
		//iterate though content
		int index = 0;
		
		//convert each character in content to upper case
		for(char c : content){
			content[index++] = Character.toUpperCase(c);
		}
		
		//return the new content as a string
		return new String(content);
	}

}
