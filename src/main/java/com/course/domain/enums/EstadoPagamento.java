package com.course.domain.enums;

public enum EstadoPagamento {
    PENDENTE(0, "Pendente"),
    QUITADO(1, "Quitado"),
    CANCELADO(2, "Cancelado");

    private int cod;
    private String desc;

    private EstadoPagamento(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public int getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }

    // method
    public static EstadoPagamento toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        for (EstadoPagamento e : EstadoPagamento.values()) {
            if (id.equals(e.getCod())) {
                return e;
            }
        }
        throw new IllegalArgumentException("Error in the argument, check the values ​​passed!");

    }
}
