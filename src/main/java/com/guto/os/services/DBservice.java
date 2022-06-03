package com.guto.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guto.os.domain.Cliente;
import com.guto.os.domain.OS;
import com.guto.os.domain.Tecnico;
import com.guto.os.domain.enuns.Prioridade;
import com.guto.os.domain.enuns.Status;
import com.guto.os.repositaries.ClienteRepository;
import com.guto.os.repositaries.OSRepository;
import com.guto.os.repositaries.TecnicoRepository;

@Service
public class DBservice {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;
	
	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Valdir Cezar", "140.017.660-35", "(77)98888-8888");
		Cliente c1 = new Cliente(null, "Betina Campos", "992.583.830-44", "(77)97777-7777");
		
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
}
