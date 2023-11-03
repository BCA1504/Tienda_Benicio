
package Tienda_BENICIO.demo.dao;

import Tienda_BENICIO.demo.domain.Producto; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    
}
