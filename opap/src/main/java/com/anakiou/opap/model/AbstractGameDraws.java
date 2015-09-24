package com.anakiou.opap.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "draws" })
public abstract class AbstractGameDraws<T> {

    @JsonProperty("draw")
    private Draws draws;

    @JsonProperty("draws")
    public Draws getDraws() {
        return draws;
    }

    @JsonProperty("draws")
    public void setDraw(Draws draws) {
        this.draws = draws;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [draws=" + draws + "]";
    }

}
