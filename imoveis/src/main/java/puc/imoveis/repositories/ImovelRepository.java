package puc.imoveis.repositories;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import puc.imoveis.entities.Imovel;

@ApplicationScoped
public class ImovelRepository implements PanacheRepository<Imovel> {
    
}
