package es.udc.fic.tfg.activity;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.udc.fic.tfg.account.Account;
import es.udc.fic.tfg.expense.Expense;
import es.udc.fic.tfg.horse.Horse;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    Activity findOneByActivityid(Long activityid);

    Page<Activity> findByActivityuser(Account consumer, Pageable pageable);

    Page <Activity> findByActivityuserAndActivityhorse(Account consumer, Horse horse, Pageable pageable);
    
    Activity findByActivityexpense(Expense expense);
}
