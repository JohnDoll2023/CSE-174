import java.util.Scanner;
import java.util.ArrayList;

public class ContactInfo {
   private String name;
   private ArrayList<Phone> phoneNums = new ArrayList<> ();
   
   public ContactInfo() {
      name = "unknown";
      phoneNums = new ArrayList<Phone> ();
   }
   
   public String getName() {
      return name;
   }
   
   public ArrayList<Phone> getPhones () {
      return phoneNums;
   }
   
   public boolean addPhone(Phone p) {
      for (Phone phone: this.getPhones()) {
         if (phone.getLabel().equals(p.getLabel()) || 
             phone.getPhonNum().equals(p.getPhonNum()))
            return false;
         }
      phoneNums.add(p);
         return true;
   }
   
   public boolean removePhone(String phonNum) {
      for (Phone phone: this.getPhones()) {
         if (phone.getPhonNum().equals(phonNum)) {
            phoneNums.remove(phone);
            return true;
      }
         }
         return false;
   }
            
   
   public ContactInfo(String name, ArrayList<Phone> phoneNumber) {
      this.name = name;
      this.phoneNums = phoneNumber;
   }
}