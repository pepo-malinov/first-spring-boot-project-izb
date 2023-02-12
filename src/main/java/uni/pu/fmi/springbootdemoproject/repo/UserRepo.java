package uni.pu.fmi.springbootdemoproject.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import uni.pu.fmi.springbootdemoproject.models.User;


public interface UserRepo extends JpaRepository<User, Long>
{
}
