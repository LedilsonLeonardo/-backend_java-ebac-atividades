package br.com.pires;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.pires.dao.IMatriculaDao;
import br.com.pires.dao.MatriculaDao;
import br.com.prires.domain.Matricula;

public class MatriculaTest {

	private IMatriculaDao matriculaDao;

	public MatriculaTest() {

		matriculaDao = new MatriculaDao();
	}

	
	public void cadastrar() {
		Matricula matricula = new Matricula();
		matricula.setCodigo("I!");
		matricula.setDataMatricula(Instant.now());
		matricula.setStatus("ATIVA");
		matricula.setValor(11000d);

		matricula = matriculaDao.cadastrar(matricula);

		assertNotNull(matricula);
		assertNotNull(matricula.getId());
		

	}

 
}
