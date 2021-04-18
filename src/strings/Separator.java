package strings;

/**
 * Practice: Create a method that will modify a string with invalid separators ("|") to a certain given symbol
 * eg: given "Hello|World" will return "Hello_World" or "Hello,World" depending on the expected separator
 */


public class Separator {


    public static void main(String[] args) {

        System.out.println(convert("Hello|World|This|That", '_'));
        System.out.println(convert("Hello|World|This|That", ','));

    }

    public static String convert(String inputWord, char symbol) {

        char [] characters = inputWord.toCharArray();
        StringBuilder modifiedWord = new StringBuilder();

        for (char character : characters) {
            if (character == '|') {
                character = symbol;
            }
            modifiedWord.append(character);
        }

        return modifiedWord.toString();
    }
}
