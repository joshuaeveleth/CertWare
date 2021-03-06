/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.evidence.evidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Method#getTool <em>Tool</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends CollectionMethod {
	/**
	 * Returns the value of the '<em><b>Tool</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.RequiresTool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getMethod_Tool()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiresTool> getTool();

} // Method
