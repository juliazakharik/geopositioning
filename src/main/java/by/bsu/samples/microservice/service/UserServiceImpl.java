package by.bsu.samples.microservice.service;

import by.bsu.samples.microservice.generic.GenericServiceImpl;
import by.bsu.samples.microservice.model.User;
import by.bsu.samples.microservice.repository.UserRepository;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service("userService")
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

  @PostConstruct
  private void postConstruct() {
    log.info("After user service is created");
  }

  @PreDestroy
  public void preDestroy() {
    log.info("Before destroy");
  }

  @Autowired
  private UserRepository userRepository;

  @Override
  protected JpaRepository<User, Long> getRepository() {
    return userRepository;
  }
}
