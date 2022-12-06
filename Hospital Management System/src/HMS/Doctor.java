package HMS;

public class Doctor {
    private String docID;
    private String docName;
    private int docQualID;
    private String address;
    private String city;
    private String phoneNum;
    private int salary;
    private String joinDate;
    private String email;

    //getters
    public String getDocID() {return docID;}
    public String getDocName() {return docName;}
    public int getDocQualID() {return docQualID;}
    public String getAddress() {return address;}
    public String getCity() {return city;}
    public String getPhoneNum() {return phoneNum;}
    public int getSalary() {return salary;}
    public String getJoinDate() {return joinDate;}
    public String getEmail() {return email;}

    //setters
    public void setDocID(String docID) {this.docID = docID;}
    public void setDocName(String docName) {this.docName = docName;}
    public void setDocQualID(int docQualID) {this.docQualID = docQualID;}
    public void setAddress(String address) {this.address = address;}
    public void setCity(String city) {this.city = city;}
    public void setPhoneNum(String phoneNum) {this.phoneNum = phoneNum;}
    public void setSalary(int salary) {this.salary = salary;}
    public void setJoinDate(String joinDate) {this.joinDate = joinDate;}
    public void setEmail(String email) {this.email = email;}

    //Display all the data for a doctor
    public void printDoctorData(){
        System.out.printf("%-20s %-20s\n", "Doctor ID: ", this.docID);
        System.out.printf("%-20s %-20s\n", "Doctor Name: ", this.docName);
        System.out.printf("%-20s %-20s\n", "Doctor Level: ", this.docQualID);
        System.out.printf("%-20s %-20s\n", "Personal Address: ", this.address);
        System.out.printf("%-20s %-20s\n", "City: ", this.city);
        System.out.printf("%-20s %-20s\n", "Phone Number: ", this.phoneNum);
        System.out.printf("%-20s %-20s\n", "Salary: ", this.salary);
        System.out.printf("%-20s %-20s\n", "Join Date: ", this.joinDate);
        System.out.printf("%-20s %-20s\n", "Email: ", this.email);
        System.out.println("------------------------------------------------------");
    }
}
