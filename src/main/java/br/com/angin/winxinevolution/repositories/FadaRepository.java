package br.com.angin.winxinevolution.repository;

import br.com.angin.winxinevolution.model.FadaModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FadaRepository extends JpaRepository<FadaModel, Integer> {

    public Page<FadaModel> findAll(Pageable pageable);

    public Page<FadaModel> findByFirstNameStartsWithIgnoreCase(String name, Pageable pageable);

}
