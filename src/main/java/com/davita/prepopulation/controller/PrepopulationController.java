package com.davita.prepopulation.controller;

import com.davita.prepopulation.model.Answer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@Api(value = "Questionnaire Endpoint", description = "CRUD operations for questionnaires")
@RequestMapping()
public class PrepopulationController {

    @GetMapping("/prepopulation")
    @ApiOperation(value = "Get the latest submission data for an user",
            notes = "Returns a list of answers",
            response = Answer.class, responseContainer = "List")
    public ResponseEntity<Iterable<Answer>> getQuestionnaires() {

        return ResponseEntity.ok(Arrays.asList(
                new Answer("Favorite food","Pizza"),
                new Answer("Favorite color","Gray"),
                new Answer("Short Answer","Test Answer")
        ));

    }
}
