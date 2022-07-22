package com.tutorial.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/testing")
public class Testing {
	/*
	@RequestMapping("/v1")
	public String test(Model model) {
		
		model.addAttribute("myname", "Vicky");
		model.addAttribute("address", "Delhi");
		
		return "prev";
	}
	*/
	
	@RequestMapping("/v1")
	public ModelAndView test() {
		
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.addObject("myname", "Vicky");
		modelAndView.addObject("address", "Delhi");
		modelAndView.setViewName("prev");
		//model.a
		
		return modelAndView;
	}
	
	//get value with the help request.getParameter.
	/*
	 * @RequestMapping("/student") 
	 * public String student(HttpServletRequest request,Model model) { 
	 * String fullname= request.getParameter("myfirstName");
	 * // System.out.println(fullname); 
	 * model.addAttribute("myname", fullname);
	 * 
	 * return "success"; }
	 */
	
	//get value with the help of @requestParam
	/*
	@RequestMapping("/student")
	public String student(@RequestParam("id") int id,@RequestParam("name") String fullname,
			@RequestParam("age") int age,@RequestParam("dept") String deptarment ,Model model) {
		
		System.out.println(fullname);
		model.addAttribute("id", id);
		model.addAttribute("name", fullname);
		model.addAttribute("age", age);
		model.addAttribute("dept", deptarment);
		
		return "success";
	}
	*/
	
	/*
	@RequestMapping("/student")
	public String student(@ModelAttribute Student student,Model model) {
		System.out.println("************");
		System.out.println(student);
		model.addAttribute("id", student.getId());
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("dept", student.getDept());
		
		return "success";
	}
	*/
	
	
	/*
	 * @RequestMapping("/student")
	 *  public String student(@ModelAttribute Student student,Model model) 
	 * { System.out.println("************");
	 * System.out.println(student); model.addAttribute("student11",student );
	 * 
	 * return "success"; }
	 */
	
	
	@RequestMapping(path="/student", method = RequestMethod.POST)
	public String student(@ModelAttribute Student student,Model model) {
		return "success";
	}
	
	
	
	
	List<String> getAll(){
		ArrayList<String> al = new ArrayList();
	return 	al;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 @RequestMapping("/home")
	    public String showHomePage(Model model) {
	          
	        // Read the existing property by
	        // fetching it from the DTO
	        NameInfoDTO nameInfoDTO = new NameInfoDTO();
	        model.addAttribute("nameInfo", nameInfoDTO);
	          
	        return "welcome-page";
	    }
	
	
	@RequestMapping("/process-homepage")
    public String showResultPage(NameInfoDTO nameInfoDTO, Model model) {
  
        // writing the value to the properties
        // by fetching from the URL
        model.addAttribute("nameInfo", nameInfoDTO);
  
        return "result-page";
    }
	
	static int count =1;
	static int age =18;
	 List<Student> al =new ArrayList<>();
	@RequestMapping("/addcustomerform")
    public String addcustomerform(@RequestParam("txtEmployeeName") String name , Model model) {
  
        System.out.println("name "+name);
       
        
        Student student = new Student();
        student.setName(name);
        student.setId(count++);
        student.setAge(age);
        student.setDept("rrr");
        al.add(student);
        model.addAttribute("studentList",al);
  
        return "test";
    }
	 
	@RequestMapping("/add")
    public String add(Model model) {
  
       // System.out.println("name "+name);
        List<Student> al =new ArrayList<>();
        
        Student student = new Student();
        student.setName("Vicky");
        student.setId(1);
        student.setAge(0);
        student.setDept("rrr");
        al.add(student);
        model.addAttribute("studentList",al);
        model.addAttribute("txtEmployeeName","vicky");
  
        return "add";
    }
	
	
}
