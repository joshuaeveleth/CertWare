/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.providers;

import net.certware.argument.gsn.parts.GsnViewsRepository;

import net.certware.argument.gsn.parts.forms.AssumptionPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.ContextPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.EvidencePropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.GoalPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.JustificationPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.SolutionPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.StrategyPropertiesEditionPartForm;

import net.certware.argument.gsn.parts.impl.AssumptionPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.ContextPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.EvidencePropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.GoalPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.JustificationPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.SolutionPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.StrategyPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class GsnPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == GsnViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == GsnViewsRepository.Goal.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new GoalPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new GoalPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Strategy.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new StrategyPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new StrategyPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Justification.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new JustificationPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new JustificationPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Context.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new ContextPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new ContextPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Assumption.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new AssumptionPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new AssumptionPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Solution.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new SolutionPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new SolutionPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Evidence.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new EvidencePropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new EvidencePropertiesEditionPartForm(component);
		}
		return null;
	}

}
