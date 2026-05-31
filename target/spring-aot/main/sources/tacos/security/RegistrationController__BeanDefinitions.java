package tacos.security;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.security.crypto.password.PasswordEncoder;
import tacos.data.UserRepository;

/**
 * Bean definitions for {@link RegistrationController}.
 */
@Generated
public class RegistrationController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'registrationController'.
   */
  private static BeanInstanceSupplier<RegistrationController> getRegistrationControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RegistrationController>forConstructor(UserRepository.class, PasswordEncoder.class)
            .withGenerator((registeredBean, args) -> new RegistrationController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'registrationController'.
   */
  public static BeanDefinition getRegistrationControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RegistrationController.class);
    beanDefinition.setInstanceSupplier(getRegistrationControllerInstanceSupplier());
    return beanDefinition;
  }
}
