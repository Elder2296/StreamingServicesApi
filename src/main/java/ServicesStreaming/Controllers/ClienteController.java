package ServicesStreaming.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ServicesStreaming.dto.ClientesDTO;
import ServicesStreaming.service.ClientesService;

@RestController
@RequestMapping("/apiStreaming/clientes")
public class ClienteController {
	@Autowired
	private ClientesService clienteService;

	@PostMapping
	public ResponseEntity<ClientesDTO> crearCliente(@RequestBody ClientesDTO clienteDTO) {
		
		return new ResponseEntity<>(clienteService.crearCliente(clienteDTO), HttpStatus.CREATED);
	}

}
