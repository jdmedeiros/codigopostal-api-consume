/*
 * CodigoPostalPortugalLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class DistMultiplos1 
        implements java.io.Serializable {
    private static final long serialVersionUID = 112863370818532043L;
    private String designacaoDistrito;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("designacaoDistrito")
    public String getDesignacaoDistrito ( ) { 
        return this.designacaoDistrito;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("designacaoDistrito")
    public void setDesignacaoDistrito (String value) { 
        this.designacaoDistrito = value;
    }
 
}
