/*
 * CodigoPostalPortugalLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ConPorDist1Builder {
    //the instance to build
    private ConPorDist1 conPorDist1;

    /**
     * Default constructor to initialize the instance
     */
    public ConPorDist1Builder() {
        conPorDist1 = new ConPorDist1();
    }

    public ConPorDist1Builder designacaoDistrito(String designacaoDistrito) {
        conPorDist1.setDesignacaoDistrito(designacaoDistrito);
        return this;
    }

    public ConPorDist1Builder designacaoConcelho(String designacaoConcelho) {
        conPorDist1.setDesignacaoConcelho(designacaoConcelho);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ConPorDist1 build() {
        return conPorDist1;
    }
}