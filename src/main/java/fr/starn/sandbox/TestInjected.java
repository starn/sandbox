package fr.starn.sandbox;

/**
 * Created by steph on 06/12/2022.
 */
public class TestInjected {
    private String value;

    public TestInjected(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
