package pl.akademiaKodu.Lotto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LottoController {

    private LottoGenerator lottoGenerator;

    /*
    Jeśli mamy pole typu interfejsowego to
    przy inicjalizacji zmiennej musi stworzyć
    obiekt klasy, która implementuje dany interfejs
    czyli w tym przypadku LottoGenerator
     */
    public void setLottoGenerator(LottoGenerator lottoGenerator) {
        this.lottoGenerator = lottoGenerator;
    }

    @GetMapping("/")
    public String generateRandomData(ModelMap map) {
        setLottoGenerator(new Lotto());
        map.put("numbers", lottoGenerator.generateDescription());

        return "lotto";

    }


}
