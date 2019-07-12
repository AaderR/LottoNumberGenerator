package pl.akademiaKodu.Lotto;

import java.util.*;

public class Lotto implements LottoGenerator {
    @Override
    public List<Integer> generate() {
        Set<Integer> mySet = new TreeSet<>();
        while (mySet.size() < 6) {
            int number = (int) (Math.random() * 49 + 1);
            mySet.add(number);
        }

        List<Integer> list = new ArrayList<>(mySet);
        return list;
    }

    @Override
    public String generateDescription() {
        StringBuilder score = new StringBuilder();
        for (Integer integer : generate()) {
            score.append(integer + ", ");

        }
        score.deleteCharAt(score.length()-2);         //usuwam przecinek w ostatnim miejcu
        score.append(".");                            //dorzucam kropkę

        return score.toString();
    }
}