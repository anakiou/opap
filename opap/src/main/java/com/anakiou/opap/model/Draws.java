package com.anakiou.opap.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "draw" })
public class Draws {

    @JsonProperty("draw")
    private List<Draw> draw;

    @JsonProperty("draw")
    public List<Draw> getDraw() {
        return draw;
    }

    @JsonProperty("draw")
    public void setDraw(List<Draw> draw) {
        this.draw = draw;
    }

}
