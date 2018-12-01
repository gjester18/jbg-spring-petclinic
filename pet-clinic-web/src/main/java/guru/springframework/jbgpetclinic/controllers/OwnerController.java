package guru.springframework.jbgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/index"})
    public String ownerList(){
        return "owners/index";
    }
}
