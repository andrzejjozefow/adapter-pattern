package andrzejjozefow.adapterpatternexample.Instrument;

import andrzejjozefow.adapterpatternexample.Soundable;

public class PlayableSoundableAdapter implements Soundable{

    Playable playable;

    public PlayableSoundableAdapter(Playable playable) {
        this.playable = playable;
    }

    public void makeASound() {
        playable.play();
    }
}
