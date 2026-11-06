package com.joysistvi.day20.activity;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format! Setting default placeholder.");
            this.email = "invalid@email.com";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        boolean hasDigit = false;
        if (password != null) {
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                    break;
                }
            }
        }

        if (password != null && password.length() >= 8 && hasDigit) {
            this.password = password;
        } else {
            System.out.println("Invalid password! Must be at least 8 characters and include a number.");
            this.password = "default123";
        }
    }
}
