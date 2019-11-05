package com.hui.blog.bean;

public class User {
    private Long userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userProfilePhoto;

    private Long userRegistrationTime;

    private Long userUpdateTime;

    private Integer userAge;

    private Integer userTelephoneNumber;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserProfilePhoto() {
        return userProfilePhoto;
    }

    public void setUserProfilePhoto(String userProfilePhoto) {
        this.userProfilePhoto = userProfilePhoto == null ? null : userProfilePhoto.trim();
    }

    public Long getUserRegistrationTime() {
        return userRegistrationTime;
    }

    public void setUserRegistrationTime(Long userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime;
    }

    public Long getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Long userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserTelephoneNumber() {
        return userTelephoneNumber;
    }

    public void setUserTelephoneNumber(Integer userTelephoneNumber) {
        this.userTelephoneNumber = userTelephoneNumber;
    }
}