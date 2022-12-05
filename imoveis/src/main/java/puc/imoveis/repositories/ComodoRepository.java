package puc.imoveis.repositories;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import puc.imoveis.entities.Comodo;

@ApplicationScoped
public class ComodoRepository implements PanacheRepository<Comodo> {

}
