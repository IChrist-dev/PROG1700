package HMS;

public class Hospital {
    private String hosName;
    private String hosAddress;
    private String city;
    private String phoneNum;

    //getters
    public String getHosName() {return hosName;}
    public String getHosAddress() {return hosAddress;}
    public String getCity() {return city;}
    public String getPhoneNum() {return phoneNum;}

    //setters
    public void setHosName(String hosName) {this.hosName = hosName;}
    public void setHosAddress(String hosAddress) {this.hosAddress = hosAddress;}
    public void setCity(String city) {this.city = city;}
    public void setPhoneNum(String phoneNum) {this.phoneNum = phoneNum;}

    //Display all info for a hospital
    public void printHospitalData(){
        System.out.printf("%-20s %-20s\n", "Hospital name: ", this.hosName);
        System.out.printf("%-20s %-20s\n", "Address: ", this.hosAddress);
        System.out.printf("%-20s %-20s\n", "City: ", this.city);
        System.out.printf("%-20s %-20s\n", "Phone number: ", this.phoneNum);
        System.out.println("------------------------------------------------------");
    }
}
