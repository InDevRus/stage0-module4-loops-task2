package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        var phrase = "";
        var position = 0;
        while (position < chars.length) {
            var symbol = chars[position];
            phrase += symbol;
            position += 1;
        }

        System.out.print(phrase);
    }
}
