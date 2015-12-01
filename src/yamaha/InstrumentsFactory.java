package yamaha;

/**
 *
 * @author alejandramartinez1
 */
public class InstrumentsFactory implements YamahaInstrumentsFactory {

    @Override
    public Piano createPiano() {
        Piano piano = new Piano.Builder("Yamaha 007", 60000, 2).build();
        return piano;
    }

    @Override
    public Guitar createGuitar() {
        Guitar guitar = new Guitar.Builder("Silver wood", 10000, 5).build();
        return guitar;
    }

    @Override
    public Drum createDrum() {
        Drum drum = new Drum.Builder("Drumer stripe", 15000, 20).build();
        return drum;
    }
    
}
