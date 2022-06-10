package enumTest.enumMapInitialization.dto;

import enumTest.enumMapInitialization.enums.ABC;
import enumTest.enumMapInitialization.role.Role;

public class User<T extends ABC> {
    private String name;
    private Role role;
    private T status;

    public User(String name, Role role, T status) {
        this.name = name;
        this.role = role;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public T getStatus() {
        return status;
    }
    public void next(){
        status = status.next();
    }
}
