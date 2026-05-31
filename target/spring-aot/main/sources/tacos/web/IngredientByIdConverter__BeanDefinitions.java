package tacos.web;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import tacos.data.IngredientRepository;

/**
 * Bean definitions for {@link IngredientByIdConverter}.
 */
@Generated
public class IngredientByIdConverter__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'ingredientByIdConverter'.
   */
  private static BeanInstanceSupplier<IngredientByIdConverter> getIngredientByIdConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<IngredientByIdConverter>forConstructor(IngredientRepository.class)
            .withGenerator((registeredBean, args) -> new IngredientByIdConverter(args.get(0)));
  }

  /**
   * Get the bean definition for 'ingredientByIdConverter'.
   */
  public static BeanDefinition getIngredientByIdConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(IngredientByIdConverter.class);
    beanDefinition.setInstanceSupplier(getIngredientByIdConverterInstanceSupplier());
    return beanDefinition;
  }
}
