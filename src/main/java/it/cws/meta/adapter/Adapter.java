package it.cws.meta.adapter;

public class Adapter implements Vga {
    private Hdmi hdmi;

    @Override
    public String traitement() {
        return null;
    }

    public Hdmi getHdmi() {
        return hdmi;
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
