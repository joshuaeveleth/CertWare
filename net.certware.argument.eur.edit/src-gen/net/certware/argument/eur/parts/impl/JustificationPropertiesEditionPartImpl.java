/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.parts.JustificationPropertiesEditionPart;
import net.certware.argument.eur.providers.EurMessages;



// End of user code

/**
 * 
 * 
 */
public class JustificationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, JustificationPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected ReferencesTable isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public JustificationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence justificationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = justificationStep.addStep(EurViewsRepository.Justification.Properties.class);
		propertiesStep.addStep(EurViewsRepository.Justification.Properties.identifier);
		propertiesStep.addStep(EurViewsRepository.Justification.Properties.description);
		propertiesStep.addStep(EurViewsRepository.Justification.Properties.content);
		propertiesStep.addStep(EurViewsRepository.Justification.Properties.isTagged);
		
		
		composer = new PartComposer(justificationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EurViewsRepository.Justification.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EurViewsRepository.Justification.Properties.identifier) {
					return createIdentifierText(parent);
				}
				if (key == EurViewsRepository.Justification.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == EurViewsRepository.Justification.Properties.content) {
					return createContentText(parent);
				}
				if (key == EurViewsRepository.Justification.Properties.isTagged) {
					return createIsTaggedAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EurMessages.JustificationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(Composite parent) {
		createDescription(parent, EurViewsRepository.Justification.Properties.identifier, EurMessages.JustificationPropertiesEditionPart_IdentifierLabel);
		identifier = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
			}

		});
		identifier.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, EurViewsRepository.Justification.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Justification.Properties.identifier, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, EurViewsRepository.Justification.Properties.description, EurMessages.JustificationPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, EurViewsRepository.Justification.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Justification.Properties.description, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		createDescription(parent, EurViewsRepository.Justification.Properties.content, EurMessages.JustificationPropertiesEditionPart_ContentLabel);
		content = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		content.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, EurViewsRepository.Justification.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Justification.Properties.content, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable(getDescription(EurViewsRepository.Justification.Properties.isTagged, EurMessages.JustificationPropertiesEditionPart_IsTaggedLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Justification.Properties.isTagged, EurViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JustificationPropertiesEditionPartImpl.this, EurViewsRepository.Justification.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(EurViewsRepository.Justification.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createIsTaggedAdvancedTableComposition

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Justification.Properties.identifier);
		if (eefElementEditorReadOnlyState && identifier.isEnabled()) {
			identifier.setEnabled(false);
			identifier.setToolTipText(EurMessages.Justification_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !identifier.isEnabled()) {
			identifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Justification.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(EurMessages.Justification_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Justification.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(EurMessages.Justification_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isTagged.setContentProvider(contentProvider);
		isTagged.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Justification.Properties.isTagged);
		if (eefElementEditorReadOnlyState && isTagged.isEnabled()) {
			isTagged.setEnabled(false);
			isTagged.setToolTipText(EurMessages.Justification_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isTagged.isEnabled()) {
			isTagged.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
		if (this.isTagged != null) {
			this.isTagged.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.JustificationPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EurMessages.Justification_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
