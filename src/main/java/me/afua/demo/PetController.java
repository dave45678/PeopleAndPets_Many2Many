package me.afua.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.HashSet;

@Controller
public class PetController {
    @Autowired
    PersonRepository petOwners;

    @Autowired
    PetRepository petlist;

    @RequestMapping("/")
    public String index(Model model)
    {

        model.addAttribute("petlist",petlist.findAll());
        model.addAttribute("ownerlist",petOwners.findAll());
        return "index";
    }

    @RequestMapping("/addpet")
    public String addPet(Model model)
    {
        model.addAttribute("aPet", new Pet());
        model.addAttribute("petowners",petOwners.findAll());
        return "pet";
    }

    @RequestMapping("/savepet")
    public String savePet(@ModelAttribute("aPet") Pet pet, Model model)
    {
        petlist.save(pet);
        return "redirect:/";
    }

    @PostConstruct
    public void fillTables()
    {
        Person p = new Person();
        p.setMyName("John Smith");
        petOwners.save(p);

        p = new Person();
        p.setMyName("Owen Richards");
        petOwners.save(p);

        p= new Person();
        p.setMyName("Ama Baidoo");
        petOwners.save(p);
    }
}
