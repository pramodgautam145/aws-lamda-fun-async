package com.pramod.aws.lamda.s3sns;

public class PatientCheckoutEvent {
    public String firstName;
    public String middleName;
    public String ssn;

    @Override
    public String toString() {
        return "PatientCheckoutEvent{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }



    public PatientCheckoutEvent() {
    }

    public PatientCheckoutEvent(String firstName, String middleName, String ssn) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.ssn = ssn;
    }
}
