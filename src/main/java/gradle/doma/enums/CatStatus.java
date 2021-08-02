package gradle.doma.enums;

import org.seasar.doma.Domain;

@Domain(valueType = String.class, factoryMethod = "of")
public enum CatStatus {
    ACTIVE("1"),
    DEACTIVE("0");

    private final String value;

    private CatStatus(String value) {
        this.value = value;
    }

    public static CatStatus of(String value) {
        for (CatStatus catStatus : CatStatus.values()) {
            if (catStatus.value.equals(value)) {
                return catStatus;
            }
        }
        throw new IllegalArgumentException(value);
    }

    public String getValue() {
        return value;
    }
}
