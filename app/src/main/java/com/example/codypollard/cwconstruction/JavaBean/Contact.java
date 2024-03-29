package com.example.codypollard.cwconstruction.JavaBean;

    public class Contact {

        private int picture;
        private String fName;
        private String lName;
        private String position;
        private String phoneNumber;
        private String emailAddress;

        public Contact() {

        }

        public Contact(int picture, String fName, String lName, String position, String phoneNumber, String emailAddress) {
            this.picture = picture;
            this.fName = fName;
            this.lName = lName;
            this.position = position;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }
        public int getPicture() {
            return picture;
        }

        public void setPicture(int picture) {
            this.picture = picture;
        }

        public String getfName() {
            return fName;
        }

        public void setfName(String fName) {
            this.fName = fName;
        }

        public String getlName() {
            return lName;
        }

        public void setlName(String lName) {
            this.lName = lName;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailAddress() {
            return emailAddress;
        }
        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }
}
