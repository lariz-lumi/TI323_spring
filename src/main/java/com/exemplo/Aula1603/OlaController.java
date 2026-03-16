package com.exemplo.Aula1603;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class OlaController {
    //tela da raiz 
    @RequestMapping(method = RequestMethod.GET)
    public String ola(){
        return "Alo mundo de TI...";
    }

    @GetMapping("/ola")
    public String getOla(){
        return "CARALHO";
    }
     
    @GetMapping("/ola/{nome}")
    public String getPorNome(@PathVariable String nome){
        return "ola, Sr(a) " + nome + "!";
    }
}