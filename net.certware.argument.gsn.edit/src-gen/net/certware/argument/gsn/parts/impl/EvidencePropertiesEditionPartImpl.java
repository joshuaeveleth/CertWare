/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.argument.gsn.parts.EvidencePropertiesEditionPart;
import net.certware.argument.gsn.parts.GsnViewsRepository;

import net.certware.argument.gsn.providers.GsnMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
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

// End of user code

/**
 * 
 * 
 */
public class EvidencePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EvidencePropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected ReferencesTable isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable target;
	protected List<ViewerFilter> targetBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> targetFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable source;
	protected List<ViewerFilter> sourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sourceFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EvidencePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence evidenceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = evidenceStep.addStep(GsnViewsRepository.Evidence.Properties.class);
		propertiesStep.addStep(GsnViewsRepository.Evidence.Properties.identifier);
		propertiesStep.addStep(GsnViewsRepository.Evidence.Properties.description);
		propertiesStep.addStep(GsnViewsRepository.Evidence.Properties.content);
		propertiesStep.addStep(GsnViewsRepository.Evidence.Properties.isTagged);
		propertiesStep.addStep(GsnViewsRepository.Evidence.Properties.target);
		propertiesStep.addStep(GsnViewsRepository.Evidence.Properties.source);
		
		
		composer = new PartComposer(evidenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GsnViewsRepository.Evidence.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == GsnViewsRepository.Evidence.Properties.identifier) {
					return createIdentifierText(parent);
				}
				if (key == GsnViewsRepository.Evidence.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == GsnViewsRepository.Evidence.Properties.content) {
					return createContentText(parent);
				}
				if (key == GsnViewsRepository.Evidence.Properties.isTagged) {
					return createIsTaggedAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Evidence.Properties.target) {
					return createTargetAdvancedReferencesTable(parent);
				}
				if (key == GsnViewsRepository.Evidence.Properties.source) {
					return createSourceAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(GsnMessages.EvidencePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(Composite parent) {
		createDescription(parent, GsnViewsRepository.Evidence.Properties.identifier, GsnMessages.EvidencePropertiesEditionPart_IdentifierLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, GsnViewsRepository.Evidence.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.Properties.identifier, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, GsnViewsRepository.Evidence.Properties.description, GsnMessages.EvidencePropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, GsnViewsRepository.Evidence.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.Properties.description, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		createDescription(parent, GsnViewsRepository.Evidence.Properties.content, GsnMessages.EvidencePropertiesEditionPart_ContentLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, GsnViewsRepository.Evidence.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.Properties.content, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable(getDescription(GsnViewsRepository.Evidence.Properties.isTagged, GsnMessages.EvidencePropertiesEditionPart_IsTaggedLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.Properties.isTagged, GsnViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(GsnViewsRepository.Evidence.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createIsTaggedAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTargetAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GsnViewsRepository.Evidence.Properties.target, GsnMessages.EvidencePropertiesEditionPart_TargetLabel);		 
		this.target = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addTarget(); }
			public void handleEdit(EObject element) { editTarget(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTarget(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTarget(element); }
			public void navigateTo(EObject element) { }
		});
		this.target.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.Properties.target, GsnViewsRepository.SWT_KIND));
		this.target.createControls(parent);
		this.target.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		targetData.horizontalSpan = 3;
		this.target.setLayoutData(targetData);
		this.target.disableMove();
		target.setID(GsnViewsRepository.Evidence.Properties.target);
		target.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addTarget() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(target.getInput(), targetFilters, targetBusinessFilters,
		"target", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.target,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				target.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTarget(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		target.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTarget(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		target.refresh();
	}

	/**
	 * 
	 */
	protected void editTarget(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				target.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSourceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GsnViewsRepository.Evidence.Properties.source, GsnMessages.EvidencePropertiesEditionPart_SourceLabel);		 
		this.source = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSource(); }
			public void handleEdit(EObject element) { editSource(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSource(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSource(element); }
			public void navigateTo(EObject element) { }
		});
		this.source.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.Properties.source, GsnViewsRepository.SWT_KIND));
		this.source.createControls(parent);
		this.source.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.source, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		sourceData.horizontalSpan = 3;
		this.source.setLayoutData(sourceData);
		this.source.disableMove();
		source.setID(GsnViewsRepository.Evidence.Properties.source);
		source.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(source.getInput(), sourceFilters, sourceBusinessFilters,
		"source", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.source,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				source.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		source.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, GsnViewsRepository.Evidence.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		source.refresh();
	}

	/**
	 * 
	 */
	protected void editSource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				source.refresh();
			}
		}
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
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Evidence.Properties.identifier);
		if (eefElementEditorReadOnlyState && identifier.isEnabled()) {
			identifier.setEnabled(false);
			identifier.setToolTipText(GsnMessages.Evidence_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !identifier.isEnabled()) {
			identifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Evidence.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(GsnMessages.Evidence_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Evidence.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(GsnMessages.Evidence_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isTagged.setContentProvider(contentProvider);
		isTagged.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Evidence.Properties.isTagged);
		if (eefElementEditorReadOnlyState && isTagged.isEnabled()) {
			isTagged.setEnabled(false);
			isTagged.setToolTipText(GsnMessages.Evidence_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isTagged.isEnabled()) {
			isTagged.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
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
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#initTarget(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTarget(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		target.setContentProvider(contentProvider);
		target.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Evidence.Properties.target);
		if (eefElementEditorReadOnlyState && target.getTable().isEnabled()) {
			target.setEnabled(false);
			target.setToolTipText(GsnMessages.Evidence_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !target.getTable().isEnabled()) {
			target.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#updateTarget()
	 * 
	 */
	public void updateTarget() {
	target.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		targetFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		targetBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#isContainedInTargetTable(EObject element)
	 * 
	 */
	public boolean isContainedInTargetTable(EObject element) {
		return ((ReferencesTableSettings)target.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#initSource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		source.setContentProvider(contentProvider);
		source.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Evidence.Properties.source);
		if (eefElementEditorReadOnlyState && source.getTable().isEnabled()) {
			source.setEnabled(false);
			source.setToolTipText(GsnMessages.Evidence_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !source.getTable().isEnabled()) {
			source.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#updateSource()
	 * 
	 */
	public void updateSource() {
	source.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		sourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		sourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#isContainedInSourceTable(EObject element)
	 * 
	 */
	public boolean isContainedInSourceTable(EObject element) {
		return ((ReferencesTableSettings)source.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GsnMessages.Evidence_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
