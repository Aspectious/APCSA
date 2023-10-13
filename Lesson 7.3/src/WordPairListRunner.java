
public class WordPairListRunner {
    public static void main(String[] args)
    {
        String[] words = {"Hi", "there", "Tyler", "Sam"};
        WordPairsList list = new WordPairsList(words);
        System.out.println(list);
        // For second part below, uncomment this test:
        //System.out.println("The number of matched pairs is: " + list.numMatches());
    }
}
