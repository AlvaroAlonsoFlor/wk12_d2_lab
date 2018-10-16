import java.util.ArrayList;

public class MusicSystem implements IConnect {
    private String name;
    private Radio radio;
    private ArrayList<Component> components;

    public MusicSystem(String name, Radio radio) {
        this.name = name;
        this.radio = radio;
        this.components = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Radio getRadio() {
        return radio;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }


    public void addComponent(Component component) {
        this.components.add(component);
    }
}
