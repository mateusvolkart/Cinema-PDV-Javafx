package com.models;

public abstract class Atendimento {
    protected int id;
    protected double valorTotal;
    public abstract void calcularValor();
}
