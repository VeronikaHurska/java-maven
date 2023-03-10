package task3.MusicInstrument;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(6));
        instruments.add(new Tube(46));
        instruments.add(new Drums(78));
        instruments.add(new Drums(23));


        instruments.forEach( instrument -> instrument.play());
    }
}
