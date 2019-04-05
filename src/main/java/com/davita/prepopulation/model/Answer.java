package com.davita.prepopulation.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Answer", description = "Answer data")
public class Answer {

    @ApiModelProperty(notes = "Form field", dataType = "String")
    private String field;

    @ApiModelProperty(notes = "Field value", dataType = "String")
    private String value;
}