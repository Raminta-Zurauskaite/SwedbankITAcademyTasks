package com.itacademy.java.oop.basics;

public enum ContractType {
    FULLTIME("F1"),
    PARTTIME("P1");

    public final String contractType;

    ContractType(String contractType){
        this.contractType = contractType;
    }

    public static ContractType valueOfCode(String contractType){
        for (ContractType e : values()){
            if (e.contractType.equals(contractType)){
                return e;
            }
        }
        return null;
    }
}
