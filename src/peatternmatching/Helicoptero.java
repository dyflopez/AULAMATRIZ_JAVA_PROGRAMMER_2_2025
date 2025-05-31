package peatternmatching;

public class Helicoptero {
    private String name;
    private String model;
    private boolean status;

    public Helicoptero(String name, String model, boolean status) {
        this.name = name;
        this.model = model;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
