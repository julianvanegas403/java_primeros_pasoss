package POO.BANCO.DOMINIO;

import POO.Persona;

public class CuentaBancaria {
    public String numero;
    public String saldo;
    public String contraseña;
    public String tipo;

    public CuentaBancaria(String numero, String saldo, String contraseña, String tipo, Persona titular, Banco banco, String retirar, String transferir) {
        this.numero = numero;
        this.saldo = saldo;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.titular = titular;
        Banco = banco;
        this.retirar = retirar;
        this.transferir = transferir;
    }

    public Persona titular;
    public Banco Banco;
    public String retirar;
    public String transferir;
}