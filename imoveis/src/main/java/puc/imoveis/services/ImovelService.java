package puc.imoveis.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import puc.imoveis.entities.Imovel;
import puc.imoveis.repositories.ComodoRepository;
import puc.imoveis.repositories.ImovelRepository;

@ApplicationScoped
public class ImovelService {
    @Inject
    ImovelRepository imovelRepository;

    @Inject
    ComodoRepository comodoRepository;

    @Transactional
    public void insert(Imovel imovelRequest) {
        Imovel imovel = new Imovel();
        imovel.setTamanho(imovelRequest.getTamanho());
        imovel.setValor(imovelRequest.getValor());
        imovelRepository.persist(imovel);
    }

    public Imovel get(Long id) {
        return imovelRepository.findById(id);
    }

    @Transactional
    public void delete(Long id) {
            imovelRepository.deleteById(id);
    }

    @Transactional
    public void update(Long id, Imovel imovelRequest) {
        Imovel imovel = imovelRepository.findById(id);
        imovel.setTamanho(imovelRequest.getTamanho());
        imovel.setValor(imovelRequest.getValor());
        imovelRepository.persist(imovel);
    }
}
