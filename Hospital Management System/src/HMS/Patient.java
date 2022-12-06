package HMS;

public class Patient {

    private String patID;
    private String name;
    private String healthCardNum;
    private String address;
    private String city;
    private String dBirth;
    private String sex;
    private String diagnosis;

    //getters
    public String getName() {return name;}
    public String getHealthCardNum() {return healthCardNum;}
    public String getAddress() {return address;}
    public String getCity() {return city;}
    public String getdBirth() {return dBirth;}
    public String getSex() {return sex;}
    public String getDiagnosis() {return diagnosis;}
    public String getPatID() {return patID;}

    //setters
    public void setPatID(String patID) {this.patID = patID;}
    public void setName(String name) {this.name = name;}
    public void setHealthCardNum(String healthCardNum) {this.healthCardNum = healthCardNum;}
    public void setAddress(String address) {this.address = address;}
    public void setCity(String city) {this.city = city;}
    public void setdBirth(String dBirth) {this.dBirth = dBirth;}
    public void setSex(String sex) {this.sex = sex;}
    public void setDiagnosis(String diagnosis) {this.diagnosis = diagnosis;}

    //Display all the data for a patient
    public void printPatientData(){
        System.out.printf("%-20s %-20s\n", "Patient ID: ", this.patID);
        System.out.printf("%-20s %-20s\n", "Patient Name: ", this.name);
        System.out.printf("%-20s %-20s\n", "Health Card Number: ", this.healthCardNum);
        System.out.printf("%-20s %-20s\n", "Address: ", this.address);
        System.out.printf("%-20s %-20s\n", "City: ", this.city);
        System.out.printf("%-20s %-20s\n", "Date of Birth: ", this.dBirth);
        System.out.printf("%-20s %-20s\n", "Sex: ", this.sex);
        System.out.printf("%-20s %-20s\n", "Diagnosis: ", this.diagnosis);
        System.out.println("------------------------------------------------------");
    }
}
