package andrzejjozefow.adapterpatternexample.Animal;

import andrzejjozefow.adapterpatternexample.Soundable;

public class SpeakableSoundableAdapter implements Soundable{

    Speakable speakable;

    public SpeakableSoundableAdapter(Speakable speakable) {
        this.speakable = speakable;
    }

    public void makeASound() {
        speakable.speak();
    }
}
