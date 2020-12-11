import java.util.Random;

public class ServerNameGenerator {

    public static String getRandomWord(String[]words) {
        Random random= new Random();
        int element = random.nextInt(words.length);
        return words[element];
    }

    public static void main(String[] args) {
        String[] adjectives = {"smooth","large","small","medium","red","orange","yellow","sticky","flat","round"};
        String[] nouns = {"girl", "boy", "friend", "gingerbread", "cookie", "house", "snow", "santa", "winter", "tree"};

        System.out.printf("Here is your server name:%n%s-%s",getRandomWord(nouns),getRandomWord(adjectives));
    }
}
