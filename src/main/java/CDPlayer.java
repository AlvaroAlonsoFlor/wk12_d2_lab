public class CDPlayer extends Component implements IVolume, IPlay {
    private int volume;

    public CDPlayer(String model, String make) {
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
