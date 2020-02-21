package es.eoi.banco.service;

import es.eoi.banco.entity.Banco;
import es.eoi.banco.entity.Cliente;
import es.eoi.banco.entity.Cuenta;

public interface CuentaService {

	void createCuenta(Cliente cliente, Banco banco, double saldo);

	Cuenta findById(int id);

	void updateCuenta(int id, double saldo);

	void removeCuenta(int id);

}