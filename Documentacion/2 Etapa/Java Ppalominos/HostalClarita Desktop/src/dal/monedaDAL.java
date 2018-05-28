/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

/**
 *
 * @author papalominos
 */
public class monedaDAL {

int number;
String dsc_moneda;
char cod_moneda;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDsc_moneda() {
        return dsc_moneda;
    }

    public void setDsc_moneda(String dsc_moneda) {
        this.dsc_moneda = dsc_moneda;
    }

    public char getCod_moneda() {
        return cod_moneda;
    }

    public void setCod_moneda(char cod_moneda) {
        this.cod_moneda = cod_moneda;
    }

    public monedaDAL(int number, String dsc_moneda, char cod_moneda) {
        this.number = number;
        this.dsc_moneda = dsc_moneda;
        this.cod_moneda = cod_moneda;
    }

    public monedaDAL() {
    }

}
