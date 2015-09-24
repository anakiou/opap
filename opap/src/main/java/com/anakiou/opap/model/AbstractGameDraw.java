package com.anakiou.opap.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "draw" })
public abstract class AbstractGameDraw<T> {

    @JsonProperty("draw")
    private Draw draw;

    @JsonProperty("draw")
    public Draw getDraw() {
        return draw;
    }

    @JsonProperty("draw")
    public void setDraw(Draw draw) {
        this.draw = draw;
    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName() + " [draw=" + draw + "]";
    }

}
