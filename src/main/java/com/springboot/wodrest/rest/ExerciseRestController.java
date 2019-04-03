package com.springboot.wodrest.rest;

import com.springboot.wodrest.entity.Exercise;
import com.springboot.wodrest.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExerciseRestController {

    private ExerciseService exerciseService;

    @Autowired
    public ExerciseRestController (ExerciseService theExerciseServise){
        exerciseService = theExerciseServise;
    }

    @GetMapping("/exercises")
    public List<Exercise> findAll(){
        return exerciseService.findAll();
    }

    @GetMapping("/exercises/{exerciseId}")
    public Exercise getExercise(int theId){
        Exercise theExercise = exerciseService.findById(theId);
        if(theExercise == null){
            throw new RuntimeException("Exercise id not found " + theId);
        }

        return theExercise;
    }

    @PostMapping("/exercises")
    public Exercise addExercise(@RequestBody Exercise theExercise){
        theExercise.setId(0);
        exerciseService.save(theExercise);
        return theExercise;
    }

    @PutMapping("/exercises")
    public Exercise updateExercise(@RequestBody Exercise theExercise){
        exerciseService.save(theExercise);
        return theExercise;
    }

    @DeleteMapping("/exercise/{exerciseId}")
    public String deleteExercise(int theId){
        Exercise tempExercise = exerciseService.findById(theId);
        if(tempExercise == null){
            throw new RuntimeException("Exercise id not found - " + theId);
        }
        exerciseService.deleteById(theId);
        return "Deleted exercise with id - " + theId;
    }
}
