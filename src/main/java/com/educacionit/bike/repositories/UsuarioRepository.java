package com.educacionit.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educacionit.bike.models.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String nombre); 
	
	
}
