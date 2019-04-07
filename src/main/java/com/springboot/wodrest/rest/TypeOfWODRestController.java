package com.springboot.wodrest.rest;

import com.springboot.wodrest.entity.TypeOfWOD;
import com.springboot.wodrest.service.TypeOfWODService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeOfWODRestController {

    private TypeOfWODService typeOfWODService;

    @Autowired
    public TypeOfWODRestController(TypeOfWODService theTypeOfWODService){
        typeOfWODService = theTypeOfWODService;
    }

    @GetMapping("/typeOfwods")
    public List<TypeOfWOD> findAll(){
        return  typeOfWODService.getAll();
    }

    @GetMapping("typeOfwods/{typeOfWODiD}")
    public TypeOfWOD getTypeOfWOD(@PathVariable int typeOfWODiD){
        TypeOfWOD typeOfWOD = typeOfWODService.findById(typeOfWODiD);
        if(typeOfWOD == null){
            throw new RuntimeException("TypeOfWOD not found ID:" + typeOfWODiD);
        }

        return typeOfWOD;
    }

    @PostMapping("/typeOfwods")
    public TypeOfWOD addTypeOfWOD(@RequestBody TypeOfWOD typeOfWOD){
        typeOfWOD.setId(0);
        System.out.println("===============>>>>" + typeOfWOD.getId());
        typeOfWODService.save(typeOfWOD);;
        System.out.println("===============>>>>" + typeOfWOD.getId());

        return typeOfWOD;
    }

    @PutMapping("/typeOfwods")
    public TypeOfWOD updateTypeOfWOD(@RequestBody TypeOfWOD typeOfWOD){
        typeOfWODService.save(typeOfWOD);
        return typeOfWOD;
    }

    @DeleteMapping("/typeOfwods/{typeOfWODiD}")
    public String deleteTypeOfWOD(@PathVariable int typeOfWODiD){
        TypeOfWOD typeOfWOD = typeOfWODService.findById(typeOfWODiD);
        if(typeOfWOD == null){
            throw new RuntimeException("TypeOfWOD not found ID:" + typeOfWODiD);
        }
        typeOfWODService.deleteById(typeOfWODiD);
        return "Deleted TypeOfWOD with id: " + typeOfWODiD;
    }
}
