package org.omega.omegaerp.coms.requests;

public class UserAuthRequest {
    private String username;
    private String password;
    private String macAddress;

    public UserAuthRequest() {
    }

    public UserAuthRequest(String username, String password, String macAddress) {
        this.username = username;
        this.password = password;
        this.macAddress = macAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}
