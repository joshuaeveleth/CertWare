/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.gsn.parts.GoalPropertiesEditionPart;
import net.certware.argument.gsn.parts.GsnViewsRepository;

import net.certware.argument.gsn.providers.GsnMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class GoalPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, GoalPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected ReferencesTable isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected Button assumed;
	protected Button toBeSupported;
	protected ReferencesTable subGoals;
	protected List<ViewerFilter> subGoalsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> subGoalsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable strategies;
	protected List<ViewerFilter> strategiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> strategiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable goalContexts;
	protected List<ViewerFilter> goalContextsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> goalContextsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable assumptions;
	protected List<ViewerFilter> assumptionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> assumptionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable goalSolutions;
	protected List<ViewerFilter> goalSolutionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> goalSolutionsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public GoalPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GoalPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence goalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = goalStep.addStep(GsnViewsRepository.Goal.Properties.class);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.identifier);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.description);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.content);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.isTagged);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.assumed);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.toBeSupported);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.subGoals);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.strategies);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.goalContexts);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.assumptions);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.goalSolutions);
		
		
		composer = new PartComposer(goalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GsnViewsRepository.Goal.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.identifier) {
					return createIdentifierText(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.content) {
					return createContentText(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.isTagged) {
					return createIsTaggedTableComposition(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.assumed) {
					return createAssumedCheckbox(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.toBeSupported) {
					return createToBeSupportedCheckbox(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.subGoals) {
					return createSubGoalsTableComposition(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.strategies) {
					return createStrategiesTableComposition(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.goalContexts) {
					return createGoalContextsTableComposition(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.assumptions) {
					return createAssumptionsTableComposition(widgetFactory, parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.goalSolutions) {
					return createGoalSolutionsTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(GsnMessages.GoalPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GsnViewsRepository.Goal.Properties.identifier, GsnMessages.GoalPropertiesEditionPart_IdentifierLabel);
		identifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		identifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GoalPropertiesEditionPartForm.this,
							GsnViewsRepository.Goal.Properties.identifier,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GoalPropertiesEditionPartForm.this,
									GsnViewsRepository.Goal.Properties.identifier,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, identifier.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GoalPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		identifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, GsnViewsRepository.Goal.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.identifier, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GsnViewsRepository.Goal.Properties.description, GsnMessages.GoalPropertiesEditionPart_DescriptionLabel);
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GoalPropertiesEditionPartForm.this,
							GsnViewsRepository.Goal.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GoalPropertiesEditionPartForm.this,
									GsnViewsRepository.Goal.Properties.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GoalPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, GsnViewsRepository.Goal.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.description, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GsnViewsRepository.Goal.Properties.content, GsnMessages.GoalPropertiesEditionPart_ContentLabel);
		content = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		content.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GoalPropertiesEditionPartForm.this,
							GsnViewsRepository.Goal.Properties.content,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GoalPropertiesEditionPartForm.this,
									GsnViewsRepository.Goal.Properties.content,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, content.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GoalPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		content.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, GsnViewsRepository.Goal.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.content, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable(getDescription(GsnViewsRepository.Goal.Properties.isTagged, GsnMessages.GoalPropertiesEditionPart_IsTaggedLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.isTagged, GsnViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(GsnViewsRepository.Goal.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createIsTaggedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createAssumedCheckbox(FormToolkit widgetFactory, Composite parent) {
		assumed = widgetFactory.createButton(parent, getDescription(GsnViewsRepository.Goal.Properties.assumed, GsnMessages.GoalPropertiesEditionPart_AssumedLabel), SWT.CHECK);
		assumed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.assumed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(assumed.getSelection())));
			}

		});
		GridData assumedData = new GridData(GridData.FILL_HORIZONTAL);
		assumedData.horizontalSpan = 2;
		assumed.setLayoutData(assumedData);
		EditingUtils.setID(assumed, GsnViewsRepository.Goal.Properties.assumed);
		EditingUtils.setEEFtype(assumed, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.assumed, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAssumedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createToBeSupportedCheckbox(FormToolkit widgetFactory, Composite parent) {
		toBeSupported = widgetFactory.createButton(parent, getDescription(GsnViewsRepository.Goal.Properties.toBeSupported, GsnMessages.GoalPropertiesEditionPart_ToBeSupportedLabel), SWT.CHECK);
		toBeSupported.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.toBeSupported, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(toBeSupported.getSelection())));
			}

		});
		GridData toBeSupportedData = new GridData(GridData.FILL_HORIZONTAL);
		toBeSupportedData.horizontalSpan = 2;
		toBeSupported.setLayoutData(toBeSupportedData);
		EditingUtils.setID(toBeSupported, GsnViewsRepository.Goal.Properties.toBeSupported);
		EditingUtils.setEEFtype(toBeSupported, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.toBeSupported, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createToBeSupportedCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSubGoalsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.subGoals = new ReferencesTable(getDescription(GsnViewsRepository.Goal.Properties.subGoals, GsnMessages.GoalPropertiesEditionPart_SubGoalsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				subGoals.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				subGoals.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				subGoals.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				subGoals.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.subGoalsFilters) {
			this.subGoals.addFilter(filter);
		}
		this.subGoals.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.subGoals, GsnViewsRepository.FORM_KIND));
		this.subGoals.createControls(parent, widgetFactory);
		this.subGoals.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData subGoalsData = new GridData(GridData.FILL_HORIZONTAL);
		subGoalsData.horizontalSpan = 3;
		this.subGoals.setLayoutData(subGoalsData);
		this.subGoals.setLowerBound(0);
		this.subGoals.setUpperBound(-1);
		subGoals.setID(GsnViewsRepository.Goal.Properties.subGoals);
		subGoals.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSubGoalsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStrategiesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.strategies = new ReferencesTable(getDescription(GsnViewsRepository.Goal.Properties.strategies, GsnMessages.GoalPropertiesEditionPart_StrategiesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				strategies.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				strategies.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				strategies.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				strategies.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.strategiesFilters) {
			this.strategies.addFilter(filter);
		}
		this.strategies.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.strategies, GsnViewsRepository.FORM_KIND));
		this.strategies.createControls(parent, widgetFactory);
		this.strategies.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData strategiesData = new GridData(GridData.FILL_HORIZONTAL);
		strategiesData.horizontalSpan = 3;
		this.strategies.setLayoutData(strategiesData);
		this.strategies.setLowerBound(0);
		this.strategies.setUpperBound(-1);
		strategies.setID(GsnViewsRepository.Goal.Properties.strategies);
		strategies.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createStrategiesTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGoalContextsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.goalContexts = new ReferencesTable(getDescription(GsnViewsRepository.Goal.Properties.goalContexts, GsnMessages.GoalPropertiesEditionPart_GoalContextsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				goalContexts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				goalContexts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				goalContexts.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				goalContexts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.goalContextsFilters) {
			this.goalContexts.addFilter(filter);
		}
		this.goalContexts.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.goalContexts, GsnViewsRepository.FORM_KIND));
		this.goalContexts.createControls(parent, widgetFactory);
		this.goalContexts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData goalContextsData = new GridData(GridData.FILL_HORIZONTAL);
		goalContextsData.horizontalSpan = 3;
		this.goalContexts.setLayoutData(goalContextsData);
		this.goalContexts.setLowerBound(0);
		this.goalContexts.setUpperBound(-1);
		goalContexts.setID(GsnViewsRepository.Goal.Properties.goalContexts);
		goalContexts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createGoalContextsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAssumptionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.assumptions = new ReferencesTable(getDescription(GsnViewsRepository.Goal.Properties.assumptions, GsnMessages.GoalPropertiesEditionPart_AssumptionsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				assumptions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				assumptions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				assumptions.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				assumptions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.assumptionsFilters) {
			this.assumptions.addFilter(filter);
		}
		this.assumptions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.assumptions, GsnViewsRepository.FORM_KIND));
		this.assumptions.createControls(parent, widgetFactory);
		this.assumptions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData assumptionsData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionsData.horizontalSpan = 3;
		this.assumptions.setLayoutData(assumptionsData);
		this.assumptions.setLowerBound(0);
		this.assumptions.setUpperBound(-1);
		assumptions.setID(GsnViewsRepository.Goal.Properties.assumptions);
		assumptions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAssumptionsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGoalSolutionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.goalSolutions = new ReferencesTable(getDescription(GsnViewsRepository.Goal.Properties.goalSolutions, GsnMessages.GoalPropertiesEditionPart_GoalSolutionsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				goalSolutions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				goalSolutions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				goalSolutions.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				goalSolutions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.goalSolutionsFilters) {
			this.goalSolutions.addFilter(filter);
		}
		this.goalSolutions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.goalSolutions, GsnViewsRepository.FORM_KIND));
		this.goalSolutions.createControls(parent, widgetFactory);
		this.goalSolutions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData goalSolutionsData = new GridData(GridData.FILL_HORIZONTAL);
		goalSolutionsData.horizontalSpan = 3;
		this.goalSolutions.setLayoutData(goalSolutionsData);
		this.goalSolutions.setLowerBound(0);
		this.goalSolutions.setUpperBound(-1);
		goalSolutions.setID(GsnViewsRepository.Goal.Properties.goalSolutions);
		goalSolutions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createGoalSolutionsTableComposition

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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.identifier);
		if (eefElementEditorReadOnlyState && identifier.isEnabled()) {
			identifier.setEnabled(false);
			identifier.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !identifier.isEnabled()) {
			identifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isTagged.setContentProvider(contentProvider);
		isTagged.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.isTagged);
		if (eefElementEditorReadOnlyState && isTagged.isEnabled()) {
			isTagged.setEnabled(false);
			isTagged.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isTagged.isEnabled()) {
			isTagged.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumed()
	 * 
	 */
	public Boolean getAssumed() {
		return Boolean.valueOf(assumed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setAssumed(Boolean newValue)
	 * 
	 */
	public void setAssumed(Boolean newValue) {
		if (newValue != null) {
			assumed.setSelection(newValue.booleanValue());
		} else {
			assumed.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.assumed);
		if (eefElementEditorReadOnlyState && assumed.isEnabled()) {
			assumed.setEnabled(false);
			assumed.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !assumed.isEnabled()) {
			assumed.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getToBeSupported()
	 * 
	 */
	public Boolean getToBeSupported() {
		return Boolean.valueOf(toBeSupported.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setToBeSupported(Boolean newValue)
	 * 
	 */
	public void setToBeSupported(Boolean newValue) {
		if (newValue != null) {
			toBeSupported.setSelection(newValue.booleanValue());
		} else {
			toBeSupported.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.toBeSupported);
		if (eefElementEditorReadOnlyState && toBeSupported.isEnabled()) {
			toBeSupported.setEnabled(false);
			toBeSupported.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toBeSupported.isEnabled()) {
			toBeSupported.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initSubGoals(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSubGoals(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		subGoals.setContentProvider(contentProvider);
		subGoals.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.subGoals);
		if (eefElementEditorReadOnlyState && subGoals.isEnabled()) {
			subGoals.setEnabled(false);
			subGoals.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subGoals.isEnabled()) {
			subGoals.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateSubGoals()
	 * 
	 */
	public void updateSubGoals() {
	subGoals.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterSubGoals(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubGoals(ViewerFilter filter) {
		subGoalsFilters.add(filter);
		if (this.subGoals != null) {
			this.subGoals.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterSubGoals(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubGoals(ViewerFilter filter) {
		subGoalsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInSubGoalsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubGoalsTable(EObject element) {
		return ((ReferencesTableSettings)subGoals.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initStrategies(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategies(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		strategies.setContentProvider(contentProvider);
		strategies.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.strategies);
		if (eefElementEditorReadOnlyState && strategies.isEnabled()) {
			strategies.setEnabled(false);
			strategies.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !strategies.isEnabled()) {
			strategies.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateStrategies()
	 * 
	 */
	public void updateStrategies() {
	strategies.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterStrategies(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategies(ViewerFilter filter) {
		strategiesFilters.add(filter);
		if (this.strategies != null) {
			this.strategies.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterStrategies(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategies(ViewerFilter filter) {
		strategiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInStrategiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategiesTable(EObject element) {
		return ((ReferencesTableSettings)strategies.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initGoalContexts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoalContexts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		goalContexts.setContentProvider(contentProvider);
		goalContexts.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.goalContexts);
		if (eefElementEditorReadOnlyState && goalContexts.isEnabled()) {
			goalContexts.setEnabled(false);
			goalContexts.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !goalContexts.isEnabled()) {
			goalContexts.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateGoalContexts()
	 * 
	 */
	public void updateGoalContexts() {
	goalContexts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterGoalContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoalContexts(ViewerFilter filter) {
		goalContextsFilters.add(filter);
		if (this.goalContexts != null) {
			this.goalContexts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterGoalContexts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGoalContexts(ViewerFilter filter) {
		goalContextsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInGoalContextsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGoalContextsTable(EObject element) {
		return ((ReferencesTableSettings)goalContexts.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initAssumptions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAssumptions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		assumptions.setContentProvider(contentProvider);
		assumptions.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.assumptions);
		if (eefElementEditorReadOnlyState && assumptions.isEnabled()) {
			assumptions.setEnabled(false);
			assumptions.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !assumptions.isEnabled()) {
			assumptions.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateAssumptions()
	 * 
	 */
	public void updateAssumptions() {
	assumptions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterAssumptions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumptions(ViewerFilter filter) {
		assumptionsFilters.add(filter);
		if (this.assumptions != null) {
			this.assumptions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterAssumptions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumptions(ViewerFilter filter) {
		assumptionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInAssumptionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionsTable(EObject element) {
		return ((ReferencesTableSettings)assumptions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initGoalSolutions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoalSolutions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		goalSolutions.setContentProvider(contentProvider);
		goalSolutions.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GsnViewsRepository.Goal.Properties.goalSolutions);
		if (eefElementEditorReadOnlyState && goalSolutions.isEnabled()) {
			goalSolutions.setEnabled(false);
			goalSolutions.setToolTipText(GsnMessages.Goal_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !goalSolutions.isEnabled()) {
			goalSolutions.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateGoalSolutions()
	 * 
	 */
	public void updateGoalSolutions() {
	goalSolutions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterGoalSolutions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoalSolutions(ViewerFilter filter) {
		goalSolutionsFilters.add(filter);
		if (this.goalSolutions != null) {
			this.goalSolutions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterGoalSolutions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGoalSolutions(ViewerFilter filter) {
		goalSolutionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInGoalSolutionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGoalSolutionsTable(EObject element) {
		return ((ReferencesTableSettings)goalSolutions.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GsnMessages.Goal_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
