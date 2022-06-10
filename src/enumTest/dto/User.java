package enumTest.dto;

import enumTest.enums.enumMapInitialization.A;
import enumTest.enums.enumMapInitialization.ABC;
import enumTest.role.Role;

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
