package com.example.kaymo.formageometrica.modelo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kaymo on 09/04/2018.
 */

public class FormaGeometrica implements Parcelable {

    private double altura;
    private double base;
    private double raio;
    private double resultado;
    private String tipoForma;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getResultado() {
        return resultado;
    }

    public String getTipoForma() {
        return tipoForma;
    }

    public void setTipoForma(String tipoForma) {
        this.tipoForma = tipoForma;
    }

    public double calculaRetangulo() {
        return this.resultado = getBase() * getAltura();
    }

    public double calculaTriangulo() {
        return this.resultado = getBase() * getAltura() / 2;
    }

    public double calculaRaio() {
        return resultado = 3.14 * (getRaio() * getRaio());
    }


    public static final Creator<FormaGeometrica> CREATOR = new Creator<FormaGeometrica>() {
        @Override
        public FormaGeometrica createFromParcel(Parcel in) {
            FormaGeometrica retorno = new FormaGeometrica();
            retorno.setAltura(in.readDouble());
            retorno.setBase(in.readDouble());
            retorno.setRaio(in.readDouble());
            return retorno;
        }

        @Override
        public FormaGeometrica[] newArray(int size) {
            return new FormaGeometrica[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.getAltura());
        parcel.writeDouble(this.getBase());
        parcel.writeDouble(this.getRaio());
    }

}
