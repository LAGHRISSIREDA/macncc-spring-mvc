package main.com.codesigne.controllers;

import main.com.codesigne.entities.Admin;
import main.com.codesigne.entities.Agent;
import main.com.codesigne.entities.Patient;
import main.com.codesigne.entities.Person;
import main.com.codesigne.helpers.Authenticated;
import main.com.codesigne.helpers.Enum;
import main.com.codesigne.services.AdminService;
import main.com.codesigne.services.AgentService;
import main.com.codesigne.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@SessionAttributes("authPerson")
public class AuthController {

    final AdminService adminService;
    final AgentService agentService;
    final PatientService patientService;

    @Autowired
    public AuthController(AdminService adminService, AgentService agentService, PatientService patientService) {
        this.adminService = adminService;
        this.agentService = agentService;
        this.patientService = patientService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm(Map<String, Object> model, @ModelAttribute("error") String error, @ModelAttribute("authPerson") Authenticated authPerson){
        if(authPerson != null){
            return "redirect:/"+authPerson.getRole().toLowerCase();
        }else{
            model.put("person", new Person());
            model.put("error", error);
            return "/auth/login";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView auth(@ModelAttribute("person") Person person, Model model){
        Authenticated auth = new Authenticated();
        String email = person.getEmail();
        String password = person.getPassword();
        String role = person.getRole();
        System.out.println("email: "+ email);
        System.out.println("password : "+ password);
        model.addAttribute("error", "Failed authentication, try again!");
        switch (role){
            case "ADMIN" -> {
                Admin admin = adminService.adminExists(email, password);
                if(admin != null){
                    auth.setLoggedInUser(admin);
                    auth.setRole(Enum.role.ADMIN.toString());
                    model.addAttribute("authPerson", auth);
                    System.out.println(model.getAttribute("authPerson"));
                    return new ModelAndView("redirect:/admin");
                }else{
                    return new ModelAndView("redirect:/login", (Map<String, ?>) model);
                }
            }
            case "AGENT" -> {
                Agent agent = agentService.agentExists(email, password);
                if(agent != null){
                    auth.setLoggedInUser(agent);
                    auth.setRole(Enum.role.AGENT.toString());
                    model.addAttribute("authPerson", auth);
                    return new ModelAndView("redirect:/agent");
                }else{
                    return new ModelAndView("redirect:/login", (Map<String, ?>) model);
                }
            }
            case "PATIENT" -> {
                Patient patient = patientService.patientExists(email, password);
                if(patient != null){
                    auth.setLoggedInUser(patient);
                    auth.setRole(Enum.role.PATIENT.toString());
                    model.addAttribute("authPerson", auth);
                    return new ModelAndView("redirect:/patient");
                }else{
                    return new ModelAndView("redirect:/login", (Map<String, ?>) model);
                }
            }
        }
        return new ModelAndView("redirect:/");
    }

    @ModelAttribute("authPerson")
    public Authenticated authenticated() {
        return null;
    }

}
