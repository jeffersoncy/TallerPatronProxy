package co.edu.unicauca.proxy.app;

import co.edu.unicauca.facade.access.IOrderRepository;

/**
 * Interface que implementa la firma de guardar un servicio al sistema
 * @author Jefferson Eduardo Campo - Hector Esteban Coral
 */
public interface IOrderService {
    void save(IOrderRepository repo);
}
