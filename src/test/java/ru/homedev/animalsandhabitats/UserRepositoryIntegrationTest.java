package ru.homedev.animalsandhabitats;


import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIntegrationTest {
//  @Autowired
//  private UserRepository userRepository;
//
//  @Test
//  public void whenCalledSave_thenCorrectNumberOfUsers() {
//    userRepository.save(new User("Bob", "bob@domain.com"));
//    List<User> users = (List<User>) userRepository.findAll();
//
//    assertThat(users.size()).isEqualTo(1);
 // }
}
