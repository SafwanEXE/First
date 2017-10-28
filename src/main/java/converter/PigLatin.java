package main.java.converter;

public class PigLatin {
	
	
	public String convertWord(String word){
		word=word.toLowerCase();
		String _newWord=null;
		char initial=word.charAt(0);
		
		if(initial =='a'||initial =='u'||initial =='e'||initial=='o'||initial=='i') {
			_newWord=word.concat("way");
		}
		else {
		_newWord=word.substring(1)+word.charAt(0)+"ay";
		}
		return _newWord;
	}
	
	

}
