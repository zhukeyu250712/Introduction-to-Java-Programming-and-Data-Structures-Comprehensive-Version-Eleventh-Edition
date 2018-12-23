import java.util.stream.Stream;

public class Exercise30_13 {
  public static void main(String[] args) {
    // Prompt the user to enter a string
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    System.out
        .println("The number of letters is " + countLetters(s));
  }

  public static int countLetters(String s) {
    return (int)Stream
        .of(Exercise30_10.toCharacterArray(s.toCharArray()))
        .filter(ch -> Character.isLetter(ch)).count();
  }
}