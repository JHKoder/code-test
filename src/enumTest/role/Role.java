package enumTest.role;


public enum Role {
    USER("ROLE_USER", "유저"),
    SELLER("ROLE_SELLER", "판매자"),
    COURIER("ROLE_COURIER", "배달원"),
    ADMIN("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;

    Role(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }
}
