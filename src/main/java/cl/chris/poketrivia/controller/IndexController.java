package cl.chris.poketrivia.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping
    public ResponseEntity<String> getAllRE(){
        return new ResponseEntity<>("Ola ke ase", HttpStatus.OK);
    }

    @GetMapping
    public String getAll(){
        return "Ola ke ase";
    }
}
