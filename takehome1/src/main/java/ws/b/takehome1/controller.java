/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.b.takehome1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author lenovo
 */
@Controller
public class controller {
    
    @RequestMapping("/data")
    //@ResponseBody
    
    public String getData (@RequestParam (value = "varnama") String N,
                        @RequestParam (value = "vartgl") String T,
                        @RequestParam (value = "varfoto") Object F,
                            Model model){
        model.addAttribute("inama", N);
        model.addAttribute("itgl", T);
        model.addAttribute("ifoto", F);
                
        //return "Welcome " +N +T;
        return "main";
    }
    
}
