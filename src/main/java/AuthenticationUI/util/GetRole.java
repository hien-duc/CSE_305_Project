package AuthenticationUI.util;

public enum GetRole {
    PATIENT_SIDE(0),
    DOCTOR_SIDE(1);

    private final int code;

    GetRole(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
