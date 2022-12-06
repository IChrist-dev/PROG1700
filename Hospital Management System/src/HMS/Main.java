package HMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //******Hospital Section******
        ArrayList<Hospital> hospitalList = new ArrayList<>();

        Hospital hospitalA = new Hospital();
        //Set all hospital A info
        hospitalA.setHosName("Belleterre General Infirmary");
        hospitalA.setHosAddress("256 Binary Avenue");
        hospitalA.setCity("Belleterre");
        hospitalA.setPhoneNum("514-449-5952");
        hospitalList.add(hospitalA);

        Hospital hospitalB = new Hospital();
        //Set all hospital B info
        hospitalB.setHosName("IWK Children's Hospital");
        hospitalB.setHosAddress("5980 University Avenue");
        hospitalB.setCity("Halifax");
        hospitalB.setPhoneNum("902-470-8888");
        hospitalList.add(hospitalB);

        Hospital hospitalC = new Hospital();
        //Set all hospital C info
        hospitalC.setHosName("Foothills Medical Centre");
        hospitalC.setHosAddress("1403 29 Street North-west");
        hospitalC.setCity("Calgary");
        hospitalC.setPhoneNum("403-944-1110");
        hospitalList.add(hospitalC);

        //******Patient Section******
        ArrayList<Patient> patientArrayList = new ArrayList<>();
        Patient patA = new Patient();
        patA.setPatID("PT458");
        patA.setName("Phinneas Beech");
        patA.setHealthCardNum("841225355");
        patA.setAddress("509 Danger Drive");
        patA.setCity("Belleterre");
        patA.setdBirth("1928-12-30");
        patA.setSex("Male");
        patA.setDiagnosis("Cardiac arrest");
        patientArrayList.add(patA);

        Patient patB = new Patient();
        patB.setPatID("PT668");
        patB.setName("Veronique Leblanc");
        patB.setHealthCardNum("623355879");
        patB.setAddress("843 Faucet Street");
        patB.setCity("Belleterre");
        patB.setdBirth("1991-05-03");
        patB.setSex("Female");
        patB.setDiagnosis("Pregnacy checkup");
        patientArrayList.add(patB);

        Patient patC = new Patient();
        patC.setPatID("PT669");
        patC.setName("Faye McDonald");
        patC.setHealthCardNum("564112983");
        patC.setAddress("430 Aberdeen Court");
        patC.setCity("Vingt Rivieres");
        patC.setdBirth("430 Aberdeen Court");
        patC.setSex("Female");
        patC.setDiagnosis("Non-Hodgkins Lymphoma");
        patientArrayList.add(patC);

        //Doctor Section
        ArrayList<Doctor> doctorArrayList = new ArrayList<>();
        Doctor docA = new Doctor();
        docA.setDocID("DR12");
        docA.setDocName("Harrison Ford");
        docA.setDocQualID(8);
        docA.setAddress("782 Stoneybrook Road");
        docA.setCity("Belleterre");
        docA.setPhoneNum("455-848-3993");
        docA.setSalary(225000);
        docA.setJoinDate("1999-08-14");
        docA.setEmail("hford@cloudside.com");
        doctorArrayList.add(docA);

        Doctor docB = new Doctor();
        docB.setDocID("DR41");
        docB.setDocName("Butch Cassidy");
        docB.setDocQualID(3);
        docB.setAddress("85 Boyle Street");
        docB.setCity("Belleterre");
        docB.setPhoneNum("514-855-3989");
        docB.setSalary(65000);
        docB.setJoinDate("2018-02-17");
        docB.setEmail("bcassidy@cloudside.com");
        doctorArrayList.add(docB);

        //User input begins
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        try {
            while (flag) {
                System.out.println("What would you like to do?");
                System.out.println("1. Print details on all hospitals \n" +
                        "2. Print details on all patients \n" +
                        "3. Print details on all doctors \n" +
                        "4. Search for hospital details based on city" + "\n" +
                        "5. Exit");
                int response = scan.nextInt();
                scan.nextLine();//catch white space
                System.out.println();//formatting for readability

                switch (response) {
                    case 1:
                        System.out.println("Hospital Directory: ");
                        //tempVariable is where fetched data is saved before printing
                        Hospital tempHospital;
                        for (int i = 0; i < hospitalList.size(); i++) {
                            tempHospital = hospitalList.get(i);
                            tempHospital.printHospitalData();
                        }
                        break;
                    case 2:
                        System.out.println("Patient Directory: ");
                        Patient tempPatient;
                        for (int j = 0; j < patientArrayList.size(); j++) {
                            tempPatient = patientArrayList.get(j);
                            tempPatient.printPatientData();
                        }
                        break;
                    case 3:
                        System.out.println("Doctor Directory: ");
                        Doctor tempDoctor;
                        for (int k = 0; k < doctorArrayList.size(); k++) {
                            tempDoctor = doctorArrayList.get(k);
                            tempDoctor.printDoctorData();
                        }
                        break;
                    case 4:
                        System.out.println("Cities with hospitals are: " + "\n" +
                                "- " + hospitalA.getCity() + "\n" +
                                "- " + hospitalB.getCity() + "\n" +
                                "- " + hospitalC.getCity());
                        String cityChoice = scan.nextLine();
                        System.out.println();//formatting for readability
                        if (cityChoice.equalsIgnoreCase("Belleterre")) {
                            System.out.println("Contact information for " + hospitalA.getHosName() + ":");
                            hospitalA.printHospitalData();

                        } else if (cityChoice.equalsIgnoreCase("Halifax")) {
                            System.out.println("Contact information for " + hospitalB.getHosName() + ":");
                            hospitalB.printHospitalData();

                        } else if (cityChoice.equalsIgnoreCase("Calgary")) {
                            System.out.println("Contact information for " + hospitalC.getHosName() + ":");
                            hospitalC.printHospitalData();

                        } else {
                            System.out.println("Your entry does not match the available cities.");
                        }
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("The option you have selected does not exist.");
                }
                System.out.println();//formatting for readability
            }
        } catch (Exception e) {
            System.out.println("The option you have selected does not exist.");
        }
    }
}