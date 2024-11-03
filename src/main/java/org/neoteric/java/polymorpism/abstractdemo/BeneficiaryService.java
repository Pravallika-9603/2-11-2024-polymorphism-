package org.neoteric.java.polymorpism.abstractdemo;

import java.util.ArrayList;

public class BeneficiaryService {

    Beneficiary addbeneficiary(Account account,Beneficiary beneficiary){

        ArrayList<Beneficiary> beneficiaryArrayListList=SBIAccountDBService.accountBeneficiaryMap.get(account.getAcc());


        if(beneficiaryArrayListList!=null){
            beneficiaryArrayListList.add(beneficiary);
        }
        else{
            beneficiaryArrayListList=new ArrayList<Beneficiary>();
            beneficiaryArrayListList.add(beneficiary);
            SBIAccountDBService.accountBeneficiaryMap.put(account.getAcc(), beneficiaryArrayListList);
        }
        return beneficiary;
    }

}
