package com.example.springdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springdemo.model.AdminModel;
import com.example.springdemo.model.LoanApplicationModel;
import com.example.springdemo.model.LoginModel;
import com.example.springdemo.model.UserModel;
import com.example.springdemo.repository.AdminRepository;
import com.example.springdemo.repository.LoanApplicationRepository;
import com.example.springdemo.repository.LoginRepository;
import com.example.springdemo.repository.UserRepository;

@Service
public class AService {

	 UserRepository urepo;
	 LoginRepository lrepo;
     AdminRepository arepo;
	 LoanApplicationRepository loanrepo;
    //AdminModel
     public AdminModel post1(AdminModel amodel)
     {
    	 return arepo.save(amodel);
     }
     
     public List<AdminModel> get1()
     {
    	 return arepo.findAll();
     }
     
     public AdminModel put1(AdminModel amodel1)
     {
    	 return arepo.saveAndFlush(amodel1);
     }
     
     public void delete1(String password)
     {
    	 arepo.deleteByPassword(password);
     }
     
     //LoanApplicationModel
     public LoanApplicationModel post2(LoanApplicationModel amodel2)
     {
    	 return loanrepo.save(amodel2);
     }
     
     public List<LoanApplicationModel> get2()
     {
    	 return loanrepo.findAll();
     }
     
     public String put2(LoanApplicationModel i,int loanId)
     {
    	 LoanApplicationModel e = loanrepo.findById(loanId).orElse(null);
		  if(e != null){
			  e.setLoanId(i.getLoanId());
		   e.setLoantype(i.getLoantype());
		   e.setApplicantName(i.getApplicantName());
		   e.setApplicantAddress(i.getApplicantAddress());
		   e.setApplicantMobile(i.getApplicantMobile());
		   e.setApplicantEmail(i.getApplicantEmail());
		   e.setApplicantAadhaar(i.getApplicantAadhaar());
		   e.setApplicantPan(i.getApplicantPan());
		   e.setApplicantSalary(i.getApplicantSalary());
		   e.setLoanAmountRequired(i.getLoanAmountRequired());
		   e.setLoanRepaymentMonths(i.getLoanRepaymentMonths());
		   loanrepo.saveAndFlush(e);
		   
		   return "The details of the  LoanID was updated";
		  }
		  else{
		   return "The LoanID is not present in the database to update the value";
		  }
     }
     
     public void delete2(int loanid)
     {
    	 loanrepo.deleteById(loanid);
     }
     
     //LoginModel
     public LoginModel post3(LoginModel amodel4)
     {
    	 return lrepo.save(amodel4);
     }
     
     public List<LoginModel> get3()
     {
    	 return lrepo.findAll();
     }
     
     public LoginModel put3(LoginModel amodel5)
     {
    	 return lrepo.saveAndFlush(amodel5);
     }
     
     public void delete3(String password)
     {
    	 lrepo.deleteByPassword(password);
     }
     
     //UserModel
     
     public UserModel post4(UserModel amodel6)
     {
    	 return urepo.save(amodel6);
     }
     
     public List<UserModel> get4()
     {
    	 return urepo.findAll();
     }
     
     public UserModel put4(UserModel amodel7)
     {
    	 return urepo.saveAndFlush(amodel7);
     }
     public void delete4(int id)
     {
    	 urepo.deleteById(id);
     }
}
