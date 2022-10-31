/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.b.takehome1;

import java.io.IOException;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author lenovo
 */
@Controller
public class controller { 
    
    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public String getData (@RequestParam (value = "varnama") String N,
                        @RequestParam (value = "vartgl") String T,
                        @RequestParam (value = "varfoto") MultipartFile F,
                        ModelMap modelMap) throws IOException{ 
        
        byte[] masukkanfoto = F.getBytes();
        String base64image = Base64.encodeBase64String(masukkanfoto);
        String foto ="data:image/png;base64,".concat(base64image);      
        String a;        
            a = "Nama Lengkap  : ";
        String b;        
            b = "Tanggal Lahir : ";
        
        modelMap.addAttribute("inama", a + N);
        modelMap.addAttribute("itgl", b + T);
        modelMap.addAttribute("ifoto", foto);
        return "main";
    }
}
