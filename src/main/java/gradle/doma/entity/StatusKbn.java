package gradle.doma.entity;

import org.seasar.doma.Domain;

@Domain(valueType = String.class)
public class StatusKbn {
    private String value;

    public String getValue() {
        return value;
    }

    public StatusKbn(String value) {
        this.value = value;
    }
}
