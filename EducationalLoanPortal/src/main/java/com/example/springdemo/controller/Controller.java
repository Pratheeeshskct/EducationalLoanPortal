package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.AdminModel;
import com.example.springdemo.model.LoanApplicationModel;
import com.example.springdemo.model.LoginModel;
import com.example.springdemo.model.UserModel;
import com.example.springdemo.service.AService;

@RestController
public class Controller {

	@Autowired
    public AService lser;
	  
	//AdminModel
	@PostMapping("/admin/post")
	public AdminModel postD(@RequestBody AdminModel amodel)
	{
		return lser.post1(amodel);
	}
	@GetMapping("/admin/get")
	public List<AdminModel> getD()
	{
		return lser.get1();
	}
	@PutMapping("/admin/update")
	public AdminModel putD(@RequestBody AdminModel amodel1)
	{
		return lser.put1(amodel1);
	}
	@DeleteMapping("/admin/del/{pass}")
	public String deleteD(@PathVariable("pass") String password)
	{
		lser.delete1(password);
		return "Deleted";
	}
	
	//LoanApplicationModel
	
	@PostMapping("/loan/post")
	public LoanApplicationModel postD1(@RequestBody LoanApplicationModel amodel3)
	{
		return lser.post2(amodel3);
	}
	@GetMapping("/loan/get")
	public List<LoanApplicationModel> getD1()
	{
		return lser.get2();
	}
	@PutMapping("/loan/update/{loanId}")
	public String putD1(@RequestBody LoanApplicationModel amodel4,@PathVariable("loanId") int loanId)
	{
		return lser.put2(amodel4,loanId);
	}
	@DeleteMapping("loan/del/{id}")
	public String deleteD1(@PathVariable("id") int loanid)
	{
		lser.delete2(loanid);
		return "Deleted";
	}
	
	//LoginModel
	@PostMapping("/login/post")
	public LoginModel postD2(@RequestBody LoginModel amodel5)
	{
		return lser.post3(amodel5);
	}
	@GetMapping("/login/get")
	public List<LoginModel> getD2()
	{
		return lser.get3();
	}
	@PutMapping("/login/update")
	public LoginModel putD2(@RequestBody LoginModel amodel6)
	{
		return lser.put3(amodel6);
	}
	@DeleteMapping("/login/del/{pass}")
	public String deleteD2(@PathVariable ("pass")String password)
	{
		lser.delete3(password);
		return "Deleted";
	}
	
	//UserModel
	@PostMapping("/user/post")
	public UserModel postD3(@RequestBody UserModel amodel7)
	{
		return lser.post4(amodel7);
	}
	@GetMapping("/user/get")
	public List<UserModel> getD3()
	{
		return lser.get4();
	}
	@PutMapping("/user/update")
	public UserModel putD3(@RequestBody UserModel amodel8)
	{
		return lser.put4(amodel8);
	}
	@DeleteMapping("/user/del/{aid}")
	public String deleteD3(@PathVariable("aid") int id)
	{
		lser.delete4(id);
		return "Deleted";
	}
}
