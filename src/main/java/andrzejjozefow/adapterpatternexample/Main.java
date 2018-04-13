package andrzejjozefow.adapterpatternexample;

import andrzejjozefow.adapterpatternexample.Animal.Cat;
import andrzejjozefow.adapterpatternexample.Animal.Dog;
import andrzejjozefow.adapterpatternexample.Animal.Duck;
import andrzejjozefow.adapterpatternexample.Animal.Speakable;
import andrzejjozefow.adapterpatternexample.Animal.SpeakableSoundableAdapter;
import andrzejjozefow.adapterpatternexample.Instrument.Guitar;
import andrzejjozefow.adapterpatternexample.Instrument.Playable;
import andrzejjozefow.adapterpatternexample.Instrument.PlayableSoundableAdapter;
import andrzejjozefow.adapterpatternexample.Instrument.Trumpet;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final Speakable filemon = new Cat();
        final Speakable reksio = new Dog();
        final Speakable donald = new Duck();

        final Playable trumpet = new Trumpet();
        final Playable guitar = new Guitar();

        final SpeakableSoundableAdapter adapterFilemon = new SpeakableSoundableAdapter(filemon);
        final SpeakableSoundableAdapter adapterReksio = new SpeakableSoundableAdapter(reksio);
        final SpeakableSoundableAdapter adapterDonald = new SpeakableSoundableAdapter(donald);
        final PlayableSoundableAdapter adapterTrumpet = new PlayableSoundableAdapter(trumpet);
        final PlayableSoundableAdapter adapterGuitar = new PlayableSoundableAdapter(guitar);

        List<Soundable> soundables = Arrays.asList(
            adapterDonald,
            adapterFilemon,
            adapterReksio,
            adapterTrumpet,
            adapterGuitar
        );

        soundables.forEach(Soundable::makeASound);
    }
}
