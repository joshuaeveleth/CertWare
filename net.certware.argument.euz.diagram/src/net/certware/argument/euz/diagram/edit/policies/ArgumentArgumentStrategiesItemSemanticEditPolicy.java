/*
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.diagram.edit.policies;

import net.certware.argument.euz.diagram.providers.EuzElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ArgumentArgumentStrategiesItemSemanticEditPolicy extends
		EuzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentArgumentStrategiesItemSemanticEditPolicy() {
		super(EuzElementTypes.ArgumentArgumentStrategies_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
