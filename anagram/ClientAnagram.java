public class ClientAnagram{
	public static void main(String[] args){
		Anagram a1 = new Anagram("School Master");
		Anagram a2 = new Anagram("The Classroom");
		a1.isAnagram(a2);
	}
}