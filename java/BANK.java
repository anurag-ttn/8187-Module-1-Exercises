public class BANK {
private String Name, headofficeAddress, chairmanName;
 private int branchCount;
private float fdInterestRate, personalLoanInterestRate, homeLoanInterestRate;
public String getHeadofficeAddress() {
   return headofficeAddress;
}
public void setHeadofficeAddress(String headofficeAddress) {
   this.headofficeAddress = headofficeAddress;
 }
public String getChairmanName() {
   return chairmanName;
  }
public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;    }

 public int getBranchCount() {
 return branchCount;
 }
  public void setBranchCount(int branchCount) {
  this.branchCount = branchCount;
   }
public float getFdInterestRate() {
 return fdInterestRate;    }
public void setFdInterestRate(float fdInterestRate) {
this.fdInterestRate = fdInterestRate;
 }
 public float getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

public void setPersonalLoanInterestRate(float personalLoanInterestRate) {
  this.personalLoanInterestRate = personalLoanInterestRate;
}
  public float getHomeLoanInterestRate() {
   return homeLoanInterestRate;
  }
public void setHomeLoanInterestRate(float homeLoanInterestRate) {
 this.homeLoanInterestRate = homeLoanInterestRate;
}

public String getName() {
return Name;
}
public void setName(String name) {
  Name = name;
}


        public String toString(){
        return "Bank name : "+Name+" chairman : "+chairmanName+" branch count : "+branchCount+
                " fd Interest rate : "+fdInterestRate+" personal Interest rate : "+personalLoanInterestRate+
                " Home Loan Interest rate"+homeLoanInterestRate;
        }

}

