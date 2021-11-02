package br.com.withdraw.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.withdraw.entities.Withdraw;

@Repository
public interface WithdrawRepository extends JpaRepository<Withdraw, UUID> {

}
