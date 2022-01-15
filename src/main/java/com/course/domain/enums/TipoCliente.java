package com.course.domain.enums;

public enum TipoCliente {
    PESSOA_FISICA (0, "Pessoa Fisica"),
    PESSOA_JURIDICA (1, "Pessoa Juridica");

    private int cod;
    private String desc;

    private TipoCliente(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public int getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }
    
    // methods

    public static TipoCliente toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }
        for (TipoCliente e : TipoCliente.values()) {
            if(cod.equals(e.getCod())){
                return e;
            }
        }

        throw new IllegalArgumentException("Error in the argument, check the values ​​passed!");
    }
    
}
