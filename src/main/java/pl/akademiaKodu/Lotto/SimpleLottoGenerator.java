package pl.akademiaKodu.Lotto;

import java.util.Arrays;
import java.util.List;

public class SimpleLottoGenerator implements LottoGenerator{

    @Override
    public List<Integer> generate() {
        List<Integer> list = Arrays.asList(1,5,10,15,20,26);

        return list;
    }

    @Override
    public String generateDescription() {
        return "1,5,10,15,20,26,";
    }
}
