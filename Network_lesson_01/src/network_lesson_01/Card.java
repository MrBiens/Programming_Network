/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network_lesson_01;

import java.io.Serializable;

/**
 *
 * @author sbien
 */
public class Card implements Serializable{
    private String fullName;
    
    private String address;
    
    private String numberPhone;
    
    private String email;
    
    private String avatar;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Card() {
    }

    public Card(String fullName, String address, String numberPhone, String email, String avatar) {
        this.fullName = fullName;
        this.address = address;
        this.numberPhone = numberPhone;
        this.email = email;
        this.avatar = avatar;
    }
    
    
    
    
    
}
