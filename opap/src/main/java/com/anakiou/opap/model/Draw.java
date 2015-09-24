package com.anakiou.opap.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "drawTime", "drawNo", "results" })
public class Draw {

    //private final static DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    @JsonProperty("drawNo")
    private Integer       drawNo;
    @JsonProperty("drawTime")
    private String drawTime;
    @JsonProperty("results")
    private List<Integer> results;

    @JsonProperty("drawNo")
    public Integer getDrawNo() {
        return drawNo;
    }

    @JsonProperty("drawNo")
    public void setDrawNo(Integer drawNo) {
        this.drawNo = drawNo;
    }

    @JsonProperty("drawTime")
    public String getDrawTime() {
        return drawTime;
    }

    @JsonProperty("drawTime")
    public void setDrawTime(String drawTime) {
        this.drawTime = drawTime;
    }

    @JsonProperty("results")
    public List<Integer> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Integer> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Draw [drawNo=" + drawNo + ", drawTime=" + drawTime + ", results=" + results + "]";
    }

}
