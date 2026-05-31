package tacos.web;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import tacos.data.IngredientRepository;
import tacos.data.UserRepository;

/**
 * Bean definitions for {@link DesignTacoController}.
 */
@Generated
public class DesignTacoController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'designTacoController'.
   */
  private static BeanInstanceSupplier<DesignTacoController> getDesignTacoControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DesignTacoController>forConstructor(IngredientRepository.class, UserRepository.class)
            .withGenerator((registeredBean, args) -> new DesignTacoController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'designTacoController'.
   */
  public static BeanDefinition getDesignTacoControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DesignTacoController.class);
    beanDefinition.setInstanceSupplier(getDesignTacoControllerInstanceSupplier());
    return beanDefinition;
  }
}
