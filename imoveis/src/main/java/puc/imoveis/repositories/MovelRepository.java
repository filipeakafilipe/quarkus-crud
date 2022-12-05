package puc.imoveis.repositories;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import puc.imoveis.entities.Movel;

@ApplicationScoped
public class MovelRepository implements PanacheRepository<Movel> {
    
}
