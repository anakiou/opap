package com.anakiou.opap.model;

public enum GameName {

    //@formatter:off
    BOWLING("bowling"),
    EXTRA5("extra5"),
    JOKER("joker"),
    KINO("kino"),
    LOTTO("lotto"),
    PENALTIES("penalties"),
    POWERSPIN("powerspin"),
    PROPOGOAL("propogoal"),
    PROPOSAT("proposat"),
    PROPOSUN("proposun"),
    PROPOWED("propowed"),
    PROTO("proto"),
    SUPER3("super3");
    //@formatter:on

    private String name;

    private GameName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
