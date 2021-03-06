package mobi.openddr.examples.gwtcanvasdemo.module.client.validation;

import javax.validation.ParameterNameProvider;
import javax.validation.Validator;

import mobi.openddr.examples.gwtcanvasdemo.module.client.requestfactory.proxy.PersonProxy;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.validation.client.AbstractGwtValidatorFactory;
import com.google.gwt.validation.client.GwtValidation;
import com.google.gwt.validation.client.impl.AbstractGwtValidator;

public class ValidatorFactory extends AbstractGwtValidatorFactory {

	@GwtValidation({PersonProxy.class})
	public interface GwtValidator extends Validator {
		
	}
	
	@Override
	public AbstractGwtValidator createValidator() {
		return GWT.create(GwtValidator.class);
	}

	@Override
	public ParameterNameProvider getParameterNameProvider() {
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
