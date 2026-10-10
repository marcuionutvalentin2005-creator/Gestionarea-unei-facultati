package Fereastra.Butoane;

import java.util.Random;

public class RandomNr {
    public int random()
    {
        Random random = new Random();
        return 10000 + random.nextInt(90000);
    }
}
