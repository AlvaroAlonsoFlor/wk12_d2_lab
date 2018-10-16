public class RecordDeck extends Component implements IPlay, IVolume {
    private int volume;

    public RecordDeck(String model, String make) {
        super(model, make);
        this.volume = 5;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
