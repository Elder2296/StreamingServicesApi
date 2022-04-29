package ServicesStreaming.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ServicesStreaming.Entity.Clientes;
import ServicesStreaming.dto.ClientesDTO;
import ServicesStreaming.repository.ClientesRepository;

@Service
public class ClienteServiceImplements implements ClientesService {
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ClientesRepository clientesRepository;

	@Override
	public ClientesDTO crearCliente(ClientesDTO clienteDTO) {
		Clientes cliente = new Clientes();
		cliente.setNombre1(clienteDTO.getNombre1());
		cliente.setApellido1(clienteDTO.getApellido1());
		cliente.setUsuarioFacebook(clienteDTO.getUsuarioFacebook());
		cliente.setWhatsapp(clienteDTO.getWhatsapp());
		cliente.setEmail(clienteDTO.getEmail());
		

		Clientes nuevoCliente = clientesRepository.save(cliente);
		
		ClientesDTO clienteGuardado = new ClientesDTO();

		clienteGuardado.setId(nuevoCliente.getId());
		clienteGuardado.setNombre1(nuevoCliente.getNombre1());
		clienteGuardado.setApellido1(nuevoCliente.getApellido1());
		clienteGuardado.setUsuarioFacebook(nuevoCliente.getUsuarioFacebook());
		clienteGuardado.setWhatsapp(nuevoCliente.getWhatsapp());
		clienteGuardado.setEmail(nuevoCliente.getEmail());
		
		
		
		
		return clienteGuardado;

	}

	private Clientes mapearEntity(ClientesDTO clienteDTO) {
		return modelMapper.map(clienteDTO, Clientes.class);
	}

	private ClientesDTO mapearToClienteDTO(Clientes cliente) {
		return modelMapper.map(cliente, ClientesDTO.class);
	}
}
