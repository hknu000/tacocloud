package tacos;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ConfigurationClassUtils;
import tacos.data.IngredientRepository;

/**
 * Bean definitions for {@link TacoCloudApplication}.
 */
@Generated
public class TacoCloudApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'tacoCloudApplication'.
   */
  public static BeanDefinition getTacoCloudApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TacoCloudApplication.class);
    beanDefinition.setTargetType(TacoCloudApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(TacoCloudApplication.class);
    beanDefinition.setInstanceSupplier(TacoCloudApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dataLoader'.
   */
  private static BeanInstanceSupplier<CommandLineRunner> getDataLoaderInstanceSupplier() {
    return BeanInstanceSupplier.<CommandLineRunner>forFactoryMethod(TacoCloudApplication$$SpringCGLIB$$0.class, "dataLoader", IngredientRepository.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("tacoCloudApplication", TacoCloudApplication.class).dataLoader(args.get(0)));
  }

  /**
   * Get the bean definition for 'dataLoader'.
   */
  public static BeanDefinition getDataLoaderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandLineRunner.class);
    beanDefinition.setFactoryBeanName("tacoCloudApplication");
    beanDefinition.setInstanceSupplier(getDataLoaderInstanceSupplier());
    return beanDefinition;
  }
}
